package com.rkosistemas.com.implement;

import com.rkosistemas.com.dao.DAOInterface;
import com.rkosistemas.com.model.Empresa;
import com.rkosistemas.connection.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 *
 * @author RKOrtega
 */
public class EmpresaImplement implements DAOInterface {

    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public boolean saveOrUpdate(Empresa empresa) {
        boolean result = true;
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(empresa);
            session.getTransaction().commit();
        } catch (Exception e) {
            result = false;
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return result;
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public List<Empresa> findAll() {
        List<Empresa> empresas = null;
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("select e from Empresa e");
            empresas = query.getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            empresas = null;
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return empresas;
    }

}
