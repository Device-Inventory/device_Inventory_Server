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

import fr.freeboxos.ftb.metier.entitys.config.ConfigSupportDuProcesseur;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigSupportDuProcesseurDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigSupportDuProcesseurServiceImpl implements ConfigSupportDuProcesseurService {

    private final ConfigSupportDuProcesseurDataService configSupportDuProcesseurDataService = PhysiqueDataFactory.getConfigSupportDuProcesseurDataService();

    @Override
    public ConfigSupportDuProcesseur add(ConfigSupportDuProcesseur t) throws Exception {
        return this.configSupportDuProcesseurDataService.add(t);
    }

    @Override
    public void remove(ConfigSupportDuProcesseur t) throws Exception {
        this.configSupportDuProcesseurDataService.remove(t);
    }

    @Override
    public void update(ConfigSupportDuProcesseur t) throws Exception {
        this.configSupportDuProcesseurDataService.update(t);
    }

    @Override
    public ConfigSupportDuProcesseur getById(Long l) throws Exception {
        return this.configSupportDuProcesseurDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configSupportDuProcesseurDataService.getCount();
    }

    @Override
    public List<ConfigSupportDuProcesseur> getAll() throws Exception {
        return this.configSupportDuProcesseurDataService.getAll();
    }

    @Override
    public List<ConfigSupportDuProcesseur> getAll(int i, int i1) throws Exception {
        return this.configSupportDuProcesseurDataService.getAll(i, i1);
    }

    @Override
    public ConfigSupportDuProcesseur getByConfigSupportDuProcesseur(String s) throws Exception {
        return this.configSupportDuProcesseurDataService.getByConfigSupportDuProcesseur(s);
    }

}
