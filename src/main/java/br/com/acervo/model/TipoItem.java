package br.com.acervo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoItem {

    public static final int LIVRO = 1;
    public static final int CD = 2;
    public static final int DVD = 3;
    public static final int APOSTILA = 4;
    public static final int REVISTA = 5;

    @Id
    private Long tipoItemKey;
    private String descricao;

    public TipoItem() {
    }

    public TipoItem(Long tipoItemKey) {
        this.tipoItemKey = tipoItemKey;
    }

    public Long getTipoItemKey() {
        return tipoItemKey;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
