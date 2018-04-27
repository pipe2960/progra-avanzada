public class Persona {

    private String nombre;



    Persona(String nombre ) {
        this.nombre=nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    void agitar(Termometro t)
    {
      t.inicio();
    }

    void tomartemperatura(Termometro f)
    {
        f.tomartemperatura();



    }


}
