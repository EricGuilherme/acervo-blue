package br.com.acervo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoItem {

    @Id
    private Long tipoItemKey;
    private String descricao;

    public TipoItem(Long tipoItemKey, String descricao) {
        this.tipoItemKey = tipoItemKey;
        this.descricao = descricao;
    }

    public Long getTipoItemKey() {
        return tipoItemKey;
    }

    public String getDescricao() {
        return descricao;
    }
}
