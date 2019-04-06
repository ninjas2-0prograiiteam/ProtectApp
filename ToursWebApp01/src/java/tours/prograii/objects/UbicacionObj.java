package tours.prograii.objects;

public class UbicacionObj {

    private int m_iId;
    private int m_iIdMunicipio;
    private int m_iIdDepartamento;
    private String m_strDestino;

    public UbicacionObj(int p_iId, int p_iIdMunicipio, int p_iIdDepartamento, String p_strDestino) {
        setId(p_iId);
        setIdMunicipio(p_iIdMunicipio);
        setIdDepartamento(p_iIdDepartamento);
        setDestino(p_strDestino);
    }
    
    

    public int getM_iId() {
        return m_iId;
    }

    private void setId(int p_iId) {
        m_iId = p_iId;
    }

    public int getIdMunicipio() {
        return m_iIdMunicipio;
    }

    private void setIdMunicipio(int p_iIdMunicipio) {
        m_iIdMunicipio = p_iIdMunicipio;
    }

    public int getIdDepartamento() {
        return m_iIdDepartamento;
    }

    private void setIdDepartamento(int p_iIdDepartamento) {
        m_iIdDepartamento = p_iIdDepartamento;
    }

    public String getDestino() {
        return m_strDestino;
    }

    private void setDestino(String p_strDestino) {
        m_strDestino = p_strDestino;
    }
    
    
}
