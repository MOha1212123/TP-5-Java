package TP5;

public class AbonnementMusique extends Abonnement implements Reducible{
    protected int nbplaylists;
    protected boolean optionOffline;
    

    public AbonnementMusique(String nom, double prixBase, int nbProfils, int nbplaylists, boolean optionOffline){
        super(nom, prixBase, nbProfils);
        this.nbplaylists=nbplaylists;
        this.optionOffline=optionOffline;
    }

    public double calculerCoutMensuel(){
       double total = getPrixBase();

        if(optionOffline){
             total += 15;
    }

    return total;
    }

    public int calculerScoreSatisfaction(){
        int score = 50;

    if(nbplaylists > 20){
        score += 20;
    }

    if(optionOffline){
        score += 20;
    }

    if(getNbProfils() > 1){
        score += 10;
    }

    return Math.min(score, 100);
    }
    public boolean estEligibleReduction(double p) {
        return p <= 30;
    }
    public double appliquerReduction(double p) {
        if (estEligibleReduction(p)) {
            return calculerCoutMensuel() * (1 - p / 100);
        }
        return calculerCoutMensuel();
    }
}
