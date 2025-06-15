import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //armando el marco
        JFrame frame = new JFrame("Calculadora de área del tringulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        JPanel mainPanel = new JPanel(new GridLayout(3,2,15,15));
        //mainPanel.setBackground(Color.GRAY); //esto cambia el fondo
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        //etiquetas label
        JLabel baseLabel = new JLabel("Base: ");
        JLabel areaLabel = new JLabel("Area: ");

        //entrada de los textos
        JTextField baseText = new JTextField();
        JTextField areaText = new JTextField();

        //botón
        JButton submitButton = new JButton("Calcular");

        //agregamos los componentes al formulario
        mainPanel.add(baseLabel);
        mainPanel.add(baseText);
        mainPanel.add(areaLabel);
        mainPanel.add(areaText);
        mainPanel.add(submitButton);


        frame.add(mainPanel);
        frame.setVisible(true);
    }
}