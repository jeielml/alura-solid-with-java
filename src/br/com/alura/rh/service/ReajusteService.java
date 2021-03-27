package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService extends ValidacaoPercentualReajuste {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    /**
     * Crítica01: Esta estrutura torna a classe anêmica
     *
     * @param funcionario
     * @param aumento
     */
    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal novoSalario = salarioAtual.add(aumento);

        funcionario.atualizarSalario(novoSalario);
    }
}
