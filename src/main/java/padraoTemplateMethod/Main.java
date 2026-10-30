package padraoTemplateMethod;

public class Main {
    public static void main(String[] args) {
        Funcionario[] candidatos = {new FuncionarioCLT(), new FuncionarioPJ(), new FuncionarioEstagiario()};
        for (Funcionario f : candidatos) {
            f.setMatricula(10);
            f.setNome("Ana");
            f.setAvaliacaoTecnica(6f);
            f.setAvaliacaoComportamental(6f);
            System.out.println(f.getClass().getSimpleName() + ": " + f.verificarAdmissao());
        }
    }
}
