package caso3;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese los lados del triángulo
		System.out.print("Ingresa el primer lado del triángulo: ");
		double lado1 = scanner.nextDouble();

		System.out.print("Ingresa el segundo lado del triángulo: ");
		double lado2 = scanner.nextDouble();

		System.out.print("Ingresa el tercer lado del triángulo: ");
		double lado3 = scanner.nextDouble();

		// Calcular el área del triángulo
		double area = calcularAreaTriangulo(lado1, lado2, lado3);

		// Mostrar el resultado
		System.out.println("Área del triángulo: " + area);

		// Cerrar el scanner
		scanner.close();
		System.out.println("Hola");
	}

	// Función para calcular el área del triángulo usando la fórmula de Herón
	public static double calcularAreaTriangulo(double lado1, double lado2, double lado3) {
		// Calcular el semiperímetro
		double s = (lado1 + lado2 + lado3) / 2;

		// Aplicar la fórmula de Herón para calcular el área
		double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

		return area;

	}

}
