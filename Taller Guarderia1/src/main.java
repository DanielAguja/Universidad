import javax.swing.*;
import java.util.ArrayList;

public class main {
    static ArrayList<Guarderia> listaNinos = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú de Guardería\n" +
                            "(1) Agregar niño\n" +
                            "(2) Listar niños\n" +
                            "(3) Buscar niño por documento\n" +
                            "(4) Actualizar niño\n" +
                            "(5) Eliminar niño\n" +
                            "Elige una opción:"
            );


            if (opcion.equals("1")) {
                agregarNino();
            } else if (opcion.equals("2")) {
                listarNinos();
            } else if (opcion.equals("3")) {
                buscarNino();
            } else if (opcion.equals("4")) {
                actualizarNino();
            } else if (opcion.equals("5")) {
                eliminarNino();
            } else {
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

        listaNinos.add(new Guarderia(nombre, edad, genero, documento, alergias, acudiente, numeroAcudiente));
        JOptionPane.showMessageDialog(null, "Niño agregado.");
    }

    private static void listarNinos() {
        StringBuilder listaDeninos = new StringBuilder("Lista de niños:\n");
        for (Guarderia nino : listaNinos) {
            listaDeninos.append(nino).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, listaDeninos.toString());
    }
    private static void buscarNino() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del niño:");

        for (Guarderia nino : listaNinos) {
            if (nino.getDocumento().equals(documento)) {
                JOptionPane.showMessageDialog(null, "Niño encontrado:\n" + listaNinos);
                return;
            }
        }
    }
    private static void actualizarNino() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del niño:");

        for (Guarderia nino : listaNinos) {
            if (nino.getDocumento().equals(documento)) {
                nino.setNombre(JOptionPane.showInputDialog("Nuevo nombre:", nino.toString()));
                nino.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Nueva edad:", nino.toString())));
                nino.setGenero(JOptionPane.showInputDialog("Nuevo género:", nino.toString()));
                nino.setAlergias(JOptionPane.showInputDialog("Nuevas alergias:", nino.toString()));
                nino.setAcudiente(JOptionPane.showInputDialog("Nuevo acudiente:", nino.toString()));
                nino.setNumeroAcudiente(JOptionPane.showInputDialog("Nuevo teléfono:", nino.toString()));

                JOptionPane.showMessageDialog(null, "Niño actualizado.");
                return;
            }
        }
    }
    private static void eliminarNino() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del niño a eliminar:");

        for (int i = 0; i < listaNinos.size(); i++) {
            if (listaNinos.get(i).getDocumento().equals(documento)) {
                listaNinos.remove(i);
                JOptionPane.showMessageDialog(null, "Niño eliminado.");
                return;
            }
        }
    }
}
