import java.util.Scanner;

public class Exercicio1 {
    /*
        Escreva uma classe Data que representa uma data com dia(inteiro), mês(String) e ano(inteiro).
        Forneça métodos para alterar e consultar os valores da data. No construtor deverá ser
        informado os três valores (dia, mês e ano) obrigatoriamente. Informe os valores que forem
        definidos no construtor na tela e após isso, o usuário deve informar os valores e exibi-los na
        tela.
     */
    public static void main(String[] args) {
        Data data1 = new Data(25, "Dezembro", 2025);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Informe o mês: ");
        String mes = scanner.next();

        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();

        data1.setDia(dia);
        data1.setMes(mes);
        data1.setAno(ano);

        data1.exibirData();
    }
}

class Data {
    private int dia;
    private String mes;
    private int ano;

    public Data(int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        exibirData();
    }

    public void exibirData() {
        System.out.printf("\nData: %d de %s de %d \n\n", getDia(), getMes(), getAno());
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
