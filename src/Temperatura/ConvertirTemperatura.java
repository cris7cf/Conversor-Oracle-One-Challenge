package Temperatura;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
		
		private double resultado;
		private double valor;
		
		public void temperatura() {
			
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
			boolean seguirPrograma = true;
			while (seguirPrograma) {
				String [] opciones = {"Celsius a Fahrenheit","Fahrenheit a Celsius","Celsius a Kelvin","Kelvin a Celsius"};
				String opcion = (String) JOptionPane.showInputDialog(null, "Eliga una opcion:", 
						"Conversor de Temperatura",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				String valorNominal = JOptionPane.showInputDialog(null, "Ingrese temperatura:");
				valor = 0.00;
				resultado = 0.00;
				try{
					valor = Double.parseDouble(valorNominal);
				} catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor no valido");
					System.exit(0);
				}
				
				if (opcion.equals("Celsius a Fahrenheit")) {
					resultado = (valor * (9/5)) + 32; 
					JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " +
							decimalFormat.format(resultado) + " grados Fahrenheit"); 
				} else if (opcion.equals("Fahrenheit a Celsius")) {
					resultado = (valor - 32) * (9/5); 
					JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " +
							decimalFormat.format(resultado) + " grados Celsius");
				} else if (opcion.equals("Celsius a Kelvin")) {
					resultado = valor + 273.15; 
					JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " +
							decimalFormat.format(resultado) + " grados Kelvin");
				} else if (opcion.equals("Kelvin a Celsius")) {
					resultado = valor - 273.15; 
					JOptionPane.showMessageDialog(null, valor + " Grados Kelvin son: " +
							decimalFormat.format(resultado) + " grados Celsius");
				}
								
				int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?","Confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					seguirPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa finalizado");					
				}
			}
		}
		
		

}
