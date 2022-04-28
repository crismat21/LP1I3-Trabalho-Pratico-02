import java.util.Scanner;


/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex02 - Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.

String inputValue = "Default que sera convertido ao valor ";
System.out.println("\n -------------//-------------------");
*/

public class TP02EX02 {

    public static void main(String[] args) {
            String inputValue = "Default que sera convertido ao valor ";
            Scanner scanner = new Scanner(System.in);
            //int quantityOfValues = 10;
            int[] valores = new int[10];
            int maior = 0, aux, media, soma = 0;
        
        for(int i = 0; i <= 9;i++)
        {
            System.out.print("Insira o " + (i + 1) + " valor: ");
            inputValue = scanner.next();
            valores[i] = Integer.parseInt(inputValue);

            while(valores[i] < 0)
            {
            System.out.print("Insira Apenas valores positivos!\n"
                    + "Insira o " + (i + 1) + " valor: ");
            inputValue = scanner.next();
            valores[i] = Integer.parseInt(inputValue);
            }
            
            soma += valores[i];
            if(valores[i] > maior)
            {
                maior = valores[i];
            }        
        }
        
            media = soma / 10;
                  

            System.out.println("\n -------------//-------------------");        
            System.out.println("O maior valor e : " + maior);            
            System.out.println("A soma de todos valores e : " + soma);
            System.out.println("A media de todos valores e : " + media);
            System.out.println("\n -------------//-------------------");  
    
    }
    
}