/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique;

import fr.freeboxos.ftb.physique.data.jpa.AdministrateurDataService;
import fr.freeboxos.ftb.physique.data.jpa.AdministrateurDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.AutreDataService;
import fr.freeboxos.ftb.physique.data.jpa.AutreDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.CableDataService;
import fr.freeboxos.ftb.physique.data.jpa.CableDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.CarteGraphiqueDataService;
import fr.freeboxos.ftb.physique.data.jpa.CarteGraphiqueDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.CarteMereDataService;
import fr.freeboxos.ftb.physique.data.jpa.CarteMereDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.HddDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.MemoireDataService;
import fr.freeboxos.ftb.physique.data.jpa.MemoireDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.OrdinateurDataService;
import fr.freeboxos.ftb.physique.data.jpa.OrdinateurDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.ProcesseurDataService;
import fr.freeboxos.ftb.physique.data.jpa.ProcesseurDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigChipsetCpuDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigChipsetCpuDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigFormatCarteMereDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigFormatCarteMereDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueCarteMereDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueCarteMereDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueChipsetGpuDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueChipsetGpuDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueCpuDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueCpuDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueGpuDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueGpuDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueHddDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueHddDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueRamDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueRamDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigSupportDuProcesseurDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigSupportDuProcesseurDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeCableDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeCableDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeMemoireDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeMemoireDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeSsdDataService;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeSsdDataServiceJPAImpl;
import fr.freeboxos.ftb.physique.data.jpa.HddDataService;

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

    private static HddDataService hddDataService = null;

    /**
     *
     * @return hddDataService
     */
    public static HddDataService getHDDDataService() {
        if (hddDataService == null) {
            hddDataService = new HddDataServiceJPAImpl(PU);
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

    private static ConfigChipsetCpuDataService configChipsetCpuDataService = null;

    public static ConfigChipsetCpuDataService getConfigChipsetCpuDataService() {
        if (configChipsetCpuDataService == null) {
            configChipsetCpuDataService = new ConfigChipsetCpuDataServiceJPAImpl(PU);
        }
        return configChipsetCpuDataService;
    }

    private static ConfigFormatCarteMereDataService configFormatCarteMereDataService = null;

    public static ConfigFormatCarteMereDataService getConfigFormatCarteMereDataService() {
        if (configFormatCarteMereDataService == null) {
            configFormatCarteMereDataService = new ConfigFormatCarteMereDataServiceJPAImpl(PU);
        }
        return configFormatCarteMereDataService;

    }

    private static ConfigMarqueCarteMereDataService configMarqueCarteMereDataService = null;

    public static ConfigMarqueCarteMereDataService getConfigMarqueCarteMereDataService() {
        if (configMarqueCarteMereDataService == null) {
            configMarqueCarteMereDataService = new ConfigMarqueCarteMereDataServiceJPAImpl(PU);
        }
        return configMarqueCarteMereDataService;
    }

    private static ConfigMarqueChipsetGpuDataService configMarqueChipsetGpuDataService = null;

    public static ConfigMarqueChipsetGpuDataService getConfigMarqueChipsetGpuDataService() {
        if (configMarqueChipsetGpuDataService == null) {
            configMarqueChipsetGpuDataService = new ConfigMarqueChipsetGpuDataServiceJPAImpl(PU);
        }
        return configMarqueChipsetGpuDataService;
    }

    private static ConfigMarqueGpuDataService configMarqueGpuDataService = null;

    public static ConfigMarqueGpuDataService getConfigMarqueGpuDataService() {
        if (configMarqueGpuDataService == null) {
            configMarqueGpuDataService = new ConfigMarqueGpuDataServiceJPAImpl(PU);
        }
        return configMarqueGpuDataService;
    }

    private static ConfigMarqueHddDataService configMarqueHddDataService = null;

    public static ConfigMarqueHddDataService getConfigMarqueHddDataService() {
        if (configMarqueHddDataService == null) {
            configMarqueHddDataService = new ConfigMarqueHddDataServiceJPAImpl(PU);
        }
        return configMarqueHddDataService;
    }

    private static ConfigMarqueRamDataService configMarqueRamDataService = null;

    public static ConfigMarqueRamDataService getConfigMarqueRamDataService() {
        if (configMarqueRamDataService == null) {
            configMarqueRamDataService = new ConfigMarqueRamDataServiceJPAImpl(PU);
        }
        return configMarqueRamDataService;
    }

    private static ConfigSupportDuProcesseurDataService configSupportDuProcesseurDataService = null;

    public static ConfigSupportDuProcesseurDataService getConfigSupportDuProcesseurDataService() {
        if (configSupportDuProcesseurDataService == null) {
            configSupportDuProcesseurDataService = new ConfigSupportDuProcesseurDataServiceJPAImpl(PU);
        }
        return configSupportDuProcesseurDataService;
    }

    private static ConfigTypeCableDataService configTypeCableDataService = null;

    public static ConfigTypeCableDataService getConfigTypeCableDataService() {
        if (configTypeCableDataService == null) {
            configTypeCableDataService = new ConfigTypeCableDataServiceJPAImpl(PU);
        }
        return configTypeCableDataService;
    }

    private static ConfigTypeMemoireDataService configTypeMemoireDataService = null;

    public static ConfigTypeMemoireDataService getConfigTypeMemoireDataService() {
        if (configTypeMemoireDataService == null) {
            configTypeMemoireDataService = new ConfigTypeMemoireDataServiceJPAImpl(PU);
        }
        return configTypeMemoireDataService;
    }

    private static ConfigTypeSsdDataService configTypeSsdDataService = null;

    public static ConfigTypeSsdDataService getConfigTypeSsdDataService() {
        if (configTypeSsdDataService == null) {
            configTypeSsdDataService = new ConfigTypeSsdDataServiceJPAImpl(PU);
        }
        return configTypeSsdDataService;
    }
}
