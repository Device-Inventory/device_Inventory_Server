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

import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueRam;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueRamDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigMarqueRamServiceImpl implements ConfigMarqueRamService {

    private final ConfigMarqueRamDataService configMarqueRamDataService = PhysiqueDataFactory.getConfigMarqueRamDataService();

    @Override
    public ConfigMarqueRam add(ConfigMarqueRam t) throws Exception {
        return this.configMarqueRamDataService.add(t);
    }

    @Override
    public void remove(ConfigMarqueRam t) throws Exception {
        this.configMarqueRamDataService.remove(t);
    }

    @Override
    public void update(ConfigMarqueRam t) throws Exception {
        this.configMarqueRamDataService.update(t);
    }

    @Override
    public ConfigMarqueRam getById(Long l) throws Exception {
        return this.configMarqueRamDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configMarqueRamDataService.getCount();
    }

    @Override
    public List<ConfigMarqueRam> getAll() throws Exception {
        return this.configMarqueRamDataService.getAll();
    }

    @Override
    public List<ConfigMarqueRam> getAll(int i, int i1) throws Exception {
        return this.configMarqueRamDataService.getAll(i, i1);
    }

    @Override
    public ConfigMarqueRam getByMarqueRam(String s) throws Exception {
        return this.configMarqueRamDataService.getByMarqueRam(s);
    }

}
