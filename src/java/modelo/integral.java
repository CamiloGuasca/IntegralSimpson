package modelo;

/**
 *
 * @author camilog
 */
public class integral {
    private double intinf;
    private double intsup;
    private String funcion;
    private int divi;
    private double delx;

    public integral() {
    }

    public integral(double intinf, double intsup, String funcion, int divi, double delx) {
        this.intinf = intinf;
        this.intsup = intsup;
        this.funcion = funcion;
        this.divi = divi;
        this.delx = delx;
    }

    public double getIntinf() {
        return intinf;
    }

    public void setIntinf(double intinf) {
        this.intinf = intinf;
    }

    public double getIntsup() {
        return intsup;
    }

    public void setIntsup(double intsup) {
        this.intsup = intsup;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public int getDivi() {
        return divi;
    }

    public void setDivi(int divi) {
        this.divi = divi;
    }

    public double getDelx() {
        return delx;
    }

    public void setDelx(double delx) {
        this.delx = delx;
    }
    
    
}
