package entidades;

public class Mecanico {
	protected String nome;
	protected double ValorDaHora;
	protected Veiculo veiculo;

	public Mecanico() {
	}

	public Mecanico(String nome, double valorDaHora, Veiculo veiculo) {
		super();
		this.nome = nome;
		ValorDaHora = valorDaHora;
		this.veiculo = veiculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorDaHora() {
		return ValorDaHora;
	}

	public void setValorDaHora(double valorDaHora) {
		ValorDaHora = valorDaHora;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void consertar() {
		System.out.println();
		System.out.println("Consertando veículo: " + veiculo.getPlaca()); //dá erro quando chamada de funileiro
	}

	public void registrarValor(double horasTrabalhadas) {
		veiculo.setValorDoConcerto(this.ValorDaHora * horasTrabalhadas);
		
	}

}
