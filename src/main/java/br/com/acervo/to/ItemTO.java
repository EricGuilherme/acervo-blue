package br.com.acervo.to;

import java.util.Date;

public class ItemTO {

    private String nome;
    private String idioma;
    private Double valor;
    private Date dataRetirada;
    private Date dataDevolucao;
    private AutorTO autor;
    private UsuarioTO usuario;
    private ProprietarioTO proprietario;

    public ItemTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public AutorTO getAutor() {
        return autor;
    }

    public void setAutor(AutorTO autor) {
        this.autor = autor;
    }

    public UsuarioTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioTO usuario) {
        this.usuario = usuario;
    }

    public ProprietarioTO getProprietario() {
        return proprietario;
    }

    public void setProprietario(ProprietarioTO proprietario) {
        this.proprietario = proprietario;
    }
}
