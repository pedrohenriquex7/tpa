import java.util.Scanner;
public class SalarioMinimo {
	public static void main (String[] args) {
		double salario;
		Scanner in= new Scanner (System.in);
		System.out.println ("Digite o seu Sal�rio:");
		salario= in.nextDouble ();
		if(salario>954.00) {
			System.out.println ("O sal�rio est� a cima");
			}
		else {
			System.out.println ("O sal�rio est� a baixo");
			}
		in.close();
	}
		
}


