package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.Processeur;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 * Classe utilisant la librairie LMLPersistenceJPA pour l'entité processeur.
 *
 * @author alan
 */
public class ProcesseurDataServiceJPAImpl extends AbstracCrudServiceJPA<Processeur> implements ProcesseurDataService {

    /**
     *
     * @param PU Nom du persistence unit.
     *
     */
    public ProcesseurDataServiceJPAImpl(String PU) {
        super(PU);
    }

}
