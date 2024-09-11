package br.edu.ifsp.aluno.front_end.modules.interlocutor.controller;

import br.edu.ifsp.aluno.front_end.modules.interlocutor.controller.dto.CreateInterlocutorRequest;
import br.edu.ifsp.aluno.front_end.modules.interlocutor.service.InterlocutorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interlocutor")
public class InterlocutorController {

    private final InterlocutorService service;

    public InterlocutorController(InterlocutorService service) {
        this.service = service;
    }

    @GetMapping("/signup")
    public String create(Model model) {
        model.addAttribute("dto", new CreateInterlocutorRequest());
        return "interlocutor/signup";
    }

    @PostMapping("/signup")
    public String create(@ModelAttribute CreateInterlocutorRequest dto) {
        return "redirect:/interlocutor/signin";
    }

    @GetMapping("/signin")
    public String auth() {
        return "interlocutor/signin";
    }
}
