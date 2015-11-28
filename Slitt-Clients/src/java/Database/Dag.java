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
@Table(name = "dag")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dag.findAll", query = "SELECT d FROM Dag d"),
    @NamedQuery(name = "Dag.findByIdDag", query = "SELECT d FROM Dag d WHERE d.idDag = :idDag"),
    @NamedQuery(name = "Dag.findByTid", query = "SELECT d FROM Dag d WHERE d.tid = :tid"),
    @NamedQuery(name = "Dag.findByForeleser", query = "SELECT d FROM Dag d WHERE d.foreleser = :foreleser")})
public class Dag implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idDag")
    private Integer idDag;
    @Column(name = "Tid")
    private String tid;
    @Column(name = "Foreleser")
    private String foreleser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dag")
    private Collection<Kalender> kalenderCollection;

    public Dag() {
    }

    public Dag(Integer idDag) {
        this.idDag = idDag;
    }

    public Integer getIdDag() {
        return idDag;
    }

    public void setIdDag(Integer idDag) {
        this.idDag = idDag;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getForeleser() {
        return foreleser;
    }

    public void setForeleser(String foreleser) {
        this.foreleser = foreleser;
    }

    @XmlTransient
    public Collection<Kalender> getKalenderCollection() {
        return kalenderCollection;
    }

    public void setKalenderCollection(Collection<Kalender> kalenderCollection) {
        this.kalenderCollection = kalenderCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDag != null ? idDag.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dag)) {
            return false;
        }
        Dag other = (Dag) object;
        if ((this.idDag == null && other.idDag != null) || (this.idDag != null && !this.idDag.equals(other.idDag))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Dag[ idDag=" + idDag + " ]";
    }
    
}
