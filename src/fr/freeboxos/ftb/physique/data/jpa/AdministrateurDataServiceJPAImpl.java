package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.Administrateur;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 * Classe utilisant la librairie LMLPersistenceJPA pour l'entité administrateur.
 *
 * @author alan
 */
public class AdministrateurDataServiceJPAImpl extends AbstracCrudServiceJPA<Administrateur> implements AdministrateurDataService {

    /**
     *
     * @param PU Nom du persistence unit.
     */
    public AdministrateurDataServiceJPAImpl(String PU) {
        super(PU);
    }

    /**
     *
     * @param login String de l'administrateur rechercher.
     * @return Un objet administrateur complet grace a JPA.
     * @throws Exception Capture d'une erreur pendant la demande sur la base de
     * donnée.
     */
    @Override
    public Administrateur getByLogin(String login) throws Exception {
        Administrateur a = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT a FROM Administrateur a WHERE a.login = :flogin");
            query.setParameter("flogin", login);
            a = (Administrateur) query.getSingleResult();
        } catch (NoResultException e) {
        } finally {
            this.close();
        }
        return a;
    }

}
