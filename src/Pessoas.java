public class Pessoas {
    private String primeiroNome, sobrenome, dataNascimento, cpf, email, telefone;
    private int id = 0;

    public Pessoas(String primeiroNome,
                   String sobrenome,
                   String dataNascimento,
                   String cpf,
                   String email,
                   String telefone) {
        setId(id++);
        setPrimeiroNome(primeiroNome);
        setSobrenome(sobrenome);
        setDataNascimento(dataNascimento);
        setCpf(cpf);
        setEmail(email);
        setTelefone(telefone);
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getPrimeiroNome() {
        return this.primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id+1;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "id='" + getId() + '\'' +
                ", primeiroNome='" + getPrimeiroNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
