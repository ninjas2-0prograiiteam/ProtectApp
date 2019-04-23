package tours.prograii.objects;
public class CategoriaObj {

    private int m_iId;
    private String m_strTipo;
    private String m_strDescripcion;

    public CategoriaObj(int p_iId, String p_strTipo, String p_strDescripcion) {
        setId(p_iId);
        setTipo(p_strTipo);
        setDescripcion(p_strDescripcion);
    }

    
    
    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public String getTipo() {
        return m_strTipo;
    }

    private void setTipo(String p_strTipo) {
        m_strTipo = p_strTipo;
    }

    public String getDescripcion() {
        return m_strDescripcion;
    }

    private void setDescripcion(String p_strDescripcion) {
        m_strDescripcion = p_strDescripcion;
    }
    
    
}
