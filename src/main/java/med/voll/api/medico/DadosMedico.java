package med.voll.api.medico;


import med.voll.api.endereco.DadosEnderedeco;

public record DadosMedico(String nome, String email, String crm, Especialidade especialidade, DadosEnderedeco dadosEnderedeco) {
}
