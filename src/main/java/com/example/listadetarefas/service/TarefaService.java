package com.example.listadetarefas.service;

import com.example.listadetarefas.model.Tarefa;
import com.example.listadetarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa buscarPorId(Long id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    public void excluirTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}