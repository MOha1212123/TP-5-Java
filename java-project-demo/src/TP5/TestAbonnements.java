package TP5;

public class TestAbonnements {
    public static void main(String[] args) {
    
        Abonnement[] A = new Abonnement[3];

        A[0] = new AbonnementVideo("Youtube", 100.0, 10, true, true);
        A[1] = new AbonnementMusique("Spotfy", 300, 20, 40, true);
        A[2] = new AbonnementJeux("PES", 400, 50, 34, 8 );

        for (Abonnement a : A) {
            a.afficherInfos();
            System.out.println("Cout mensuel: " + a.calculerCoutMensuel());
            System.out.println("Score satisfaction: " + a.calculerScoreSatisfaction());
            System.out.println("----------------------");
        }

        Reducible[] reducibles = {
            (Reducible) A[0],
            (Reducible) A[1]
        };

        System.out.println("=== Test Réduction ===");
        for (Reducible r : reducibles) {
            System.out.println("20%: " + r.appliquerReduction(20));
            System.out.println("50%: " + r.appliquerReduction(50));
        }
    }
}
