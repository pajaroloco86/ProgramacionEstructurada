
public class RaizCuadrada {

	public static void main(String[] args) {
	double numero = 0;
	double raiz;
	
	raiz = Math.sqrt(numero);
	System.out.println("numero natural" + "             raiz");
	
	while (numero < 100) {
		
		numero ++;
		raiz = Math.sqrt(numero);
		
		System.out.println(numero + "                -         " + raiz);
		
	} 

	}

}
