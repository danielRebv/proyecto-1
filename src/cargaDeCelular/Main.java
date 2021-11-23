package cargaDeCelular;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int opcion;

		String Menu = "MENU CELULAR\n\n" + "1.- Llamada Telefonica\n" + "2.- Cargar Dinero al Celuar\n"
				+ "3.- Cargar Bateria Celular\n" + "4.- Mostrar Estadistica\n" + "5.- Salir\n";

		JOptionPane jo = new JOptionPane();
		Celular celular = new Celular(5000, 500, 0, 0);

		do {
			opcion = Integer.parseInt(jo.showInputDialog(Menu));
			switch (opcion) {

			case 1:
				celular.llamadaTelefonica();
				jo.showMessageDialog(null, "Realizando llamada.. ");
				break;

			case 2:
				celular.cargarDineroCelular(opcion);
				break;

			case 3:
				jo.showMessageDialog(null, "Cargando Bateria..");
				celular.cargarBateriaCelular();
				celular.cantidadVecesCaragado();
				break;

			case 4:
				celular.mostrarEstadisticas();
				break;

			case 5:
				jo.showMessageDialog(null, "Saliendo del programa", "Advertencia", jo.WARNING_MESSAGE);
				break;

			default:
				jo.showMessageDialog(null, "Opcion Ingresada incorrecta", "Mensaje de advertencia", jo.ERROR_MESSAGE);
				break;
			}

		} while (opcion != 5);

	}

}
