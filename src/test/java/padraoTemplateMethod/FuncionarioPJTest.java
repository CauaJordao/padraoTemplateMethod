package padraoTemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioPJTest {

    @Test
    void deveRetornarAdmitido() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setAvaliacaoTecnica(6.0f);
        funcionario.setAvaliacaoComportamental(6.0f);
        assertEquals("Admitido", funcionario.verificarAdmissao());
    }

    @Test
    void deveRetornarNaoAdmitido() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setAvaliacaoTecnica(6.0f);
        funcionario.setAvaliacaoComportamental(5.9f);
        assertEquals("Não Admitido", funcionario.verificarAdmissao());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioPJ funcionario = new FuncionarioPJ();
        funcionario.setAvaliacaoTecnica(6.0f);
        funcionario.setAvaliacaoComportamental(5.9f);
        funcionario.setNome("Marcelo");
        funcionario.setMatricula(2);
        assertEquals("FuncionarioPJ{matricula=2, nome='Marcelo', resultado=Não Admitido}", funcionario.getInfo());
    }
}
