import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Calculadora con interfaz gráfica de usuario (GUI) para realizar operaciones simples, como suma, resta, multiplicacion y division.
 *
 * Funciones principales:
 * - Botones numéricos del 0 al 9, punto decimal y operadores.
 * - Operaciones matemáticas en tiempo real.
 * - Botón "=" para calcular el resultado.
 * - Botón "AC" para borrar el contenido.
 * - Botón de cambio de signo para números negativos.
 */

/* Variables de botones y resultado y datos */

public class Calculadora {
    private JPanel Calculadora;
    private JTextField txtPantalla;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton delButton1;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton button9;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button13;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton a0Button;
    private JButton pointButton;
    private JButton button8;
    private JButton ACButton;

    double a, b, resultado;
    String op;
/* metodos para la funcionalidad de los botones numericos*/
    public Calculadora() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a9Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a6Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a3Button.getText());

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a2Button.getText());

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a1Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPantalla.setText(txtPantalla.getText() + a00Button.getText());
            }
        });
        /* metodos para los botones de operacion*/
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtPantalla.getText().contains(".")){
                    double pm= Double.parseDouble(txtPantalla.getText());
                    pm = pm*-1;
                    txtPantalla.setText(String.valueOf(pm));
                }else {
                    long PM = Long.parseLong(txtPantalla.getText());
                    PM= PM*-1;
                    txtPantalla.setText(String.valueOf(PM));
                }

            }
        });
        pointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtPantalla.getText().contains(".")){
                    txtPantalla.setText(txtPantalla.getText() + pointButton.getText());
                }

            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtPantalla.getText());
                op = "+";
                txtPantalla.setText("");

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtPantalla.getText());
                op = "-";
                txtPantalla.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtPantalla.getText());
                op = "*";
                txtPantalla.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtPantalla.getText());
                op = "/";
                txtPantalla.setText("");
            }
        });
        delButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String borra=null;
                if(!txtPantalla.getText().isEmpty()) {
                    StringBuilder strB = new StringBuilder(txtPantalla.getText());
                    strB.deleteCharAt(txtPantalla.getText().length() -1);
                    borra = String.valueOf(strB);
                    txtPantalla.setText(borra);
                }
            }
        });
        /* metodo para realizar las operaciones y las devuelva el boton = */
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtPantalla.getText());
                if(op == "+"){
                    resultado= a+b;
                    txtPantalla.setText(String.valueOf(resultado));
                } else if (op == "-"){
                    resultado = a-b;
                    txtPantalla.setText(String.valueOf(resultado));
                } else if (op == "/") {
                    resultado = a/b;
                    txtPantalla.setText(String.valueOf(resultado));
                } else if (op == "*") {
                    resultado = a*b;
                    txtPantalla.setText(String.valueOf(resultado));

                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
