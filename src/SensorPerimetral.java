public class SensorPerimetral {
    private int idZona;
    private String tipoSensor;
    private CentralMonitoreo central;

    public SensorPerimetral(int idZona, String tipoSensor, CentralMonitoreo central) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.central = central;
    }

    public void detectarMovimiento() {
        System.out.println("Movimiento detectado en zona " + idZona);
        Alerta alerta = new Alerta(idZona, tipoSensor, "23/10/2026 19:00");
        central.procesarAlerta(alerta);
    }
}
