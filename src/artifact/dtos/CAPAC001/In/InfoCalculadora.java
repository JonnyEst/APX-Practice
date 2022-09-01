package artifact.dtos.CAPAC001.In;

public class InfoCalculadora {

    private String nombre;
    private String porQue;
    private Calculadora calculadora;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPorQue() {
        return porQue;
    }
    public void setPorQue(String porQue) {
        this.porQue = porQue;
    }
    public Calculadora getCalculadora() {
        return calculadora;
    }
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public String toString() {
        return "InfoCalculadora{" +
                "nombre='" + nombre + '\'' +
                ", porQue='" + porQue + '\'' +
                ", calculadora=" + calculadora +
                '}';
    }
}
