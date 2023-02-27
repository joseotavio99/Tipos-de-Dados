import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double altura,peso,imc;
        


        System.out.println("Digite o peso da pessoa (em kg): ");
        peso = input.nextDouble();
        
        System.out.println("Digite a altura da pessoa (em metros): ");
        altura = input.nextDouble();
        
        imc = peso / (altura * altura);
        //String faixaPeso;
        
        if (imc < 18.5) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso correspondente é : Abaixo do peso \n");
        } else if (imc <= 24.9) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso correspondente é : Peso Normal \n");
        } else if (imc <= 29.9) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso correspondente é : Sobre peso \n");
        } else if (imc <= 34.9) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso correspondente é : Obesidade grau 1 \n");
        } else if (imc <= 39.9) {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso correspondente é : Obesidade grau 2 \n");
        } else {
            System.out.printf("O IMC da pessoa é " + imc + "\n faixa de peso correspondente é : Obesidade grau 3 \n");
        }
    }
}