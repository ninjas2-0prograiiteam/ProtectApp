package tours.prograii.objects;

public class EventoViewObj {
    private String m_strEmpresa;
    private String m_strCategoria;
    private String m_strDepartamento;
    private String m_strHoradeSalida;
    private String m_strFecha;
    private String m_strHoradeRetorno;
    private String m_strPuntodeEncuentro;
    private int m_iPrecio;
    private int m_iCuposRestantes;

    public EventoViewObj(String p_strEmpresa, String p_strCategoria, String p_strDepartamento, String p_strHoradeSalida, String p_strFecha, String p_strHoradeRetorno, String p_strPuntodeEncuentro, int p_iPrecio, int p_iCuposRestantes) {
        setEmpresa(p_strEmpresa);
        setCategoria(p_strCategoria);
        setDepartamento(p_strDepartamento);
        setHoradeSalida(p_strHoradeSalida);
        setFecha(p_strFecha);
        setHoradeRetorno(p_strHoradeRetorno);
        setPuntodeEncuentro(p_strPuntodeEncuentro);
        setPrecio(p_iPrecio);
        setCuposRestantes(p_iCuposRestantes);
    }
    
    

    public String getEmpresa() {
        return m_strEmpresa;
    }

    private void setEmpresa(String p_strEmpresa) {
        m_strEmpresa = p_strEmpresa;
    }

    public String getCategoria() {
        return m_strCategoria;
    }

    private void setCategoria(String p_strCategoria) {
        m_strCategoria = p_strCategoria;
    }

    public String getDepartamento() {
        return m_strDepartamento;
    }

    private void setDepartamento(String p_strDepartamento) {
        m_strDepartamento = p_strDepartamento;
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

    public int getCuposRestantes() {
        return m_iCuposRestantes;
    }

    private void setCuposRestantes(int p_iCuposRestantes) {
        m_iCuposRestantes = p_iCuposRestantes;
    }

    
    
}
