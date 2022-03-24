
package classes;

public class Moto  extends Vehicule {
    
    private int vitesseMax;
    
    public Moto(String marque, String modele, String immatriculation,int vitesseMax) {
        super(marque, modele, immatriculation);
        this.vitesseMax = vitesseMax;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
    @Override
    public String toString() {
        String affichage ; 
        affichage = "La moto "+getMarque()+" Modele : "+getModele()+" Immatriculation : "+getImmatriculation()+" Vitesse maximale : "+getVitesseMax();
        return affichage;
    }
}
