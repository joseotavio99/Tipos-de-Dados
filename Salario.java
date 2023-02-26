import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double novoSalario, salarioAtual;
        
        System.out.println("Qual é o seu salário atual? ");
        salarioAtual = input.nextDouble();
        
        
        
        if (salarioAtual >= 1000 && salarioAtual < 2000) {
            novoSalario = salarioAtual * 1.15;
        } else if (salarioAtual >= 2000 && salarioAtual < 3000) {
            novoSalario = salarioAtual * 1.10;
        } else if (salarioAtual >= 3000) {
            novoSalario = salarioAtual * 1.05;
        } else {
            novoSalario = salarioAtual;
        }
        
        System.out.printf("Seu novo salário é R$ %.2f.\n", novoSalario);
    }
}
