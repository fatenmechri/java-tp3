import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le solde initial du compte : ");
        try {
            double soldeInitial = scanner.nextDouble();
            if(soldeInitial<0)  throw new Exp1();
            CompteBancaire compte = new CompteBancaire(soldeInitial);
            System.out.print("Entrez le montant à déposer : ");
            double montantDepot = scanner.nextDouble();
            if (montantDepot<0)throw new Exp2();
            compte.deposer(montantDepot);
            System.out.print("Entrez le montant à retirer : ");
            double montantRetrait = scanner.nextDouble();
            compte.retirer(montantRetrait);

            System.out.println("Solde final du compte : " + compte.getSolde());
        }
        catch (Exp1 e){
            System.out.println("Solde invalide : Le solde doit être supérieur à zéro");
        }
        catch (Exp2 e){
            System.out.println("montant invalide : Le montant doit être supérieur à zéro");
        }
        scanner.close();
    }
}