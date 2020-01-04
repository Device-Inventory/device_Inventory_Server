/*
 * Copyright (C) 2019 alan
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
package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.OrdinateurService;
import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.Memoire;
import fr.freeboxos.ftb.metier.entitys.Ordinateur;
import fr.freeboxos.ftb.metier.entitys.Processeur;
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
@Path("/OrdinateurService")
@Consumes("application/json")
@Produces("application/json")
public class OrdinateurServiceRestImpl {

    private final OrdinateurService ordinateurService = MetierFactory.getOrdinateurService();

    @GET
    @Path("/getByProcesseur/{processeur}")
    public Ordinateur getByProcesseur(@PathParam("processeur") long idProcesseur) throws Exception {
        Processeur processeur = MetierFactory.getProcesseurService().getById(idProcesseur);
        return ordinateurService.getByProcesseur(processeur);
    }

    @GET
    @Path("/getByMemoire/{memoire}")
    public Ordinateur getByMemoire(@PathParam("memoire") long idMemoire) throws Exception {
        Memoire memoire = MetierFactory.getMemoireService().getById(idMemoire);
        return ordinateurService.getByMemoire(memoire);
    }

    @GET
    @Path("/getByHdd/{hdd}")
    public Ordinateur getByHdd(@PathParam("hdd") long idHdd) throws Exception {
        HDD hdd = MetierFactory.getHDDService().getById(idHdd);
        return ordinateurService.getByHdd(hdd);
    }

    @GET
    @Path("/processeurAttribue/{processeur}")
    public Boolean isProcesseurAttribue(@PathParam("processeur") long idProcesseur) throws Exception {
        Processeur processeur = MetierFactory.getProcesseurService().getById(idProcesseur);
        return ordinateurService.isProcesseurAttribue(processeur);
    }

    @GET
    @Path("/memoireAttribue/{memoire}")
    public Boolean isMemoireAttribue(@PathParam("memoire") long idMemoire) throws Exception {
        Memoire memoire = MetierFactory.getMemoireService().getById(idMemoire);
        return ordinateurService.isMemoireAttribue(memoire);
    }

    @GET
    @Path("/hddAttribue/{hdd}")
    public Boolean isHddAttribue(@PathParam("hdd") long idHdd) throws Exception {
        HDD hdd = MetierFactory.getHDDService().getById(idHdd);
        return ordinateurService.isHddAttribue(hdd);
    }

    @POST
    @Path("/")
    public Ordinateur add(Ordinateur t) throws Exception {
        return ordinateurService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Ordinateur t) throws Exception {
        ordinateurService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Ordinateur t) throws Exception {
        ordinateurService.update(t);
    }

    @GET
    @Path("/{id}")
    public Ordinateur getById(@PathParam("id") Long l) throws Exception {
        return ordinateurService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return ordinateurService.getCount();
    }

    @GET
    @Path("/")
    public List<Ordinateur> getAll() throws Exception {
        return ordinateurService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<Ordinateur> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return ordinateurService.getAll(i, i1);
    }

}
