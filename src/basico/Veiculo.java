package basico;


// O IMPLEMENTS SERVER PARA ADICIONAR A INTERFACE AO SEU METODO RESPECTIVO
public class Veiculo implements Carro {
    protected int tempo; // So pode ser usado dentro do pacote

    public Veiculo(int tempo) {
        String corrida = acelerar();
        freiar();
        parar();

        this.tempo = tempo;

        System.out.println("O carro esta a " + corrida + " por hora");
    }

    @Override
    public String acelerar() {
        System.out.println("Acelerando do Carro \n");
        return "43Km";
    }

    @Override
    public void freiar() {
        System.out.println("Reduzindo a velocidade do Carro \n");
    }

    @Override
    public void parar() {
        System.out.println("O Carro parou \n");
    }
}
