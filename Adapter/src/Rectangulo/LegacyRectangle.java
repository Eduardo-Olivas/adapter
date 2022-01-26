package Rectangulo;

public class LegacyRectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public LegacyRectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rectangulo Viejo Creado: ");
		System.out.println("x1: " + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);
	}

	protected void render() {
		System.out.println("Rectangulo viejo dibuja ");
		System.out.println("x1: " + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);

	}
}