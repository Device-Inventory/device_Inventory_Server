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

import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueCarteMere;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueCarteMereDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigMarqueCarteMereServiceImpl implements ConfigMarqueCarteMereService {

    private final ConfigMarqueCarteMereDataService configMarqueCarteMereDataService = PhysiqueDataFactory.getConfigMarqueCarteMereDataService();

    @Override
    public ConfigMarqueCarteMere add(ConfigMarqueCarteMere t) throws Exception {
        return this.configMarqueCarteMereDataService.add(t);
    }

    @Override
    public void remove(ConfigMarqueCarteMere t) throws Exception {
        this.configMarqueCarteMereDataService.remove(t);
    }

    @Override
    public void update(ConfigMarqueCarteMere t) throws Exception {
        this.configMarqueCarteMereDataService.update(t);
    }

    @Override
    public ConfigMarqueCarteMere getById(Long l) throws Exception {
        return this.configMarqueCarteMereDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configMarqueCarteMereDataService.getCount();
    }

    @Override
    public List<ConfigMarqueCarteMere> getAll() throws Exception {
        return this.configMarqueCarteMereDataService.getAll();
    }

    @Override
    public List<ConfigMarqueCarteMere> getAll(int i, int i1) throws Exception {
        return this.configMarqueCarteMereDataService.getAll(i, i1);
    }

    @Override
    public ConfigMarqueCarteMere getByMarqueCarteMere(String s) throws Exception {
        return this.configMarqueCarteMereDataService.getByMarqueCarteMere(s);
    }

}
