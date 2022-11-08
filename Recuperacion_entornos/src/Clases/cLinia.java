package Clases;

public class cLinia extends cObjecteGeometric{
	cPunto aPuntInicial;
	cPunto aPuntFinal;
	
	public cLinia(int aNumeroDimensiones , cPunto aPuntInicial, cPunto aPuntFinal) {
		super(aNumeroDimensiones);
		this.aPuntInicial = aPuntInicial;
		this.aPuntFinal = aPuntFinal;
		
	}

	public cPunto getaPuntInicial() {
		return aPuntInicial;
	}

	public void setaPuntInicial(cPunto aPuntInicial) {
		this.aPuntInicial = aPuntInicial;
	}

	public cPunto getaPuntFinal() {
		return aPuntFinal;
	}

	public void setaPuntFinal(cPunto aPuntFinal) {
		this.aPuntFinal = aPuntFinal;
	}
	public void Mostrar() {
		System.out.println(this.aPuntInicial);
		System.out.println(this.aPuntFinal);
		System.out.println(super.aNumeroDimensiones);
	}
	//metodo para la devolucion del tamaño de los ojetos
	public static int devucion(cPunto aPuntInicial, cPunto aPuntFinal) {
		return aNumeroDimensiones;
		
	}
}
