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
import fr.freeboxos.ftb.metier.config.ConfigMarqueHddService;
import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueHdd;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author alan
 */
@Path("/ConfigMarqueHddService")
@Consumes("application/json")
@Produces("application/json")
public class ConfigMarqueHddRestImpl {

    private final ConfigMarqueHddService configMarqueHddService = MetierFactory.getConfigMarqueHddService();

    @POST
    @Path("/")
    public ConfigMarqueHdd add(ConfigMarqueHdd t) throws Exception {
        return configMarqueHddService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(ConfigMarqueHdd t) throws Exception {
        configMarqueHddService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(ConfigMarqueHdd t) throws Exception {
        configMarqueHddService.update(t);
    }

    @GET
    @Path("/{id}")
    public ConfigMarqueHdd getById(@PathParam("id") Long l) throws Exception {
        return configMarqueHddService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return configMarqueHddService.getCount();
    }

    @GET
    @Path("/")
    public List<ConfigMarqueHdd> getAll() throws Exception {
        return configMarqueHddService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<ConfigMarqueHdd> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return configMarqueHddService.getAll(i, i1);
    }

}
