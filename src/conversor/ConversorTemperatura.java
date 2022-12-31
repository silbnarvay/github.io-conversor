package conversor;

import javax.swing.JOptionPane;

import conversor.Menu;

public class ConversorTemperatura extends Menu {

	public boolean ValidarNumero(String input) {
		if ( input.matches("^[0-9]+([.][0-9]+)?$") ){
			return true;
		}else{
			JOptionPane.showMessageDialog(null, "Ingresa solo valor numerico.");
			return false;
		} 
	}
	
	
	public double ConversionTemperatura(double TemperaturaInput) {
		String tipoConversion = ( JOptionPane.showInputDialog(null, "Elija la escala a la que desea convertir su temperatura","Temperaturas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						 "De Celcius a Fahrenheit",
						  "De Celcius a Kelvin",
						  "De Fahrenheit a Celcius",
						  "De Fahrenheit a Kelvin",
						  "De Kelvin a Celcius",
						  "De Kelvin a Fahrenheit",
			},"De Celcius a Fahrenheit")).toString();
		
		
		switch (tipoConversion) {
		
		case "De Celcius a Fahrenheit":
			TemperaturaInput =  (TemperaturaInput * 1.8) + 32 ;
			break;
			
		case "De Celcius a Kelvin":
			TemperaturaInput = TemperaturaInput + 273.15 ;
			break;
			
		case "De Fahrenheit a Celcius":
			TemperaturaInput = (TemperaturaInput - 32) * 1.8;
			break;
			
		case "De Fahrenheit a Kelvin":
			TemperaturaInput = (TemperaturaInput - 32) * 5/9 + 273.15;
			break;
			
		case "De Kelvin a Celcius":
			TemperaturaInput = TemperaturaInput - 273.15;
			break;
			
		case "De Kelvin a Fahrenheit":
			TemperaturaInput = (TemperaturaInput - 273.15) * 9/5 + 32;
			break;

		default:
			break;
		}
		return TemperaturaInput;
		}
		
}	
