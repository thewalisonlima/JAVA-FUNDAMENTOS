package swing;
import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel {
    public Panel() {
        JFrame janela = new JFrame(); // INSTANCIANDO JANELA.
        
        // CRIANDO & DEFININDO ELEMENTOS
        
        // JTextField
        JTextField textArea = new JTextField();
        textArea.setBounds(16, 80, 150, 30);


        // JButton
        JButton button = new JButton("Clique aqui!");
        button.setBounds(16, 120, 150, 30);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("teste de mensagem");
                String value = textArea.getText();
                System.out.printf("Valor %s", value);
            }
        });



        // JLabel
        JLabel label = new JLabel("Usuario: ");
        label.setBounds(16, 30, 150, 30);


        // ADICIONANDO ELEMENTOS
        janela.add(textArea);
        janela.add(label);
        janela.add(button);
        

        // DEFINIÇÕES DA JANELA
        janela.setLayout(null);
        janela.setBounds(120, 120, 400, 600); // Define a posição e medidas da janela.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação de forma definitiva.
        janela.setVisible(true); // Deixa a janela visivel.
        
    }
}
