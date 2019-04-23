package tours.prograii.objects;

public class EventoObj {

        private int m_iId;
        private int m_iIdEmpresa;
        private int m_iIdCategoria;
        private int m_iIdDepartamento;
        private String m_strHoradeSalida;
        private String m_strFecha;
        private String m_strHoradeRetorno;
        private String m_strPuntodeEncuentro;
        private int m_iPrecio;
        private int m_iCupo;
        private int m_iCuposRestantes;

    public EventoObj(int p_iId, int p_iIdEmpresa, int p_iIdCategoria, int p_iIdDepartamento, String p_strHoradeSalida,
            String p_strFecha, String p_strHoradeRetorno, String p_strPuntodeEncuentro, int p_iPrecio,int p_iCupo,int p_iCuposRestantes) {
        setId(p_iId);
        setIdEmpresa(p_iIdEmpresa);
        setIdCategoria(p_iIdCategoria);
        setIdDepartamento(p_iIdDepartamento);
        setHoradeSalida(p_strHoradeSalida);
        setFecha(p_strFecha);
        setHoradeRetorno(p_strHoradeRetorno);
        setPuntodeEncuentro(p_strPuntodeEncuentro);
        setPrecio(p_iPrecio);
        setCupo(p_iCupo);
        setCuposRestantes(p_iCuposRestantes);
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

    public int getIdDepartamento() {
        return m_iIdDepartamento;
    }

    private void setIdDepartamento(int p_iIdDepartamento) {
        m_iIdDepartamento = p_iIdDepartamento;
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

    public String getPuntodeEncuentro() {
        return m_strPuntodeEncuentro;
    }

    private void setPuntodeEncuentro(String p_strPuntodeEncuentro) {
        m_strPuntodeEncuentro = p_strPuntodeEncuentro;
    }

    public int getPrecio() {
        return m_iPrecio;
    }

    private void setPrecio(int p_iPrecio) {
        m_iPrecio = p_iPrecio;
    }

    public int getCupo() {
        return m_iCupo;
    }

    private void setCupo(int p_iCupo) {
        m_iCupo = p_iCupo;
    }

    public int getCuposRestantes() {
        return m_iCuposRestantes;
    }

    public void setCuposRestantes(int p_iCuposRestantes) {
        m_iCuposRestantes = p_iCuposRestantes;
    }
        
        
        
}
