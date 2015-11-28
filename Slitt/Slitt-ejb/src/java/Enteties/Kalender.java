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
@TableGenerator(name="kalender", initialValue=0, allocationSize=50)
public class Kalender implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne private Bruker bruker;
    @GeneratedValue(strategy=GenerationType.TABLE, generator="kalender")
    @Id
    private Long KalenderId;
    private String Soke_Motetid;
    private Boolean Godkjent_IkkeGodkjent;
    private String ModulFrist;

    public Long getId() {
        return KalenderId;
    }

    public String getSoke_Motetid() {
        return Soke_Motetid;
    }

    public void setSoke_Motetid(String Soke_Motetid) {
        this.Soke_Motetid = Soke_Motetid;
    }

    public Boolean getGodkjent_IkkeGodkjent() {
        return Godkjent_IkkeGodkjent;
    }

    public void setGodkjent_IkkeGodkjent(Boolean Godkjent_IkkeGodkjent) {
        this.Godkjent_IkkeGodkjent = Godkjent_IkkeGodkjent;
    }

    public String getModulFrist() {
        return ModulFrist;
    }

    public void setModulFrist(String ModulFrist) {
        this.ModulFrist = ModulFrist;
    }

    public void setId(Long id) {
        this.KalenderId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (KalenderId != null ? KalenderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kalender)) {
            return false;
        }
        Kalender other = (Kalender) object;
        if ((this.KalenderId == null && other.KalenderId != null) || (this.KalenderId != null && !this.KalenderId.equals(other.KalenderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enteties.Kalender[ id=" + KalenderId + " ]";
    }

    
}
