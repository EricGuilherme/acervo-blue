package br.com.acervo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {

    @Id
    private Long userKey;
    private String nome;
    private String email;
    private String senha;
    @OneToMany
    @JoinColumn() // TODO: 17/03/16 Analisar como irá ficar essa relação. Usar joinColumn ou mappedBy
    private List<Item> itens;
    private boolean pendencia;

    public User(Long userKey, String nome, String email, String senha) {
        this.userKey = userKey;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public List<Item> getItens() {
        return itens;
    }

    public boolean isPendencia() {
        return pendencia;
    }
}

