import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solicitud {

    private static double calcularDistancia(double latitud1, double longitud1, double latitud2, double longitud2) {
        final double RADIO_TIERRA = 6371.0; // Radio de la tierra en kilómetros.

        // Primero: Vamos a convertir los grados de latitud y longitud a radianes.
        double lat1 = Math.toRadians(latitud1);
        double lon1 = Math.toRadians(longitud1);

        double lat2 = Math.toRadians(latitud2);
        double lon2 = Math.toRadians(longitud2);

        // Segundo: Obtenemos la diferencia entre coordenadas.
        double deltaLat = lat2 - lat1;
        double deltaLon = lon2 - lon1;

        // Tercero: Aplicamos la formula de Haversine
        double calculo = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.sin(deltaLon / 2) * Math.sin(deltaLon /2);

        double resultado = 2 * Math.atan2(Math.sqrt(calculo), Math.sqrt(1 - calculo));

        // Final: Retornamos la distancia final en kilómetros.
        return RADIO_TIERRA * resultado;
    }

    public static List<Vehiculo> uberCercano(Cliente cliente, List<Vehiculo> vehiculos) {

        DecimalFormat df = new DecimalFormat("#.##");

        List<Vehiculo> uberCercanos = new ArrayList();

        for (Vehiculo uber : vehiculos) {
            double distancia = calcularDistancia(
                    cliente.getLatitud(),
                    cliente.getLongitud(),
                    uber.getLatitud(),
                    uber.getLongitud());

            if (distancia <= 3) {
                uberCercanos.add(uber);
            }

        }

        Collections.sort(uberCercanos, Comparator.comparing(uber -> calcularDistancia(
                cliente.getLatitud(),
                cliente.getLongitud(),
                uber.getLatitud(),
                uber.getLongitud())));

        return uberCercanos.size() > 3 ? uberCercanos.subList(0, 3) : uberCercanos;

    }

}
