package cargaDeCelular;

import javax.swing.JOptionPane;

public class Celular {

	int saldoDineroCelular;
	int CantidadCargaBateria;
	int CantidadDineroAcum;
	int CantidadVecesCargado;

	public Celular(int saldoDineroCelular, int cantidadCargaBateria, int cantidadDineroAcum, int cantidadVecesCargado) {

		this.saldoDineroCelular = saldoDineroCelular;
		this.CantidadCargaBateria = cantidadCargaBateria;
		this.CantidadDineroAcum = cantidadDineroAcum;
		this.CantidadVecesCargado = cantidadVecesCargado;
	}

	public void llamadaTelefonica() {
		saldoDineroCelular = saldoDineroCelular - 150;
		CantidadCargaBateria = CantidadCargaBateria - 50;

	}

	public void cargarDineroCelular(int cantidad) {

		cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese dinero a cargar"));
		saldoDineroCelular = saldoDineroCelular + cantidad;
		CantidadDineroAcum = CantidadDineroAcum + cantidad;

	}

	public void cargarBateriaCelular() {
		CantidadCargaBateria = CantidadCargaBateria + 300;
	}

	public int acumularDinero() {
		return CantidadDineroAcum;

	}

	public int cantidadVecesCaragado() {
		CantidadVecesCargado = CantidadVecesCargado + 1;
		return CantidadVecesCargado;

	}

	public void mostrarEstadisticas() {
		JOptionPane.showMessageDialog(null,
				"Saldo del Celular: $" + saldoDineroCelular + "\n" + "Cantidad Carga Bateria: " + CantidadCargaBateria
						+ " mAh" + "\n" + "Dinero Cargado: $ " + CantidadDineroAcum + "\n" + "Ciclos: "
						+ CantidadVecesCargado);
	}

}
