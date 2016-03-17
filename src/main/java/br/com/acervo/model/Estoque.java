package br.com.acervo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Estoque {

    @Id
    @Column(name = "ESTOQUE_KEY")
    private Long estoqueKey;
    @OneToMany
    @JoinColumn() // TODO: 17/03/16 Analisar como irá ficar essa relação. Usar joinColumn ou mappedBy
    private List<Item> itens;
    private boolean status;
    private int quantidade;

    public Long getEstoqueKey() {
        return estoqueKey;
    }

    public void setEstoqueKey(Long estoqueKey) {
        this.estoqueKey = estoqueKey;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
