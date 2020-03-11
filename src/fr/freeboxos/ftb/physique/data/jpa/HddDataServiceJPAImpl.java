/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.HDD;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 * Classe utilisant la librairie LMLPersistenceJPA pour l'entité disque dur.
 *
 * @author alan
 */
public class HddDataServiceJPAImpl extends AbstracCrudServiceJPA<HDD> implements HddDataService {

    /**
     *
     * @param PU Nom du persistence unit.
     */
    public HddDataServiceJPAImpl(String PU) {
        super(PU);
    }

}
