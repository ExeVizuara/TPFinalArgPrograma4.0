
package modelo;

import java.util.List;

public class Tecnico extends Empleado {
    
    private List<ReporteIncidencia> reporteIncidencia; //1 a N
    private List<Especialidad> especialidades; // N a N
   
    
}
