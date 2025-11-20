package basico;

public class FiatUno implements Carro {

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
