/**
 * Clase Paciente
 * @author Jonnathan Juarez, 15377
 * @author Julio barahona, 14xxx
 * @since 02/10/2016
 * @version 1.0
 */
public class Paciente implements Comparable <Paciente>{
    private  String nombre;
    private  String descripcion;
    private  String codigoDeEmergencia;
    public Paciente(String nombre, String descripcion, String codigoDeEmergencia){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoDeEmergencia = codigoDeEmergencia;
    }
    @Override
    public  String toString(){

        return this.getNombre() +","+this.getDescripcion()+","+this.getCodigoDeEmergencia();
    }
    @Override
    public  int compareTo(Paciente p){

        return  this.getCodigoDeEmergencia().compareTo(p.getCodigoDeEmergencia());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoDeEmergencia() {
        return codigoDeEmergencia;
    }

    public void setCodigoDeEmergencia(String codigoDeEmergencia) {
        this.codigoDeEmergencia = codigoDeEmergencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
