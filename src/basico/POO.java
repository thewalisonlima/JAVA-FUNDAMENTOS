package basico;

public class POO {
    public POO() {

        // Chamando objeto e passando parametro
        new CriarCarro("Fiat uno");
        new CriarCarro("Onix");
        new CriarCarro("Sandero");
        // NOTA: Posso chamar o mesmo objeto mais de uma vez, passando parametros diferentes a cada chamada.

        // ========== FORMA 1: Método que RETORNA valor (String) ==========
        // Criando um objeto Alerta para usar o método Texto()
        Alerta alerta1 = new Alerta("Carro modelo: ");
        
        // Chamando o método que retorna a mensagem
        String mensagemRetornada = alerta1.Texto();
        
        // Passando a mensagem retornada para outro objeto Alerta mostrar
        new Alerta(mensagemRetornada);

        System.out.println("\n--- Separador ---\n");

        // ========== FORMA 2: Dois métodos void (um chama o outro) ==========
        Alerta alerta2 = new Alerta("Status: ");
        
        // Método void que internamente chama outro método void
        alerta2.MostrarAlertaVelocidade();

    }
}

class CriarCarro {
    //============================================
    // METODO CONSTRUTOR
    //============================================

    String modelo; // Criando variavel para o construtor

    // Serve para passar parametros a um objeto criando e moldando o mesmo.
    public CriarCarro(String receberModelo) {
        // recebendo poarametro e passando ele para variavel modelo
        this.modelo = receberModelo;
        // apresentando a cariavel modelo;
        System.out.print("Carro criaod com sucesso: " + modelo + "\n");
    }

    
    // Para criar um metodo(função) temos que indicar 3 coisas
    // modificador de acesso, tipo de valor retornado, nome do metodo
    // public String nomeDoMetodo() {}
    // posso indicar que ele não retorna nada usando void
}

class Alerta {
    // Método void que RECEBE e MOSTRA uma mensagem
    public Alerta(String conteudo) {
        String mensagem = conteudo;
        System.out.println(mensagem);
    }

    // FORMA 1: Método que RETORNA uma mensagem (String)
    public String Texto() {
        return "Carro em alta velocidade detectado!";
    }

    // ========== FORMA 2: Usando dois métodos void ==========
    
    // Método void que RECEBE e MOSTRA uma mensagem
    public void MostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    // Método void que CHAMA o outro método void passando a mensagem
    public void MostrarAlertaVelocidade() {
        MostrarMensagem("Alerta: Velocidade alta detectada!");
    }
}
