import java.util.ArrayList;

public class PrincipalLivro {
    /*
        Crie uma classe Livro com atributos privados: título, autor, ano e número de páginas.
        Adicione métodos para realizar a manipulação desses atributos (exibição(get) e definição(set)) e também crie um
        método para exibir informações sobre o livro chamado exibirDadosLivro().
        Crie uma classe chamada PrincipalLivro e um arrayList do tipo Livro, defina valores para esses objetos e mostre
        na tela os valores desses objetos utilizando o método exibirDadosPessoa().
     */
    public static void main(String[] args) {
        ArrayList<Livro> livrs = new ArrayList<>();

        livrs.add(new Livro("Clean Code", "Robert C. Martin", 464));
        livrs.add(new Livro("Java: Como Programar", "Deitel", 1200));

        for (Livro l : livrs) {
            l.exibirDadosLivro();
        }
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirDadosLivro() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }
}