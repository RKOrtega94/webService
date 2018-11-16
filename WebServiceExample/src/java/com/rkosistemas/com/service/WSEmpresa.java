package com.rkosistemas.com.service;

import com.rkosistemas.com.dao.DAOInterface;
import com.rkosistemas.com.implement.EmpresaImplement;
import com.rkosistemas.com.model.Empresa;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author RKOrtega
 */
@WebService(serviceName = "WSEmpresa")
public class WSEmpresa {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "save")
    public boolean save(@WebParam(name = "razonSocial") String razonSocial, @WebParam(name = "ruc") String ruc, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "correo") String correo) {
        DAOInterface dao = new EmpresaImplement();
        Empresa empresa = new Empresa();
        empresa.setEmpresaRazonSocial(razonSocial);
        empresa.setEmpresaRuc(ruc);
        empresa.setEmpresaDireccion(direccion);
        empresa.setEmpresaCorreo(correo);
        dao.saveOrUpdate(empresa);
        return true;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "findAll")
    public List<Empresa> findAll() {
        DAOInterface dao = new EmpresaImplement();
        List<Empresa> empresas = dao.findAll();
        return empresas;
    }
}
