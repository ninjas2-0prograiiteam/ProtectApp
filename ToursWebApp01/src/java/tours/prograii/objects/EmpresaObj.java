package tours.prograii.objects;

public class EmpresaObj {
    private int m_iId;
    private String m_strNombre;
    private String m_strEmail;
    private int m_iTelefono;
    private int m_iNit;
    private String m_strUsername;
    private String m_strPassword;
    private int m_iNodeCuenta;

    public EmpresaObj(int p_iId, String p_strNombre, String p_strEmail, int p_iTelefono, int p_iNit, 
            String p_strUsername, String p_strPassword, int p_iNodeCuenta) {
        setId(p_iId);
        setNombre(p_strNombre);
        setEmail(p_strEmail);
        setTelefono(p_iTelefono);
        setNit(p_iNit);
        setUsername(p_strUsername);
        setPassword(p_strPassword);
        setNodeCuenta(p_iNodeCuenta);
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

    public String getEmail() {
        return m_strEmail;
    }

    private void setEmail(String p_strEmail) {
        m_strEmail = p_strEmail;
    }

    public int getTelefono() {
        return m_iTelefono;
    }

    private void setTelefono(int p_iTelefono) {
        m_iTelefono = p_iTelefono;
    }

    public int getNit() {
        return m_iNit;
    }

    private void setNit(int p_iNit) {
        m_iNit = p_iNit;
    }

    public String getUsername() {
        return m_strUsername;
    }

    private void setUsername(String p_strUsername) {
        m_strUsername = p_strUsername;
    }

    public String getPassword() {
        return m_strPassword;
    }

    private void setPassword(String p_strPassword) {
        m_strPassword = p_strPassword;
    }

    public int getNodeCuenta() {
        return m_iNodeCuenta;
    }

    private void setNodeCuenta(int p_iNodeCuenta) {
        m_iNodeCuenta = p_iNodeCuenta;
    }
    
    
}
