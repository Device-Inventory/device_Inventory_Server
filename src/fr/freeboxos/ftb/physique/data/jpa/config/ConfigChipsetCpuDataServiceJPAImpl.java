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

import fr.freeboxos.ftb.metier.entitys.config.ConfigChipsetCpu;
import javax.persistence.Query;
import lml.persistence.jpa.AbstracCrudServiceJPA;

public class ConfigChipsetCpuDataServiceJPAImpl extends AbstracCrudServiceJPA<ConfigChipsetCpu> implements ConfigChipsetCpuDataService {

    public ConfigChipsetCpuDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public ConfigChipsetCpu getByChipset(String chipset) throws Exception {
        ConfigChipsetCpu ccc = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT ccc FROM ConfigChipsetCpu ccc WHERE ccc.chipsetCpu = :fchipset");
            query.setParameter("fchipset", chipset);
            ccc = (ConfigChipsetCpu) query.getSingleResult();
        } catch (Exception e) {
        } finally {
            this.close();
        }
        return ccc;
    }

}
