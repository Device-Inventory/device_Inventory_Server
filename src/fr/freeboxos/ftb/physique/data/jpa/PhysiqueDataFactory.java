/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data.jpa;

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
}