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
import javax.persistence.TableGenerator;

/**
 *
 * @author Kenneth
 */
@Entity
@TableGenerator(name="modul", initialValue=0, allocationSize=50)
public class Modul implements Serializable {
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy=GenerationType.TABLE, generator="modul")
    @Id
    private Long ModulId;
    private String Ressurs;
    private String Info_Kriterier;
    private int ModulNr;

    public Long getId() {
        return ModulId;
    }

    public String getRessurs() {
        return Ressurs;
    }

    public void setRessurs(String Ressurs) {
        this.Ressurs = Ressurs;
    }

    public String getInfo_Kriterier() {
        return Info_Kriterier;
    }

    public void setInfo_Kriterier(String Info_Kriterier) {
        this.Info_Kriterier = Info_Kriterier;
    }

    public int getModulNr() {
        return ModulNr;
    }

    public void setModulNr(int ModulNr) {
        this.ModulNr = ModulNr;
    }

    public void setId(Long id) {
        this.ModulId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ModulId != null ? ModulId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modul)) {
            return false;
        }
        Modul other = (Modul) object;
        if ((this.ModulId == null && other.ModulId != null) || (this.ModulId != null && !this.ModulId.equals(other.ModulId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enteties.Modul[ id=" + ModulId + " ]";
    }
    
}
