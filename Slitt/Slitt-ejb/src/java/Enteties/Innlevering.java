/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enteties;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

/**
 *
 * @author Kenneth
 */
@Entity
@TableGenerator(name="user", initialValue=0, allocationSize=50)
public class Innlevering implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne private Bruker bruker;
    @GeneratedValue(strategy=GenerationType.TABLE, generator="innlevering")
    @Id
    private Long InnleveringId;
    private String LastOpp;
    private String Kommentar;
    private String Vedlegg;

    public Long getId() {
        return InnleveringId;
    }

    public String getLastOpp() {
        return LastOpp;
    }

    public void setLastOpp(String LastOpp) {
        this.LastOpp = LastOpp;
    }

    public String getKommentar() {
        return Kommentar;
    }

    public void setKommentar(String Kommentar) {
        this.Kommentar = Kommentar;
    }

    public String getVedlegg() {
        return Vedlegg;
    }

    public void setVedlegg(String Vedlegg) {
        this.Vedlegg = Vedlegg;
    }

    public void setId(Long id) {
        this.InnleveringId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (InnleveringId != null ? InnleveringId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Innlevering)) {
            return false;
        }
        Innlevering other = (Innlevering) object;
        if ((this.InnleveringId == null && other.InnleveringId != null) || (this.InnleveringId != null && !this.InnleveringId.equals(other.InnleveringId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enteties.Innlevering[ id=" + InnleveringId + " ]";
    }
    
}
