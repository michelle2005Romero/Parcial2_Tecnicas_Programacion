public class SistemaReservasVuelos {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo(101, "Ciudad A", "Ciudad B", new Date(), 150);
        Pasajero pasajero1 = new Pasajero("Laura Jimena", "ABC121", 30, "Vegetariano");

        vuelo1.reservarVuelo(pasajero1, new Date());
        vuelo1.reservarVuelo(new Pasajero("Juan melo", "XYZ789", 25, "Sin restricciones"), new Date());
        vuelo1.reservarVuelo(new Pasajero("Sara saez", "DEF456", 40, "Kosher"), new Date());

        // Intentar reservar en un vuelo lleno
        vuelo1.reservarVuelo(new Pasajero("estela gomez", "GHI789", 28, "Sin restricciones"), new Date());

        // Mostrar información de las reservas realizadas
        List<Reserva> reservasVuelo1 = vuelo1.getReservas();
        for (Reserva reserva : reservasVuelo1) {
            System.out.println("Reserva para el vuelo " + reserva.getVuelo().getNumeroVuelo() +
                    " con pasajero " + reserva.getPasajero().getNombre() +
                    " confirmada: " + reserva.isConfirmada());
        }
    }
}