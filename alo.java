package dezesseteabril;
import java.util.Scanner;
public class alo {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);

	String usuario;
	System.out.println("quem é você usuario? Digite um nome");
	usuario = ler.nextLine();

	System.out.println("Escolha um numero de 1 a 10");
	int numero = ler.nextInt();


	switch (numero) {
	case 1:
		System.out.println("O");

	case 2:
		System.out.println("Ol");
		
	case 3:
		System.out.println("Olá");
	
	case 4:
		System.out.println("Olá M");
		
	case 5:
		System.out.println("Olá M");
		
	case 6:
		System.out.println("Olá Mu");
		
	case 7:
		System.out.println("Olá Mun");
		
	case 8:
		System.out.println("Olá Mund");
		
	case 9:
		System.out.println("Olá Mundo");
		
	case 10:
		System.out.println("===================================================================");
		
	case 11:
		System.out.println("Olá Mundo");
		
	case 12:
		System.out.println("Olá Mundo");
		
	case 13:
		System.out.println("Olá Mundo");
		
	case 14:
		System.out.println("Olá Mundo");
		
	case 15:
		System.out.println("Olá Mundo");
		
	default:
		System.out.println("NÃO É UM NUMERO VALIDO! POR FAVOR TENTE NOVAMENTE");
  }
 }
}