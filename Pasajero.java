class pasajero {
    private String nombre;
    private String numeroPasaporte;
    private int edad;
    private String preferenciasAlimenticias;

    public pasajero(String nombre, String numeroPasaporte, int edad, String preferenciasAlimenticias) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.edad = edad;
        this.preferenciasAlimenticias = preferenciasAlimenticias;
    }
// Método getter para obtener el nombre ☺
    public String getNombre() {
        return nombre;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public String getPreferenciasAlimenticias() {
        return preferenciasAlimenticias;
    }
}





