package conversor;

import javax.swing.JOptionPane;

import conversor.ConversorMoneda;
import conversor.ConversorTemperatura;

public class Menu {
	
	public static void main(String[] args) {
	
		
		ConversorMoneda cm = new ConversorMoneda();
		ConversorTemperatura ct = new ConversorTemperatura();
		
		while(true) {
			
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
				     JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},          	
				     "Selecciona")).toString();
			
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: "); 
				if(cm.ValidarNumero(input) == true) {
					double MonedaInput = Double.parseDouble(input);
					double total = cm.ConversionMoneda(MonedaInput);
					JOptionPane.showMessageDialog(null, "Tienes $ " + Math.round(total * 100) / 100d);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Terminado");
						break;
					}
				}
			}
			else if(opciones == "Conversor de Temperatura") {
				String input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir: ");
				if(ct.ValidarNumero(input) == true) {
					double TemperaturaInput = Double.parseDouble(input);
					double total = ct.ConversionTemperatura(TemperaturaInput);
					JOptionPane.showMessageDialog(null, "Tienes " + Math.round(total) + " grados ");
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Terminado");
						break;
					}
				}
			}
			 
		}
		
		
	}
	
}