/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Øystein
 */
@Entity
@Table(name = "system")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "System.findAll", query = "SELECT s FROM System s"),
    @NamedQuery(name = "System.findByIdSystem", query = "SELECT s FROM System s WHERE s.systemPK.idSystem = :idSystem"),
    @NamedQuery(name = "System.findByForeleseridForeleser", query = "SELECT s FROM System s WHERE s.systemPK.foreleseridForeleser = :foreleseridForeleser"),
    @NamedQuery(name = "System.findByStudentidStudent", query = "SELECT s FROM System s WHERE s.systemPK.studentidStudent = :studentidStudent"),
    @NamedQuery(name = "System.findByModulForsideidModulForside", query = "SELECT s FROM System s WHERE s.systemPK.modulForsideidModulForside = :modulForsideidModulForside"),
    @NamedQuery(name = "System.findByTilbakemeldingidTilbakemelding", query = "SELECT s FROM System s WHERE s.systemPK.tilbakemeldingidTilbakemelding = :tilbakemeldingidTilbakemelding"),
    @NamedQuery(name = "System.findByKalenderidKalender", query = "SELECT s FROM System s WHERE s.systemPK.kalenderidKalender = :kalenderidKalender"),
    @NamedQuery(name = "System.findByKalenderDagidDag", query = "SELECT s FROM System s WHERE s.systemPK.kalenderDagidDag = :kalenderDagidDag"),
    @NamedQuery(name = "System.findByInnleveringidInnlevering", query = "SELECT s FROM System s WHERE s.systemPK.innleveringidInnlevering = :innleveringidInnlevering"),
    @NamedQuery(name = "System.findByBrukeridBruker", query = "SELECT s FROM System s WHERE s.systemPK.brukeridBruker = :brukeridBruker")})
public class System implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SystemPK systemPK;
    @JoinColumn(name = "Bruker_idBruker", referencedColumnName = "idBruker", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bruker bruker;
    @JoinColumn(name = "Innlevering_idInnlevering", referencedColumnName = "idInnlevering", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Innlevering innlevering;
    @JoinColumns({
        @JoinColumn(name = "Kalender_idKalender", referencedColumnName = "idKalender", insertable = false, updatable = false),
        @JoinColumn(name = "Kalender_Dag_idDag", referencedColumnName = "Dag_idDag", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Kalender kalender;
    @JoinColumn(name = "ModulForside_idModulForside", referencedColumnName = "idModulForside", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Modulforside modulforside;
    @JoinColumn(name = "Tilbakemelding_idTilbakemelding", referencedColumnName = "idTilbakemelding", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tilbakemelding tilbakemelding;

    public System() {
    }

    public System(SystemPK systemPK) {
        this.systemPK = systemPK;
    }

    public System(int idSystem, int foreleseridForeleser, int studentidStudent, int modulForsideidModulForside, int tilbakemeldingidTilbakemelding, int kalenderidKalender, int kalenderDagidDag, int innleveringidInnlevering, int brukeridBruker) {
        this.systemPK = new SystemPK(idSystem, foreleseridForeleser, studentidStudent, modulForsideidModulForside, tilbakemeldingidTilbakemelding, kalenderidKalender, kalenderDagidDag, innleveringidInnlevering, brukeridBruker);
    }

    public SystemPK getSystemPK() {
        return systemPK;
    }

    public void setSystemPK(SystemPK systemPK) {
        this.systemPK = systemPK;
    }

    public Bruker getBruker() {
        return bruker;
    }

    public void setBruker(Bruker bruker) {
        this.bruker = bruker;
    }

    public Innlevering getInnlevering() {
        return innlevering;
    }

    public void setInnlevering(Innlevering innlevering) {
        this.innlevering = innlevering;
    }

    public Kalender getKalender() {
        return kalender;
    }

    public void setKalender(Kalender kalender) {
        this.kalender = kalender;
    }

    public Modulforside getModulforside() {
        return modulforside;
    }

    public void setModulforside(Modulforside modulforside) {
        this.modulforside = modulforside;
    }

    public Tilbakemelding getTilbakemelding() {
        return tilbakemelding;
    }

    public void setTilbakemelding(Tilbakemelding tilbakemelding) {
        this.tilbakemelding = tilbakemelding;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (systemPK != null ? systemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof System)) {
            return false;
        }
        System other = (System) object;
        if ((this.systemPK == null && other.systemPK != null) || (this.systemPK != null && !this.systemPK.equals(other.systemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.System[ systemPK=" + systemPK + " ]";
    }
    
}
