package src.Guia8;

import javax.net.ssl.SSLContext;

public class Guia {
    public String numeroGuia;
    private    String fecha;
    private String tipoEmbalaje;
    public int cedulaCliente;
    private int peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int costo;
    private String estadoEnvio;

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }
    public int calcularCostoXKilo(){
        return this.costo * this.peso;
    }
    public String verificarEntrega(){
        this.numeroGuia = "12A";
        this.fecha = "26 de febrero";
        this.tipoEmbalaje = "primario";
        this.cedulaCliente = 1233;
        this.ciudadOrigen = "Cali";
        this.ciudadDestino = "Medellín";
        this.estadoEnvio = "Empacando";
        return "La entrega ha sido completada con éxito";
    }
}
