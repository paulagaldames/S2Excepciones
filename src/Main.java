import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //armando el marco
        JFrame frame = new JFrame("Calculadora de área del tringulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,200);
        JPanel mainPanel = new JPanel(new GridLayout(3,2,15,15));
        //mainPanel.setBackground(Color.GRAY); //esto cambia el fondo
        mainPanel.setBorder(new EmptyBorder(20,20,20,20));

        //etiquetas label
        JLabel baseLabel = new JLabel("Base: ");
        JLabel alturaLabel = new JLabel("Altura: ");
        JLabel resultadoLabel = new JLabel("");

        //entrada de los textos
        JTextField baseText = new JTextField();
        JTextField alturaText = new JTextField();

        //botón
        JButton calcularButton = new JButton("Calcular");

        //agregamos los componentes al formulario
        mainPanel.add(baseLabel);
        mainPanel.add(baseText);
        mainPanel.add(alturaLabel);
        mainPanel.add(alturaText);
        mainPanel.add(resultadoLabel);
        mainPanel.add(calcularButton);

        //calculamos el area del trangulo
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double base = Double.parseDouble(baseText.getText());
                    double altura = Double.parseDouble(alturaText.getText());

                    //primera validacion, que los numeros sean positivos
                    if (base <= 0 || altura <= 0) {
                        throw new ArithmeticException("Base y altura deben ser números positivos ");
                    }

                    double resultado = (base * altura) / 2;
                    resultadoLabel.setText("Resultado: " + resultado);

                }catch(NumberFormatException ex) {
                    resultadoLabel.setText("Error: Ingrese números validos y enteros positivos.");
                } catch (Throwable t) {
                    resultadoLabel.setText("Error: " + t.getMessage());
                }
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}