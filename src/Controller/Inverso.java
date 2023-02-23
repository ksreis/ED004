package Controller;

public class Inverso {
	public Inverso() {
	super();
	}

	public static String TextoInverso(String str) {
	    // condição de parada
	    if (str.length() <= 1) {
	        return str;
	    }
	    // É feito uma concatenação do último caractere da string com a string invertida
	    else {
	        return str.substring(str.length() - 1) + TextoInverso(str.substring(0, str.length() - 1));
	    }
	}	
}
