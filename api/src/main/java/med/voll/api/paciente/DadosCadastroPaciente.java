package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String crm, String telefone, String cpf, DadosEndereco endereco) {
  
}
