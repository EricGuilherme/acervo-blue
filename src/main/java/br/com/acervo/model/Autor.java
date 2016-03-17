package br.com.acervo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor {

    @Id
    @Column(name = "AUTOR_KEY")
    private Long autorKey;
    private String nome;

    public Autor(Long autorKey, String nome) {
        this.autorKey = autorKey;
        this.nome = nome;
    }

    public Long getAutorKey() {
        return autorKey;
    }

    public String getNome() {
        return nome;
    }
}
