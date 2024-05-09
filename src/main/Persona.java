package main;

// SUPER CLASE
class Persona {

	private String nombre;
    private String rut;
    
    // Constructor
    // ---------------------------------------------
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    // Metodos GET, SET
    // ---------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }
}
