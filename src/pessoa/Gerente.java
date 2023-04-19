package pessoa;

public class Gerente extends Funcionario {

	private int numeroAgencia;

	public Gerente(String nome, String cpf, int senha, Cargo tipo, int numeroAgencia) {
		super(nome, cpf, senha, tipo);
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", tipo=" + tipo + "]";
	}

}
