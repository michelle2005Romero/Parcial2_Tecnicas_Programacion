import java.util.ArrayList;
import java.util.Date;

class Vuelo {
    private String numerodevuelo;
    private String origen;
    private String destino;
    private Date fecha;
    private Date horadesalida;
    private int capacidadmaximadepasajeros;

    // Constructor para inicializar los atributos de vuelo ☺
    public Vuelo(String numerodevuelo, String origen, String destino, Date fecha, Date horadesalida, int capacidadmaximadepasajeros) {
        this.numerodevuelo = numerodevuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horadesalida = horadesalida;
        this.capacidadmaximadepasajeros = capacidadmaximadepasajeros;
    }

    // Método getter para obtener el numero de vuelo ☺
    public String getNumerodevuelo() {
        return numerodevuelo;
    }

    // Método setter para establecer el origen ☺
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    // Método getter para obtener el destino ☺
    public String getDestino() {
        return destino;
    }

    // Método setter para establecer la fecha
    public Date setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Método getter para obtener la hora de salida ☺
    public Date getHoradesalida() {
        return horadesalida;
    }

    // Método setter para capacidad de pasajeros ☺
    public int setcapacidadmaximadepasajeros(int capacidadmaximadepasajeros) {
        this.capacidadmaximadepasajeros = capacidadmaximadepasajeros;


        public boolean Reserva ( int pasajero, Date fecha){
            if (Reserva.size() < capacidadmaximadepasajeros) {
                Reserva reserva = new Reserva(this, pasajero, Date fecha);
                reserva.add(reserva);
                return true;
            } else {
                System.out.println("Disculpa este vuelo esta lleno.No sera posible realizar tu reserva sorry.");
                return false;
            }
        }
    }
}



