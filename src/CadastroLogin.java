import javax.swing.*;
import java.awt.*;

public class CadastroLogin {
    public static void abrir() {
        JFrame janela = new JFrame("Cadastro - Login");
        janela.setSize(400, 300);
        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.CYAN);

        JLabel lblEmail = new JLabel("E-MAIL:");
        lblEmail.setBounds(20, 30, 80, 25);
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(100, 30, 200, 25);

        JLabel lblSenha = new JLabel("SENHA:");
        lblSenha.setBounds(20, 70, 80, 25);
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(100, 70, 200, 25);

        JButton btnProxima = new JButton("PRÓXIMA");
        btnProxima.setBounds(120, 140, 150, 40);
        btnProxima.setBackground(Color.GREEN);
        btnProxima.setForeground(Color.WHITE);

        btnProxima.addActionListener(e -> {
            janela.dispose();
            CadastroConfirmacao.abrir();
        });

        janela.add(lblEmail);
        janela.add(txtEmail);
        janela.add(lblSenha);
        janela.add(txtSenha);
        janela.add(btnProxima);
        janela.setVisible(true);
    }
}
