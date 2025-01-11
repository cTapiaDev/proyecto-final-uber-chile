public class Vehiculo {

    private String patente;
    private String nombreConductor;
    private Double latitud;
    private Double longitud;

    public Vehiculo(String patente, String nombreConductor, Double latitud, Double longitud) {
        this.patente = patente;
        this.nombreConductor = nombreConductor;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
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
