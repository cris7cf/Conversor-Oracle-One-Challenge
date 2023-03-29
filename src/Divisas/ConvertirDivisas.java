package Divisas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirDivisas {
	
	private double valor;
	private double moneda;
	
	public void divisas() {
		
		DecimalFormat formatearDivisas = new DecimalFormat("#.##");
		boolean continuarPrograma = true;
		while (continuarPrograma) {
			String [] opciones = {"Pesos MXM a Dólar", "Pesos MXM a Euros",
					"Pesos MXM a Libras Esterlinas", "Pesos MXM a Yen Japonés",
					"Pesos MXM a Won sul-coreano", "Dolár a Pesos MXM",
					"Euros a Pesos MXM", "Libras Esterlinas Pesos MXM",
					"Yen Japonés a Pesos MXM", "Won sul-coreano a Pesos MXM"};
			String cambio = (String) JOptionPane.showInputDialog(null, "Eliga una opcion:", 
			"Conversor de Moneda", JOptionPane.QUESTION_MESSAGE,  null, opciones, opciones[0]);
			String input = JOptionPane.showInputDialog(null, "Ingrese la Cantidad:");
			valor = 0.00;
			moneda = 0.00;
			try{
				valor = Double.parseDouble(input);
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no valido");
			}

			if (cambio.equals("Pesos MXM a Dólar")) {
				moneda = valor / 19;
				JOptionPane.showMessageDialog(null, valor + " Pesos MXM son: " +
						formatearDivisas.format(moneda) + " Dolares.");				
			} else if (cambio.equals("Dolár a Pesos MXM")) {
				moneda = valor * 19;
				JOptionPane.showMessageDialog(null, valor + " Dolares son: " + 
						formatearDivisas.format(moneda) + " Pesos MXM.");				
			} else if (cambio.equals("Pesos MXM a Euros")) {
				moneda = valor / 20;
				JOptionPane.showMessageDialog(null, valor + " Pesos MXM son: " + 
						formatearDivisas.format(moneda) + " Euros.");				
			} else if (cambio.equals("Euros a Pesos MXM")) {
				moneda = valor * 20;
				if (valor <= 1)
				JOptionPane.showMessageDialog(null, valor + " Euros son: " + 
						formatearDivisas.format(moneda) + " Pesos MXM.");
			} else if (cambio.equals("Pesos MXM a Libras Esterlinas")) {
				moneda = valor / 23;
				JOptionPane.showMessageDialog(null, valor + " Pesos MXM son: " + 
				formatearDivisas.format(moneda) + " Libras Esterlinas.");
			} else if (cambio.equals("Libras Esterlinas Pesos MXM")) {
				moneda = valor * 23;
				JOptionPane.showMessageDialog(null, valor + " Libras Esterlinas son: " + 
				formatearDivisas.format(moneda) + " Pesos MXM.");
			} else if (cambio.equals("Pesos MXM a Yen Japonés")) {
				moneda = valor / 0.14;
				JOptionPane.showMessageDialog(null, valor + " Pesos MXM son: " + 
				formatearDivisas.format(moneda) + " Yen Japonés.");
			} else if (cambio.equals("Yen Japonés a Pesos MXM")) {
				moneda = valor * 0.14;
				JOptionPane.showMessageDialog(null, valor + " Yen Japonés son: " + 
				formatearDivisas.format(moneda) + " Pesos MXM.");
			} else if (cambio.equals("Pesos MXM a Won sul-coreano")) {
				moneda = valor / 0.014;
				JOptionPane.showMessageDialog(null, valor + " Pesos MXM son: " + 
				formatearDivisas.format(moneda) + " Won sul-coreano.");
			} else if (cambio.equals("Won sul-coreano a Pesos MXM")) {
				moneda = valor * 0.014;
				JOptionPane.showMessageDialog(null, valor + " Won sul-coreano  son: " + 
				formatearDivisas.format(moneda) + " Pesos MXM.");
			}
							
			int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?","Confirmar",
					JOptionPane.YES_NO_CANCEL_OPTION);
			if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
				continuarPrograma = false;
				JOptionPane.showMessageDialog(null, "Programa finalizado");					
			}
 
		}

	}
}
