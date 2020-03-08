/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueCpuDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueCpuDataServiceJPAImpl;

/**
 * Physique data factory permet de créer les objets de chaque entités.
 *
 * @author alan
 */
public class PhysiqueDataFactory {

    private static final String PU = "Device_InventoryServerPU";

    private static AutreDataService autreDataService = null;

    /**
     *
     * @return autreDataService
     */
    public static AutreDataService getAutreDataService() {
        if (autreDataService == null) {
            autreDataService = new AutreDataServiceJPAImpl(PU);
        }
        return autreDataService;
    }

    private static CableDataService cableDataService = null;

    /**
     *
     * @return cableDataService
     */
    public static CableDataService getCableDataService() {
        if (cableDataService == null) {
            cableDataService = new CableDataServiceJPAImpl(PU);
        }
        return cableDataService;
    }

    private static HDDDataService hddDataService = null;

    /**
     *
     * @return hddDataService
     */
    public static HDDDataService getHDDDataService() {
        if (hddDataService == null) {
            hddDataService = new HDDDataServiceJPAImpl(PU);
        }
        return hddDataService;
    }

    private static MemoireDataService memoireDataService = null;

    /**
     *
     * @return memoireDataService
     */
    public static MemoireDataService getMemoireDataService() {
        if (memoireDataService == null) {
            memoireDataService = new MemoireDataServiceJPAImpl(PU);
        }
        return memoireDataService;
    }

    private static ProcesseurDataService processeurDataService = null;

    /**
     *
     * @return processeurDataService
     */
    public static ProcesseurDataService getProcesseurDataService() {
        if (processeurDataService == null) {
            processeurDataService = new ProcesseurDataServiceJPAImpl(PU);
        }
        return processeurDataService;
    }

    private static AdministrateurDataService administateurDataService = null;

    /**
     *
     * @return administrateurDataService
     */
    public static AdministrateurDataService getAdministrateurDataService() {
        if (administateurDataService == null) {
            administateurDataService = new AdministrateurDataServiceJPAImpl(PU);
        }

        return administateurDataService;
    }

    private static OrdinateurDataService ordinateurDataService = null;

    public static OrdinateurDataService getOrdinateurDataService() {
        if (ordinateurDataService == null) {
            ordinateurDataService = new OrdinateurDataServiceJPAImpl(PU);
        }

        return ordinateurDataService;
    }

    private static CarteGraphiqueDataService carteGraphiqueDataService = null;

    public static CarteGraphiqueDataService getCarteGraphiqueDataService() {
        if (carteGraphiqueDataService == null) {
            carteGraphiqueDataService = new CarteGraphiqueDataServiceJPAImpl(PU);
        }
        return carteGraphiqueDataService;
    }

    private static CarteMereDataService carteMereDataService = null;

    public static CarteMereDataService getCarteMereDataService() {
        if (carteMereDataService == null) {
            carteMereDataService = new CarteMereDataServiceJPAImpl(PU);
        }
        return carteMereDataService;
    }

    private static ConfigMarqueCpuDataService configMarqueCpuService = null;

    public static ConfigMarqueCpuDataService getConfigMarqueCpuDataService() {
        if (configMarqueCpuService == null) {
            configMarqueCpuService = new ConfigMarqueCpuDataServiceJPAImpl(PU);
        }
        return configMarqueCpuService;
    }
}
