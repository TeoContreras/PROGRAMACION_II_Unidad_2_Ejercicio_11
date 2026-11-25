public class main {
    public static void main(String[] args) {
        CentralMonitoreo central = new CentralMonitoreo();
        SensorPerimetral sensor1 = new SensorPerimetral(1, "Infrarrojo", central);
        SensorPerimetral sensor2 = new SensorPerimetral(2, "Movimiento", central);

        sensor1.detectarMovimiento();
        sensor2.detectarMovimiento();
        central.mostrarReporte();
    }
}
