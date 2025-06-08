import javax.swing.*;
import java.awt.*;

public class CadastroInicial {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro - Início");
        janela.setSize(400, 400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.CYAN);

        JLabel lblNome = new JLabel("NOME:");
        lblNome.setBounds(20, 20, 80, 25);
        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 20, 200, 25);

        JLabel lblNascimento = new JLabel("NASCIMENTO:");
        lblNascimento.setBounds(20, 60, 100, 25);
        JTextField txtNascimento = new JTextField();
        txtNascimento.setBounds(120, 60, 180, 25);

        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setBounds(20, 100, 80, 25);
        JTextField txtCPF = new JTextField();
        txtCPF.setBounds(100, 100, 200, 25);

        JLabel lblGenero = new JLabel("GÊNERO:");
        lblGenero.setBounds(20, 140, 80, 25);
        JRadioButton feminino = new JRadioButton("FEMININO");
        feminino.setBounds(100, 140, 100, 25);
        JRadioButton masculino = new JRadioButton("MASCULINO");
        masculino.setBounds(200, 140, 100, 25);
        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(feminino);
        grupoGenero.add(masculino);
        feminino.setBackground(Color.CYAN);
        masculino.setBackground(Color.CYAN);

        JLabel lblEndereco = new JLabel("ENDEREÇO:");
        lblEndereco.setBounds(20, 180, 100, 25);
        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(120, 180, 180, 25);

        JButton btnProximo = new JButton("CADASTRAR");
        btnProximo.setBounds(120, 240, 150, 40);
        btnProximo.setBackground(Color.GREEN);
        btnProximo.setForeground(Color.WHITE);

        btnProximo.addActionListener(e -> {
            janela.dispose();
            CadastroLogin.abrir();
        });

        janela.add(lblNome);
        janela.add(txtNome);
        janela.add(lblNascimento);
        janela.add(txtNascimento);
        janela.add(lblCPF);
        janela.add(txtCPF);
        janela.add(lblGenero);
        janela.add(feminino);
        janela.add(masculino);
        janela.add(lblEndereco);
        janela.add(txtEndereco);
        janela.add(btnProximo);
        janela.setVisible(true);
    }
}
