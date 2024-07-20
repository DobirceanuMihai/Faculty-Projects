import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Automat{
    private String st_init;
    private String st_finale[];
    private ListaTranzitii lt = new ListaTranzitii();
    private List<String> listaStari = new ArrayList<>();
    private List<String> multime = new ArrayList<>();
    private List<String> multime2 = new ArrayList<>();
    private List<String> stariNeacceptate = new ArrayList<>();

    Automat(String nume_fis) throws Exception{
        BufferedReader buf = new BufferedReader(new FileReader(nume_fis));
        this.st_init = buf.readLine();
        String st_finale_str = buf.readLine();
        this.st_finale = st_finale_str.split(" ");

        while(true){
            String linie = buf.readLine();
            if(linie == null)
                break;
            else{
                String tbl[] = linie.split(" ");
                Tranzitie tr = new Tranzitie(tbl[0], tbl[1].charAt(0), tbl[2]);
                System.out.println(linie);
                this.lt.adaugaTranzitii(tr);
                multime.add(tbl[0]);
                multime.add(tbl[2]);
            }
        }
    }

    boolean apartineStareFinala(String stare, String[] stari){
        for (int i = 0; i < stari.length; i++) {
            if(stare.equals(stari[i])){
                return true;
            }
        }
        return false;
    }

    boolean analizeazaCuvant(String sir_intrare){
        Tranzitie trnz = new Tranzitie("0", '0', "0");
        if(sir_intrare.equals("")){
            if(apartineStareFinala(st_init, st_finale))
                return true;
            else
                return false;
        }
        for (int i = 0; i < sir_intrare.length(); i++) {
            if(i == sir_intrare.length() - 1){
                trnz = lt.gasesteTranzitie(trnz.spuneStSfarsit(), sir_intrare.charAt(i));
                if(trnz == null)
                    return false;
                if(apartineStareFinala(trnz.spuneStSfarsit(), st_finale)){
                    listaStari.add(trnz.spuneStSfarsit());
                    return true;
                }
            }
            if(i == 0){
                trnz = lt.gasesteTranzitie(st_init, sir_intrare.charAt(i));
                listaStari.add(trnz.spuneStInceput());
                listaStari.add(trnz.spuneStSfarsit());
            }else{
                trnz = lt.gasesteTranzitie(trnz.spuneStSfarsit(), sir_intrare.charAt(i));
                listaStari.add(trnz.spuneStSfarsit());
            }
        }
        return false;
    }

    void AfisStari(){
        System.out.println(Arrays.toString(listaStari.toArray()).replace("[", "->").replace(",", "->").replace("]", ""));
    }

    void AfisMultime(){
        for (int i = 0; i < multime.size(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if(multime.get(i).equals(multime.get(j))){
                    break;
                }
            }
                if(i == j){
                    multime2.add(multime.get(i));
                }
        }
        System.out.println(Arrays.toString(multime2.toArray()).replace("[", "{").replace("]", "}"));
    }

    void StariPrinCareNuTrece(){
        int contor;
        for (int i = 0; i < multime2.size(); i++) {
            contor = 0;
            for (int j = 0; j < listaStari.size(); j++) {
                if(listaStari.get(j).equals(multime2.get(i))){
                    continue;
                }else{
                    contor++;
                }
                if(contor == listaStari.size()){
                    stariNeacceptate.add(multime2.get(i));
                }
            }
        }
        System.out.println(Arrays.toString(stariNeacceptate.toArray()));
    }
}