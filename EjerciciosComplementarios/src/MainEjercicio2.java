public class MainEjercicio2 {
    
    static CalculadoraBasica cbasica = new CalculadoraBasica();
    static CalculadoraAvanzada cavanzada = new CalculadoraAvanzada();
    public static void main(String[] args) {
        //numeros para operaciones basicas
        cbasica.Suma(20, 10);
        cbasica.Resta(20, 10);
        cbasica.Multiplicacion(20, 10);
        cbasica.Division(20, 10);
        //numeros para operaciones avanzadas
        cavanzada.Potencia(20, 10);
        cavanzada.Opuesto(20);
        cavanzada.Factorial(6);
        //Resultados operaciones basicas
        System.out.print("Los resultados básicos son:\n");
        cbasica.impresionSuma();
        cbasica.impresionResta();
        cbasica.impresionMultiplicacion();
        cbasica.impresionDivision();
        //Resultados operaciones avanzadas
        System.out.print("Los resultados avanzados son:\n");
        cavanzada.ImpresionPotencia();
        cavanzada.ImpresionOpuesto();
        cavanzada.ImpresionFactorial();
    }
}