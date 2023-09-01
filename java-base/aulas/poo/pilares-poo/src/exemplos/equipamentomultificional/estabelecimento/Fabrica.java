package exemplos.equipamentomultificional.estabelecimento;

import exemplos.equipamentomultificional.equipamentos.copiadora.Copiadora;
import exemplos.equipamentomultificional.equipamentos.digitalizadora.Digitalizadora;
import exemplos.equipamentomultificional.equipamentos.impressora.Deskjet;
import exemplos.equipamentomultificional.equipamentos.impressora.Impressora;
import exemplos.equipamentomultificional.equipamentos.multifuncional.EquipamentoMultificional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultificional em = new EquipamentoMultificional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		digitalizadora.digitalizar();
		impressora.imprimir();
		copiadora.copiar();
	}
}
