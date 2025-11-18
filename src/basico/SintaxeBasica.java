package basico;

import java.util.ArrayList;

public class SintaxeBasica {
    public SintaxeBasica() {
        //============================================
        // VARIAVEIS & TIPOS PRIMITIVOS
        //============================================

        // NÚMEROS INTEIROS
        byte bb = 100; // Ocupa 8 bits => -128 a 127
        short ss = 10600; // Ocupa 16 bits => -32.768 a 32.767
        int ii = 102000; // Ocupa 32 bits => -2.147.483.648 a 2.147.483.647
        long ll = 103400L; // Ocupa 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // NÚMEROS DECIMAIS
        float rr = 40.2f; // 32 bits => precisão simples
        double dd = 33.5; // 64 bits => precisão dupla

        // OUTROS...
        String st = "George"; // Palavras ou Frases
        char cc = 'A'; // Representa um único caractere
        boolean bool = true; // true(verdadeiro) ou false(falso)

        System.out.print("byte:" + bb + "\n" + "short:" + ss + "\n" + "int:" + ii + "\n" + "long:" + ll + "\n" + "float:" + rr + "\n" + "double:" + dd + "\n" + "String:" + st + "\n" + "char:" + cc + "\n" + "boolean:" + bool + "\n");


        //============================================
        // CONDICIONAIS
        //============================================


        if ( dd != 0) {
            System.out.print("Tem valor \n");
        } else if (bool) {
            System.out.print("Verdadeiro \n");
        } else {
            System.out.print("Falso \n");
        }

        //============================================
        // VETORES
        //============================================


        int[] colecaoDeInteiros = {1 ,2 ,3 , 4, 5};

        System.out.print(colecaoDeInteiros[1] + "\n");
        System.out.print(colecaoDeInteiros.length + "\n");


        //============================================
        // ARRAY LIST (é uma classe)
        //============================================


        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Walison"); // Adicionando valor
        nomes.add("Lucas");
        nomes.add("Maria");
        nomes.add("Lucas");

        System.out.print(nomes.get(0) + "\n"); // Pesquisa item
        nomes.remove(1); // Remove item


        //============================================
        // LOOPS FOR & WHILE
        //============================================

        
        // Repetidor com contador
        for(int i = 0; i < nomes.size(); i++) {
            System.out.print(nomes.get(i) + "\n");
        }
        System.out.print("\n");

        boolean modelo = true;
        int counter = 5;

        // Repetidor com condição
        while (modelo) {
            counter--;
            System.out.print(counter);
            if(counter <= 0) {
                modelo = false;
            }
        }
        System.out.print("\n");


        //============================================
        // CASTING => Conversao de dados
        //============================================


        // EXEMPLO:
        double resultado = 0.0;
        // remove os numeros do ponto a diante para ser inteiro.
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        // apenas adiciona o numero inteiro ao double, indicando que agora ele pode ter numeros depois de um ponto.
        double meuDouble = meuInt;

        // TEMOS CASOS MAIS COMPLEXOS:

        String minhaString = "10";
        int meuNumeroInteiro = Integer.parseInt(minhaString); // Converte a String em Inteiro
        String minhaString2 = String.valueOf(meuNumeroInteiro); // Converte o Inteiro para String

    }
}
