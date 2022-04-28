import java.util.Scanner;


/*Cristiano Guimarães de Carvalho FP CB3013111
Patricia Jéssica Santos Fernandes Pinheiro CB3013073
TP02Ex03 - Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;

String inputValue = "Default que sera convertido ao valor ";
Scanner scanner = new Scanner(System.in);
System.out.println("\n -------------//-------------------");
System.out.println("");
*/

public class TP02EX03 {

    public static void main(String[] args) {
        boolean  VerifBool = true;
               
        while (VerifBool)
        {
            String inputValue = "Default que sera convertido ao valor ";
            String Verif = "gghghgh";
            Scanner scanner = new Scanner(System.in);
            //int quantityOfValues = 10;
            //int[] valores = new int[];
            int quantidadeValoresN = 0;
            int  media, soma = 0;
            double contPos = 0, contNeg = 0,porcenPos = 0, porcenNeg = 0;
            
            
            System.out.println("Insira a quantidade de valores do programa : ");
            inputValue = scanner.next();
            quantidadeValoresN = Integer.parseInt(inputValue);
            
            while(quantidadeValoresN <= 0 || quantidadeValoresN >= 20)
            {
                System.out.println("\nInsira somente uma quantidade entre 1 e 19\n"
                        + "Insira Novamente a quantidade de valores do programa: ");
                inputValue = scanner.next();
                quantidadeValoresN = Integer.parseInt(inputValue);
            }
            
            int[] valores = new int[quantidadeValoresN];
            int maior = valores[0], menor = valores[0];
            
            for(int i = 0; i <= (quantidadeValoresN - 1);i++)
            {
                System.out.print("Insira o " + (i + 1) + " valor: ");
                inputValue = scanner.next();
                valores[i] = Integer.parseInt(inputValue);
               

                soma += valores[i];
                if(valores[i] > maior)
                {
                    maior = valores[i];
                }
                if(valores[i] < menor )
                {
                    menor = valores[i];
                }
                
                if(valores[i] > 0)
                {
                 contPos++;
                }
                else
                {
                 contNeg++;
                }
            }

            
            porcenPos = (contPos / quantidadeValoresN) * 100;
            porcenNeg = (contNeg / quantidadeValoresN) * 100;
            media = soma / quantidadeValoresN;
                  

            System.out.println("\n -------------//-------------------");
            System.out.println("O maior valor e : " + maior);  
            System.out.println("O menor valor e : " + menor);
            System.out.println("A soma de todos valores e : " + soma);
            System.out.println("A media de todos valores e : " + media);
            System.out.println("A porcentagem de valores positivos e : " + porcenPos);
            System.out.println("A porcentagem de valores negativos e : " + porcenNeg);
            System.out.println("\n -------------//-------------------");  
            
            //System.out.println(quantidadeValoresN);
        
            System.out.println("\n Deseja Efetuar Uma Nova Consulta? (S/N) ?: ");
            Verif = scanner.next();  
            
        
        while (!Verif.equals("N") || !Verif.equals("n") || !Verif.equals("S") || !Verif.equals("s")){
	  
	  if (Verif.equals("N") || Verif.equals("n") || Verif.equals("S") || Verif.equals("s"))
            {
		break;
            }
		System.out.println("\nInsira Apenas S para Sim ou N para Nao \n ");
		System.out.println("\n Deseja Efetuar Uma Nova Consulta? (S/N) ?: ");
		Verif = scanner.next();  	  
            } 
  
            if (Verif.equals("N")|| Verif.equals("n"))
            {
              VerifBool = false; 
            }           
        
        } 
        
    }
    
}