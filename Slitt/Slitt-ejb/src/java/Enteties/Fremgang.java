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
@TableGenerator(name="fremgang", initialValue=0, allocationSize=50)
public class Fremgang implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne private Bruker bruker;
    @GeneratedValue(strategy=GenerationType.TABLE, generator="fremgang")
    @Id
    private Long FremgangId;
    private String Status;
    private String Oversikt;
    private String Logg;

    public Long getId() {
        return FremgangId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getOversikt() {
        return Oversikt;
    }

    public void setOversikt(String Oversikt) {
        this.Oversikt = Oversikt;
    }

    public String getLogg() {
        return Logg;
    }

    public void setLogg(String Logg) {
        this.Logg = Logg;
    }

    public void setId(Long id) {
        this.FremgangId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (FremgangId != null ? FremgangId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fremgang)) {
            return false;
        }
        Fremgang other = (Fremgang) object;
        if ((this.FremgangId == null && other.FremgangId != null) || (this.FremgangId != null && !this.FremgangId.equals(other.FremgangId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enteties.Fremgang[ id=" + FremgangId + " ]";
    }
    
}
