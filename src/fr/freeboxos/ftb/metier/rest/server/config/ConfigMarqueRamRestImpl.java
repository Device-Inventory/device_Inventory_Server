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
import fr.freeboxos.ftb.metier.config.ConfigMarqueRamService;
import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueRam;
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
@Path("/ConfigMarqueRamService")
@Consumes("application/json")
@Produces("application/json")
public class ConfigMarqueRamRestImpl {

    private final ConfigMarqueRamService configMarqueRamService = MetierFactory.getConfigMarqueRamService();

    @POST
    @Path("/")
    public ConfigMarqueRam add(ConfigMarqueRam t) throws Exception {
        return configMarqueRamService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(ConfigMarqueRam t) throws Exception {
        configMarqueRamService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(ConfigMarqueRam t) throws Exception {
        configMarqueRamService.update(t);
    }

    @GET
    @Path("/{id}")
    public ConfigMarqueRam getById(@PathParam("id") Long l) throws Exception {
        return configMarqueRamService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return configMarqueRamService.getCount();
    }

    @GET
    @Path("/")
    public List<ConfigMarqueRam> getAll() throws Exception {
        return configMarqueRamService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<ConfigMarqueRam> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return configMarqueRamService.getAll(i, i1);
    }

    @GET
    @Path("/marque/{marque}")
    public ConfigMarqueRam getByMarqueRam(@PathParam("marque") String s) throws Exception {
        return configMarqueRamService.getByMarqueRam(s);
    }

}
