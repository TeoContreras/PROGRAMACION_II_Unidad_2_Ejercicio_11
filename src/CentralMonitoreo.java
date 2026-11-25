import java.util.ArrayList;

public class CentralMonitoreo {
    private ArrayList<Alerta> incidentesActivos;

    public CentralMonitoreo() { incidentesActivos = new ArrayList<Alerta>(); }

    public void procesarAlerta(Alerta alerta) {
        incidentesActivos.add(alerta);
        System.out.println("Alerta recibida y registrada.");
    }

    public void mostrarReporte() {
        System.out.println("Alertas activas:");
        for (Alerta alerta : incidentesActivos) System.out.println(alerta);
    }
}
