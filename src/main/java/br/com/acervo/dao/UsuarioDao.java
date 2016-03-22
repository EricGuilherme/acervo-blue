package br.com.acervo.dao;

import br.com.acervo.model.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UsuarioDao {

    @PersistenceContext
    private EntityManager manager;

    public Usuario obterUsuarioPorEmailESenha(String email, String senha) {

        String jpql = "select u from Usuario u where u.email = :email and u.senha = :senha";

        return manager.createQuery(jpql, Usuario.class)
                    .setParameter("email", email)
                    .setParameter("senha", senha)
                    .getSingleResult();
    }
}
