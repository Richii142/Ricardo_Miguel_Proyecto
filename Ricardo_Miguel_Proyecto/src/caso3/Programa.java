package caso3;

import java.util.Scanner;

public class Programa {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedimos los datos del triangulo
		System.out.println("Escribe la base del triangulo: ");
		double baseTriangulo = entrada.nextInt();

		System.out.println("Escribe la altura del triangulo: ");
		double alturaTriangulo = entrada.nextInt();

		System.out.println("El area del triangulo es de " + calcularArea(baseTriangulo, alturaTriangulo));

		// Pedimos los datos de la circunferencia
		System.out.println("Escribe el radio de la circunferencia: ");
		double radioCircunferencia = entrada.nextInt();

		System.out.println("El area de la circunferencia es de " + calcularAreaCircunferencia(radioCircunferencia));
		System.out.println(
				"El perimetro de la circunferencia es de " + calcularPerimetroCircunferencia(radioCircunferencia));

		// Pedimos los datos del cilindro
		System.out.println("Escribe el radio del cilindro: ");
		double radioCilindro = entrada.nextInt();

		System.out.println("Escribe la altura del cilindro: ");
		double alturaCIlindro = entrada.nextInt();

		System.out.println("El area del cilindro es de " + calcularArea(radioCilindro, alturaCIlindro));
		
		//Pedimos los datos del rectangulo
		System.out.println("Escribe la base del rectangulo: ");
		double ladoA_Rectangulo = entrada.nextInt();
		
		System.out.println("Escribe la altura del rectangulo: ");
		double ladoB_Rectangulo = entrada.nextInt();
		
		System.out.println("El area del rectangulo es de "+ calcularArea(ladoA_Rectangulo, ladoB_Rectangulo));
		

	}

	// Calculamos el área del triangulo - Alumno1
	public static double calcularArea(double base, double altura) {
		double area = base * altura / 2;
		return area;
	}

	// Calculamos el área y el perimetro de la circunferencia - Alumno2
	public static double calcularAreaCircunferencia(double radio) {
		double area = 3.14 * (radio * radio);
		return area;
	}

	public static double calcularPerimetroCircunferencia(double radio) {
		double area = 3.14 * (radio + radio);
		return area;
	}

	// Calculamos el área del cilindro - Alumno1
	public static double calcularAreaCilindro(double radio, double altura) {
		double area = 2 * 3.14 * radio * (radio + altura);
		return area;
	}
	
	//Calculamos el área de un rectangulo - Alumno2
	public static double calcularAreaRectangulo(double base, double altura) 
	{
		double area = base * altura;
		return area;
	}

}