import java.util.Scanner;

public class SomaDeNumeros {


    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n1, n2, soma;
        
        System.out.println("Informe o valor do primeiro numero : ");
        n1 = input.nextInt();
    
        System.out.println("Informe o valor do segundo numero ");
        n2 = input.nextInt();
    
        soma = n1 + n2 ;
    
        System.out.printf("Seu primeiro numero foi = " + n1);
        System.out.printf("\n Seu segundo numero foi = " + n2);
        System.out.printf("\n A soma dos dois numeros = " + soma +  "\n");
    
        }
}
