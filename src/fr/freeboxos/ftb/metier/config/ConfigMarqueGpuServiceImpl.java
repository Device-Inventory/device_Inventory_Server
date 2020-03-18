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

import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueGpu;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigMarqueGpuDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigMarqueGpuServiceImpl implements ConfigMarqueGpuService {

    private final ConfigMarqueGpuDataService configMarqueGpuDataService = PhysiqueDataFactory.getConfigMarqueGpuDataService();

    @Override
    public ConfigMarqueGpu add(ConfigMarqueGpu t) throws Exception {
        return this.configMarqueGpuDataService.add(t);
    }

    @Override
    public void remove(ConfigMarqueGpu t) throws Exception {
        this.configMarqueGpuDataService.remove(t);
    }

    @Override
    public void update(ConfigMarqueGpu t) throws Exception {
        this.configMarqueGpuDataService.update(t);
    }

    @Override
    public ConfigMarqueGpu getById(Long l) throws Exception {
        return this.configMarqueGpuDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configMarqueGpuDataService.getCount();
    }

    @Override
    public List<ConfigMarqueGpu> getAll() throws Exception {
        return this.configMarqueGpuDataService.getAll();
    }

    @Override
    public List<ConfigMarqueGpu> getAll(int i, int i1) throws Exception {
        return this.configMarqueGpuDataService.getAll(i, i1);
    }

    @Override
    public ConfigMarqueGpu getByMarqueGpu(String s) throws Exception {
        return this.configMarqueGpuDataService.getByMarqueGpu(s);
    }

}
