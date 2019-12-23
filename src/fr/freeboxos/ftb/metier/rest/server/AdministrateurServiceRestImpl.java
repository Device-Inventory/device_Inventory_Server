package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.AdministrateurService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.entitys.Administrateur;
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
 * Classe permettant de faire le lien entre le client et le serveur via l'API
 * RestFul pour l'entité administrateur.
 *
 * @author alan
 */
@Path("/AdministrateurService")
@Consumes("application/json")
@Produces("application/json")
public class AdministrateurServiceRestImpl {

    private final AdministrateurService administrateurService;

    /**
     * Instanciation de la référence sur getAdministrateurService du metier
     * factory.
     */
    public AdministrateurServiceRestImpl() {
        this.administrateurService = MetierFactory.getAdministrateurService();
    }

    /**
     * Méthode permettant de faire la demande d'un ajout d'aministrateur via
     * l'API Rest.
     *
     * @param t Nom de la référence de l'objet administrateur.
     * @return Demande l'ajout de la reférence t dans la couche metier.
     * @throws Exception Capture l'erreur en cas de probleme d'ajout dans la
     * base de donnée.
     */
    @POST
    @Path("/")
    public Administrateur add(Administrateur t) throws Exception {
        return administrateurService.add(t);
    }

    /**
     * Méthode permettant de faire la demande de suppression d'un administrateur
     * via l'API Rest.
     *
     * @param t Nom de la référence de l'objet administrateur.
     * @throws Exception Capture l'erreur en cas de probleme de suppression dans
     * la base de donnée.
     */
    @DELETE
    @Path("/")
    public void remove(Administrateur t) throws Exception {
        administrateurService.remove(t);
    }

    /**
     * Méthode permettant de faire la demande de mise a jour d'un administrateur
     * via l'API Rest.
     *
     * @param t Nom de la référence de l'objet administrateur.
     * @throws Exception Capture l'erreur en cas de probleme de mise a jour dans
     * la base de donnée.
     */
    @PUT
    @Path("/")
    public void update(Administrateur t) throws Exception {
        administrateurService.update(t);
    }

    /**
     * Méthode permettant de trouver un administrateur via un ID.
     *
     * @param l L'id de l'administrateur recherche.
     * @return La demande de recherche via la couche metier.
     * @throws Exception Capture l'erreur en cas de probleme de la demande dans
     * la couche metier.
     */
    @GET
    @Path("/{id}")
    public Administrateur getById(@PathParam("id") Long l) throws Exception {
        return administrateurService.getById(l);
    }

    /**
     * Méthode permettant de demander le nombre d'administrateur.
     *
     * @return La demande du nombre d'administrateur via la couche metier.
     * @throws Exception Capture l'erreur en cas de probleme de la demande dans
     * la couche metier.
     */
    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return administrateurService.getCount();
    }

    /**
     * Méthode permettant de récuperer tous les administrateurs.
     *
     * @return La demande d'une liste d'administrateurs.
     * @throws Exception Capture l'erreur en cas de probleme de la demande dans
     * la couche metier.
     */
    @GET
    @Path("/")
    public List<Administrateur> getAll() throws Exception {
        return administrateurService.getAll();
    }

    /**
     *
     * @param i
     * @param i1
     * @return
     * @throws Exception
     */
    @GET
    @Path("/{i}/{i1}")
    public List<Administrateur> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return administrateurService.getAll(i, i1);
    }

    /**
     * Méthode permettant de rechercher un administrateur via son login.
     *
     * @param login Nom d'administrateur donné.
     * @return La demande de recherche de l'administrateur via le login.
     * @throws Exception Capture l'erreur en cas de probleme de la demande dans
     * la couche metier.
     */
    @GET
    @Path("/login/{login}")
    public Administrateur getByLogin(@PathParam("login") String login) throws Exception {
        return administrateurService.getByLogin(login);
    }

}
