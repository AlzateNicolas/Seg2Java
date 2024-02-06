package src.Notas14;

public class Notas {
    private int fisica;
    private int quimica;
    private int biologia;
    private int matematica;
    private int informatica;

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

    public int getQuimica() {
        return quimica;
    }

    public void setQuimica(int quimica) {
        this.quimica = quimica;
    }

    public int getBiologia() {
        return biologia;
    }

    public void setBiologia(int biologia) {
        this.biologia = biologia;
    }

    public int getMatematica() {
        return matematica;
    }

    public void setMatematica(int matematica) {
        this.matematica = matematica;
    }

    public int getInformatica() {
        return informatica;
    }

    public void setInformatica(int informatica) {
        this.informatica = informatica;
    }

    public int sumaNotas() {
        this.informatica = 7;
        this.quimica = 3;
        this.biologia = 7;
        this.matematica = 10;
        this.fisica = 9;
        return this.fisica + this.quimica + this.matematica + this.informatica + this.biologia;
    }

    public int promNotas() {
        return this.sumaNotas() / 5;
    }

    public void  calificacionTotal() {
        if (promNotas() >= 0 && promNotas() <= 5.9) {

        } else if (promNotas() >= 6 && promNotas() <= 8) {

        } else if (promNotas() > 8) {

        }
    }
}



