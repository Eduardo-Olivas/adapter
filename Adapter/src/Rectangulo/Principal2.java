package Rectangulo;


public class Principal2
{
	public static void main(String[] args)
	{
		Rectangle r = new RectangleAdapter(120, 200, 90, 40);
		r.draw();
	}
}
