import javax.swing.*;
import java.awt.*;

public class TelaConversor {

    public static void main(String[] args) {

        // Janela criacao
        JFrame janela = new JFrame("Conversores");

        janela.setSize(600, 500);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Campo para preenchimento
        //-Painel
        JPanel numero = new JPanel();
        numero.setLayout(new BoxLayout(numero, BoxLayout.Y_AXIS));
        numero.setBackground(Color.DARK_GRAY);
        numero.setForeground(Color.DARK_GRAY);
        numero.add(Box.createVerticalStrut(50));

        //-Titulo do Campo a ser Preenchido
        JLabel textNum = new JLabel("Coloque seu valor aqui:");
        textNum.setAlignmentX(Component.CENTER_ALIGNMENT);
        textNum.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        textNum.setForeground(Color.WHITE);

        //-Campo a ser Preenchido
        JTextField campoNum = new JTextField();
        campoNum.setAlignmentX(Component.CENTER_ALIGNMENT);
        campoNum.setMaximumSize(new Dimension(100, 20));
        campoNum.setBackground(Color.GRAY);
        campoNum.setForeground(Color.WHITE);

        //Campo do Resultado
        //-Painel
        JPanel resultado = new JPanel();
        resultado.setLayout(new BoxLayout(resultado, BoxLayout.Y_AXIS));
        resultado.setBackground(Color.DARK_GRAY);
        resultado.setForeground(Color.DARK_GRAY);
        resultado.add(Box.createVerticalStrut(50));

        //-Titulo do Resultado
        JLabel textTitlResultado = new JLabel("");
        textTitlResultado.setAlignmentX(Component.CENTER_ALIGNMENT);
        textTitlResultado.setBackground(Color.DARK_GRAY);
        textTitlResultado.setForeground(Color.WHITE);
        textTitlResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        textTitlResultado.setVisible(false);

        //-O Resultado em si
        JLabel textResultado = new JLabel("");
        textResultado.setAlignmentX(Component.CENTER_ALIGNMENT);
        textResultado.setBackground(Color.DARK_GRAY);
        textResultado.setForeground(Color.WHITE);
        textResultado.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        textResultado.setVisible(false);


        //Botoes
        JPanel botoes = new JPanel();
        botoes.setLayout(new GridLayout(2, 3));
        botoes.setBackground(Color.DARK_GRAY);
        botoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Afasta Tudo da borda

        JButton btnKmMetro = new JButton("Kilometro -> Metro");
        btnKmMetro.setBackground(Color.GREEN);
        btnKmMetro.setForeground(Color.BLACK);
        btnKmMetro.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnKmMetro.setPreferredSize(new Dimension(300, 50));

        JButton btnMetroKm = new JButton("Metro -> Kilometro");
        btnMetroKm.setBackground(Color.GREEN);
        btnMetroKm.setForeground(Color.BLACK);
        btnMetroKm.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnMetroKm.setPreferredSize(new Dimension(300, 50));

        JButton btnCelsFahr= new JButton("Celsius -> Fahr");
        btnCelsFahr.setBackground(Color.GREEN);
        btnCelsFahr.setForeground(Color.BLACK);
        btnCelsFahr.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        btnCelsFahr.setPreferredSize(new Dimension(300, 20));

        JButton btnFahrCels = new JButton("Fahr -> Celsius");
        btnFahrCels.setBackground(Color.GREEN);
        btnFahrCels.setForeground(Color.BLACK);
        btnFahrCels.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        btnFahrCels.setPreferredSize(new Dimension(300, 50));

        JButton btnMinHora = new JButton("Min -> Hora");
        btnMinHora.setBackground(Color.GREEN);
        btnMinHora.setForeground(Color.BLACK);
        btnMinHora.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        btnMinHora.setPreferredSize(new Dimension(300, 50));

        JButton btnHoraMin = new JButton("Hora -> Min");
        btnHoraMin.setBackground(Color.GREEN);
        btnHoraMin.setForeground(Color.BLACK);
        btnHoraMin.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        btnHoraMin.setPreferredSize(new Dimension(300, 50));

        JButton btnRefazer = new JButton("Refazer");
        btnRefazer.setBackground(Color.GREEN);
        btnRefazer.setForeground(Color.BLACK);
        btnRefazer.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        btnRefazer.setPreferredSize(new Dimension(300, 50));
        btnRefazer.setVisible(false);



        numero.add(textNum);
        numero.add(campoNum);

        resultado.add(textTitlResultado);
        resultado.add(textResultado);

        botoes.add(btnKmMetro);
        botoes.add(btnMetroKm);
        botoes.add(btnCelsFahr);
        botoes.add(btnFahrCels);
        botoes.add(btnMinHora);
        botoes.add(btnHoraMin);

        //Acoes dos Botoes
        



        janela.add(numero, BorderLayout.NORTH);
        janela.add(resultado, BorderLayout.CENTER);
        janela.add(botoes, BorderLayout.SOUTH);

        janela.setVisible(true);

    }
}