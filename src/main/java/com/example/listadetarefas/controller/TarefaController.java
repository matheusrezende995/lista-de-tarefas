package com.example.listadetarefas.controller;

import com.example.listadetarefas.model.Tarefa;
import com.example.listadetarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaService.criarTarefa(tarefa);
    }

    @GetMapping
    public List<Tarefa> listar() {
        return tarefaService.listarTarefas();
    }

    @GetMapping("/{id}")
    public Tarefa buscar(@PathVariable Long id) {
        return tarefaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tarefaService.excluirTarefa(id);
    }
}