package ejemplo;

public class Alumno {
	private String nombre;
	private String apellido;
	private int nroAlumno;
	
	private static int nro = 0;
	public Alumno(String nombre, String apellido) {
		nro++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroAlumno = nro;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNroAlumno() {
		return nroAlumno;
	}


	public void setNroAlumno(int nroAlumno) {
		this.nroAlumno = nroAlumno;
	}


	public static int getNro() {
		return nro;
	}


	public static void setNro(int nro) {
		Alumno.nro = nro;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nroAlumno=" + nroAlumno + "]";
	}
	
	

}
