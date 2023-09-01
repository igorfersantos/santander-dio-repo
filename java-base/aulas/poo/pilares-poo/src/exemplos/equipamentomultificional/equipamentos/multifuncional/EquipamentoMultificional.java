package exemplos.equipamentomultificional.equipamentos.multifuncional;

import exemplos.equipamentomultificional.equipamentos.copiadora.Copiadora;
import exemplos.equipamentomultificional.equipamentos.digitalizadora.Digitalizadora;
import exemplos.equipamentomultificional.equipamentos.impressora.Impressora;

public class EquipamentoMultificional implements Copiadora, Digitalizadora, Impressora {

	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
		
	}

	public void digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional");
		
	}

	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional");
	}

}
