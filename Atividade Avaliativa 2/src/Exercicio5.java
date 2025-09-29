import java.util.ArrayList;

public class Exercicio5 {
    /*
        Crie uma classe Aluno com atributos privados: nome, matrícula e notas(vetor com 3 índices).
        Implemente métodos para calcular a média das notas e verificar se o aluno está aprovado ou reprovado, considerando
        que a média é 7(ou seja, será aprovado com média igual ou superior à 7).
        Crie os métodos para realizar a manipulação dos atributos da classe.
        Crie a classe chamada PrincipalAluno que irá conter um arrayList de Alunos que irá representar uma turma.
        Informe valores para cada um desses objetos, mostre suas informações na tela (nome, matrícula e cada uma das notas) e se foi aprovado ou reprovado.
        Além disso, na classe PrincipalAluno mostre na tela as seguintes informações:
            Quantidade de alunos  na turma;
            Média das notas da turma;
            Quantidade de alunos aprovados;
            Quantidade de alunos reprovados;
            Aluno com maior nota;
            Aluno com menor nota.
     */
    public static void main(String[] args) {
        ArrayList<Aluno> turma = new ArrayList<>();

        turma.add(new Aluno("João", "001", new double[]{8, 7, 9}));
        turma.add(new Aluno("Maria", "002", new double[]{5, 6, 5}));
        turma.add(new Aluno("Ana", "003", new double[]{9, 10, 8}));

        int qtd = turma.size();
        double somaMedias = 0;
        int aprovados = 0;
        int reprovados = 0;
        Aluno maiorNota = turma.get(0);
        Aluno menorNota = turma.get(0);

        for (Aluno a : turma) {
            a.exibirDados();
            double media = a.calcularMedia();
            somaMedias += media;

            if (a.isAprovado()) aprovados++;
            else reprovados++;

            if (media > maiorNota.calcularMedia()) maiorNota = a;
            if (media < menorNota.calcularMedia()) menorNota = a;
        }

        System.out.println("\nQuantidade de alunos: " + qtd);
        System.out.println("Média da turma: " + (somaMedias / qtd));
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Aluno com maior nota: " + maiorNota.getNome());
        System.out.println("Aluno com menor nota: " + menorNota.getNome());
    }
}

class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.length;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 7;
    }

    public void exibirDados() {
        System.out.print("Aluno: " + nome + " | Matrícula: " + matricula + " | Notas: ");
        for (double n : notas) System.out.print(n + " ");
        System.out.println("| Média: " + calcularMedia() + " | " + (isAprovado() ? "Aprovado" : "Reprovado"));
    }
}