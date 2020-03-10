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
import fr.freeboxos.ftb.metier.config.ConfigFormatCarteMereService;
import fr.freeboxos.ftb.metier.entitys.config.ConfigFormatCarteMere;
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
@Path("/ConfigFormatCarteMereService")
@Consumes("application/json")
@Produces("application/json")
public class ConfigFormatCarteMereRestImpl {

    private final ConfigFormatCarteMereService configFormatCarteMereService = MetierFactory.getConfigFormatCarteMereService();

    @POST
    @Path("/")
    public ConfigFormatCarteMere add(ConfigFormatCarteMere t) throws Exception {
        return configFormatCarteMereService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(ConfigFormatCarteMere t) throws Exception {
        configFormatCarteMereService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(ConfigFormatCarteMere t) throws Exception {
        configFormatCarteMereService.update(t);
    }

    @GET
    @Path("/{id}")
    public ConfigFormatCarteMere getById(@PathParam("id") Long l) throws Exception {
        return configFormatCarteMereService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return configFormatCarteMereService.getCount();
    }

    @GET
    @Path("/")
    public List<ConfigFormatCarteMere> getAll() throws Exception {
        return configFormatCarteMereService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<ConfigFormatCarteMere> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return configFormatCarteMereService.getAll(i, i1);
    }

}
