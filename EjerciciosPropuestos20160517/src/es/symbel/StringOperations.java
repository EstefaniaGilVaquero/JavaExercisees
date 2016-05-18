package es.symbel;

public class StringOperations {

	public static void caracterEnCadena(String cadena, CharSequence caracter){
		String cadenaUperCase = cadena.toUpperCase();
		if (cadenaUperCase.contains(caracter.toString().toUpperCase())){
			System.out.println("El caracter: " + caracter 
					+ " esta contenido en la cadena: " + cadena);
		}else{
			System.out.println("El caracter: " + caracter 
					+ " NO esta contenido en la cadena: " + cadena);
		}
		
	}
	
	public static void main(String[] args) {
		
		/*1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER 
		 * Y DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO 
		 */
		caracterEnCadena("Estefania","E");
	}

}
