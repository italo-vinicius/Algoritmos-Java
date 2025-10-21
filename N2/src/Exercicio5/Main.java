package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico1 = new Tecnico();
        tecnico1.nome = "Carla";
        tecnico1.especialidade = "Redes";

        Tecnico tecnico2 = new Tecnico();
        tecnico2.nome = "João";
        tecnico2.especialidade = "Hardware";

        Tecnico tecnico3 = new Tecnico();
        tecnico3.nome = "Mario";
        tecnico3.especialidade = "Hardware";

        Chamado chamado = new Chamado();
        chamado.id = 1;
        chamado.descricao = "Computador não liga.";
        chamado.prioridade = "Alta";
        chamado.tecnicoResponsavel = tecnico1;

        Chamado chamado2 = new Chamado();
        chamado2.id = 2;
        chamado2.descricao = "Impressora sem tinta.";
        chamado2.prioridade = "Média";
        chamado2.tecnicoResponsavel = tecnico2;

        Chamado chamado3 = new Chamado();
        chamado3.id = 3;
        chamado3.descricao = "Ar-condicionado não funciona.";
        chamado3.prioridade = "Baixa";
        chamado3.tecnicoResponsavel = tecnico3;

        Chamado.abrirChamado(chamado);
        Chamado.abrirChamado(chamado2);
        Chamado.abrirChamado(chamado3);

        System.out.println(Chamado.exibirDetalhesChamado(chamado));
        System.out.println(Chamado.exibirDetalhesChamado(chamado2));
        System.out.println(Chamado.exibirDetalhesChamado(chamado3));

        Chamado.fecharChamado(chamado2);

        System.out.println(Chamado.exibirDetalhesChamado(chamado));
        System.out.println(Chamado.exibirDetalhesChamado(chamado2));
        System.out.println(Chamado.exibirDetalhesChamado(chamado3));
    }
}
