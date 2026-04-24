package TP5;

 abstract class Abonnement {
    private String nom;
    private double prixBase;
    private int nbProfils;
    

    public Abonnement(String nom, double prixBase, int nbProfils){
        this.nom=nom;
        if(prixBase<=0){
            this.prixBase=1;
        }else{
          this.prixBase=prixBase;
        }
        if(nbProfils<=0){
          this.nbProfils=1;
        }else{
        this.nbProfils=nbProfils;
        }
    }

    public String getNom() { return nom; }
    public double getPrixBase() { return prixBase; }
    public int getNbProfils() { return nbProfils; }

    public void setNom(String nom)   { 
        this.nom= nom; }
    public void setPrixBase(double prixBase)   { 
        if (prixBase > 0) {
            this.prixBase = prixBase;
        } else {
            this.prixBase = 1;
        } }

    public void setNbProfils(int nbProfils) {
    if (nbProfils > 0) {
        this.nbProfils = nbProfils;
    }else {
            this.nbProfils = 1;
           }
    }
    
    public boolean estPartageFamilial(){
        if(nbProfils>=3){
            return true;
        }else{
            return false;
        }
    }
    public void afficherInfos(){
        System.out.println("Nom : " +nom);
        System.out.println("Prix Base : " +prixBase);
        System.out.println("nbProfils : " +nbProfils);
        System.out.println("Partage familial: " + estPartageFamilial());
    }
    abstract double calculerCoutMensuel();
    abstract int calculerScoreSatisfaction();
}
