package padraoTemplateMethod;

public abstract class Funcionario {

    private int matricula;
    protected String nome;
    private float avaliacaoTecnica;
    private float avaliacaoComportamental;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAvaliacaoTecnica() {
        return avaliacaoTecnica;
    }

    public void setAvaliacaoTecnica(float avaliacaoTecnica) {
        this.avaliacaoTecnica = avaliacaoTecnica;
    }

    public float getAvaliacaoComportamental() {
        return avaliacaoComportamental;
    }

    public void setAvaliacaoComportamental(float avaliacaoComportamental) {
        this.avaliacaoComportamental = avaliacaoComportamental;
    }

    public float calcularMediaAvaliacao() {
        return (avaliacaoTecnica + avaliacaoComportamental) / 2;
    }

    /** Algoritmo fixo: subclasses personalizam apenas a média de corte. */
    public final String verificarAdmissao() {
        return calcularMediaAvaliacao() >= getMediaCorte() ? "Admitido" : "Não Admitido";
    }

    public abstract float getMediaCorte();

    public String getTipoContrato() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipoContrato() + "{matricula=" + this.matricula +
                ", nome='" + this.nome + "', resultado=" + this.verificarAdmissao() + "}";
    }
}
