package med.voll.api.controller;

import med.voll.api.medico.DadosMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoControler {

    @PostMapping
    public void cadastraMedico(@RequestBody DadosMedico dadosMedico) {

    }
}
