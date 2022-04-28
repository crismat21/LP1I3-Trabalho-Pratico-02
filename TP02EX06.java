import java.util.Scanner;

/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex06 - Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. 

String inputValue = "Default que sera convertido ao valor ";
Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
*/

public class TP02EX06 {
  
    public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    Scanner scanner = new Scanner(System.in);
    int dimencaoX = 2, dimencaoY = 3;
    String[][] matrix;

    matrix = new String[dimencaoX][dimencaoY];

    for (int x = 1; x <= dimencaoX; x++) {
      for (int y = 1; y <= dimencaoY; y++) {
        String valor;
        
        System.out.println("Insira o valor da posicao " + x + "x" + y + " da matriz: ");               
        inputValue = scanner.next();
        valor = inputValue;

        int currentIndexX = x - 1, currentIndexY = y - 1;

        matrix[currentIndexX][currentIndexY] = valor;
      }
    }

    System.out.println("\n -------------//-------------------");
    for (int x = 0; x < dimencaoX; x++) {
      for (int y = 0; y < dimencaoY; y++) {
        System.out.print(" " + matrix[x][y] + " ");
      }
     System.out.println("\n -------------//-------------------");
    }
    
    }
    
}