package br.com.acervo.model;

import br.com.acervo.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Usuario {

    @Autowired
    UsuarioDao usuarioDao;

    @Id
    private Long userKey;
    private String nome;
    private String email;
    private String senha;
    @OneToMany
    @JoinColumn() // TODO: 17/03/16 Analisar como irá ficar essa relação. Usar joinColumn ou mappedBy
    private List<Item> itens;
    private boolean pendencia;

    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Long getUserKey() {
        return userKey;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Item> getItens() {
        return itens;
    }

    public boolean isPendencia() {
        return pendencia;
    }

    public boolean isLoginValido() {
        return isValido();
    }

    private boolean isValido() {
        return usuarioDao.obterUsuarioPorEmailESenha(this.email, this.senha) != null;
    }
}

