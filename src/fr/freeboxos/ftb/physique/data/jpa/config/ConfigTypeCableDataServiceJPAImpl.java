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
package fr.freeboxos.ftb.physique.data.jpa.config;

import fr.freeboxos.ftb.metier.entitys.config.ConfigTypeCable;
import javax.persistence.Query;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 *
 * @author alan
 */
public class ConfigTypeCableDataServiceJPAImpl extends AbstracCrudServiceJPA<ConfigTypeCable> implements ConfigTypeCableDataService {

    public ConfigTypeCableDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public ConfigTypeCable getByTypeCable(String s) throws Exception {
        ConfigTypeCable cmcm = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT cmcm FROM ConfigTypeCable cmcm WHERE cmcm.typeCable = :ftype");
            query.setParameter("ftype", s);
            cmcm = (ConfigTypeCable) query.getSingleResult();
        } catch (Exception e) {
        } finally {
            this.close();
        }
        return cmcm;
    }

}
