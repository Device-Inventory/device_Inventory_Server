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
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.Memoire;
import fr.freeboxos.ftb.metier.entitys.Ordinateur;
import fr.freeboxos.ftb.metier.entitys.Processeur;
import fr.freeboxos.ftb.physique.data.jpa.OrdinateurDataService;
import fr.freeboxos.ftb.physique.data.jpa.PhysiqueDataFactory;
import java.util.List;

public class OrdinateurServiceImpl implements OrdinateurService {

    private final OrdinateurDataService ordinateurDataService = PhysiqueDataFactory.getOrdinateurDataService();

    @Override
    public Ordinateur getByProcesseur(Processeur processeur) throws Exception {
        return this.ordinateurDataService.getByProcesseur(processeur);
    }

    @Override
    public Ordinateur getByMemoire(Memoire memoire) throws Exception {
        return this.ordinateurDataService.getByMemoire(memoire);
    }

    @Override
    public Ordinateur getByHdd(HDD hdd) throws Exception {
        return this.ordinateurDataService.getByHdd(hdd);
    }

    @Override
    public Boolean isProcesseurAttribue(Processeur processeur) throws Exception {
        return this.ordinateurDataService.isProcesseurAttribue(processeur);
    }

    @Override
    public Boolean isMemoireAttribue(Memoire memoire) throws Exception {
        return this.ordinateurDataService.isMemoireAttribue(memoire);
    }

    @Override
    public Boolean isHddAttribue(HDD hdd) throws Exception {
        return this.ordinateurDataService.isHddAttribue(hdd);
    }

    @Override
    public Ordinateur add(Ordinateur t) throws Exception {
        return this.ordinateurDataService.add(t);
    }

    @Override
    public void remove(Ordinateur t) throws Exception {
        this.ordinateurDataService.remove(t);
    }

    @Override
    public void update(Ordinateur t) throws Exception {
        this.ordinateurDataService.update(t);
    }

    @Override
    public Ordinateur getById(Long l) throws Exception {
        return this.ordinateurDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.ordinateurDataService.getCount();
    }

    @Override
    public List<Ordinateur> getAll() throws Exception {
        return this.ordinateurDataService.getAll();
    }

    @Override
    public List<Ordinateur> getAll(int i, int i1) throws Exception {
        return this.ordinateurDataService.getAll(i, i1);
    }

}
