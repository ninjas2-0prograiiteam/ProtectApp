package tours.prograii.objects;

public class CarritoView {
    String username;
    int iIdEvento;
    int iTotal;

    public CarritoView(String username, int iIdEvento, int iTotal) {
        setUsername(username);
        setIdEvento(iIdEvento);
        setTotal(iTotal);
    }

    
    
    public String getUsername() {
        return username;
    }

    private void setUsername(String p_username) {
        username = p_username;
    }

    public int getIdEvento() {
        return iIdEvento;
    }

    private void setIdEvento(int p_iIdEvento) {
        iIdEvento = p_iIdEvento;
    }

    public int getTotal() {
        return iTotal;
    }

    private void setTotal(int p_iTotal) {
       iTotal = p_iTotal;
    }
    
    
}