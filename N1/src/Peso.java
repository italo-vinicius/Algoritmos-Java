import java.util.Scanner;

public class Peso {
    /*
        Crie uma classe chamada Peso que permite calcular o peso de uma pessoa em
        vários planetas através de um método chamado converterPeso. O método deverá receber
        como argumento o peso da pessoa e o Planeta a ser convertido e retornar o novo peso.
        Mostre na tela o peso original, o novo peso e o planeta escolhido.
     */
    public static void main(String[] args) {
        System.out.print("Digite seu peso: ");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextInt();

        System.out.println("Digite o Planeta: \n[1] Mercurio \n[2] Venus \n[3] Marte \n[4] Jupiter \n[5] Saturno \n[6] Urano");
        int opcaoPlaneta = sc.nextInt();

        converterPeso(valor, opcaoPlaneta);
    }

    public static void converterPeso(double valor, int opcaoPlaneta) {
        double pesoConvertido = 0;

        switch (opcaoPlaneta) {
            case 1:
                pesoConvertido = (valor / 9.807) * 0.37;
                break;
            case 2:
                pesoConvertido = (valor / 9.807) * 0.88;
                break;
            case 3:
                pesoConvertido = (valor / 9.807) * 0.38;
                break;
            case 4:
                pesoConvertido = (valor / 9.807) * 2.64;
                break;
            case 5:
                pesoConvertido = (valor / 9.807) * 1.15;
                break;
            case 6:
                pesoConvertido = (valor / 9.807) * 1.17;
                break;
            default:
                System.out.println("Planeta invalido");
                return;
        }

        System.out.printf("Seu peso no planeta e: %.2f\n", pesoConvertido);
    }
}
