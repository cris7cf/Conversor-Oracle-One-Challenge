package cuerpo;

import javax.swing.JOptionPane;

import Divisas.ConvertirDivisas;

import Temperatura.ConvertirTemperatura;

import masa.ConvertirMasa;

import presion.ConvertirPresion;

public class Principal {

	public void principal() {
		String[] options = {"Convertir Divisas","Convertir Temperatura","Convertir Masa",
				"Convertir Presion"};
		String elige = (String) JOptionPane.showInputDialog(null, "¿Qué quieres hacer?", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if (elige.equals("Convertir Divisas")) {
			ConvertirDivisas divisas = new ConvertirDivisas();
			divisas.divisas();
		} else if (elige.equals("Convertir Temperatura")) {
			ConvertirTemperatura temperatura = new ConvertirTemperatura();
			temperatura.temperatura();
		} else if (elige.equals("Convertir Masa")) {
			ConvertirMasa masa = new ConvertirMasa();
			masa.masa();
		} else if (elige.equals("Convertir Presion")) {
			ConvertirPresion presion = new ConvertirPresion();
			presion.presion();
		}
	}	

}

