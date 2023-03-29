package presion;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirPresion {
	
	private double valor;
	private double resultado;
	
	public void presion() {
		
		DecimalFormat decimalFormat = new DecimalFormat("#.###################");
		boolean continuarPrograma = true;
		while (continuarPrograma) {
			String [] opciones = {"Pascales [Pa] a Atmosferas [atm]", "Atmosferas [atm] a Pascales [Pa]"};
			String opcion = (String) JOptionPane.showInputDialog(null, "Elige una opcion:",
					"Conversor de Presion", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
			String input = JOptionPane.showInputDialog(null, "Ingrese la Cantidad:");
			valor = 0.00;
			resultado = 0.00;
			try {
				valor = Double.parseDouble(input);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no valido");
				System.exit(0);
			}
			
			if (opcion.equals("Pascales [Pa] a Atmosferas [atm]")) {
				resultado = valor / 101300;
				JOptionPane.showMessageDialog(null, valor + " Pascales son: " +
						decimalFormat.format(resultado) +" Atmosferas");
			} else if (opcion.equals("Atmosferas [atm] a Pascales [Pa]")) {
				resultado = valor * 101300;
				JOptionPane.showMessageDialog(null, valor + " Atmosferas son: " +
						decimalFormat.format(resultado) +" Pascales");
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
