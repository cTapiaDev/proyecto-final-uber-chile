import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Coordenadas del cliente
        double latCliente = -33.456; // Latitud del cliente
        double lonCliente = -70.660; // Longitud del cliente

        // Lista de vehículos (array de vehículos)
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("CPTA45", "Juan Pérez", -33.451, -70.651));
        vehiculos.add(new Vehiculo("BBYT98", "María González", -33.453, -70.653));
        vehiculos.add(new Vehiculo("QWER12", "Pedro Morales", -33.455, -70.657));
        vehiculos.add(new Vehiculo("ZPTY56", "Laura Martínez", -33.471, -70.672));
        vehiculos.add(new Vehiculo("PLOX88", "Carlos Díaz", -33.459, -70.663));
        vehiculos.add(new Vehiculo("JHGY56", "Ana Ruiz", -33.458, -70.659));
        vehiculos.add(new Vehiculo("POIU76", "José Rojas", -33.450, -70.650));
        vehiculos.add(new Vehiculo("LKJT98", "Sofía López", -33.465, -70.670));
        vehiculos.add(new Vehiculo("MNBT34", "Manuel Herrera", -33.460, -70.661));
        vehiculos.add(new Vehiculo("ZXCV12", "Diego Marín", -33.449, -70.649));
        vehiculos.add(new Vehiculo("ASDF34", "Paula Araya", -33.453, -70.653));
        vehiculos.add(new Vehiculo("GHJK56", "Luis Pizarro", -33.454, -70.655));
        vehiculos.add(new Vehiculo("UIOP78", "Valeria Silva", -33.460, -70.662));
        vehiculos.add(new Vehiculo("NBVC90", "Claudio Torres", -33.466, -70.674));
        vehiculos.add(new Vehiculo("QAZX12", "Marta Peña", -33.452, -70.652));
        vehiculos.add(new Vehiculo("WSXC45", "Ignacio Suárez", -33.453, -70.653));
        vehiculos.add(new Vehiculo("EDCV78", "Raúl Muñoz", -33.456, -70.658));
        vehiculos.add(new Vehiculo("RFVB34", "Cristina Oyarzún", -33.459, -70.659));
        vehiculos.add(new Vehiculo("TGBN67", "Fernando Gómez", -33.455, -70.657));
        vehiculos.add(new Vehiculo("YHNU98", "Karla Fuentes", -33.451, -70.651));

        // Creamos un nuevo usuario/cliente.
        Cliente nuevo = new Cliente(
                "Carlos",
                "Tapia",
                30,
                "ctapiadev@gmail.com",
                "65909293",
                latCliente,
                lonCliente);

        List<Vehiculo> disponibles = Solicitud.uberCercano(nuevo, vehiculos);

        for (Vehiculo uber : disponibles) {
            System.out.println("Vehículo de patente "
                    + uber.getPatente()
                    + ", conducido por "
                    + uber.getNombreConductor()
            );
        }

    }
}