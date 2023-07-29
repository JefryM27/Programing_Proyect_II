/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author allys
 */
public class Cliente {
    private int id;
    private int cédula;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int teléfono;
    private String correoElectrónico;
    
    public Cliente(int id,int cédula,String nombre, String primerApellido,String segundoApellido,int teléfono,String correoElectrónico){
        this.id= id;
        this.cédula= cédula;
        this.nombre= nombre;
        this.primerApellido= primerApellido;
        this.segundoApellido= segundoApellido;
        this.teléfono= teléfono;
        this.correoElectrónico= correoElectrónico;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cédula
     */
    public int getCédula() {
        return cédula;
    }

    /**
     * @param cédula the cédula to set
     */
    public void setCédula(int cédula) {
        this.cédula = cédula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the teléfono
     */
    public int getTeléfono() {
        return teléfono;
    }

    /**
     * @param teléfono the teléfono to set
     */
    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    /**
     * @return the correoElectrónico
     */
    public String getCorreoElectrónico() {
        return correoElectrónico;
    }

    /**
     * @param correoElectrónico the correoElectrónico to set
     */
    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }
}
