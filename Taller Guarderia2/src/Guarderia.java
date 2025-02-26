public class Guarderia {
    private String nombre;
    private int edad;
    private String genero;
    private String documento;
    private String alergias;
    private String acudiente;
    private String numeroAcudiente;

    public Guarderia(String nombre, int edad,
                     String genero, String documento,
                     String alergias, String acudiente,
                     String numeroAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.acudiente = acudiente;
        this.numeroAcudiente = numeroAcudiente;

    }

    @Override
    public String toString() {
        return "Documento: " + documento + " | Nombre: " + nombre + " | Edad: " + edad + " | Género: " + genero +
                " | Alergias: " + alergias + " | Acudiente: " + acudiente +
                " | Teléfono Acudiente: " + numeroAcudiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(String acudiente) {this.acudiente = acudiente;}

    public String getNumeroAcudiente() {
        return numeroAcudiente;
    }

    public void setNumeroAcudiente(String numeroAcudiente) {
        this.numeroAcudiente = numeroAcudiente;
    }
}

