package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.Cable;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 * Classe utilisant la librairie LMLPersistenceJPA pour l'entité cable.
 *
 * @author alan
 */
public class CableDataServiceJPAImpl extends AbstracCrudServiceJPA<Cable> implements CableDataService {

    /**
     *
     * @param PU Nom du persistence unit.
     */
    public CableDataServiceJPAImpl(String PU) {
        super(PU);
    }

}
