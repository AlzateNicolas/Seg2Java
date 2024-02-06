package src.Bombilla4;

public class Bombilla {
    private boolean estado;
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public String encenderLuces(){
     this.estado = true;
        return "Luz encendida";
    }
   public String apagarLuz(){
        this.estado = false;
        return "Luz apagada";
   }


}
