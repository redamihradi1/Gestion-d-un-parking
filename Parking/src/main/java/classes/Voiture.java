
package classes;

public class Voiture  extends Vehicule {
   
    private int nombrePortes;
    
    public Voiture(String marque, String modele, String immatriculation,int nombrePortes) {
        super(marque, modele, immatriculation);
        this.nombrePortes = nombrePortes ;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }
    @Override
    public String toString() {
        String affichage;
        affichage = "La voiture "+getMarque()+" Modele : "+getModele()+" Immatriculation : "+getImmatriculation()+" Nombre de portes : "+getNombrePortes();
        return affichage ; 
    }
    
    
}
