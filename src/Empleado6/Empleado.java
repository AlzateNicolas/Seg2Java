package src.Empleado6;

public class Empleado {
    public int codEmpleado;
    private int salarioBasico;
    public int horasExtra;
    private int numeroHoras;
    private int descuento;
    private int desceuntoPrestamo;
    private int bonificacion;
    private int neto;

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public int getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        salarioBasico = salarioBasico;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDesceuntoPrestamo() {
        return desceuntoPrestamo;
    }

    public void setDesceuntoPrestamo(int desceuntoPrestamo) {
        this.desceuntoPrestamo = desceuntoPrestamo;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }
    public int calcularHE(){
        return this.horasExtra * this.numeroHoras;
    }
    public int calDevengado(){
        return this.salarioBasico + this.calcularHE() + this.bonificacion;
    }
    public int calcularDeducido(){
        return this.descuento + this.desceuntoPrestamo;
    }
    public int calcularNeto(){
        return this.calDevengado() - this.calcularDeducido();
    }
}
