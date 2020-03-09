/*
 * Copyright (C) 2020 alan
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

import fr.freeboxos.ftb.metier.entitys.CarteGraphique;
import fr.freeboxos.ftb.physique.data.jpa.CarteGraphiqueDataService;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import java.util.List;

public class CarteGraphiqueServiceImpl implements CarteGraphiqueService {

    private final CarteGraphiqueDataService carteGraphiqueDataService = PhysiqueDataFactory.getCarteGraphiqueDataService();

    @Override
    public CarteGraphique add(CarteGraphique t) throws Exception {
        return this.carteGraphiqueDataService.add(t);
    }

    @Override
    public void remove(CarteGraphique t) throws Exception {
        this.carteGraphiqueDataService.remove(t);
    }

    @Override
    public void update(CarteGraphique t) throws Exception {
        this.carteGraphiqueDataService.update(t);
    }

    @Override
    public CarteGraphique getById(Long l) throws Exception {
        return this.carteGraphiqueDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.carteGraphiqueDataService.getCount();
    }

    @Override
    public List<CarteGraphique> getAll() throws Exception {
        return this.carteGraphiqueDataService.getAll();
    }

    @Override
    public List<CarteGraphique> getAll(int i, int i1) throws Exception {
        return this.carteGraphiqueDataService.getAll(i, i1);
    }

}
