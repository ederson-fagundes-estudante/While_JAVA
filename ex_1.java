import java.util.Scanner;
public class ex_1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static float scanFloat(String text) {
		print(text);
		return sc.nextFloat();
	}

	public static void main(String[] args) {
		float sCarlos = scanFloat("Qual o salario de carlos?");
		float sJoão = sCarlos/3;
		
		int i = 1;

		double reajusteSalarioCarlos = sCarlos*(1+i*0.02);
		double reajusteSalarioJoão = sJoão*(1+i*0.05);
		
		while(reajusteSalarioCarlos > reajusteSalarioJoão) {
			reajusteSalarioCarlos = reajusteSalarioCarlos*(1.02);
			reajusteSalarioJoão = reajusteSalarioJoão*(1.05);
			i++;
		}
		print("Quantidade de meses necessarios: "+i);
		
		sc.close();
	}

}
