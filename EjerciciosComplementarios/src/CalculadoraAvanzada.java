public class CalculadoraAvanzada {

	private int Potencia;
	private int numOpuesto;
	private double Factorial = 1;


	public int Potencia(int num, int pot) {
		for (int i = 0; i < pot; i++) {
			Potencia = num * pot;
		}
		return Potencia;
	}
	public void ImpresionPotencia() {
		System.out.println(Potencia);

	}
	public int Opuesto(int num) {
		numOpuesto = num * (-1);
		return numOpuesto;
	}
	public void ImpresionOpuesto() {
		System.out.println(numOpuesto);
	}
	public double Factorial(int num) {
		for (int i = num; i > 0; i--) {
			Factorial = Factorial * i;
		}
		return Factorial;
	}
	public void ImpresionFactorial() {
		System.out.println(Factorial);
	}
}
