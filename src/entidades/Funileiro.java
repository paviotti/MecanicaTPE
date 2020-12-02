package entidades;

public class Funileiro extends Mecanico {

	//private Veiculo veiculo;
	
	public Funileiro() {
		super();
	}
	public Funileiro(String nome, double valorDaHora, Veiculo veiculo) {
		super(nome, valorDaHora, veiculo);
	}


	@Override
	public void registrarValor(double horasTrabalhadas) {
		  //super.registrarValor(horasTrabalhadas*1.5); 
		  veiculo.setValorDoConcerto(this.ValorDaHora * horasTrabalhadas*1.5); //só pode porque é protected
	}
	

}
