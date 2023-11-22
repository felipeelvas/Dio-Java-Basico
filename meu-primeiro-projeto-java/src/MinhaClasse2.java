public class MinhaClasse2 {
    public static void main(String[] args) {
        String primeiroNome = "Fabrício";
        String sobrenome = "Carlos Pereira Elvas";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto(String primeiroNome, String sobrenome){
        return primeiroNome.concat(" ").concat(sobrenome);
    
    }
}
