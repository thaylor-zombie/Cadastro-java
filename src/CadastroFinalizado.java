import javax.swing.*;
import java.awt.*;

public class CadastroFinalizado {
    public static void abrir() {
        JFrame janela = new JFrame("Cadastro - Sucesso");
        janela.setSize(400, 200);
        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.CYAN);

        JLabel lblMensagem = new JLabel("Cadastro finalizado com sucesso!");
        lblMensagem.setBounds(50, 60, 300, 30);
        lblMensagem.setFont(new Font("Arial", Font.BOLD, 16));

        janela.add(lblMensagem);
        janela.setVisible(true);
    }
}
