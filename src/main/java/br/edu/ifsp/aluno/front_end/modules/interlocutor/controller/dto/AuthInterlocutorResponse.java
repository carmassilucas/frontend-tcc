package br.edu.ifsp.aluno.front_end.modules.interlocutor.controller.dto;

import lombok.Data;

import java.util.List;

public @Data class AuthInterlocutorResponse {
    private String access_token;
    private List<String> roles;
    private Long expires_in;
}
