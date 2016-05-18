package es.symbel;

public class StringOperations {
	
	/*1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER 
	 * Y DIGA SI ESE CARACTER PERTENECE A LA CADENA O NO 
	 */
	public static void caracterEnCadena(String cadena, CharSequence caracter){
		String cadenaUperCase = cadena.toUpperCase();
		if (cadenaUperCase.contains(caracter.toString().toUpperCase())){
			System.out.println("El caracter " + caracter 
					+ " esta contenido en la cadena " + cadena);
		}else{
			System.out.println("El caracter " + caracter 
					+ " NO esta contenido en la cadena " + cadena);
		}
		
	}
	
	/*2) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER
	 *  Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
	 */
	public static void contarCaracteresEnCadena(String cadena, String caracter){
		String cadenaUperCase = cadena.toUpperCase();
		String caracterUperCase = caracter.toUpperCase();
		
		int numeroApariciones = cadena.length() - cadenaUperCase.replace(caracterUperCase, "").length();
		
	    System.out.println("El caracter " + caracter + " aparece " + numeroApariciones + " veces en la cadena " + cadena);
	}

	
	public static void main(String[] args) {
		
		
		caracterEnCadena("Estefania","E");		
		contarCaracteresEnCadena("Estefania","E");
	}

}
