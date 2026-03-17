import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class AgendaElectronica extends JFrame {

    private JTextField txtDni, txtNombre, txtApellido, txtDireccion, txtTelefono, txtFecha;
    private JLabel lblIndice;
    private int indice = 0;

    private ArrayList<String[]> agenda = new ArrayList<>();

    public AgendaElectronica() {
        setTitle("Agenda Electrónica");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(10, 20, 10, 20));
        add(panel);

        JLabel titulo = new JLabel("Agenda Electrónica", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(titulo, BorderLayout.NORTH);

        // FORM con tamaños controlados
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        txtDni = new JTextField(20);
        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtDireccion = new JTextField(20);
        txtTelefono = new JTextField(20);
        txtFecha = new JTextField(20);

        //Fila 1
        gbc.gridx = 0; gbc.gridy = 0;
        form.add(new JLabel("Dni:"), gbc);
        gbc.gridx = 1;
        form.add(txtDni, gbc);

        gbc.gridx = 2;
        form.add(new JLabel("Dirección:"), gbc);
        gbc.gridx = 3;
        form.add(txtDireccion, gbc);

        //Fila 2
        gbc.gridx = 0; gbc.gridy = 1;
        form.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        form.add(txtNombre, gbc);

        gbc.gridx = 2;
        form.add(new JLabel("Teléfono:"), gbc);
        gbc.gridx = 3;
        form.add(txtTelefono, gbc);

        //Fila 3
        gbc.gridx = 0; gbc.gridy = 2;
        form.add(new JLabel("Apellido:"), gbc);
        gbc.gridx = 1;
        form.add(txtApellido, gbc);

        gbc.gridx = 2;
        form.add(new JLabel("Fecha Nac:"), gbc);
        gbc.gridx = 3;
        form.add(txtFecha, gbc);

        panel.add(form, BorderLayout.CENTER);

        //Bottom
        JPanel bottom = new JPanel(new GridLayout(2, 1));

        JPanel botones = new JPanel();
        JButton btnPrev = new JButton("<<");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnNext = new JButton(">>");

        botones.add(btnPrev);
        botones.add(btnGuardar);
        botones.add(btnNext);

        JPanel indicePanel = new JPanel();
        lblIndice = new JLabel(String.valueOf(indice + 1));
        indicePanel.add(new JLabel("Índice: "));
        indicePanel.add(lblIndice);

        bottom.add(botones);
        bottom.add(indicePanel);

        panel.add(bottom, BorderLayout.SOUTH);

        // EVENTOS
        btnGuardar.addActionListener(e -> guardar());

        btnNext.addActionListener(e -> {
            indice++;
            if (indice >= agenda.size()) {
                agenda.add(new String[6]);
            }
            cargar();
        });

        btnPrev.addActionListener(e -> {
            if (indice > 0) {
                indice--;
                cargar();
            }
        });

        // Inicializar con un espacio
        agenda.add(new String[6]);
    }

    private void guardar() {
        String[] datos = new String[]{
                txtDni.getText(),
                txtNombre.getText(),
                txtApellido.getText(),
                txtDireccion.getText(),
                txtTelefono.getText(),
                txtFecha.getText()
        };

        agenda.set(indice, datos);
        JOptionPane.showMessageDialog(this, "Contacto guardado en índice " + (indice + 1));
    }

    private void cargar() {
        String[] datos = agenda.get(indice);

        txtDni.setText(datos[0] != null ? datos[0] : "");
        txtNombre.setText(datos[1] != null ? datos[1] : "");
        txtApellido.setText(datos[2] != null ? datos[2] : "");
        txtDireccion.setText(datos[3] != null ? datos[3] : "");
        txtTelefono.setText(datos[4] != null ? datos[4] : "");
        txtFecha.setText(datos[5] != null ? datos[5] : "");

        lblIndice.setText(String.valueOf(indice + 1));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AgendaElectronica().setVisible(true));
    }
}