package it.infrazioneDAO;

public class Infrazione {

    
    private int id;
    private String data;
    private String tipo;
    private double importo;
    private String targa;

   
    public Infrazione() {}


    public Infrazione(int id, String data, String tipo, double importo, String targa) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.importo = importo;
        this.targa = targa;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}