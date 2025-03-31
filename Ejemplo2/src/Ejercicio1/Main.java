package Ejercicio1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 1)Crear una lista para almacenar productos.
		 * agregar_producto(),eliminar_producto(),buscar_producto() Añadir funciones
		 * para actualizar el precio de un producto y listar todos los productos de la
		 * lista.
		 */
		LinkedList<Producto> productos = new LinkedList<Producto>();
		Scanner entrada = new Scanner(System.in);
		String opcion;
		do {
			System.out.println("1-Agregar producto\n" + "2-Eliminar producto\n " + "3-Buscar producto\n "
					+ "4-Ver productos\n " + "5-Salir\n");
			opcion = entrada.next();
			switch (opcion) {
			case "1":
				System.out.println("Ingrese nombre de producto");
				String nombre = entrada.next();
				System.out.println("Ingrese precio de producto");
				double precio = entrada.nextDouble();
				System.out.println("Ingrese cantidad de producto");
				int cantidad = entrada.nextInt();
				Producto nuevo = new Producto(nombre, precio, cantidad);
				productos.add(nuevo);
				break;
			case "2":
				if (productos.isEmpty()) {
					System.out.println("No hay elementos");
				} else {
					System.out.println("ingrese el elemento a borrar");
					int elimina = entrada.nextInt();
					if (productos.size() > elimina && elimina > 0) {
						System.out.println("Eliminando producto " + productos.get(elimina));
						productos.remove(elimina);
					} else {
						System.out.println("No se encontró");
					}
				}
				break;
			case "3":
				if (productos.isEmpty()) {
					System.out.println("No hay elementos");
				} else {
					System.out.println("ingrese el elemento a buscar");
					int buscar = entrada.nextInt();
					if (productos.size() > buscar && buscar > 0) {
						System.out.println("Producto encontrado" + productos.get(buscar));

					} else {
						System.out.println("No se encontró");
					}
				}
				break;
			case "4":
				System.out.println(productos);
				break;
			case "5":
				System.err.println("Hasta la proxima!!!");
				break;
			}
		} while (!opcion.equals("5"));

	}
}
