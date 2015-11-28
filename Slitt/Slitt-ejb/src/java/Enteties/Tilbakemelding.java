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
@TableGenerator(name="tilbakemelding", initialValue=0, allocationSize=50)
public class Tilbakemelding implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne private Bruker bruker;
    @GeneratedValue(strategy=GenerationType.TABLE, generator="tilbakemelding")
    @Id
    private Long TilbakemeldingId;
    private String Kommentar;
    private String ModulTilbakemelding;
    private String SvarPaaSpm;
    private Boolean Godkjenning;

    public Long getId() {
        return TilbakemeldingId;
    }

    public String getKommentar() {
        return Kommentar;
    }

    public void setKommentar(String Kommentar) {
        this.Kommentar = Kommentar;
    }

    public String getModulTilbakemelding() {
        return ModulTilbakemelding;
    }

    public void setModulTilbakemelding(String ModulTilbakemelding) {
        this.ModulTilbakemelding = ModulTilbakemelding;
    }

    public String getSvarPaaSpm() {
        return SvarPaaSpm;
    }

    public void setSvarPaaSpm(String SvarPaaSpm) {
        this.SvarPaaSpm = SvarPaaSpm;
    }

    public Boolean getGodkjenning() {
        return Godkjenning;
    }

    public void setGodkjenning(Boolean Godkjenning) {
        this.Godkjenning = Godkjenning;
    }

    public void setId(Long id) {
        this.TilbakemeldingId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (TilbakemeldingId != null ? TilbakemeldingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tilbakemelding)) {
            return false;
        }
        Tilbakemelding other = (Tilbakemelding) object;
        if ((this.TilbakemeldingId == null && other.TilbakemeldingId != null) || (this.TilbakemeldingId != null && !this.TilbakemeldingId.equals(other.TilbakemeldingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enteties.Tilbakemelding[ id=" + TilbakemeldingId + " ]";
    }
    
}
