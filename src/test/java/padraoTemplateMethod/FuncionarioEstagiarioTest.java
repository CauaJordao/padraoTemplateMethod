package padraoTemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioEstagiarioTest {

    @Test
    void deveRetornarAdmitido() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setAvaliacaoTecnica(5.0f);
        funcionario.setAvaliacaoComportamental(5.0f);
        assertEquals("Admitido", funcionario.verificarAdmissao());
    }

    @Test
    void deveRetornarNaoAdmitido() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setAvaliacaoTecnica(5.0f);
        funcionario.setAvaliacaoComportamental(4.9f);
        assertEquals("Não Admitido", funcionario.verificarAdmissao());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioEstagiario funcionario = new FuncionarioEstagiario();
        funcionario.setAvaliacaoTecnica(5.0f);
        funcionario.setAvaliacaoComportamental(4.9f);
        funcionario.setNome("Marcelo");
        funcionario.setMatricula(2);
        assertEquals("FuncionarioEstagiario{matricula=2, nome='Marcelo', resultado=Não Admitido}", funcionario.getInfo());
    }
}
