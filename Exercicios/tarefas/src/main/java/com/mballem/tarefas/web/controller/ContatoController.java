package com.mballem.tarefas.web.controller;

import com.mballem.internal.entity.Contato;
import com.mballem.internal.service.ContatoService;
import jakarta.websocket.server.PathParam;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

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
    @GetMapping("/contatos/{id}")
    public ResponseEntity<Contato> getContatoById(@PathVariable Long id) {
        Contato contact = contatoService.getById(id);
        return ResponseEntity.ok(contact);
    }

    // EXERCICIO 3
    @GetMapping("/contatos/nome/{nome}")
    public ResponseEntity<Contato> getContatoByNome(@PathVariable String nome) {
        Contato contact = contatoService.getContatoByNome(nome);
        return ResponseEntity.ok(contact);
    }

    // EXERCICIO 4
    @GetMapping("/contatos")
    public ResponseEntity<Integer> getQuantidadeDeContatos() {
        int size = contatoService.getAll();
        return ResponseEntity.ok(size);
    }

    // EXERCICIO 5
    @GetMapping("/contatos/dataNascimento")
    public ResponseEntity<List<Contato>> getContatosByDataNascimento(@RequestParam LocalDate dataNascimento) {
        List<Contato> contatos = contatoService.getByDataNascimento(dataNascimento);
        return ResponseEntity.ok(contatos);
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
