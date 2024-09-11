package br.edu.ifsp.aluno.front_end.modules.interlocutor.controller.dto;

import lombok.Data;
import lombok.ToString;

@ToString
public @Data class CreateInterlocutorRequest {
    private String username;
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
}
