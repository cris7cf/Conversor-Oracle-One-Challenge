package masa;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirMasa {
	
	private double valor;
	private double resultado;
	
	public void masa() {
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		boolean continuarPrograma = true;
		while (continuarPrograma) {
			String [] opciones = {"Gramos [g] a Kilogramos [Kg]", "Kilogramos [Kg] a Gramos [g]",
					"Kilogramos [Kg] a Libras [lb]", "Libras [lb] a Kilogramos [Kg]"};
			String opcion = (String) JOptionPane.showInputDialog(null, "Elige una opcion:",
					"Conversor de Masa", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			String input = JOptionPane.showInputDialog(null, "Ingrese la Cantidad:");
			valor = 0.00;
			resultado = 0.00;
			try {
				valor = Double.parseDouble(input);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no valido");
				System.exit(0);
			}
			
			if (opcion.equals("Gramos [g] a Kilogramos [Kg]")) {
				resultado = valor / 1000;
				JOptionPane.showMessageDialog(null, valor + " Gramos son: " +
						decimalFormat.format(resultado) +" Kilogramos");
			} else if (opcion.equals("Kilogramos [Kg] a Gramos [g]")) {
				resultado = valor * 1000;
				JOptionPane.showMessageDialog(null, valor + " Kilogramos son: " +
						decimalFormat.format(resultado) +" Gramos");
			} else if (opcion.equals("Kilogramos [Kg] a Libras [lb]")) {
				resultado = valor * 2.205;
				JOptionPane.showMessageDialog(null, valor + " Kilogramos son: " + 
						decimalFormat.format(resultado) + " Libras");
			} else if (opcion.equals("Libras [lb] a Kilogramos [Kg]")) {
				resultado = valor / 2.205;
				JOptionPane.showMessageDialog(null, valor + " Libras son: " + 
						decimalFormat.format(resultado) + " Kilogramos");
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
