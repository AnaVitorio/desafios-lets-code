public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cidade;
    private String uf;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    @Override
    public String toString() {
        return "Pessoa [cidade=" + cidade + ", dataNascimento=" + dataNascimento + ", nome=" + nome + ", uf=" + uf
                + "]";
    }



        
}
