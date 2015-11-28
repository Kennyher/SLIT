/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enteties;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

/**
 *
 * @author Kenneth
 */
@Entity
@TableGenerator(name="user", initialValue=0, allocationSize=50)
public class Bruker implements Serializable {
    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy="bruker")
    List<Fremgang> Fremgang;
    @OneToMany(mappedBy="bruker")
    List<Innlevering> Innlevering;
    @OneToMany(mappedBy="bruker")
    List<Kalender> Kalender;
    @OneToMany(mappedBy="bruker")
    List<Tilbakemelding> Tilbakemelding;
    @GeneratedValue(strategy=GenerationType.TABLE, generator="user")
    @Id
    private Long BrukerId;
    private String FirstName;
    private String LastName;
    private int TlfNr;
    private String Email;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getTlfNr() {
        return TlfNr;
    }

    public void setTlfNr(int TlfNr) {
        this.TlfNr = TlfNr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public Long getId() {
        return BrukerId;
    }
    

    public void setId(Long id) {
        this.BrukerId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (BrukerId != null ? BrukerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bruker)) {
            return false;
        }
        Bruker other = (Bruker) object;
        if ((this.BrukerId == null && other.BrukerId != null) || (this.BrukerId != null && !this.BrukerId.equals(other.BrukerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enteties.User[ id=" + BrukerId + " ]";
    }
    
}
