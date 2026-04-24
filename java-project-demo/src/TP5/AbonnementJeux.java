package TP5;

 class AbonnementJeux extends Abonnement{
    protected int nbJeuxInclus;
    protected int heuresjeuParMois;
  

    public AbonnementJeux(String nom, double prixBase, int nbProfils, int nbJeuxInclus, int heuresjeuParMois ){
        super(nom, prixBase, nbProfils);
        this.nbJeuxInclus=nbJeuxInclus;
        this.heuresjeuParMois=heuresjeuParMois;
    }

    public double calculerCoutMensuel(){
        double total = getPrixBase();
        if(nbJeuxInclus>50){
         total+=25;
        }
        if(heuresjeuParMois>40){
          total+=15;
        }
        return total;
    }

    public int calculerScoreSatisfaction(){
        int scorinitial=40;
        if(nbJeuxInclus>30){
            scorinitial+=20;
        }
        if(heuresjeuParMois>=20){
           scorinitial+=20;
        }
        if (getNbProfils() >= 2) scorinitial += 10;
        return Math.min(scorinitial, 100);

    } 

}
