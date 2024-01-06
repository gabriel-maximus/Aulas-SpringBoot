package com.mballem.tarefas.web.controller;

import com.mballem.internal.entity.Contato;
import com.mballem.internal.service.ContatoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("tarefas")
public class ContatoController {

    private final ContatoService contatoService;

    // EXERCICIO 1
    @PostMapping("/contatos")
    public ResponseEntity<Contato> create(@RequestBody Contato contato) {
        Contato contact = contatoService.save(contato);
        return ResponseEntity.ok(contact);
    }

    // EXERCICIO 2
    public Object getContatoById() {

        return null;
    }

    // EXERCICIO 3
    public Object getContatoByNome() {

        return null;
    }

    // EXERCICIO 4
    public Object getQuantidadeDeContatos() {

        return null;
    }

    // EXERCICIO 5
    public Object getContatosByDataNascimento() {

        return null;
    }

    // EXERCICIO 6
    public Object updateContatoById() {

        return null;
    }

    // EXERCICIO 7
    public Object deleteById() {

        return null;
    }
}
