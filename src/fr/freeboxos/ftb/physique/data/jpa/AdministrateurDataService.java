/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.Administrateur;
import lml.persistence.CrudService;

/**
 * Déclaration abstraite des methodes de l'entité administrateur.
 *
 * @author alan
 */
public interface AdministrateurDataService extends CrudService<Administrateur> {

    /**
     *
     * @param login String de l'administrateur rechercher.
     * @return Un objet administrateur complet grace a JPA.
     * @throws Exception Exception Capture d'une erreur pendant la demande sur
     * la base de donnée.
     */
    public Administrateur getByLogin(String login) throws Exception;
}
