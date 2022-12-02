import java.util.Scanner;
public class vetorInteiro {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in); 
		final int A = 10;
		final int B = 10;
		final int C = A + B;
		int i, a[], b[], c[];
		
		a = new int [10];
		b = new int [10];
		
		for (i = 0; i < A ; i++) {
			System.out.println("Entre com o "+(i+1)+"o . valor");
			a[i] = in.nextInt();
			b[i] = b[i]+a[i];
		}
		for (i = 0; i < B ; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i] = in.nextInt();
			b[i] = a[i]+b[i];
		}
		for (i = 0; i < C ; i++) {
			System.out.println("O "+(i+1)+"o. valor de B é "+a[i]);
		}
	}
}

