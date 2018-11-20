/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Empresa;
import java.util.List;

/**
 *
 * @author RKOrtega
 */
public interface EmpresaInterfaz {
    
    public boolean create(Empresa empresa);
    
    public boolean update(Empresa empresa);
    
    public boolean delete(Empresa empresa);
    
    public List<Empresa> findAll();
    
    public Empresa find(int id);
    
    public int count();
}
