public class Exercicio6 {
    /*
       Crie um método chamado preencherVetor que recebe como parâmetro um vetor de inteiro de tamanho qualquer.
       O método deverá retornar o vetor preenchido com valores aleatórios entre 1 e 100.
    */
    public static void main(String[] args) {
        int[] vetor = new int[10];

        preencherVetor(vetor);

        for (int i : vetor) {
            System.out.println(i);
        }
    }

    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
    }
}