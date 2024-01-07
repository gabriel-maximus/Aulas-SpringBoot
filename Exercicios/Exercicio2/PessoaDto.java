public class PessoaDto {
    private String nomeCompleto;
    private long idade;

    public PessoaDto(String nomeCompleto, long idade) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public long getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "PessoaDto{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", idade=" + idade +
                '}';
    }
}
