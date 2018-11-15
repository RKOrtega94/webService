package com.rkosistemas.model;
// Generated 15-nov-2018 14:23:45 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Perfil generated by hbm2java
 */
@Entity
@Table(name="perfil"
    ,schema="dbo"
    ,catalog="restoitsco"
)
public class Perfil  implements java.io.Serializable {


     private int perfilId;
     private String perfilDescripcion;
     private Date perfilFechaCreacion;
     private Date perfilFechaModificacion;
     private Character perfilEstado;
     private Set perfilusuarios = new HashSet(0);

    public Perfil() {
    }

	
    public Perfil(int perfilId) {
        this.perfilId = perfilId;
    }
    public Perfil(int perfilId, String perfilDescripcion, Date perfilFechaCreacion, Date perfilFechaModificacion, Character perfilEstado, Set perfilusuarios) {
       this.perfilId = perfilId;
       this.perfilDescripcion = perfilDescripcion;
       this.perfilFechaCreacion = perfilFechaCreacion;
       this.perfilFechaModificacion = perfilFechaModificacion;
       this.perfilEstado = perfilEstado;
       this.perfilusuarios = perfilusuarios;
    }
   
     @Id 

    
    @Column(name="perfilId", unique=true, nullable=false)
    public int getPerfilId() {
        return this.perfilId;
    }
    
    public void setPerfilId(int perfilId) {
        this.perfilId = perfilId;
    }

    
    @Column(name="perfilDescripcion", length=100)
    public String getPerfilDescripcion() {
        return this.perfilDescripcion;
    }
    
    public void setPerfilDescripcion(String perfilDescripcion) {
        this.perfilDescripcion = perfilDescripcion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="perfilFechaCreacion", length=23)
    public Date getPerfilFechaCreacion() {
        return this.perfilFechaCreacion;
    }
    
    public void setPerfilFechaCreacion(Date perfilFechaCreacion) {
        this.perfilFechaCreacion = perfilFechaCreacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="perfilFechaModificacion", length=23)
    public Date getPerfilFechaModificacion() {
        return this.perfilFechaModificacion;
    }
    
    public void setPerfilFechaModificacion(Date perfilFechaModificacion) {
        this.perfilFechaModificacion = perfilFechaModificacion;
    }

    
    @Column(name="perfilEstado", length=1)
    public Character getPerfilEstado() {
        return this.perfilEstado;
    }
    
    public void setPerfilEstado(Character perfilEstado) {
        this.perfilEstado = perfilEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="perfil")
    public Set getPerfilusuarios() {
        return this.perfilusuarios;
    }
    
    public void setPerfilusuarios(Set perfilusuarios) {
        this.perfilusuarios = perfilusuarios;
    }




}

