package br.edu.ifsp.aluno.front_end.modules.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/interlocutor/signin").permitAll()
                            .requestMatchers("/interlocutor/signup").permitAll();
                    auth.anyRequest().authenticated();
                })
                .formLogin(form -> form.loginPage("/interlocutor/signin"));
        return http.build();
    }
}
