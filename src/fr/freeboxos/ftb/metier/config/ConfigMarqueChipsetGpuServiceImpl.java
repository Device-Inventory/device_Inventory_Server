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

import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueChipsetGpu;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueChipsetGpuDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigMarqueChipsetGpuServiceImpl implements ConfigMarqueChipsetGpuService {

    private final ConfigMarqueChipsetGpuDataService configMarqueChipsetGpuDataService = PhysiqueDataFactory.getConfigMarqueChipsetGpuDataService();

    @Override
    public ConfigMarqueChipsetGpu add(ConfigMarqueChipsetGpu t) throws Exception {
        return this.configMarqueChipsetGpuDataService.add(t);
    }

    @Override
    public void remove(ConfigMarqueChipsetGpu t) throws Exception {
        this.configMarqueChipsetGpuDataService.remove(t);
    }

    @Override
    public void update(ConfigMarqueChipsetGpu t) throws Exception {
        this.configMarqueChipsetGpuDataService.update(t);
    }

    @Override
    public ConfigMarqueChipsetGpu getById(Long l) throws Exception {
        return this.configMarqueChipsetGpuDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configMarqueChipsetGpuDataService.getCount();
    }

    @Override
    public List<ConfigMarqueChipsetGpu> getAll() throws Exception {
        return this.configMarqueChipsetGpuDataService.getAll();
    }

    @Override
    public List<ConfigMarqueChipsetGpu> getAll(int i, int i1) throws Exception {
        return this.configMarqueChipsetGpuDataService.getAll(i, i1);
    }

    @Override
    public ConfigMarqueChipsetGpu getByMarqueChipsetGpu(String s) throws Exception {
        return this.configMarqueChipsetGpuDataService.getByMarqueChipsetGpu(s);
    }

}
