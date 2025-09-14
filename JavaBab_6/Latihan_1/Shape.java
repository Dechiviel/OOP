import java.text.NumberFormat;

public class Shape
{
	public double length;
	public double width;
	public double height;
	public double volume;

	public Shape(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double compareTo(Shape shape)
	{
		return (this.volume - shape.volume) > 0 ? (this.volume - shape.volume) : (this.volume - shape.volume) * -1;
	}
	
	private void calculateVolume()
	{
		this.volume = this.length * this.width * this.height;
		if(this.volume < 0) 
			this.volume *= -1;
	}

	public void cetak()
	{
		this.calculateVolume();

		System.out.println("Panjang x Lebar x Tinggi = " + this.length + " x " + this.width + " x " + this.height);
		System.out.println("Volume = " + this.volume);
	}
}