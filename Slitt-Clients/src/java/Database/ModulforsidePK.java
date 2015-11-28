/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Øystein
 */
@Embeddable
public class ModulforsidePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idModulForside")
    private int idModulForside;
    @Basic(optional = false)
    @Column(name = "Modul_idModul")
    private int modulidModul;

    public ModulforsidePK() {
    }

    public ModulforsidePK(int idModulForside, int modulidModul) {
        this.idModulForside = idModulForside;
        this.modulidModul = modulidModul;
    }

    public int getIdModulForside() {
        return idModulForside;
    }

    public void setIdModulForside(int idModulForside) {
        this.idModulForside = idModulForside;
    }

    public int getModulidModul() {
        return modulidModul;
    }

    public void setModulidModul(int modulidModul) {
        this.modulidModul = modulidModul;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idModulForside;
        hash += (int) modulidModul;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModulforsidePK)) {
            return false;
        }
        ModulforsidePK other = (ModulforsidePK) object;
        if (this.idModulForside != other.idModulForside) {
            return false;
        }
        if (this.modulidModul != other.modulidModul) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModulforsidePK[ idModulForside=" + idModulForside + ", modulidModul=" + modulidModul + " ]";
    }
    
}
