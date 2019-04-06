package tours.prograii.objects;

public class DepartamentosObj {

    private int m_iId;
    private String m_strNombre;

    public DepartamentosObj(int p_iId, String p_strNombre) {
        setId(p_iId);
        setNombre(p_strNombre);
    }
    
    

    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public String getNombre() {
        return m_strNombre;
    }

    private void setNombre(String p_strNombre) {
        m_strNombre = p_strNombre;
    }
    
    
}
