package clase1v;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Mesero {
	
	private String nombre;
	private String contrania;
	private static LinkedList<Mesero> meseros = new LinkedList<Mesero>();
	
	public Mesero(String nombre, String contrania) {
		super();
		this.nombre = nombre;
		this.contrania = contrania;
	}
	
	public static LinkedList<Mesero> getMeseros() {
		return meseros;
	}

	public static void setMeseros(LinkedList<Mesero> meseros) {
		Mesero.meseros = meseros;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrania() {
		return contrania;
	}
	public void setContrania(String contrania) {
		this.contrania = contrania;
	}
	@Override
	public String toString() {
		return "Mesero [nombre=" + nombre + ", contrania=" + contrania + "]";
	}
	//Función de instancia/objeto
	public void Login(String nombre,String contrania) {	
		if (this.nombre.equals(nombre)) {
			JOptionPane.showMessageDialog(null, "Ingresa");
		} else {
			JOptionPane.showMessageDialog(null, "Error :C");

		}
	}
	//Función de clase
	public static void Registrar(String nombre,String contrania) {
		
		meseros.add(new Mesero(nombre,contrania));
	}
	 
	

}
