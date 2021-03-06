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
import fr.freeboxos.ftb.metier.config.ConfigMarqueCarteMereService;
import fr.freeboxos.ftb.metier.entitys.config.ConfigMarqueCarteMere;
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
@Path("/ConfigMarqueCarteMereService")
@Consumes("application/json")
@Produces("application/json")
public class ConfigMarqueCarteMereRestImpl {

    private final ConfigMarqueCarteMereService configMarqueCarteMereService = MetierFactory.getConfigMarqueCarteMereServiceService();

    @POST
    @Path("/")
    public ConfigMarqueCarteMere add(ConfigMarqueCarteMere t) throws Exception {
        return configMarqueCarteMereService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(ConfigMarqueCarteMere t) throws Exception {
        configMarqueCarteMereService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(ConfigMarqueCarteMere t) throws Exception {
        configMarqueCarteMereService.update(t);
    }

    @GET
    @Path("/{id}")
    public ConfigMarqueCarteMere getById(@PathParam("id") Long l) throws Exception {
        return configMarqueCarteMereService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return configMarqueCarteMereService.getCount();
    }

    @GET
    @Path("/")
    public List<ConfigMarqueCarteMere> getAll() throws Exception {
        return configMarqueCarteMereService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<ConfigMarqueCarteMere> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return configMarqueCarteMereService.getAll(i, i1);
    }

    @GET
    @Path("/marque/{marque}")
    public ConfigMarqueCarteMere getByMarqueCarteMere(@PathParam("marque") String s) throws Exception {
        return configMarqueCarteMereService.getByMarqueCarteMere(s);
    }

}
