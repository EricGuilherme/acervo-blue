package br.com.acervo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Item {

    @Id
    @Column(name = "ITEM_KEY")
    private Long itemKey;

    private String nome;

    private String idioma;

    private Double valor;

    private Date dataRetirada;

    private Date dataDevolucao;

    @OneToOne
    @JoinColumn(name = "AUTOR_KEY")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "USER_KEY")
    private User user;

    @OneToOne
    @JoinColumn(name = "PROPRIETARIO_KEY")
    private Proprietario proprietario;

    @OneToOne
    @JoinColumn(name = "TIPO_ITEM_KEY")
    private TipoItem tipoItem;

    public Item(TipoItem tipoItem,
                Long itemKey,
                String nome,
                Date dataRetirada,
                Date dataDevolucao) {
        this.tipoItem = tipoItem;
        this.itemKey = itemKey;
        this.nome = nome;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
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

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
