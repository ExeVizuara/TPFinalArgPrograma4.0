
package modelo;

public abstract class Empleado extends EntidadId {
    
    protected String apellido;
    protected String nombre;
    protected int legajo;
    protected DatosContacto datosContacto; //1 a 1
    
}
