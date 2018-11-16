package com.rkosistemas.com.service;

import com.rkosistemas.com.dao.DAOInterface;
import com.rkosistemas.com.implement.EmpresaImplement;
import com.rkosistemas.com.model.Empresa;
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
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "saveOrUpdate")
    public boolean saveOrUpdate(@WebParam(name = "razonSocial") String razonSocial, @WebParam(name = "ruc") String ruc, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "correo") String correo) {
        DAOInterface dao = new EmpresaImplement();
        Empresa empresa = new Empresa();
        empresa.setEmpresaRazonSocial(razonSocial);
        empresa.setEmpresaRuc(ruc);
        empresa.setEmpresaDireccion(direccion);
        empresa.setEmpresaCorreo(correo);
        dao.saveOrUpdate(empresa);
        return false;
    }
}
