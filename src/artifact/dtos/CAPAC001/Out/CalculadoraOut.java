package artifact.dtos.CAPAC001.Out;

public class CalculadoraOut {

    private Integer valUno;
    private Integer valDos;
    private String operacion;
    private Integer resultado;

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
    public Integer getResultado() {
        return resultado;
    }
    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "CalculadoraOut{" +
                "valUno=" + valUno +
                ", valDos=" + valDos +
                ", operacion='" + operacion + '\'' +
                ", resultado=" + resultado +
                '}';
    }
}
