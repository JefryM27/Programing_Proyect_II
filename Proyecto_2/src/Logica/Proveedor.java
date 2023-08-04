package Logica;

/**
 *
 * @author Cristopher Matus
 */
public class Proveedor {
    private int id;
    private String cedulaJuridica;
    private String nombre;
    private String telefono;
    private String correo;

    // Constructor
    public Proveedor(int id, String cedulaJuridica, String nombre, String telefono, String correo) {
        this.id = id;
        this.cedulaJuridica = cedulaJuridica;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters and Setters (Opcional, pero recomendado)
    public int getId() { //Devuelve el valor actual del atributo id.
        return id;
    }

    public void setId(int id) { //Establece el valor del atributo id con el valor pasado como argumento.
        this.id = id;
    }

    public String getCedulaJuridica() { // Devuelve el valor actual del atributo cedulaJuridica.
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) { //Establece el valor del atributo cedulaJuridica con el valor pasado como argumento.
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getNombre() { //Devuelve el valor actual del atributo nombre
        return nombre;
    }

    public void setNombre(String nombre) { //Establece el valor del atributo nombre con el valor pasado como argumento.
        this.nombre = nombre;
    }

    public String getTelefono() { // Devuelve el valor actual del atributo telefono.
        return telefono;
    }

    public void setTelefono(String telefono) { //Establece el valor del atributo telefono con el valor pasado como argumento.
        this.telefono = telefono;
    }

    public String getCorreo() {// Devuelve el valor actual del atributo correo.
        return correo;
    }

    public void setCorreo(String correo) { //Establece el valor del atributo correo con el valor pasado como argumento.
        this.correo = correo;
    }

    
    //toString(): El método devuelve una cadena que muestra todos los atributos del proveedor (id, cédula jurídica, nombre, teléfono y correo) en un formato legible.
    @Override
    public String toString() {
        return "Proveedor [id=" + id + ", cedulaJuridica=" + cedulaJuridica + ", nombre=" + nombre + ", telefono="
                + telefono + ", correo=" + correo + "]";
    }
}

