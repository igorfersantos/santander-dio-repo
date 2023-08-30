
public class App {

	public static void main(String[] args) {
		for (EstadoBrasileiro estadoBrasileiro : EstadoBrasileiro.values()) {
			System.out.println(estadoBrasileiro.getSigla() + " - " + estadoBrasileiro.getNome());
		}

		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

		System.out.println(eb.getNome());

	}

}
