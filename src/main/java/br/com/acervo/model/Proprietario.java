package br.com.acervo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Proprietario {

    @Id
    private Long proprietarioKey;
    private String nome;
    @OneToMany
    @JoinColumn() // TODO: 17/03/16 Analisar como irá ficar essa relação. Usar joinColumn ou mappedBy
    private List<Item> itens;

    public Long getProprietarioKey() {
        return proprietarioKey;
    }

    public void setProprietarioKey(Long proprietarioKey) {
        this.proprietarioKey = proprietarioKey;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

}
