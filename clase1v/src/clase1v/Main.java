package clase1v;
//ej
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[] args) {
		
//		Mesero yo = new Mesero("ghami","1234");
//		Mesero Tomas = new Mesero("Tomas","1234");
//		
		Mesero.Registrar("Axel", "4321");
		Mesero.Registrar("Seba", "4221");

		String []opciones = {
				"Login", // 0 
				"Registrarse", //1
				"Ver usuarios", //2 
				"Salir" //3
		};
		int elegido;
		do {
			
		
		
			elegido = JOptionPane.showOptionDialog(null,
				"Elija una opción", 
				null,
				0,
				JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(Main.class.getResource("cafe.png")),
				opciones, 
				opciones[0]);
		switch (elegido) {
		case 0:
			String nombre = JOptionPane.showInputDialog("Ingrese nombre");
			for (Mesero mesero : Mesero.getMeseros()) {
				mesero.Login(nombre, null);
			}
			break;
		case 1:
			 nombre = JOptionPane.showInputDialog("Ingrese nombre");
			Mesero.Registrar(nombre, "4221");

			break;
		case 2:
			JOptionPane.showMessageDialog(null, Mesero.getMeseros());

			break;
		case 3:
			JOptionPane.showMessageDialog(null,"Salir");

			break;
		default:
			break;
		}
		} while (elegido!=3);
		
		

		
		
//		
//		Tomas.Login("ghami", null);
//		
//		yo.Login("ghami", null);
		
	}
}
