package basico;

public class SintaxeBasica {
    public SintaxeBasica() {
        // Variaveis & Tipos Primitivos

        // NÚMEROS INTEIROS
        byte bb = 2; // Ocupa 8 bits => -128 a 127
        short ss = 3; // Ocupa 16 bits => -32.768 a 32.767
        int ii = 5; // Ocupa 32 bits => -2.147.483.648 a 2.147.483.647
        long ll = 10; // Ocupa 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // NÚMEROS DECIMAIS
        float rr = 4.2f; // 32 bits => precisão simples
        double dd = 3.5; // 64 bits => precisão dupla

        // OUTROS...
        String st = "George"; // Palavras ou Frases
        char cc = 'a'; // Representa um único caractere
        boolean teste = true; // true(verdadeiro) ou false(falso)

        System.out.println(bb);
        System.out.println(ss);
        System.out.println(ii);
        System.out.println(ll);

        System.out.println(rr);
        System.out.println(dd);

        System.out.println(st);
        System.out.println(cc);
        System.out.println(teste);
    }
}
