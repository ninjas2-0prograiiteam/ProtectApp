package tours.prograii.objects;
public class UsuariosObj {
    private int m_iId;
    private String m_strNombre;
    private String m_strApellido;
    private int m_iEdad;
    private int m_iDui;
    private int m_iNit;
    private String m_strEmail;
    private String m_strUsername;
    private String m_strPassword;
    private int m_iIdDepartamento;


    public UsuariosObj(int p_iId, String p_strNombre, String p_strApellido, int p_iEdad, int p_iDui, int p_iNit, 
            String p_strEmail, String p_strUsername, String p_strPassword, int p_iIdDepartamento) {
        setId(p_iId);
        setNombre(p_strNombre);
        setApellido(p_strApellido);
        setEdad(p_iEdad);
        setDui(p_iDui);
        setNit(p_iNit);
        setEmail(p_strEmail);
        setUsername(p_strUsername);
        setPassword(p_strPassword);
        setIdDepartamento(p_iIdDepartamento);
        
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

    public String getApellido() {
        return m_strApellido;
    }

    private void setApellido(String p_strApellido) {
        m_strApellido = p_strApellido;
    }

    public int getEdad() {
        return m_iEdad;
    }

    private void setEdad(int p_iEdad) {
        m_iEdad = p_iEdad;
    }

    public int getDui() {
        return m_iDui;
    }

    private void setDui(int p_iDui) {
        m_iDui = p_iDui;
    }

    public int getNit() {
        return m_iNit;
    }

    private void setNit(int p_iNit) {
        m_iNit = p_iNit;
    }

    public String getEmail() {
        return m_strEmail;
    }

    private void setEmail(String p_strEmail) {
        m_strEmail = p_strEmail;
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

    public int getIdDepartamento() {
        return m_iIdDepartamento;
    }

    private void setIdDepartamento(int p_iIdUbicacion) {
        m_iIdDepartamento = p_iIdUbicacion;
    }
    
}
