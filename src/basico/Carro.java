package basico;


//============================================
    // AS INTERFACES DEFINEN O QUE UM MATODO TEM QUE TER, COMO UMA PROTECAO OU PREVIA
//============================================
public interface Carro {
    String acelerar();

    void freiar();

    void parar();
}

// A INTERFACE CRIADA PODE SER USADA EM MAIS DE UM METODO

// POLIMOFISMO => O polimorfismo se baseia em objetos do mesmo tipo sendo chamados da mesma forma, mas tendo caracteristicas diferentes, embora uma interface defina o que vai ter em um metodo, ela nao define tudo, inclusive pode nao definir os detalhes dentro desses metodos.
