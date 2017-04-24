/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compomics.xltools_reference;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Genet
 */
@Stateless
public class PxltTableFacade extends AbstractFacade<PxltTable> {

    @PersistenceContext(unitName = "com.compomics_XLTools_Reference_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PxltTableFacade() {
        super(PxltTable.class);
    }
    
}
