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
@Table(name = "modul")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modul.findAll", query = "SELECT m FROM Modul m"),
    @NamedQuery(name = "Modul.findByIdModul", query = "SELECT m FROM Modul m WHERE m.idModul = :idModul")})
public class Modul implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idModul")
    private Integer idModul;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modul")
    private Collection<Modulforside> modulforsideCollection;

    public Modul() {
    }

    public Modul(Integer idModul) {
        this.idModul = idModul;
    }

    public Integer getIdModul() {
        return idModul;
    }

    public void setIdModul(Integer idModul) {
        this.idModul = idModul;
    }

    @XmlTransient
    public Collection<Modulforside> getModulforsideCollection() {
        return modulforsideCollection;
    }

    public void setModulforsideCollection(Collection<Modulforside> modulforsideCollection) {
        this.modulforsideCollection = modulforsideCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModul != null ? idModul.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modul)) {
            return false;
        }
        Modul other = (Modul) object;
        if ((this.idModul == null && other.idModul != null) || (this.idModul != null && !this.idModul.equals(other.idModul))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Modul[ idModul=" + idModul + " ]";
    }
    
}
