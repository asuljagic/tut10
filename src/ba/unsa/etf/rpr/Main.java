package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String ispisiGradove(){
        ArrayList<Grad> gradovi = GeografijaDAO.getInstance().gradovi();
        String rez = "";
        for (Grad grad: gradovi) {
            rez += grad.getNaziv() + " (" + grad.getDrzava().getNaziv() + ")" + " - " +
                    grad.getBrojStanovnika() + "\n";
        }
        return rez;
    }

    public static void glavniGrad(){
        System.out.println("Unesite ime drzave: ");
        Scanner scanner = new Scanner(System.in);
        String drzava = scanner.nextLine();
        Grad grad = GeografijaDAO.getInstance().glavniGrad(drzava);
        if (grad != null) {
            System.out.println("Glavni grad drzave " + drzava + " je " + grad.getNaziv());
        }
        else {
            System.out.println("Nepostojeca drzava");
        }

    }

    public static void main(String[] args) {
        System.out.println("Gradovi su:\n" + ispisiGradove());
        glavniGrad();
    }
}
