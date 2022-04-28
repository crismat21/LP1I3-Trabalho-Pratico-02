import java.util.Scanner;


/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex10 - Entrar com uma matriz de ordem MxM, onde a ordem tambem sera escolhida pelo usuario,
sendo que no maximo sera de ordem 10 e quadratica. Apos a digitacao dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/

public class TP02Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m;
		
		System.out.println("Entre com a ordem da matriz: ");
		
		do {
			m = sc.nextInt();
			
			if (m > 10) {
				System.out.println("O valor precisa ser menor que 10. Tente novamente!");
			} 
		} while (m > 10);		
      
		
		int matriz[][] = new int[m][m];
		
		for (int i=0; i < m; i++) {
			
			for (int j=0; j < m; j++) {
				System.out.println("Entre com o valor da posi��o matriz["+i+"]["+j+"] = ");
				matriz[i][j] = sc.nextInt();
			}
			
		  }
		
		for (int i=m-1; i > -1; i--) {
			
			for (int j=m-1; j > -1; j--) {
				System.out.println("matriz["+i+"]["+j+"] = "+matriz[i][j]);
			}
			
		  }			

		}

}