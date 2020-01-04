/*
 * Copyright (C) 2019 alan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.freeboxos.ftb.physique.data.jpa;

import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.Memoire;
import fr.freeboxos.ftb.metier.entitys.Ordinateur;
import fr.freeboxos.ftb.metier.entitys.Processeur;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 *
 * @author alan
 */
public class OrdinateurDataServiceJPAImpl extends AbstracCrudServiceJPA<Ordinateur> implements OrdinateurDataService {

    public OrdinateurDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public Ordinateur getByProcesseur(Processeur processeur) throws Exception {
        Ordinateur o = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Ordinateur o WHERE o.processeur = :fprocesseur");
            query.setParameter("fprocesseur", processeur);
            o = (Ordinateur) query.getSingleResult();
        } catch (NoResultException exception) {

        } finally {
            this.close();
        }
        return o;
    }

    @Override
    public Ordinateur getByMemoire(Memoire memoire) throws Exception {
        Ordinateur o = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Ordinateur o WHERE o.memoire = :fmemoire");
            query.setParameter("fmemoire", memoire);
            o = (Ordinateur) query.getSingleResult();
        } catch (NoResultException exception) {

        } finally {
            this.close();
        }
        return o;
    }

    @Override
    public Ordinateur getByHdd(HDD hdd) throws Exception {
        Ordinateur o = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Ordinateur o WHERE o.hdd = :fhdd");
            query.setParameter("fhdd", hdd);
            o = (Ordinateur) query.getSingleResult();
        } catch (NoResultException e) {
        } finally {
            this.close();
        }
        return o;
    }

    @Override
    public Boolean isProcesseurAttribue(Processeur processeur) throws Exception {
        return (this.getByProcesseur(processeur) != null);
    }

    @Override
    public Boolean isMemoireAttribue(Memoire memoire) throws Exception {
        return (this.getByMemoire(memoire) != null);
    }

    @Override
    public Boolean isHddAttribue(HDD hdd) throws Exception {
        return (this.getByHdd(hdd) != null);
    }

}
