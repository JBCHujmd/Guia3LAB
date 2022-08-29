import java.util.Scanner;

public class Estudiante {

	private Scanner sc = new Scanner(System.in);

	private String Nombre;
	private String Apellido;
	private int Carnet;
	private String[] Materias;

	public Estudiante(String Nom, String Ape, int ed, int car) {
		this.Nombre = Nom;
		this.Apellido = Ape;
		this.Carnet = car;

		System.out.println("Nombre: " + Nom);
		System.out.println("Apellido: " + Ape);
		System.out.println("Edad: " + ed);
		System.out.println("Carnet: " + car);
	}

	public void IngresoMateria() {
		int cantMat = 5;
		System.out.print("Bienvenid@ al portal de inscripcion:\n");
		Materias = new String[cantMat];
		for (int i = 0; i < Materias.length; i++) {
			System.out.print("Ingrese la materia " + (i + 1) + " : ");
			Materias[i] = sc.next();
		}
	}


	public void MostrarDatos() {
		System.out.println("Gracias, Estudiante " + this.Carnet + ": " + this.Nombre + " " + this.Apellido);
		System.out.println("Usted ha inscrito las materias siguientes:");
		for (int i = 0; i < Materias.length; i++) {
			System.out.println(Materias[i]);
		}
	}
}
