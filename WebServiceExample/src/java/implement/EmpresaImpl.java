package implement;

import entity.Empresa;
import java.util.List;
import model.EmpresaInterfaz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 *
 * @author RKOrtega
 */
public class EmpresaImpl implements EmpresaInterfaz{
    
    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public boolean create(Empresa empresa) {
        boolean result = true;
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            session.save(empresa);
            session.getTransaction().commit();
        } catch (Exception e){
            result = false;
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return result;
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public boolean update(Empresa empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public boolean delete(Empresa empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public List<Empresa> findAll() {
        List<Empresa> result = null;
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("select e from Empresa e");
            result = query.getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            result = null;
            session.getTransaction().rollback();
        }
        return result;
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public Empresa find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
