package tours.prograii.objects;

public class CupoObj {
    
    private int m_iId;
    private int m_iIdEvento;
    private int m_iCupo;
    

    public CupoObj(int p_iId, int p_iIdEvento, int p_iCupo) {
        setId(p_iId);
        setIdEvento(p_iIdEvento);
        setCupo(p_iCupo);
        
    }
    
    

    public int getId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public int getCupo() {
        return m_iCupo;
    }

    private void setCupo(int p_iCupo) {
        m_iCupo = p_iCupo;
    }

    public int getIdEvento() {
        return m_iIdEvento;
    }

    private void setIdEvento(int p_iIdEvento) {
        m_iIdEvento = p_iIdEvento;
    }
    
    
}
