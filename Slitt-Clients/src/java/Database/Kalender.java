/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "kalender")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kalender.findAll", query = "SELECT k FROM Kalender k"),
    @NamedQuery(name = "Kalender.findByIdKalender", query = "SELECT k FROM Kalender k WHERE k.kalenderPK.idKalender = :idKalender"),
    @NamedQuery(name = "Kalender.findByDagidDag", query = "SELECT k FROM Kalender k WHERE k.kalenderPK.dagidDag = :dagidDag")})
public class Kalender implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KalenderPK kalenderPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kalender")
    private Collection<System> systemCollection;
    @JoinColumn(name = "Dag_idDag", referencedColumnName = "idDag", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Dag dag;

    public Kalender() {
    }

    public Kalender(KalenderPK kalenderPK) {
        this.kalenderPK = kalenderPK;
    }

    public Kalender(int idKalender, int dagidDag) {
        this.kalenderPK = new KalenderPK(idKalender, dagidDag);
    }

    public KalenderPK getKalenderPK() {
        return kalenderPK;
    }

    public void setKalenderPK(KalenderPK kalenderPK) {
        this.kalenderPK = kalenderPK;
    }

    @XmlTransient
    public Collection<System> getSystemCollection() {
        return systemCollection;
    }

    public void setSystemCollection(Collection<System> systemCollection) {
        this.systemCollection = systemCollection;
    }

    public Dag getDag() {
        return dag;
    }

    public void setDag(Dag dag) {
        this.dag = dag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kalenderPK != null ? kalenderPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kalender)) {
            return false;
        }
        Kalender other = (Kalender) object;
        if ((this.kalenderPK == null && other.kalenderPK != null) || (this.kalenderPK != null && !this.kalenderPK.equals(other.kalenderPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Kalender[ kalenderPK=" + kalenderPK + " ]";
    }
    
}
