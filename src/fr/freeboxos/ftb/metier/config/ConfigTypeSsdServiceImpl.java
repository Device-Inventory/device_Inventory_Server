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

import fr.freeboxos.ftb.metier.entitys.config.ConfigTypeSsd;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeSsdDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigTypeSsdServiceImpl implements ConfigTypeSsdService {

    private final ConfigTypeSsdDataService configTypeSsdDataService = PhysiqueDataFactory.getConfigTypeSsdDataService();

    @Override
    public ConfigTypeSsd add(ConfigTypeSsd t) throws Exception {
        return this.configTypeSsdDataService.add(t);
    }

    @Override
    public void remove(ConfigTypeSsd t) throws Exception {
        this.configTypeSsdDataService.remove(t);
    }

    @Override
    public void update(ConfigTypeSsd t) throws Exception {
        this.configTypeSsdDataService.update(t);
    }

    @Override
    public ConfigTypeSsd getById(Long l) throws Exception {
        return this.configTypeSsdDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configTypeSsdDataService.getCount();
    }

    @Override
    public List<ConfigTypeSsd> getAll() throws Exception {
        return this.configTypeSsdDataService.getAll();
    }

    @Override
    public List<ConfigTypeSsd> getAll(int i, int i1) throws Exception {
        return this.configTypeSsdDataService.getAll(i, i1);
    }

    @Override
    public ConfigTypeSsd getByTypeSsd(String s) throws Exception {
        return this.configTypeSsdDataService.getByTypeSsd(s);
    }

}
