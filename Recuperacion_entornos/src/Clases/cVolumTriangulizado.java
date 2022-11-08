package Clases;

public class cVolumTriangulizado extends cObjecteGeometric{
 int aNumero_Triángulos;
 int aTriángulos;
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

//metodo para la devolucion del tamaño de los ojetos
public static int devucion(int aNumero_Triángulos, int aTriángulos) {
	return aNumeroDimensiones;
	
}
}
