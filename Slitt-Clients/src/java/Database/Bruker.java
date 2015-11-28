/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Øystein
 */
@Entity
@Table(name = "bruker")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bruker.findAll", query = "SELECT b FROM Bruker b"),
    @NamedQuery(name = "Bruker.findByIdBruker", query = "SELECT b FROM Bruker b WHERE b.idBruker = :idBruker"),
    @NamedQuery(name = "Bruker.findByFirstName", query = "SELECT b FROM Bruker b WHERE b.firstName = :firstName"),
    @NamedQuery(name = "Bruker.findByLastName", query = "SELECT b FROM Bruker b WHERE b.lastName = :lastName"),
    @NamedQuery(name = "Bruker.findByTlf", query = "SELECT b FROM Bruker b WHERE b.tlf = :tlf"),
    @NamedQuery(name = "Bruker.findByEmail", query = "SELECT b FROM Bruker b WHERE b.email = :email")})
public class Bruker implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idBruker")
    private Integer idBruker;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "TLF")
    private String tlf;
    @Column(name = "Email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bruker")
    private Collection<System> systemCollection;

    public Bruker() {
    }

    public Bruker(Integer idBruker) {
        this.idBruker = idBruker;
    }

    public Integer getIdBruker() {
        return idBruker;
    }

    public void setIdBruker(Integer idBruker) {
        Integer oldIdBruker = this.idBruker;
        this.idBruker = idBruker;
        changeSupport.firePropertyChange("idBruker", oldIdBruker, idBruker);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        String oldTlf = this.tlf;
        this.tlf = tlf;
        changeSupport.firePropertyChange("tlf", oldTlf, tlf);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
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
        hash += (idBruker != null ? idBruker.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bruker)) {
            return false;
        }
        Bruker other = (Bruker) object;
        if ((this.idBruker == null && other.idBruker != null) || (this.idBruker != null && !this.idBruker.equals(other.idBruker))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Bruker[ idBruker=" + idBruker + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
