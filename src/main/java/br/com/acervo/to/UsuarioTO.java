package br.com.acervo.to;

public class UsuarioTO {

    private String email;
    private String senha;

    public UsuarioTO(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
