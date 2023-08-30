package exemplos.autodromo;

import exemplos.autodromo.model.Carro;
import exemplos.autodromo.model.Moto;
import exemplos.autodromo.model.Veiculo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("482374783");
		jeep.ligar();

		Moto z400 = new Moto();
		z400.setChassi("432874387");
		z400.ligar();
		
		Veiculo coringa = jeep;
		coringa.ligar();
	}
}
