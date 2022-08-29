public class CalculadoraBasica {

	private int numero1;
	private int numero2;
	private int suma;
	private int resta;
	private int multiplicacion;
	private int division;

	public int Suma(int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
		suma = num1 + num2;
		return suma;
	}

	public void impresionSuma() {
		System.out.println(suma);
	}

	public int Resta(int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
		resta = num1 - num2;
		return resta;
	}

	public void impresionResta() {
		System.out.println(resta);
	}

	public int Multiplicacion(int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
		multiplicacion = num1 * num2;
		return multiplicacion;
	}

	public void impresionMultiplicacion() {
		System.out.println(multiplicacion);
	}


	public int Division(int num1, int num2) {
		this.numero1 = num1;
		this.numero2 = num2;
		division = num1 / num2;
		return division;
	}

	public void impresionDivision() {
		System.out.println(division);
	}
}