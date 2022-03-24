
package classes;

public class Camion extends Vehicule {
    
    private boolean remorque;
    
    public Camion(String marque, String modele, String immatriculation,boolean remorque) {
        super(marque, modele, immatriculation);
        this.remorque = remorque;
    }

    public boolean isRemorque() {
        return remorque;
    }

    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }
    @Override
    public String toString() {
        String affcihage;
        if (isRemorque()){
            affcihage ="Le camion "+getMarque()+" Modele : "+getModele()+" Immatriculation : "+getImmatriculation()+" contient une remorque" ;
            return affcihage;
        }
        else{
            affcihage = "Le camion "+getMarque()+" Modele : "+getModele()+" Immatriculation : "+getImmatriculation()+" ne contient une remorque";
            return affcihage;
        }
    }
}
