public class Test {
    public static void main(String[] args) throws Exception {
        Automat M = new Automat("automat.txt");
        System.out.print("Cuvantul este acceptat: ");
        System.out.println(M.analizeazaCuvant("abb"));
        System.out.print("Starile prin care trece automatul: ");
        M.AfisStari();
        System.out.print("Multimea de stari: ");
        M.AfisMultime();
        System.out.print("Stari prin care nu trece automatul: ");
        M.StariPrinCareNuTrece();

    }
}
