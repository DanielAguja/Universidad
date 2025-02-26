import javax.swing.*;
import java.util.ArrayList;

public class main {
    static ArrayList<Guarderia> listaNinos = new ArrayList<>();
    static ArrayList<Guarderia> listaNinosMayores = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de Guardería\n" +
                            "(1) Agregar niño\n" +
                            "(2) Listar niños\n" +
                            "Elige una opción:"
            );


            if (opcion.equals("1")) {
                agregarNino();
            } else if (opcion.equals("2")) {
                listarNinos();
                JOptionPane.showMessageDialog(null, "Intenta de nuevo.");
            }
        }
    }

    private static void agregarNino() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
        String genero = JOptionPane.showInputDialog("Género:");
        String documento = JOptionPane.showInputDialog("Documento:");
        String alergias = JOptionPane.showInputDialog("Alergias:");
        String acudiente = JOptionPane.showInputDialog("Nombre del acudiente:");
        String numeroAcudiente = JOptionPane.showInputDialog("Teléfono del acudiente:");


        if(edad > 5) {
            listaNinosMayores.add(new Guarderia(nombre, edad, genero, documento, alergias, acudiente, numeroAcudiente));
        }
        else {
            listaNinos.add(new Guarderia(nombre, edad, genero, documento, alergias, acudiente, numeroAcudiente));
        }
        JOptionPane.showMessageDialog(null, "Niño agregado.");
    }

    private static void listarNinos() {
        StringBuilder listaDeninos = new StringBuilder("Lista de niños:\n");
        listaDeninos.append("Niños menores de 5 años:\n");
        for (Guarderia nino : listaNinos) {
            listaDeninos.append(nino).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, listaDeninos.toString());

        StringBuilder listaDeninosMayores = new StringBuilder("Niños mayores de 5 años:\n");
        for (Guarderia ninoMayor : listaNinosMayores) {
            listaDeninosMayores.append(ninoMayor).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, listaDeninosMayores.toString());
    }
}