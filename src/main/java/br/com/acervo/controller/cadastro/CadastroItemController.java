package br.com.acervo.controller.cadastro;

import br.com.acervo.gestao.CriadorItem;
import br.com.acervo.model.Item;
import br.com.acervo.to.ItemTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CadastroItemController {

    @Autowired
    private CriadorItem criadorItem;

    @ResponseBody
    public void cadastrar(@RequestBody ItemTO itemTO, int tipoItemKey){
        Item item = criadorItem.incluir(itemTO, tipoItemKey);
    }
}
