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

import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueHdd;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueHddDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigMarqueHddServiceImpl implements ConfigMarqueHddService {

    private final ConfigMarqueHddDataService configMarqueHddDataService = PhysiqueDataFactory.getConfigMarqueHddDataService();

    @Override
    public ConfigMarqueHdd add(ConfigMarqueHdd t) throws Exception {
        return this.configMarqueHddDataService.add(t);
    }

    @Override
    public void remove(ConfigMarqueHdd t) throws Exception {
        this.configMarqueHddDataService.remove(t);
    }

    @Override
    public void update(ConfigMarqueHdd t) throws Exception {
        this.configMarqueHddDataService.update(t);
    }

    @Override
    public ConfigMarqueHdd getById(Long l) throws Exception {
        return this.configMarqueHddDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configMarqueHddDataService.getCount();
    }

    @Override
    public List<ConfigMarqueHdd> getAll() throws Exception {
        return this.configMarqueHddDataService.getAll();
    }

    @Override
    public List<ConfigMarqueHdd> getAll(int i, int i1) throws Exception {
        return this.configMarqueHddDataService.getAll(i, i1);
    }

    @Override
    public ConfigMarqueHdd getByMarqueHdd(String s) throws Exception {
        return this.configMarqueHddDataService.getByMarqueHdd(s);
    }

}
