import javax.swing.*;
import java.awt.*;

public class CadastroConfirmacao {
    public static void abrir() {
        JFrame janela = new JFrame("Cadastro - Confirmação");
        janela.setSize(400, 250);
        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.CYAN);

        JLabel lblConfirma = new JLabel("CONFIRME A SENHA:");
        lblConfirma.setBounds(20, 50, 200, 25);
        JPasswordField txtConfirma = new JPasswordField();
        txtConfirma.setBounds(180, 50, 150, 25);

        JButton btnProxima = new JButton("FINALIZAR");
        btnProxima.setBounds(120, 120, 150, 40);
        btnProxima.setBackground(Color.GREEN);
        btnProxima.setForeground(Color.WHITE);

        btnProxima.addActionListener(e -> {
            janela.dispose();
            CadastroFinalizado.abrir();
        });

        janela.add(lblConfirma);
        janela.add(txtConfirma);
        janela.add(btnProxima);
        janela.setVisible(true);
    }
}
