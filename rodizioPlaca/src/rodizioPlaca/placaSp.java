package rodizioPlaca;
import	java.util.Scanner;
public class placaSp {
	public static void main (String[]args ) {
	Scanner in= new Scanner (System.in); 
	int nP;
	System.out.println ("Digite o ultimo numero da placa");
	nP= in.nextInt();
	switch(nP) {
		case 1:
		case 2:System.out.println ("N�o pode rodar de Segunda Feira");
			break;
		case 3:
		case 4:System.out.println ("N�o pode rodar de Ter�a Feira");
			break;
		case 5:
		case 6:System.out.println ("N�o pode rodar de Quarta Feira");
			break;
		case 7:
		case 8:System.out.println ("N�o pode rodar de Quinta Feira");
		break;
		case 9:
		case 0:System.out.println ("N�o pode rodar de Sexta Feira");
			break;
			default:
				System.out.println ("N�mero inv�lido");
				in.close();
			}
		}
	}	
