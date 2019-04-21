package tours.prograii.objects;

public class PagoObj {

    private int m_iId;
    private int m_iIdUsuario;
    private String m_strNodeTarjeta;
    private int m_iCvv;
    private int m_iFechadeVencimiento;

    public PagoObj(int p_iId, int p_iIdUsuario, String p_strNodeTarjeta, int p_iCvv, int p_iFechadeVencimiento) {
        setId(p_iId);
        setIdUsuario(p_iIdUsuario);
        setNodeTarjeta(p_strNodeTarjeta);
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

    public String getNodeTarjeta() {
        return m_strNodeTarjeta;
    }

    private void setNodeTarjeta(String p_strNodeTarjeta) {
        m_strNodeTarjeta = p_strNodeTarjeta;
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
