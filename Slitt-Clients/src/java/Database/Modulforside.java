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
@Table(name = "modulforside")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modulforside.findAll", query = "SELECT m FROM Modulforside m"),
    @NamedQuery(name = "Modulforside.findByIdModulForside", query = "SELECT m FROM Modulforside m WHERE m.modulforsidePK.idModulForside = :idModulForside"),
    @NamedQuery(name = "Modulforside.findByModulidModul", query = "SELECT m FROM Modulforside m WHERE m.modulforsidePK.modulidModul = :modulidModul")})
public class Modulforside implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModulforsidePK modulforsidePK;
    @JoinColumn(name = "Modul_idModul", referencedColumnName = "idModul", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Modul modul;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modulforside")
    private Collection<System> systemCollection;

    public Modulforside() {
    }

    public Modulforside(ModulforsidePK modulforsidePK) {
        this.modulforsidePK = modulforsidePK;
    }

    public Modulforside(int idModulForside, int modulidModul) {
        this.modulforsidePK = new ModulforsidePK(idModulForside, modulidModul);
    }

    public ModulforsidePK getModulforsidePK() {
        return modulforsidePK;
    }

    public void setModulforsidePK(ModulforsidePK modulforsidePK) {
        this.modulforsidePK = modulforsidePK;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
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
        hash += (modulforsidePK != null ? modulforsidePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modulforside)) {
            return false;
        }
        Modulforside other = (Modulforside) object;
        if ((this.modulforsidePK == null && other.modulforsidePK != null) || (this.modulforsidePK != null && !this.modulforsidePK.equals(other.modulforsidePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Modulforside[ modulforsidePK=" + modulforsidePK + " ]";
    }
    
}
