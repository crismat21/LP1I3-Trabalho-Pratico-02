import java.util.Scanner;


/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex07 - Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.  

String inputValue = "Default que sera convertido ao valor ";
Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
*/

public class TP02EX07 {

    
    public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    Scanner scanner = new Scanner(System.in);
    int dimencaoX = 3, dimencaoY = 4;
    int[][] matrix;
    int MultiCons;

    matrix = new int[dimencaoX][dimencaoY];

    for (int x = 1; x <= dimencaoX; x++) {
      for (int y = 1; y <= dimencaoY; y++) {
        int valor;
        
        System.out.println("Insira o valor da posicao " + x + "x" + y + " da matriz: ");               
        inputValue = scanner.next();
        valor = Integer.parseInt(inputValue);

        int currentIndexX = x - 1, currentIndexY = y - 1;

        matrix[currentIndexX][currentIndexY] = valor;
      }
    }
    
    System.out.print("Insira a constante Multiplicativa : ");
    inputValue = scanner.next();
    MultiCons = Integer.parseInt(inputValue);
    
    
    for (int x = 1; x <= dimencaoX; x++) {
      for (int y = 1; y <= dimencaoY; y++) {
        int valor;

        int currentIndexX = x - 1, currentIndexY = y - 1;

        valor = matrix[currentIndexX][currentIndexY];

        matrix[currentIndexX][currentIndexY] =
          valor * MultiCons;
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