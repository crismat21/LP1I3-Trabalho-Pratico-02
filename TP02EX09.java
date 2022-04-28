import java.util.Scanner;


/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex09 - Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta

String inputValue = "Default que sera convertido ao valor ";
Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
*/
public class TP02EX09 {

    
    public static void main(String[] args) {
        String inputValue = "Default que sera convertido ao valor ";
        Scanner scanner = new Scanner(System.in);
        int dimencaoX, dimencaoY;
        int[][] matrix;

    
        //Colunas
        
        System.out.println("Insira a quantidade de colunas :  ");
        inputValue = scanner.next();
        dimencaoX = Integer.parseInt(inputValue);
            
        while(dimencaoX <= 0 || dimencaoX > 10)
        {
            System.out.println("\nInsira somente uma quantidade entre 1 e 10\n"
                        + "Insira Novamente a quantidade de colunas : ");
            inputValue = scanner.next();
            dimencaoX = Integer.parseInt(inputValue);
        }
        
        //Linhas
        
        System.out.println("Insira a quantidade de Linhas :  ");
        inputValue = scanner.next();
        dimencaoY = Integer.parseInt(inputValue);
            
        while(dimencaoY <= 0 || dimencaoY > 10)
        {
            System.out.println("\nInsira somente uma quantidade entre 1 e 10\n"
                        + "Insira Novamente a quantidade de Linhas : ");
            inputValue = scanner.next();
            dimencaoY = Integer.parseInt(inputValue);
        }
    
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

    System.out.println("\n -------------//-------------------");
    for (int x = 0; x < dimencaoX; x++) {
      for (int y = 0; y < dimencaoY; y++) {
        System.out.print(" " + matrix[x][y] + " ");
      }
     System.out.println("\n -------------//-------------------");
    }
    
    }
        
        
    
}
    