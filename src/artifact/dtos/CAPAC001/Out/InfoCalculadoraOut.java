package artifact.dtos.CAPAC001.Out;

public class InfoCalculadoraOut {

    private String nombre;
    private String Porque;
    private CalculadoraOut calculadoraOut;



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPorque() {
        return Porque;
    }
    public void setPorque(String porque) {
        Porque = porque;
    }
    public CalculadoraOut getCalculadoraOut() {
        return calculadoraOut;
    }
    public void setCalculadoraOut(CalculadoraOut calculadoraOut) {
        this.calculadoraOut = calculadoraOut;
    }

    @Override
    public String toString() {
        return "InfoCalculadoraOut{" +
                "nombre='" + nombre + '\'' +
                ", Porque='" + Porque + '\'' +
                ", calculadoraOut=" + calculadoraOut +
                '}';
    }
}
