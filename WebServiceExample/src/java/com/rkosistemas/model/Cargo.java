package com.rkosistemas.model;
// Generated 15-nov-2018 14:23:45 by Hibernate Tools 4.3.1


import java.io.Serializable;
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
 * Cargo generated by hbm2java
 */
@Entity
@Table(name="cargo"
    ,schema="dbo"
    ,catalog="restoitsco"
)
public class Cargo  implements java.io.Serializable {


     private int cargoId;
     private String cargoDescripcion;
     private Date cargoFechaCreacion;
     private Date cargoFechaModificacion;
     private Serializable cargoEstado;
     private Set empleados = new HashSet(0);

    public Cargo() {
    }

	
    public Cargo(int cargoId) {
        this.cargoId = cargoId;
    }
    public Cargo(int cargoId, String cargoDescripcion, Date cargoFechaCreacion, Date cargoFechaModificacion, Serializable cargoEstado, Set empleados) {
       this.cargoId = cargoId;
       this.cargoDescripcion = cargoDescripcion;
       this.cargoFechaCreacion = cargoFechaCreacion;
       this.cargoFechaModificacion = cargoFechaModificacion;
       this.cargoEstado = cargoEstado;
       this.empleados = empleados;
    }
   
     @Id 

    
    @Column(name="cargoId", unique=true, nullable=false)
    public int getCargoId() {
        return this.cargoId;
    }
    
    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    
    @Column(name="cargoDescripcion", length=100)
    public String getCargoDescripcion() {
        return this.cargoDescripcion;
    }
    
    public void setCargoDescripcion(String cargoDescripcion) {
        this.cargoDescripcion = cargoDescripcion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="cargoFechaCreacion", length=23)
    public Date getCargoFechaCreacion() {
        return this.cargoFechaCreacion;
    }
    
    public void setCargoFechaCreacion(Date cargoFechaCreacion) {
        this.cargoFechaCreacion = cargoFechaCreacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="cargoFechaModificacion", length=23)
    public Date getCargoFechaModificacion() {
        return this.cargoFechaModificacion;
    }
    
    public void setCargoFechaModificacion(Date cargoFechaModificacion) {
        this.cargoFechaModificacion = cargoFechaModificacion;
    }

    
    @Column(name="cargoEstado")
    public Serializable getCargoEstado() {
        return this.cargoEstado;
    }
    
    public void setCargoEstado(Serializable cargoEstado) {
        this.cargoEstado = cargoEstado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cargo")
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }




}


