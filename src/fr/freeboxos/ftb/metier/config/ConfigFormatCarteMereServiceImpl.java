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

import fr.freeboxos.ftb.metier.entitys.config.ConfigFormatCarteMere;
import fr.freeboxos.ftb.physique.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.jpa.config.ConfigFormatCarteMereDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ConfigFormatCarteMereServiceImpl implements ConfigFormatCarteMereService {

    private final ConfigFormatCarteMereDataService configFormatCarteMereDataService = PhysiqueDataFactory.getConfigFormatCarteMereDataService();

    @Override
    public ConfigFormatCarteMere add(ConfigFormatCarteMere t) throws Exception {
        return this.configFormatCarteMereDataService.add(t);
    }

    @Override
    public void remove(ConfigFormatCarteMere t) throws Exception {
        this.configFormatCarteMereDataService.remove(t);
    }

    @Override
    public void update(ConfigFormatCarteMere t) throws Exception {
        this.configFormatCarteMereDataService.update(t);
    }

    @Override
    public ConfigFormatCarteMere getById(Long l) throws Exception {
        return this.configFormatCarteMereDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.configFormatCarteMereDataService.getCount();
    }

    @Override
    public List<ConfigFormatCarteMere> getAll() throws Exception {
        return this.configFormatCarteMereDataService.getAll();
    }

    @Override
    public List<ConfigFormatCarteMere> getAll(int i, int i1) throws Exception {
        return this.configFormatCarteMereDataService.getAll(i, i1);
    }

    @Override
    public ConfigFormatCarteMere getByFormatCarteMere(String format) throws Exception {
        return this.configFormatCarteMereDataService.getByFormatCarteMere(format);
    }

}
