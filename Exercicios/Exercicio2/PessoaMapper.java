import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
 
public class PessoaMapper {
 
  public static PessoaDto toDto(Pessoa pessoa) {
      String nomeCompleto = pessoa.getNome() + " " + 
            pessoa.getSobrenome();
 
      int idade = (int) ChronoUnit    
            .YEARS
            .between(pessoa.getDataNascimento(), LocalDate.now());
 
      return new PessoaDto(nomeCompleto, idade);
  }
}