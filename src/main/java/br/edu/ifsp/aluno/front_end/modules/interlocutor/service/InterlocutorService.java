package br.edu.ifsp.aluno.front_end.modules.interlocutor.service;

import br.edu.ifsp.aluno.front_end.modules.interlocutor.controller.dto.CreateInterlocutorRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InterlocutorService {

    private final RestTemplate restTemplate;

    public InterlocutorService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void create(CreateInterlocutorRequest request) {


    }
}
