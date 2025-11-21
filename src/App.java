import basico.SintaxeBasica;
import basico.Veiculo;
import basico.FiatUno;
import basico.POO;
import basico.Carro;
import swing.Panel;

public class App {
    public static void main(String[] args) throws Exception {
        new SintaxeBasica();
        new POO();
        Veiculo dados = new FiatUno();

        dados.acelerar();
        dados.freiar();
        dados.parar();

        new Panel();
    }
}

/*
se eu quiser definir a variavel como carro eu tenho que importar os tipos de carro do interface, mas quando eu quiser chamar metodos herdados eu posso chamar esses metodos usando o metodo pai para definilos

Veiculos dados = new FiatUno(); // quando o FiatUno herdar o Veiculos

Carro dados = new FiatUno(); //quando nao houver heranca nenhuma


no caso da heranca, podemos herdar uma classe normal que pode ser chamada ou herdada, ou criar uma classe abistrata, que serve apenas para ser herdada, servindo como um modelo para classe filho.
*/