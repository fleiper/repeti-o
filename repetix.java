package dezesseteabril;
import java.util.Scanner;
public class repetix {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, resultado; 

		System.out.print("informe um numero para a tabuada: ");
		n= ler.nextInt();

		for (int i=0; i <=100; i++) {
			resultado= n*i;
			System.out.println(n + " x " + i + " = " + resultado);
		}
	}
}
