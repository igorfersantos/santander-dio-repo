package exemplos.messengers;

import exemplos.messengers.apps.FacebookMessenger;
import exemplos.messengers.apps.MSNMessenger;
import exemplos.messengers.apps.ServicoMensagemInstantanea;
import exemplos.messengers.apps.TelegramMessenger;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class Computador1 {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMessenger();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}