package tours.prograii.objects;

public class PagoObj {

    private int m_iId;
    private int m_iIdUsuario;
    private int m_iNodeTarjeta;
    private int m_iCvv;
    private int m_iFechadeVencimiento;

    public PagoObj(int p_iId, int p_iIdUsuario, int p_iNodeTarjeta, int p_iCvv, int p_iFechadeVencimiento) {
        setId(p_iId);
        setIdUsuario(p_iIdUsuario);
        setNodeTarjeta(p_iNodeTarjeta);
        setCvv(p_iCvv);
        setFechadeVencimiento(p_iFechadeVencimiento);
    }
    
    

    public int getId() {
        return m_iId;
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

    public int getNodeTarjeta() {
        return m_iNodeTarjeta;
    }

    private void setNodeTarjeta(int p_iNodeTarjeta) {
        m_iNodeTarjeta = p_iNodeTarjeta;
    }

    public int getCvv() {
        return m_iCvv;
    }

    private void setCvv(int p_iCvv) {
        m_iCvv = p_iCvv;
    }

    public int getFechadeVencimiento() {
        return m_iFechadeVencimiento;
    }

    private void setFechadeVencimiento(int p_iFechadeVencimiento) {
        m_iFechadeVencimiento = p_iFechadeVencimiento;
    }
    
    
    
}
