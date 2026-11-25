public class Alerta {
    private int idZona;
    private String tipoSensor;
    private String marcaTemporal;

    public Alerta(int idZona, String tipoSensor, String marcaTemporal) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.marcaTemporal = marcaTemporal;
    }

    public String toString() {
        return "Zona: " + idZona + " | Sensor: " + tipoSensor + " | Fecha: " + marcaTemporal;
    }
}
