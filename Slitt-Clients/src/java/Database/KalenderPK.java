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
public class KalenderPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idKalender")
    private int idKalender;
    @Basic(optional = false)
    @Column(name = "Dag_idDag")
    private int dagidDag;

    public KalenderPK() {
    }

    public KalenderPK(int idKalender, int dagidDag) {
        this.idKalender = idKalender;
        this.dagidDag = dagidDag;
    }

    public int getIdKalender() {
        return idKalender;
    }

    public void setIdKalender(int idKalender) {
        this.idKalender = idKalender;
    }

    public int getDagidDag() {
        return dagidDag;
    }

    public void setDagidDag(int dagidDag) {
        this.dagidDag = dagidDag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idKalender;
        hash += (int) dagidDag;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KalenderPK)) {
            return false;
        }
        KalenderPK other = (KalenderPK) object;
        if (this.idKalender != other.idKalender) {
            return false;
        }
        if (this.dagidDag != other.dagidDag) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.KalenderPK[ idKalender=" + idKalender + ", dagidDag=" + dagidDag + " ]";
    }
    
}
