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

import fr.freeboxos.ftb.metier.entitys.config.ConfigChipsetCpu;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigChipsetCpuDataService;
import java.util.List;

public class ConfigChipsetCpuServiceImpl implements ConfigChipsetCpuService {

    private final ConfigChipsetCpuDataService configChipsetCpuDataService = PhysiqueDataFactory.getConfigChipsetCpuDataService();

    @Override
    public ConfigChipsetCpu add(ConfigChipsetCpu t) throws Exception {
        return this.configChipsetCpuDataService.add(t);
    }

    @Override
    public void remove(ConfigChipsetCpu t) throws Exception {
        this.configChipsetCpuDataService.remove(t);
    }

    @Override
    public void update(ConfigChipsetCpu t) throws Exception {
        this.configChipsetCpuDataService.update(t);
    }

    @Override
    public ConfigChipsetCpu getById(Long l) throws Exception {
        return this.configChipsetCpuDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configChipsetCpuDataService.getCount();
    }

    @Override
    public List<ConfigChipsetCpu> getAll() throws Exception {
        return this.configChipsetCpuDataService.getAll();
    }

    @Override
    public List<ConfigChipsetCpu> getAll(int i, int i1) throws Exception {
        return this.configChipsetCpuDataService.getAll(i, i1);
    }

}
