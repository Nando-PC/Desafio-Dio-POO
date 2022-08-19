package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //protected somente tem acesso quem tiver herança
    //static acesso ao atributo direto da classe
    //final cria uma constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //Para criar metodo ABSTRATO a classe deverá ser ABSTRATA
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
