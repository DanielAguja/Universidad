import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Empleado nuevoEmpleado = new Empleado("112371823", "Juan Carlos",
                "Cartero", "aguahsuhdigasd@gmail.com",
                "13218312", "12/12/20");

        JOptionPane.showMessageDialog(null, nuevoEmpleado);
    }
}

