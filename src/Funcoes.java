public class Funcoes {
    public int id;
    public String nome;

    public String funcao; //= {"Backing Vocal", "Vocal Base", "Ministrante", "Teclado", "Violão", "Guitarra", "Baixo", "Bateria", "Sonoplastia", "Dança", "DataShow"};
    public boolean escalado;

    public Funcoes(int id, String nome, String funcao) {
        setId(id);
        setNome(nome);
        setFuncao(funcao);
        setEscalado(false);

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public boolean isEscalado() {
        return escalado;
    }

    public void setEscalado(boolean escalado) {
        this.escalado = escalado;
    }
}
