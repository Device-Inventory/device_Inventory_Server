
import fr.freeboxos.ftb.metier.AdministrateurService;
import fr.freeboxos.ftb.metier.AutreService;
import fr.freeboxos.ftb.metier.CableService;
import fr.freeboxos.ftb.metier.HDDService;
import fr.freeboxos.ftb.metier.MemoireService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.ProcesseurService;
import fr.freeboxos.ftb.metier.entitys.Administrateur;
import fr.freeboxos.ftb.metier.entitys.Autre;
import fr.freeboxos.ftb.metier.entitys.Cable;
import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.Memoire;
import fr.freeboxos.ftb.metier.entitys.Processeur;
import fr.freeboxos.ftb.metier.entitys.SSD;

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

        autre = new Autre("Carton");
        autre.setNombre(2);
        autreService.add(autre);

        //create cable
        Cable cable;
        CableService cableService = MetierFactory.getCableService();

        cable = new Cable("hdmi", "hdmi", "hdmi", 1);
        cableService.add(cable);

        //create hdd
        HDD hdd;
        HDDService hDDService = MetierFactory.getHDDService();

        hdd = new HDD("Seagate", "ABC", "SATA", "1.5", "1To", "7200", "64", "50");
        hDDService.add(hdd);

        SSD ssd;

        ssd = new SSD("fvgbhn", true, "fghn", "fghj", "fgbn,", 56, true, "cvbn", "fghj", "vbn", "cvb", "vbn", "fghj,k;", "dfgh", "cvbn");

        hDDService.add(ssd);

        Memoire memoire;
        MemoireService memoireService = MetierFactory.getMemoireService();

        memoire = new Memoire("is", "dbkedf", "fkn", "bjknb ", "bkj bn", "bkn", "kjve", "bk e", "kbndevk", "567");
        memoireService.add(memoire);

        Processeur processeur;
        ProcesseurService processeurService = MetierFactory.getProcesseurService();

        processeur = new Processeur("kjbn", "dfkdb", "bknk", "fkvjdb", "kjv nbk", 6, 18, "bkjb", "kjb", "kbdnb", "ffbnf", "kfvjnerk", "56", "456");
        processeurService.add(processeur);

        Administrateur administrateur;
        AdministrateurService administrateurService = MetierFactory.getAdministrateurService();

        administrateur = new Administrateur();
        administrateur.setLogin("admin");
        administrateur.setMdp("admin");
        administrateurService.add(administrateur);

    }

}
