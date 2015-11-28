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
@Table(name = "tilbakemelding")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tilbakemelding.findAll", query = "SELECT t FROM Tilbakemelding t"),
    @NamedQuery(name = "Tilbakemelding.findByIdTilbakemelding", query = "SELECT t FROM Tilbakemelding t WHERE t.idTilbakemelding = :idTilbakemelding")})
public class Tilbakemelding implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTilbakemelding")
    private Integer idTilbakemelding;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tilbakemelding")
    private Collection<System> systemCollection;

    public Tilbakemelding() {
    }

    public Tilbakemelding(Integer idTilbakemelding) {
        this.idTilbakemelding = idTilbakemelding;
    }

    public Integer getIdTilbakemelding() {
        return idTilbakemelding;
    }

    public void setIdTilbakemelding(Integer idTilbakemelding) {
        this.idTilbakemelding = idTilbakemelding;
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
        hash += (idTilbakemelding != null ? idTilbakemelding.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tilbakemelding)) {
            return false;
        }
        Tilbakemelding other = (Tilbakemelding) object;
        if ((this.idTilbakemelding == null && other.idTilbakemelding != null) || (this.idTilbakemelding != null && !this.idTilbakemelding.equals(other.idTilbakemelding))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Tilbakemelding[ idTilbakemelding=" + idTilbakemelding + " ]";
    }
    
}
