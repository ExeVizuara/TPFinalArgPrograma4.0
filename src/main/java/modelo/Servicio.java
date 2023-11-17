
package modelo;

import java.util.List;

public class Servicio extends EntidadId {
    
    private String denominacion;
    private List<Cliente> clientes; // N a N
}
