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

import fr.freeboxos.ftb.metier.entitys.config.ConfigTypeCable;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigTypeCableDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigTypeCableServiceImpl implements ConfigTypeCableService {

    private final ConfigTypeCableDataService configTypeCableDataService = PhysiqueDataFactory.getConfigTypeCableDataService();

    @Override
    public ConfigTypeCable add(ConfigTypeCable t) throws Exception {
        return this.configTypeCableDataService.add(t);
    }

    @Override
    public void remove(ConfigTypeCable t) throws Exception {
        this.configTypeCableDataService.remove(t);
    }

    @Override
    public void update(ConfigTypeCable t) throws Exception {
        this.configTypeCableDataService.update(t);
    }

    @Override
    public ConfigTypeCable getById(Long l) throws Exception {
        return this.configTypeCableDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configTypeCableDataService.getCount();
    }

    @Override
    public List<ConfigTypeCable> getAll() throws Exception {
        return this.configTypeCableDataService.getAll();
    }

    @Override
    public List<ConfigTypeCable> getAll(int i, int i1) throws Exception {
        return this.configTypeCableDataService.getAll(i, i1);
    }

}
