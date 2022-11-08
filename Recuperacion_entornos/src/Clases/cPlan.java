package Clases;

public class cPlan extends cObjecteGeometric{
	cLinia aNúmeroLados;
	cLinia[] aLados = new cLinia[5];
	
	
	public cPlan(int aNumeroDimensiones,cLinia aNúmeroLados, cLinia[] aLados) {
		super(aNumeroDimensiones);
		
		this.aNúmeroLados = aNúmeroLados;
		this.aLados = aLados;
	}
	

}
