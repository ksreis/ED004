package View;
import Controller.Inverso;

public class Principal {
	public static void main(String[] args) {
	    String str = "O pobre sofre";
	    String strInvertida = Inverso.TextoInverso(str);
	    System.out.println(strInvertida);
	}
}
