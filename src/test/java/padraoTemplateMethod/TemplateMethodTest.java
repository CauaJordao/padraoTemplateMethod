package padraoTemplateMethod;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Modifier;
import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {
    @Test
    void algoritmoDoTemplateEFinal() throws NoSuchMethodException {
        assertTrue(Modifier.isFinal(Funcionario.class.getMethod("verificarAdmissao").getModifiers()));
    }

    @Test
    void subclassesAlteramSomenteCriterioDeAvaliacao() {
        Funcionario clt = new FuncionarioCLT();
        Funcionario estagiario = new FuncionarioEstagiario();
        clt.setAvaliacaoTecnica(6f); clt.setAvaliacaoComportamental(6f);
        estagiario.setAvaliacaoTecnica(6f); estagiario.setAvaliacaoComportamental(6f);
        assertEquals("Não Admitido", clt.verificarAdmissao());
        assertEquals("Admitido", estagiario.verificarAdmissao());
    }
}
