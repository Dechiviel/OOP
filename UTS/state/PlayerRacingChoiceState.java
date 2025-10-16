package state;

import javax.swing.JOptionPane;
import pacuKuda.*;

public class PlayerRacingChoiceState extends PlayerBaseState {

    public void EnterState(PlayerStateManager player) {
        if(player.trainer.getHorse().getActiveSkill().getCooldown() > 0) {
            player.trainer.getHorse().getActiveSkill().setCooldown(player.trainer.getHorse().getActiveSkill().getCooldown() - 1);
        }
        checkRaceFinished(player);
        checkPlayerStamina(player);

        String input;

        int random = (int) (Math.random() * 4);

        String[] choices = {
            "It's your call, what's your decision?",
            "Now, it's up to you. Choose wisely.",
            "Make your choice.",
            "What will you do?"
        };

        String strRandom = choices[random];
        do {
            input = JOptionPane.showInputDialog(null,
                    "Current Speed: " + player.trainer.getHorse().getKmh() + " km/h\n"
                    + "Stamina: " + player.trainer.getHorse().getStaminaOnRace() + "/" + player.trainer.getHorse().getStamina() + "\n\n"
                    + "1. Accelerate speed. (Consumes turn)\n\n"
                    + "2. Maintain current speed. (Consumes turn)\n\n"
                    + "3. Slow down the speed. (Consumes turn)\n\n"
                    + (player.trainer.getHorse().getActiveSkill().getIsOn()
                    ? "4. Deactivate " + player.trainer.getHorse().getActiveSkill().getName() + "\n\n"
                    : "4. Activate " + player.trainer.getHorse().getActiveSkill().getName() + " " + (player.trainer.getHorse().getActiveSkill().getCooldown() < 1 ? "\n\n" : " (Cooldown: " + player.trainer.getHorse().getActiveSkill().getCooldown() + " turns)\n\n"))
                    + "5. Observe the terrain\n\n\n"
                    + strRandom + "\n\n",
                    "Distance Covered: " + player.trainer.getHorse().getDistanceTraveled() + " m (" + (player.terrain.getDistance() - player.trainer.getHorse().getDistanceTraveled()) + "m left until finish)",
                    JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                break;
            }

        } while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") && !input.equals("5"));

        if (input.equals("1")) {
            if (!player.trainer.getHorse().increaseSpeed()) {
                JOptionPane.showMessageDialog(null,
                        player.trainer.getHorse().getName() + " is already at maximum speed!\n\n"
                        + "Maintain the speed instead.\n\n",
                        "Grand Arena",
                        JOptionPane.PLAIN_MESSAGE);

                player.trainer.getHorse().maintainSpeed();
            }
            start(player);

            printTerrainInfo(player);

            player.SwitchState(player.racingChoiceState);
        } else if (input.equals("2")) {
            player.trainer.getHorse().maintainSpeed();

            start(player);

            printTerrainInfo(player);

            player.SwitchState(player.racingChoiceState);
        } else if (input.equals("3")) {
            player.trainer.getHorse().decreaseSpeed();

            start(player);

            printTerrainInfo(player);

            player.SwitchState(player.racingChoiceState);
        } else if (input.equals("4")) {
            boolean used = false;
            if (player.trainer.getHorse().getActiveSkill().getCooldown() <= 0) {
                used = player.trainer.getHorse().getActiveSkill().useSkill();
            }

            if (!used) {
                player.trainer.getHorse().getActiveSkill().deactivateSkill();
            }

            player.SwitchState(player.racingChoiceState);
        } else if (input.equals("5")) {
            printTerrainInfo(player);

            JOptionPane.showMessageDialog(null,
                    player.trainer.getHorse().getName() + "'s stats\n"
                    + "\n"
                    + "Speed: " + player.trainer.getHorse().getSpeed() + "\n"
                    + "Stamina: " + player.trainer.getHorse().getStamina() + "\n"
                    + "Power: " + player.trainer.getHorse().getPower(),
                    "Grand Arena",
                    JOptionPane.PLAIN_MESSAGE);

            player.SwitchState(player.racingChoiceState);
        }
    }

    public void checkRaceFinished(PlayerStateManager player) {
        for (Trainer trainer : player.terrain.getTrainers()) {
            Horse horse = trainer.getHorse();

            if (horse != null && horse.getDistanceTraveled() >= player.terrain.getDistance()) {
                JOptionPane.showMessageDialog(null,
                    player.terrain.getTrainers().get(0).getHorse().getName() + " has crossed the finish line!\n\n",
                    "Grand Arena",
                    JOptionPane.PLAIN_MESSAGE);

                if (player.terrain.getTrainers().indexOf(trainer) == 0) {
                    player.SwitchState(player.winState);
                } else {
                    player.SwitchState(player.loseState);
                }
            }
        }
    }

    public void checkPlayerStamina(PlayerStateManager player) {
        if (player.trainer.getHorse().getStaminaOnRace() <= 0) {
            JOptionPane.showMessageDialog(null,
                    player.trainer.getHorse().getName() + " has run out of stamina.\n\n",
                    "Grand Arena",
                    JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,
                    player.trainer.getHorse().getName() + " tried to push through again...\n\n",
                    "Grand Arena",
                    JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,
                    "Again and again...\n\n",
                    "Grand Arena",
                    JOptionPane.PLAIN_MESSAGE);

            JOptionPane.showMessageDialog(null,
                    "But " + player.trainer.getHorse().getName() + " just can't go on.\n\n",
                    "Grand Arena",
                    JOptionPane.PLAIN_MESSAGE);

            player.SwitchState(player.loseState);
        }
    }

    public void start(PlayerStateManager player) {
        if (player.trainer.getHorse().getPassiveSkill().checkUnlock()) {
            player.trainer.getHorse().getPassiveSkill().useSkill();
        }

        for (Trainer trainer : player.terrain.getTrainers()) {
            if (trainer != player.trainer) {
                if (trainer.getHorse().getStaminaOnRace() <= 0 && trainer == player.trainer) {
                    continue;
                }

                trainer.getHorse().increaseSpeed();
            }
        }

        player.terrain.getTrainers().sort(
                (t1, t2) -> Double.compare(t2.getHorse().getDistanceTraveled(), t1.getHorse().getDistanceTraveled())
        );
    }

    public void printTerrainInfo(PlayerStateManager player) {
        StringBuilder standings = new StringBuilder("Current Race Information\n\n");
        int rank = 1;
        for (Trainer t : player.terrain.getTrainers()) {
            standings.append("#").append(rank).append(" ")
                    .append(t.getHorse().getName()).append(" - Trainer ").append(t.getName()).append("\n")
                    .append("   Distance Travelled: ").append(String.format("%.2f", (double)t.getHorse().getDistanceTraveled())).append(" m")
                    .append(" | Speed: ").append(String.format("%.2f", (double)t.getHorse().getKmh())).append(" km/h\n\n");
            rank++;
        }

        javax.swing.JTextArea textArea = new javax.swing.JTextArea(standings.toString());
        textArea.setEditable(false);
        textArea.setCaretPosition(0);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);

        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 400));

        JOptionPane.showMessageDialog(null, scrollPane, "Race Standings", JOptionPane.PLAIN_MESSAGE);
    }

}
