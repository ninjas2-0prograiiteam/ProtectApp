package tours.prograii.objects;

public class EventoObj {

        private int m_iId;
        private int m_iIdEmpresa;
        private int m_iIdCategoria;
        private String m_strHoradeSalida;
        private String m_strFecha;
        private String m_strHoradeRetorno;
        private int m_iIdUbicacion;
        private int m_iPrecio;

    public EventoObj(int p_iId, int p_iIdEmpresa, int p_iIdCategoria, String p_strHoradeSalida, 
            String p_strFecha, String p_strHoradeRetorno, int p_iIdUbicacion, int p_iPrecio) {
        setId(p_iId);
        setIdEmpresa(p_iIdEmpresa);
        setIdCategoria(p_iIdCategoria);
        setHoradeSalida(p_strHoradeSalida);
        setFecha(p_strFecha);
        setHoradeRetorno(p_strHoradeRetorno);
        setIdUbicacion(p_iIdUbicacion);
        setPrecio(p_iPrecio);
    }
        
        

    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public int getIdEmpresa() {
        return m_iIdEmpresa;
    }

    private void setIdEmpresa(int p_iIdEmpresa) {
        m_iIdEmpresa = p_iIdEmpresa;
    }

    public int getIdCategoria() {
        return m_iIdCategoria;
    }

    private void setIdCategoria(int p_iIdCategoria) {
        m_iIdCategoria = p_iIdCategoria;
    }

    public String getHoradeSalida() {
        return m_strHoradeSalida;
    }

    private void setHoradeSalida(String p_strHoradeSalida) {
        m_strHoradeSalida = p_strHoradeSalida;
    }

    public String getFecha() {
        return m_strFecha;
    }

    private void setFecha(String p_strFecha) {
        m_strFecha = p_strFecha;
    }

    public String getHoradeRetorno() {
        return m_strHoradeRetorno;
    }

    private void setHoradeRetorno(String p_strHoradeRetorno) {
        m_strHoradeRetorno = p_strHoradeRetorno;
    }

    public int getIdUbicacion() {
        return m_iIdUbicacion;
    }

    private void setIdUbicacion(int p_iIdUbicacion) {
        m_iIdUbicacion = p_iIdUbicacion;
    }

   

    public int getPrecio() {
        return m_iPrecio;
    }

    private void setPrecio(int p_iPrecio) {
        m_iPrecio = p_iPrecio;
    }
        
        
        
}
