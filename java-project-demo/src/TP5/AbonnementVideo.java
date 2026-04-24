package TP5;

public class AbonnementVideo extends Abonnement implements Reducible  {
    protected boolean optionHD;
    protected boolean option4K;

    public AbonnementVideo(String nom, double prixBase, int nbProfils, boolean optionHD, boolean option4K){
        super(nom, prixBase, nbProfils);
        this.optionHD=optionHD;
        this.option4K=option4K;
    }

    public double calculerCoutMensuel(){
        double total = getPrixBase();
        if(optionHD==true){
            total+=10;
        }
        if(option4K==true){
            total+=20;
        }
        return total;
    }

    public int calculerScoreSatisfaction( ){
         int score=60;

        if(optionHD== true){
            score+=10;
        }
        if(option4K==true){
            score+=20;
        }
        if(getNbProfils()>=4){
                score+=10;
        }
        if(score>100){
           score=100;
        }  
        return score;  
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
