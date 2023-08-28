public class App {

    public static void main(String[] args) {
        String primeiroNome = "Igor";
        String segundoNome = "Fernandes";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
    }
}
