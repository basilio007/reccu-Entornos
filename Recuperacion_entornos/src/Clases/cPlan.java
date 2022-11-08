package Clases;

public class cPlan extends cObjecteGeometric{
	cLinia aNúmeroLados;
	cLinia[] aLados = new cLinia[5];
	
	
	public cPlan(int aNumeroDimensiones,cLinia aNúmeroLados, cLinia[] aLados) {
		super(aNumeroDimensiones);
		
		this.aNúmeroLados = aNúmeroLados;
		this.aLados = aLados;
		
		
	}
	public cLinia getaNúmeroLados() {
		return aNúmeroLados;
	}
	public void setaNúmeroLados(cLinia aNúmeroLados) {
		this.aNúmeroLados = aNúmeroLados;
	}
	public cLinia[] getaLados() {
		return aLados;
	}
	public void setaLados(cLinia[] aLados) {
		this.aLados = aLados;
	}
	//metodo para la devolucion del tamaño de los ojetos
	public static int devucion(cLinia aNúmeroLados, cLinia[] aLados) {
		return 2 ;
		
	}

}
