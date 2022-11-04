package Clases;

public class cPlan extends cObjecteGeometric{
	public int aNúmeroLados;
	public int aLados;
	public cPlan(int aNumeroDimensiones,int aNúmeroLados, int aLados) {
		super(aNumeroDimensiones);
		
		this.aNúmeroLados = aNúmeroLados;
		this.aLados = aLados;
	}
	public int getaNúmeroLados() {
		return aNúmeroLados;
	}
	public void setaNúmeroLados(int aNúmeroLados) {
		this.aNúmeroLados = aNúmeroLados;
	}
	public int getaLados() {
		return aLados;
	}
	public void setaLados(int aLados) {
		this.aLados = aLados;
	}
	public void Mostrar() {
		System.out.println(this.aNúmeroLados);
		System.out.println(this.aLados);
		System.out.println(super.aNumeroDimensiones);
	}

}
