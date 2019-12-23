/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.Memoire;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 * Classe utilisant la librairie LMLPersistenceJPA pour l'entité memoire.
 *
 * @author alan
 */
public class MemoireDataServiceJPAImpl extends AbstracCrudServiceJPA<Memoire> implements MemoireDataService {

    /**
     *
     * @param PU Nom du persistence unit
     */
    public MemoireDataServiceJPAImpl(String PU) {
        super(PU);
    }

}
