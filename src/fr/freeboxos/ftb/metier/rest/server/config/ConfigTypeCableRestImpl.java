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
@Path("/ConfigTypeCableService")
@Consumes("application/json")
@Produces("application/json")
public class ConfigTypeCableRestImpl {

    private final ConfigTypeCableService configTypeCableService = MetierFactory.getConfigTypeCableService();

    @POST
    @Path("/")
    public ConfigTypeCable add(ConfigTypeCable t) throws Exception {
        return configTypeCableService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(ConfigTypeCable t) throws Exception {
        configTypeCableService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(ConfigTypeCable t) throws Exception {
        configTypeCableService.update(t);
    }

    @GET
    @Path("/{id}")
    public ConfigTypeCable getById(@PathParam("id") Long l) throws Exception {
        return configTypeCableService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return configTypeCableService.getCount();
    }

    @GET
    @Path("/")
    public List<ConfigTypeCable> getAll() throws Exception {
        return configTypeCableService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<ConfigTypeCable> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return configTypeCableService.getAll(i, i1);
    }

    @GET
    @Path("/type/{type}")
    public ConfigTypeCable getByTypeCable(@PathParam("type") String s) throws Exception {
        return configTypeCableService.getByTypeCable(s);
    }

}
