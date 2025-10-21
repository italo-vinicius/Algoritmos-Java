package Exercicio5;

public class Chamado {
    public int id;
    public String descricao = "";
    public String prioridade = "";
    public String status = "";
    public Tecnico tecnicoResponsavel;

    public static void abrirChamado(Chamado chamado)
    {
        chamado.status = "Aberto";
    }

    public static void fecharChamado(Chamado chamado)
    {
        chamado.status = "Fechado";
    }

    public static String exibirDetalhesChamado(Chamado chamado)
    {
        return "Chamado ID: " + chamado.id + "\n" +
               "Descrição: " + chamado.descricao + "\n" +
               "Prioridade: " + chamado.prioridade + "\n" +
               "Status: " + chamado.status + "\n" +
               "Técnico: " + (chamado.tecnicoResponsavel.nome) + "\n" +
               "Especialidade: " + (chamado.tecnicoResponsavel.especialidade) + "\n\n";
    }
}
