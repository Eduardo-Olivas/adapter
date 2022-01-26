package Rectangulo;

public class RectangleAdapter extends LegacyRectangle implements Rectangle
{
	public RectangleAdapter(int x, int y, int w, int h)
	{
		super(x,y,x + w,y + h); //invoca a la clase superior
		System.out.println("Creando rectangulo Nuevo");
		System.out.println("x1: "+x+" y: "+y+" w: "+w+" h: "+h);
		
		
	}
	@Override
	public void draw()
	{
		System.out.println("Creando rectangulo Nuevo");
		render();
	}
}