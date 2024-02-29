
public class CompteBancaire {
        private double solde;

        public CompteBancaire(double soldeInitial) throws Exp1{

            this.solde = soldeInitial;
            if (soldeInitial<0) throw new Exp1();
        }

        public void deposer(double montant)throws Exp2{
            if (montant<=0)throw new  Exp2();
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + solde);
        }

        public void retirer(double montant) throws Exp2 {
            if (montant <= solde) {
                if(montant<0)throw new Exp2();
                solde -= montant;
                System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
            } else {
                System.out.println("Solde insuffisant.");
            }
        }

        public double getSolde() {
            return solde;
        }
    }
