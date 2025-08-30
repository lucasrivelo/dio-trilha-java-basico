import lombok.Getter;

@Getter
public class ContaUniversitaria extends Conta {
    
    private String identificacaoAluno;
    private double limiteSaqueMensal = 500.0;

    public ContaUniversitaria(Cliente cliente, String identificacaoAluno) {
        super(cliente);
        this.identificacaoAluno = identificacaoAluno;
    }

    @Override
    public void sacar(double valor) {
        if (valor > limiteSaqueMensal) {
            System.out.println("Erro: Saque acima do limite mensal da Conta Universitária.");
        } else {

            super.sacar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Universitária ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Identificação do Aluno: %s", this.getIdentificacaoAluno()));
    }
}