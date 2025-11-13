package com.gs9_collab_learning.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class TemaController {

    @GetMapping(value = "info", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getInfo() {
        return Map.of(
                "tema", "Comunidades de aprendizagem colaborativa e global",
                "membro1", "Rafael Arcoverde Melo",
                "membro2", "Rafael Nascimento Gomes",
                "descricao", "Plataforma para conectar aprendizes e comunidades globais, promovendo colaboração educacional e compartilhamento de conhecimento."
        );
    }
}
