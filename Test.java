import java.util.Scanner;
import java.util.ArrayList;
/**
 * Descripcion: Clase para realizar pruebas con 
 * 				otras clases desarroladas.
* 		prueba para editar desde remoto
* 		otra linea de prueba
 * 	Fecha:		22/01/2015
 */
public class Test
{

	/**
	 * [main description]
	 * @param args [description]
	 */
	public static void main(String[] args)
	{
		int numero = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Seleccione un entero para la sucesion de Fibonacci:\t");
		numero = teclado.nextInt();
		ArrayList<Integer> resul = new ArrayList<Integer>(); //Arreglo dinamico

		for( int i = 0; i < numero; i++)
		{
			resul.add(CFibonacci.fibonacci(i));
		}

		for( int i = 0; i < numero; i++)
		{
			System.out.printf("%5d", resul.get(i) );
		}
	}
}
