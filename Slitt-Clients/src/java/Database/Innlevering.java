/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Øystein
 */
@Entity
@Table(name = "innlevering")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Innlevering.findAll", query = "SELECT i FROM Innlevering i"),
    @NamedQuery(name = "Innlevering.findByIdInnlevering", query = "SELECT i FROM Innlevering i WHERE i.idInnlevering = :idInnlevering")})
public class Innlevering implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idInnlevering")
    private Integer idInnlevering;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "innlevering")
    private Collection<System> systemCollection;

    public Innlevering() {
    }

    public Innlevering(Integer idInnlevering) {
        this.idInnlevering = idInnlevering;
    }

    public Integer getIdInnlevering() {
        return idInnlevering;
    }

    public void setIdInnlevering(Integer idInnlevering) {
        this.idInnlevering = idInnlevering;
    }

    @XmlTransient
    public Collection<System> getSystemCollection() {
        return systemCollection;
    }

    public void setSystemCollection(Collection<System> systemCollection) {
        this.systemCollection = systemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInnlevering != null ? idInnlevering.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Innlevering)) {
            return false;
        }
        Innlevering other = (Innlevering) object;
        if ((this.idInnlevering == null && other.idInnlevering != null) || (this.idInnlevering != null && !this.idInnlevering.equals(other.idInnlevering))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Innlevering[ idInnlevering=" + idInnlevering + " ]";
    }
    
}
