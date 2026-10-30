package padraoTemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioCLTTest {

    @Test
    void deveRetornarAdmitido() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setAvaliacaoTecnica(7.0f);
        funcionario.setAvaliacaoComportamental(7.0f);
        assertEquals("Admitido", funcionario.verificarAdmissao());
    }

    @Test
    void deveRetornarNaoAdmitido() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setAvaliacaoTecnica(7.0f);
        funcionario.setAvaliacaoComportamental(6.9f);
        assertEquals("Não Admitido", funcionario.verificarAdmissao());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setAvaliacaoTecnica(7.0f);
        funcionario.setAvaliacaoComportamental(6.9f);
        funcionario.setNome("Marcelo");
        funcionario.setMatricula(2);
        assertEquals("Funcionario{matricula=2, nome='Marcelo', resultado=Não Admitido}", funcionario.getInfo());
    }
}
