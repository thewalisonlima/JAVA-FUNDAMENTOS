package basico;

public class FiatUno extends Veiculo {

    /*  O super definido dentro do construtor da classe, serve para chamar o construtor do Veiculo, isso acontece porque o Construtor do veiculo exige de forma obrigatoria um valor, e isso e resolvido dessa forma, no lugar de chamar o nome do construtor, como ja temos ele sendo chamado no extends, chamamos o super e passamos o valor, assim o java entende que o super chamado se refere ao construtor do pai. */

    public FiatUno() {
        super(12);
        // depois de chamar com super e passar o valor, eu posso consultar essa mesma variavel.
        System.out.println(this.tempo);
    }
    
    @Override
    public String acelerar() {
        System.out.println("Acelerando do Carro \n");
        return "43Km";
    }




    public void freiar() {
        System.out.println("Reduzindo a velocidade do Carro \n");
    }


    public void parar() {
        System.out.println("O Carro parou \n");
    }
}
