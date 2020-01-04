package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.Autre;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 * Classe utilisant la librairie LMLPersistenceJPA pour l'entité autre.
 *
 * @author alan
 */
public class AutreDataServiceJPAImpl extends AbstracCrudServiceJPA<Autre> implements AutreDataService {

    /**
     *
     * @param PU Nom du persistence unit.
     */
    public AutreDataServiceJPAImpl(String PU) {
        super(PU);
    }
}
