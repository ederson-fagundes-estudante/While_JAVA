import java.util.ArrayList;
import java.util.Scanner;
public class ex_2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static float scanFloat(String text) {
		print(text);
		return sc.nextFloat();
	}

	public static void main(String[] args) {
		float quantidade = scanFloat("Quantos valores serão lidos?");
		ArrayList<Float> n = new ArrayList<Float>();
		
		for(int x = 0; x < quantidade; x++) {
			n.add(scanFloat("Qual o valor("+ x +"): "));
		}
		
		for(int x = 0; x < n.size(); x++) {
			print("Valor: "+n.get(x));
			print("Valor ao quadrado: "+Math.pow(n.get(x), 2));
			print("Valor ao cubo: "+Math.pow(n.get(x), 3));
			print("Valor raiz quadrada: "+Math.sqrt(n.get(x)));
		}
		
		sc.close();
	}

}
