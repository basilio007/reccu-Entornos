package Clases;

public class cVolumTriangulizado extends cObjecteGeometric{
public int aNumero_Triángulos;
public int aTriángulos;
public cVolumTriangulizado(int aNumeroDimensiones, int aNumero_Triángulos, int aTriángulos) {
	super(aNumeroDimensiones);
	this.aNumero_Triángulos = aNumero_Triángulos;
	this.aTriángulos = aTriángulos;
}
public int getaNumero_Triángulos() {
	return aNumero_Triángulos;
}
public void setaNumero_Triángulos(int aNumero_Triángulos) {
	this.aNumero_Triángulos = aNumero_Triángulos;
}
public int getaTriángulos() {
	return aTriángulos;
}
public void setaTriángulos(int aTriángulos) {
	this.aTriángulos = aTriángulos;
}
public void mostrar() {
	System.out.println(this.aNumero_Triángulos);
	System.out.println(this.aTriángulos);
	System.out.println(super.aNumeroDimensiones);
}
}
