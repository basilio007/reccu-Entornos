package Clases;

public class cPunto extends cObjecteGeometric{
	 float aCoordenadaX;
	 float aCoordenadaY;
	 float aCoordenadaZ;
	
	public cPunto(int aNumeroDimensiones, float aCoordenadaX, float aCoordenadaY, float aCoordenadaZ) {
		super(aNumeroDimensiones);
		
		this.aCoordenadaX = aCoordenadaX;
		this.aCoordenadaY = aCoordenadaY;
		this.aCoordenadaZ = aCoordenadaZ;
		
	}

	public float getaCoordenadaX() {
		return aCoordenadaX;
	}

	public void setaCoordenadaX(float aCoordenadaX) {
		this.aCoordenadaX = aCoordenadaX;
	}

	public float getaCoordenadaY() {
		return aCoordenadaY;
	}

	public void setaCoordenadaY(float aCoordenadaY) {
		this.aCoordenadaY = aCoordenadaY;
	}

	public float getaCoordenadaZ() {
		return aCoordenadaZ;
	}

	public void setaCoordenadaZ(float aCoordenadaZ) {
		this.aCoordenadaZ = aCoordenadaZ;
	}
public void Mostrar() {
	System.out.println(this.aCoordenadaX);
	System.out.println(this.aCoordenadaY);
	System.out.println(this.aCoordenadaZ);
	System.out.println(super.aNumeroDimensiones);
}
}
