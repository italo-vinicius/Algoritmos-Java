import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Peso {
    /*
        Crie uma classe chamada Peso que permite calcular o peso de uma pessoa em
        vários planetas através de um método chamado converterPeso. O método deverá receber
        como argumento o peso da pessoa e o Planeta a ser convertido e retornar o novo peso.
        Mostre na tela o peso original, o novo peso e o planeta escolhido.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Double> gravidade = new HashMap<>();
        gravidade.put(1, 0.37);
        gravidade.put(2, 0.88);
        gravidade.put(3, 0.38);
        gravidade.put(4, 2.64);
        gravidade.put(5, 1.15);
        gravidade.put(6, 1.17);

        Map<Integer, String> nomes = new HashMap<>();
        nomes.put(4, "Jupiter");
        nomes.put(1, "Mercurio");
        nomes.put(2, "Venus");
        nomes.put(3, "Marte");
        nomes.put(5, "Saturno");
        nomes.put(6, "Urano");

        System.out.print("Digite seu peso: ");
        double valor = sc.nextDouble();

        System.out.println("Digite o Planeta: \n[1] Mercurio \n[2] Venus \n[3] Marte \n[4] Jupiter \n[5] Saturno \n[6] Urano");
        int opcaoPlaneta = sc.nextInt();

        converterPeso(valor, opcaoPlaneta, gravidade, nomes);
    }

    public static void converterPeso(double valor, int opcaoPlaneta, Map<Integer, Double> gravidade, Map<Integer, String> nomes) {
        if (!gravidade.containsKey(opcaoPlaneta)) {
            System.out.println("Planeta invalido");
            return;
        }
        double pesoConvertido = (valor / 9.807) * gravidade.get(opcaoPlaneta);
        String nomePlaneta = nomes.get(opcaoPlaneta);

        System.out.printf("Peso original: %.2f kg\n", valor);
        System.out.printf("Novo peso em %s: %.2f kg\n", nomePlaneta, pesoConvertido);
    }
}
