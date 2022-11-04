package Clases;

public class cLinia extends cObjecteGeometric{
	public int aPuntInicial;
	public int aPuntFinal;
	
	public cLinia(int aNumeroDimensiones , int aPuntInicial, int aPuntFinal) {
		super(aNumeroDimensiones);
		this.aPuntInicial = aPuntInicial;
		this.aPuntFinal = aPuntFinal;
		
	}

	public int getaPuntInicial() {
		return aPuntInicial;
	}

	public void setaPuntInicial(int aPuntInicial) {
		this.aPuntInicial = aPuntInicial;
	}

	public int getaPuntFinal() {
		return aPuntFinal;
	}

	public void setaPuntFinal(int aPuntFinal) {
		this.aPuntFinal = aPuntFinal;
	}
	public void Mostrar() {
		System.out.println(this.aPuntInicial);
		System.out.println(this.aPuntFinal);
		System.out.println(super.aNumeroDimensiones);
	}

}
