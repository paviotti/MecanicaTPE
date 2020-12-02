package entidades;

public class Veiculo {
	private String placa;
	private Double ValorDoConcerto = 0.0;

	public Veiculo() {
	}

	public Veiculo(String placa, Double valorDoConcerto) {
		this.placa = placa;
		ValorDoConcerto = valorDoConcerto = 0.0;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Double getValorDoConcerto() {
		return ValorDoConcerto;
	}

	public void setValorDoConcerto(Double valorDoConcerto) {
		ValorDoConcerto = valorDoConcerto;
	}

	public void exibirValorDoConcerto() {
		System.out.println();
		System.out.println("******** VEÍCULO CONCERTADO ***********");
		System.out.println("PLACA: " + placa);
		System.out.println("Valor do concerto: R$ " + String.format("%.2f", this.ValorDoConcerto));
		System.out.println();
		System.out.println("***************************************");
	}

}
