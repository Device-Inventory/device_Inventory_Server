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

import fr.freeboxos.ftb.metier.entitys.CarteMere;
import fr.freeboxos.ftb.physique.data.jpa.CarteMereDataService;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import java.util.List;

/**
 *
 * @author alan
 */
public class CarteMereServiceImpl implements CarteMereService {

    private final CarteMereDataService carteMereService = PhysiqueDataFactory.getCarteMereDataService();

    @Override
    public CarteMere add(CarteMere t) throws Exception {
        return this.carteMereService.add(t);
    }

    @Override
    public void remove(CarteMere t) throws Exception {
        this.carteMereService.remove(t);
    }

    @Override
    public void update(CarteMere t) throws Exception {
        this.carteMereService.update(t);
    }

    @Override
    public CarteMere getById(Long l) throws Exception {
        return this.carteMereService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.carteMereService.getCount();
    }

    @Override
    public List<CarteMere> getAll() throws Exception {
        return this.carteMereService.getAll();
    }

    @Override
    public List<CarteMere> getAll(int i, int i1) throws Exception {
        return this.carteMereService.getAll(i, i1);
    }

}
