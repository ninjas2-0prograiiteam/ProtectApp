package tours.prograii.objects;

public class CarritoDeComprasObj {

    private int m_iId;
    private int m_iIdUsuario;
    private int m_iIdEvento;
    private int m_iTotal;

    public int getId() {
        return m_iId;
    }

    public CarritoDeComprasObj(int p_iId, int p_iIdUsuario, int p_iIdEvento, int p_iTotal) {
        setId(p_iId);
        setIdUsuario(p_iIdUsuario);
        setIdEvento(p_iIdEvento);
        setTotal(p_iTotal);
    }
    
    
    
    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public int getIdUsuario() {
        return m_iIdUsuario;
    }

    private void setIdUsuario(int p_iIdUsuario) {
        m_iIdUsuario = p_iIdUsuario;
    }

    public int getIdEvento() {
        return m_iIdEvento;
    }

    private void setIdEvento(int p_iIdEvento) {
        m_iIdEvento = p_iIdEvento;
    }

    public int getTotal() {
        return m_iTotal;
    }

    private void setTotal(int p_iTotal) {
        m_iTotal = p_iTotal;
    }
    
    
}
