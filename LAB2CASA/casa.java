//Crear una clase casa que permita guardar el nombre del propietario y la superficie de la casa. 
//Permitir a la clase casa establecer, devolver y visualizar el propietario y la superficie de la casa.
public class casa {
    public String propietario;
    public double superficie;
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    public String getPropietario() {
        return propietario;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    public void visualizar() {
        System.out.println("Propietario: " + propietario);
        System.out.println("Superficie: " + superficie);
    }
}
