package com.acesso.acesso.service;

import com.acesso.acesso.model.JornadaTrabalho;
import com.acesso.acesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public void setJornadaRepository(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }


    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();

    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void  deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

}
