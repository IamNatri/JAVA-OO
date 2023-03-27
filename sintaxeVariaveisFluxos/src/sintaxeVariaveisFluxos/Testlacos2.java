package sintaxeVariaveisFluxos;

public class Testlacos2 {

	public static void main(String[] args) {
		
		//i = linha
		for (int i = 1; i <= 10; i++) {
			// j = coluna
			for(int j = 1; j<=10; j++) {
				if (j > i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		for (int i = 3; i < 100; i+=3) {
			System.out.println(i);
			
			//if(i % 3 == 0 ){
			//	System.out.println(i);
			//}
			
		}
	}
}
