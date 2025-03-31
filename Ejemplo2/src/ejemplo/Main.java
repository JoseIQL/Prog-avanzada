package ejemplo;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Crear lista

		/*
		 * System.out.println("ingrese la cantidad de alumnos"); int cantAlumnos =
		 * entrada.nextInt(); for (int i = 0; i < cantAlumnos; i++) {
		 * System.out.println("ingrese nombre"); String nombre = entrada.next();
		 * System.out.println("ingrese apellido"); String apellido = entrada.next();
		 * Alumno yo = new Alumno(nombre,apellido); alumnos.add(yo); }
		 */
//		
		/*
		 * 1)Crear una lista para almacenar productos.
		 * agregar_producto(),eliminar_producto(),buscar_producto() Añadir funciones
		 * para actualizar el precio de un producto y listar todos los productos de la
		 * lista.
		 */
		LinkedList<Alumno> alumnos = new LinkedList<Alumno>();
		alumnos.add(new Alumno("Gamaliel", "Quiroz"));
		alumnos.add(new Alumno("Juan", "Del pozo"));
		Scanner entrada = new Scanner(System.in);
		if (alumnos.isEmpty()) {
			System.out.println("No hay elementos");
		} else {
			System.out.println("ingrese el elemento a borrar");
			int elimina = entrada.nextInt();
			if (alumnos.size() > elimina && elimina > 0) {
				alumnos.remove(elimina);
			} else {
				System.out.println("No se encontró");
			}
		}
		System.out.println(alumnos);

	}
}
