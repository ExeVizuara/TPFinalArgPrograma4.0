
package modelo;

import java.util.List;

public class Cliente extends EntidadId {
    
    private String razonSocial;
    private long cuit;
    private List<Servicio> servicios; // N a N
    private List<ReporteIncidencia> reportesIncidencia; // 1 a N
    private DatosContacto datosContacto;
    
}
