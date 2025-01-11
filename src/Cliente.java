public class Cliente {

    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String telefono;
    private Double latitud;
    private Double longitud;

    public Cliente(String nombre,
                   String apellido,
                   int edad,
                   String correo,
                   String telefono,
                   Double latitud,
                   Double longitud
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}
