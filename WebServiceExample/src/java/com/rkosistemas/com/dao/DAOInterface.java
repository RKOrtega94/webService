package com.rkosistemas.com.dao;

import com.rkosistemas.com.model.Empresa;
import java.util.List;

/**
 *
 * @author RKOrtega
 */
public interface DAOInterface {

    public boolean saveOrUpdate(Empresa empresa);

    public List<Empresa> findAll();
}
