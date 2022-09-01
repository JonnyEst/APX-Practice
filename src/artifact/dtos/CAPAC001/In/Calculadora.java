package artifact.dtos.CAPAC001.In;

public class Calculadora {

    private Integer valUno;
    private Integer valDos;
    private String operacion;

    public Integer getValUno() {
        return valUno;
    }
    public void setValUno(Integer valUno) {
        this.valUno = valUno;
    }
    public Integer getValDos() {
        return valDos;
    }
    public void setValDos(Integer valDos) {
        this.valDos = valDos;
    }
    public String getOperacion() {
        return operacion;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "valUno=" + valUno +
                ", valDos=" + valDos +
                ", operacion='" + operacion + '\'' +
                '}';
    }
}
