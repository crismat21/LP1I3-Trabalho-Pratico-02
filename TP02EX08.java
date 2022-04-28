import java.util.Scanner;


/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex08 - Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas. 

String inputValue = "Default que sera convertido ao valor ";
Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
*/
public class TP02EX08 {

    
    public static void main(String[] args) {
        String inputValue = "Default que sera convertido ao valor ";
        Scanner scanner = new Scanner(System.in);
        int dimencaoX = 3, dimencaoY = 4;
        int[][] matrix, matrixMulti;
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

         matrixMulti = new int[dimencaoX][dimencaoY];

        for (int x = 1; x <= dimencaoX; x++) {
          for (int y = 1; y <= dimencaoY; y++) {
            int valor;

            int currentIndexX = x - 1, currentIndexY = y - 1;

            valor = matrix[currentIndexX][currentIndexY];

            matrixMulti[currentIndexX][currentIndexY] =
              valor * MultiCons;
          }
        }


        System.out.println("\n Matriz Original : \n ");
        System.out.println("\n -------------//-------------------");

        for (int x = 0; x < dimencaoX; x++) {
          for (int y = 0; y < dimencaoY; y++) {
            System.out.print(" " + matrix[x][y] + " ");
          }
         System.out.println("\n -------------//-------------------");
        }

        System.out.println("\n Matriz Original : \n ");
        System.out.println("\n -------------//-------------------");

        for (int x = 0; x < dimencaoX; x++) {
          for (int y = 0; y < dimencaoY; y++) {
            System.out.print(" " + matrixMulti[x][y] + " ");
          }
         System.out.println("\n -------------//-------------------");
        }
    
    
    }
        
        
 }