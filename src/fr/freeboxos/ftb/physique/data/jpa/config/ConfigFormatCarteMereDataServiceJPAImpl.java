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

import fr.freeboxos.ftb.metier.entitys.config.ConfigFormatCarteMere;
import javax.persistence.Query;
import lml.persistence.jpa.AbstracCrudServiceJPA;

/**
 *
 * @author alan
 */
public class ConfigFormatCarteMereDataServiceJPAImpl extends AbstracCrudServiceJPA<ConfigFormatCarteMere> implements ConfigFormatCarteMereDataService {

    public ConfigFormatCarteMereDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public ConfigFormatCarteMere getByFormatCarteMere(String format) throws Exception {
        ConfigFormatCarteMere configFormatCarteMere = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT configFormatCarteMere FROM ConfigFormatCarteMere configFormatCarteMere WHERE configFormatCarteMere.formatCarteMere = :fformat");
            query.setParameter("fformat", format);
            configFormatCarteMere = (ConfigFormatCarteMere) query.getSingleResult();
        } catch (Exception e) {
        } finally {
            this.close();

        }
        return configFormatCarteMere;
    }

}
