package conversor;

import javax.swing.JOptionPane;


public class ConversorMoneda extends Menu {

	
	
	public boolean ValidarNumero(String input) {
		if ( input.matches("^[0-9]+([.][0-9]+)?$") ){
			return true;
		}else{
			JOptionPane.showMessageDialog(null, "Ingresa solo valor numerico.");
			return false;
		} 
	}
	
	public double ConversionMoneda(double MonedaInput) {
		 String tipoConversion = ( JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir su dinero","Monedas", 
								JOptionPane.PLAIN_MESSAGE, null, new Object[] {
				  "De peso a Dolar",
				  "De peso a Euro",
				  "De peso a Libras",
				  "De peso a Yen",
				  "De peso a Won coreano",
				  "De Dolar a Peso",
				  "De Euro a Peso",
				  "De Libras a Peso",
				  "De Yen a Peso",
				  "De Won coreano a Peso",	
		},"De peso a Dolar")).toString();
		
		 switch (tipoConversion) {
			case "De peso a Dolar":
				MonedaInput = MonedaInput / 19.64;
				break;
				
			case "De peso a Euro":
				MonedaInput = MonedaInput / 20.98;
				break;
				
			case "De peso a Libras":
				MonedaInput = MonedaInput / 24.67;
				break;
				
			case "De peso a Yen":
				MonedaInput = MonedaInput / 0.15;
				break;
				
			case "De peso a Won coreano":
				MonedaInput = MonedaInput * 0.016;
				break;
				
			case "De Dolar a Peso":
				MonedaInput = MonedaInput * 19.64;
				break;
				
			case "De Euro a Peso":
				MonedaInput = MonedaInput * 20.98;
				break;
				
			case "De Libras a Peso":
				MonedaInput = MonedaInput * 24.67;
				break;
				
			case "De Yen a Peso":
				MonedaInput = MonedaInput * 0.15;
				break;
				
			case "De Won coreano a Peso":
				MonedaInput = MonedaInput / 0.016;
				break;
				
			default:
				break;
			}
		 
			return MonedaInput;
		}
	}
	
	