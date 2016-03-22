package br.com.acervo.seguranca;

import br.com.acervo.model.Usuario;
import br.com.acervo.to.UsuarioTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping
    @ResponseBody
    public boolean login(@RequestBody UsuarioTO usuarioTO){
        Usuario usuario = new Usuario(usuarioTO.getEmail(), usuarioTO.getSenha());
        return usuario.isLoginValido();
    }
}
