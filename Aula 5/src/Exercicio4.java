import java.util.Scanner;

public class Exercicio4 {
    /*
        Escreva uma classe Aluno que represente um aluno com nome, matrícula e notas(array).
        Forneça métodos para alterar e consultar os dados do aluno e para calcular a média das notas.
        No construtor deve constar o nome, a matrícula e a nota. Crie um array do tipo aluno com três
        posições, e informe valores para cada um dos alunos.
     */
    public static void main(String[] args) {
        Aluno [] alunos = new Aluno [3];

        for (int i = 0; i < 3; i++) {
            alunos[i] = new Aluno();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o nome do aluno: ");
            String nome = scanner.next();

            System.out.print("Informe a matrícula do aluno: ");
            String matricula = scanner.next();

            alunos[i].setNome(nome);
            alunos[i].setMatricula(matricula);
            alunos[i].preencherNotas();

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("A média das notas do aluno %s é %.2f\n", alunos[i].getNome(), alunos[i].getMediaFinal());
        }
    }
}

class Aluno {
    private String nome;
    private String matricula;
    private int [] notas;

    public double getMediaFinal() {
        double soma = 0;

        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }

        return soma / this.notas.length;
    }

    public void preencherNotas() {
        this.notas = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < this.notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            this.notas[i] = scanner.nextInt();
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = this.matricula;
    }
}