import java.util.Scanner;

public class FaixaEtaria {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome? ");
        String nome = input.nextLine();
        
        System.out.println("Qual é a sua idade? ");
        int idade = input.nextInt();
        
        String faixaEtaria;
        
        if (idade < 0) {
            faixaEtaria = "idade inválida";
        } else if (idade >= 0 && idade <= 12) {
            faixaEtaria = "criança";
        } else if (idade >= 13 && idade <= 17) {
            faixaEtaria = "adolescente";
        } else if (idade >= 18 && idade <= 59) {
            faixaEtaria = "adulto";
        } else {
            faixaEtaria = "idoso";
        }
        
        System.out.printf(nome +  " você está na faixa etária de." + faixaEtaria +  "\n");
    }
}
