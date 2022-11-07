package Clases;

public class cPunto extends cObjecteGeometric{
	 cPunto aCoordenadaX;
	 cPunto aCoordenadaY;
	 cPunto aCoordenadaZ;
	
	public cPunto(int aNumeroDimensiones, cPunto aCoordenadaX, cPunto aCoordenadaY, cPunto aCoordenadaZ) {
		super(aNumeroDimensiones);
		
		this.aCoordenadaX = aCoordenadaX;
		this.aCoordenadaY = aCoordenadaY;
		this.aCoordenadaZ = aCoordenadaZ;
		
	}

	public cPunto getaCoordenadaX() {
		return aCoordenadaX;
	}

	public void setaCoordenadaX(cPunto aCoordenadaX) {
		this.aCoordenadaX = aCoordenadaX;
	}

	public cPunto getaCoordenadaY() {
		return aCoordenadaY;
	}

	public void setaCoordenadaY(cPunto aCoordenadaY) {
		this.aCoordenadaY = aCoordenadaY;
	}

	public cPunto getaCoordenadaZ() {
		return aCoordenadaZ;
	}

	public void setaCoordenadaZ(cPunto aCoordenadaZ) {
		this.aCoordenadaZ = aCoordenadaZ;
	}
public void Mostrar() {
	System.out.println(this.aCoordenadaX);
	System.out.println(this.aCoordenadaY);
	System.out.println(this.aCoordenadaZ);
	System.out.println(super.aNumeroDimensiones);
}
}
