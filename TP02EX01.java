import java.util.Scanner;


/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex01 - Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor. 

String inputValue = "Default que sera convertido ao valor ";
Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
*/


public class TP02EX01 {

    public static void main(String[] args) {
    String inputValue = "Default que sera convertido ao valor ";
    int valor1, valor2 = 0;
    

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira o Primeiro valor: ");
    inputValue = scanner.next();
    valor1 = Integer.parseInt(inputValue);
    
    /*do
    {
    System.out.print("Insira o Segundo valor: ");
    inputValue = scanner.next();
    valor2 = Double.parseDouble(inputValue);
    } while (valor1 >= valor2);   
    */
    
    System.out.print("Insira o Segundo valor: ");
    inputValue = scanner.next();
    valor2 = Integer.parseInt(inputValue);
    
    System.out.println("\n -------------//-------------------");
    
    while (valor1 >= valor2)
    {
    System.out.print("Insira um valor maior que " + valor1 + "\nInsira o segundo valor: ");
    inputValue = scanner.next();
    valor2 = Integer.parseInt(inputValue);
    
    if(valor2 > valor1){
        break;
    }
    }
     System.out.println("\n -------------//-------------------");
     System.out.println("Primeiro valor: " + valor1 + "\nSegundo valor: " + valor2);
     System.out.println("\n -------------//-------------------");
}
    
}