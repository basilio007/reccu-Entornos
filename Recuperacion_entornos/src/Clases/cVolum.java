package Clases;

public class cVolum extends cObjecteGeometric{
	 int aNúmeroCares;
	 int aCares;
	
	public cVolum(int aNumeroDimensiones, int aNúmeroCares, int aCares) {
		super(aNumeroDimensiones);
		this.aNúmeroCares = aNúmeroCares;
		this.aCares = aCares;
	}

	public int getaNúmeroCares() {
		return aNúmeroCares;
	}

	public void setaNúmeroCares(int aNúmeroCares) {
		this.aNúmeroCares = aNúmeroCares;
	}

	public int getaCares() {
		return aCares;
	}

	public void setaCares(int aCares) {
		this.aCares = aCares;
	}
	public void mostrar() {
		System.out.println(this.aCares);
		System.out.println(this.aNúmeroCares);
		System.out.println(super.aNumeroDimensiones);
	}

}
