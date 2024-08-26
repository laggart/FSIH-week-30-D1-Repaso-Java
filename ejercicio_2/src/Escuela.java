public class Escuela {
    private String nombre;
    private String localidad;
    private double precio;
    private boolean cursosNocturnos;

    //Constructor

    public Escuela(String nombre, String localidad, double precio, boolean cursosNocturnos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.precio = precio;
        this.cursosNocturnos = cursosNocturnos;
    }
    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isCursosNocturnos() {
        return this.cursosNocturnos;
    }

    public boolean getCursosNocturnos() {
        return this.cursosNocturnos;
    }

    public void setCursosNocturnos(boolean cursosNocturnos) {
        this.cursosNocturnos = cursosNocturnos;
    }


    @Override
    public String toString() {
        String nocturno;
        if(cursosNocturnos){
            nocturno = "tiene";
        } else {
            nocturno = "no tiene";
        }

        return "El curso de Java en la escuela" + nombre + ", En la localidad " + localidad +
            ", tiene un precio de " + precio +
            "€ y " + nocturno + " modalidad nocturna.";
    }
}
