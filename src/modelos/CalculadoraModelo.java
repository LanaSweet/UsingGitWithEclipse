package modelos;

public class CalculadoraModelo {
	
	public float altura;
	public float peso;
	public float imc=0;
	public String mensaje="";
	

	public CalculadoraModelo() {
		this.altura = 0;
		this.peso = 0;
		this.imc = 0;
		this.mensaje="";
		

	}
	public CalculadoraModelo(float altura, float peso) {
		this();
		this.altura = altura;
		this.peso = peso;
		
	}
	
	

}
