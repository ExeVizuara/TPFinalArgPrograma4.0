
package modelo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class ReporteIncidencia extends EntidadId {
        
    @Getter @Setter
    private Date fechaAlta;
    private String descripcionProblema; //basico, intermedio, complejo.
    private String tipoProblema;
    private Servicio servicio;//N a 1
    private OperadorMesaAyuda operador;
    private Cliente cliente;//N a 1
    private Tecnico tecnico;//N a 1
    private int tiempoEstimadoResolucion;
    private Date fechaPosibleResolucion;
    private String estado; //pendiente, en proceso, resuelto, anulado.
    private String observacionesTecnico;
   
}
