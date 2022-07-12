import java.util.ArrayList;
import java.util.Scanner;
public class ex_3 {
	
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
		float soma = 0, maior = 0, menor = 0, somaNPares = 0;
		int qNPares = 0, qNImpar = 0;
		
		for(int x = 0; x < quantidade; x++) {
			n.add(scanFloat("Qual o valor("+ x +"): "));
		}

		menor = n.get(0);
		for(int x = 0; x < n.size(); x++) {
			float num = n.get(x);
			soma += num;
			if(num>maior)
				maior = num;
	
			if(num<menor)
				menor = num;

			if(n.get(x) % 2 == 0) {
				somaNPares += num;
				qNPares++;
			}
			if(n.get(x) % 2 != 0) 
				qNImpar++;	
		}
		print("Numero de valores: "+n.size());
		print("Soma de valores: "+soma);
		print("Maior valor: "+maior);
		print("Menor valor: "+menor);
		print("Media de valores pares: "+(somaNPares/qNPares));
		print("Porcentagem valores impares: "+(qNImpar*100/n.size()));
		
		sc.close();
	}

}
