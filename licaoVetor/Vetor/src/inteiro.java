import java.util.Scanner;
public class inteiro {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in) ;
		final int A = 10 ; 
		int i, a[], b[];
		
		a = new int [A];
		b = new int [A];
		//leitura dos vetores 
		for (i = 0; i < A ; i++) {
			 System.out.println("Entre com o "+(i+1)+"o. valor");
			 a[i] = in.nextInt();
			 b[i] = a[i]*a[i];
		}
		
		for (i = 0; i < A ; i++) {
			System.out.println("O "+(i+1)+"o. valor de B é "+b[i]);
		}
	}

}
