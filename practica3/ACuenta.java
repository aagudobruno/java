package practica3;
public class ACuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double interes;
    private double saldo;

    public ACuenta() {
    }

    public ACuenta(String nombreCliente, String numeroCuenta, double interes, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public ACuenta(ACuenta c1) {
        this.nombreCliente = c1.nombreCliente;
        this.numeroCuenta = c1.numeroCuenta;
        this.interes = c1.interes;
        this.saldo = c1.saldo;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getInteres() {
        return interes;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public boolean ingreso(double ingreso){
        if (ingreso<0){
            System.out.println("Disculpe, el ingreso no puede ser negativo");
            return false;
        }
        else{
            setSaldo(this.saldo+ingreso);
            return true;
        }
    }
    
    public boolean reintegro(double reintegro){
        if ((this.saldo-reintegro)<0){
            System.out.println("Disculpe, el reintegro es superior a la cantidad que contiene la cuenta");
            return false;
        }
        else{
            setSaldo(this.saldo-reintegro);
            return true;
        }
    }
    
    public void transferencia(ACuenta c2,double transferencia){
        if ((this.saldo-transferencia)<0){
              System.out.println("Disculpe, su cuenta no dipone de fondos suficientes para realizar la transferencia");
        }
        else{
            setSaldo(this.saldo-transferencia);
            c2.setSaldo(c2.saldo+transferencia);
        }
    }
    
    
    
}
