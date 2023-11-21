class Reserva {
    private Vuelo vuelo;
    private Pasajero pasajero;
    private Date fecha;
    private boolean confirmada;

    public Reserva(Vuelo vuelo, Pasajero pasajero, Date fecha) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.fecha = fecha;
        this.confirmada = false;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void confirmarReserva() {
        confirmada = true;
        System.out.println("Tu reserva es confirmada gracias ☺ " + vuelo.getNumeroVuelo() +
                " con pasajero " + pasajero.getNombre());
    }
}




