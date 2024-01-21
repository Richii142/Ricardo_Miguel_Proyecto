package caso3;

import java.util.Scanner;

public class Programa
{
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		//Pedimos los datos del triangulo
		System.out.println("Escribe la base del triangulo: ");
		double baseTriangulo = entrada.nextInt();
		
		System.out.println("Escribe la altura del triangulo: ");
		double alturaTriangulo = entrada.nextInt();
		
		System.out.println("El area del triangulo es de "+ calcularArea(baseTriangulo, alturaTriangulo));
	
		//Pedimos los datos de la circunferencia
		System.out.println("Escribe el radio de la circunferencia: ");
		double radioCircunferencia = entrada.nextInt();
		
		System.out.println("El area de la circunferencia es de "+ calcularAreaCircunferencia(radioCircunferencia));
		System.out.println("El perimetro de la circunferencia es de "+ calcularPerimetroCircunferencia(radioCircunferencia));
		
	}
	
	//Calculamos el área del triangulo - Alumno1
	public static double calcularArea(double base, double altura)
	{
		double area = base * altura/2;
		return area;
	}
	
	//Calculamos el área y el perimetro de la circunferencia - Alumno2
	public static double calcularAreaCircunferencia(double radio)
	{
		double area = 3.14*(radio*radio);
		return area;
	}
	public static double calcularPerimetroCircunferencia(double radio)
	{
		double area = 3.14*(radio+radio);
		return area;
	}
}