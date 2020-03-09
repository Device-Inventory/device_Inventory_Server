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
package fr.freeboxos.ftb.metier.config;

import fr.freeboxos.ftb.metier.entitys.config.ConfigTypeMemoire;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeMemoireDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigTypeMemoireServiceImpl implements ConfigTypeMemoireService {

    private final ConfigTypeMemoireDataService configTypeMemoireDataService = PhysiqueDataFactory.getConfigTypeMemoireDataService();

    @Override
    public ConfigTypeMemoire add(ConfigTypeMemoire t) throws Exception {
        return this.configTypeMemoireDataService.add(t);
    }

    @Override
    public void remove(ConfigTypeMemoire t) throws Exception {
        this.configTypeMemoireDataService.remove(t);
    }

    @Override
    public void update(ConfigTypeMemoire t) throws Exception {
        this.configTypeMemoireDataService.update(t);
    }

    @Override
    public ConfigTypeMemoire getById(Long l) throws Exception {
        return this.configTypeMemoireDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configTypeMemoireDataService.getCount();
    }

    @Override
    public List<ConfigTypeMemoire> getAll() throws Exception {
        return this.configTypeMemoireDataService.getAll();
    }

    @Override
    public List<ConfigTypeMemoire> getAll(int i, int i1) throws Exception {
        return this.configTypeMemoireDataService.getAll(i, i1);
    }
}
