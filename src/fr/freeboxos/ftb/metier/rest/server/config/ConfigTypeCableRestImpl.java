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
package fr.freeboxos.ftb.metier.rest.server.config;

import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.config.ConfigTypeCableService;
import fr.freeboxos.ftb.metier.entitys.config.ConfigTypeCable;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author alan
 */
@Path("/ConfigTypeCableService")
@Consumes("application/json")
@Produces("application/json")
public class ConfigTypeCableRestImpl {

    private final ConfigTypeCableService configTypeCableService = MetierFactory.getConfigTypeCableService();

    public ConfigTypeCable add(ConfigTypeCable t) throws Exception {
        return configTypeCableService.add(t);
    }

    public void remove(ConfigTypeCable t) throws Exception {
        configTypeCableService.remove(t);
    }

    public void update(ConfigTypeCable t) throws Exception {
        configTypeCableService.update(t);
    }

    public ConfigTypeCable getById(Long l) throws Exception {
        return configTypeCableService.getById(l);
    }

    public long getCount() throws Exception {
        return configTypeCableService.getCount();
    }

    public List<ConfigTypeCable> getAll() throws Exception {
        return configTypeCableService.getAll();
    }

    public List<ConfigTypeCable> getAll(int i, int i1) throws Exception {
        return configTypeCableService.getAll(i, i1);
    }

}
