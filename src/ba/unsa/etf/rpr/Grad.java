package ba.unsa.etf.rpr;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Grad {

    private SimpleIntegerProperty id, brojStanovnika;
    private SimpleStringProperty naziv;
    private Drzava drzava;

    public Grad() {
        id = new SimpleIntegerProperty(0);
        naziv = new SimpleStringProperty("");
        brojStanovnika = new SimpleIntegerProperty(0);
        drzava = null;
    }

    public Grad (Integer a, String b, Integer c, Drzava d) {
        id = new SimpleIntegerProperty(a);
        naziv = new SimpleStringProperty(b);
        brojStanovnika = new SimpleIntegerProperty(c);
        drzava = d;
    }


    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNaziv() {
        return naziv.get();
    }

    public SimpleStringProperty nazivProperty() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv.set(naziv);
    }

    public int getBrojStanovnika() {
        return brojStanovnika.get();
    }

    public SimpleIntegerProperty brojStanovnikaProperty() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika.set(brojStanovnika);
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }
}
