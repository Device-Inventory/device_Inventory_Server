
import fr.freeboxos.ftb.metier.AutreService;
import fr.freeboxos.ftb.metier.CableService;
import fr.freeboxos.ftb.metier.HDDService;
import fr.freeboxos.ftb.metier.MemoireService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.OrdinateurService;
import fr.freeboxos.ftb.metier.ProcesseurService;
import fr.freeboxos.ftb.metier.config.ConfigMarqueCpuService;
import fr.freeboxos.ftb.metier.entitys.Autre;
import fr.freeboxos.ftb.metier.entitys.Cable;
import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.Memoire;
import fr.freeboxos.ftb.metier.entitys.Ordinateur;
import fr.freeboxos.ftb.metier.entitys.Processeur;
import fr.freeboxos.ftb.metier.entitys.SSD;
import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueCpu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alan
 */
public class TestServer {

    public static void main(String[] args) throws Exception {
        new TestServer().populate();
    }

    private void populate() throws Exception {

        //create autre element
        Autre autre;
        AutreService autreService = MetierFactory.getAutreService();

        autreService.getAll();

        for (int i = 0; i < 10; i++) {
            autre = new Autre("Carton");
            autre.setNombre(2);
            autreService.add(autre);
        }

        //create cable
        Cable cable;
        CableService cableService = MetierFactory.getCableService();

        for (int i = 0; i < 10; i++) {
            cable = new Cable("hdmi", "hdmi", "hdmi", 1);
            cableService.add(cable);
        }

        //create hdd
        HDD hdd;
        HDDService hDDService = MetierFactory.getHDDService();

        for (int i = 0; i < 10; i++) {
            hdd = new HDD("Seagate", "ABC", "SATA", "1.5", "1To", "7200", "64", "50");
            hDDService.add(hdd);
        }

        SSD ssd;

        for (int i = 0; i < 10; i++) {
            ssd = new SSD("fvgbhn", true, "fghn", "fghj", "fgbn,", 56, true, "cvbn", "fghj", "vbn", "cvb", "vbn", "fghj,k;", "dfgh", "50");

            hDDService.add(ssd);
        }

        Memoire memoire;
        MemoireService memoireService = MetierFactory.getMemoireService();

        for (int i = 0; i < 10; i++) {
            memoire = new Memoire("is", "dbkedf", "fkn", "bjknb ", "bkj bn", "bkn", "kjve", "bk e", "kbndevk", "567");
            memoireService.add(memoire);
        }

        Processeur processeur;
        ProcesseurService processeurService = MetierFactory.getProcesseurService();

        for (int i = 0; i < 10; i++) {
            processeur = new Processeur("kjbn", "dfkdb", "bknk", "fkvjdb", "kjv nbk", 6, 18, "bkjb", "kjb", "kbdnb", "ffbnf", "kfvjnerk", "56", "456");
            processeurService.add(processeur);
        }

        Ordinateur ordinateur;
        OrdinateurService ordinateurService = MetierFactory.getOrdinateurService();

        for (int i = 0; i < 1; i++) {
            Processeur processeur1 = processeurService.getById(1l);
            Memoire memoire1 = memoireService.getById(1l);
            HDD hdd1 = hDDService.getById(1l);

            ordinateur = new Ordinateur(false, processeur1, memoire1, hdd1);
            ordinateurService.add(ordinateur);
        }

//        CarteMere carteMere;
//        CarteMereService carteMereService = MetierFactory.getCarteMereService();
//        List<String> marque = null;
//        marque.add("amd");
//        marque.add("intel");
//
//        for (int i = 0; i < 10; i++) {
//            //carteMere = new CarteMere(marque, "bjknrd", "dbjkndf", 5.0f, "jhrfedv", 3, "fkbjgfn", "lkbjn", true, "dflkbjhdn", "klbjdn", 5, 5, "dkbjndr", true, true, "gblkjf", 64, "jkfgbn", "jkfghdn", true, true, true, true, true, 54, 4165, 6541, 6541, 641, "jhfgdv", 354, "dkhjbd", "bdfkjg", true, "fgdjhb", 54);
//            //carteMereService.add(carteMere);
//        }
        ConfigMarqueCpu configMarqueCpu;
        ConfigMarqueCpuService configMarqueCpuService = MetierFactory.getConfigMarqueCpuService();

        for (int i = 0; i < 10; i++) {
            configMarqueCpu = new ConfigMarqueCpu("amd");
            configMarqueCpuService.add(configMarqueCpu);
        }

    }

}
