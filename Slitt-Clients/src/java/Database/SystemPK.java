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
public class SystemPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idSystem")
    private int idSystem;
    @Basic(optional = false)
    @Column(name = "Foreleser_idForeleser")
    private int foreleseridForeleser;
    @Basic(optional = false)
    @Column(name = "Student_idStudent")
    private int studentidStudent;
    @Basic(optional = false)
    @Column(name = "ModulForside_idModulForside")
    private int modulForsideidModulForside;
    @Basic(optional = false)
    @Column(name = "Tilbakemelding_idTilbakemelding")
    private int tilbakemeldingidTilbakemelding;
    @Basic(optional = false)
    @Column(name = "Kalender_idKalender")
    private int kalenderidKalender;
    @Basic(optional = false)
    @Column(name = "Kalender_Dag_idDag")
    private int kalenderDagidDag;
    @Basic(optional = false)
    @Column(name = "Innlevering_idInnlevering")
    private int innleveringidInnlevering;
    @Basic(optional = false)
    @Column(name = "Bruker_idBruker")
    private int brukeridBruker;

    public SystemPK() {
    }

    public SystemPK(int idSystem, int foreleseridForeleser, int studentidStudent, int modulForsideidModulForside, int tilbakemeldingidTilbakemelding, int kalenderidKalender, int kalenderDagidDag, int innleveringidInnlevering, int brukeridBruker) {
        this.idSystem = idSystem;
        this.foreleseridForeleser = foreleseridForeleser;
        this.studentidStudent = studentidStudent;
        this.modulForsideidModulForside = modulForsideidModulForside;
        this.tilbakemeldingidTilbakemelding = tilbakemeldingidTilbakemelding;
        this.kalenderidKalender = kalenderidKalender;
        this.kalenderDagidDag = kalenderDagidDag;
        this.innleveringidInnlevering = innleveringidInnlevering;
        this.brukeridBruker = brukeridBruker;
    }

    public int getIdSystem() {
        return idSystem;
    }

    public void setIdSystem(int idSystem) {
        this.idSystem = idSystem;
    }

    public int getForeleseridForeleser() {
        return foreleseridForeleser;
    }

    public void setForeleseridForeleser(int foreleseridForeleser) {
        this.foreleseridForeleser = foreleseridForeleser;
    }

    public int getStudentidStudent() {
        return studentidStudent;
    }

    public void setStudentidStudent(int studentidStudent) {
        this.studentidStudent = studentidStudent;
    }

    public int getModulForsideidModulForside() {
        return modulForsideidModulForside;
    }

    public void setModulForsideidModulForside(int modulForsideidModulForside) {
        this.modulForsideidModulForside = modulForsideidModulForside;
    }

    public int getTilbakemeldingidTilbakemelding() {
        return tilbakemeldingidTilbakemelding;
    }

    public void setTilbakemeldingidTilbakemelding(int tilbakemeldingidTilbakemelding) {
        this.tilbakemeldingidTilbakemelding = tilbakemeldingidTilbakemelding;
    }

    public int getKalenderidKalender() {
        return kalenderidKalender;
    }

    public void setKalenderidKalender(int kalenderidKalender) {
        this.kalenderidKalender = kalenderidKalender;
    }

    public int getKalenderDagidDag() {
        return kalenderDagidDag;
    }

    public void setKalenderDagidDag(int kalenderDagidDag) {
        this.kalenderDagidDag = kalenderDagidDag;
    }

    public int getInnleveringidInnlevering() {
        return innleveringidInnlevering;
    }

    public void setInnleveringidInnlevering(int innleveringidInnlevering) {
        this.innleveringidInnlevering = innleveringidInnlevering;
    }

    public int getBrukeridBruker() {
        return brukeridBruker;
    }

    public void setBrukeridBruker(int brukeridBruker) {
        this.brukeridBruker = brukeridBruker;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idSystem;
        hash += (int) foreleseridForeleser;
        hash += (int) studentidStudent;
        hash += (int) modulForsideidModulForside;
        hash += (int) tilbakemeldingidTilbakemelding;
        hash += (int) kalenderidKalender;
        hash += (int) kalenderDagidDag;
        hash += (int) innleveringidInnlevering;
        hash += (int) brukeridBruker;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SystemPK)) {
            return false;
        }
        SystemPK other = (SystemPK) object;
        if (this.idSystem != other.idSystem) {
            return false;
        }
        if (this.foreleseridForeleser != other.foreleseridForeleser) {
            return false;
        }
        if (this.studentidStudent != other.studentidStudent) {
            return false;
        }
        if (this.modulForsideidModulForside != other.modulForsideidModulForside) {
            return false;
        }
        if (this.tilbakemeldingidTilbakemelding != other.tilbakemeldingidTilbakemelding) {
            return false;
        }
        if (this.kalenderidKalender != other.kalenderidKalender) {
            return false;
        }
        if (this.kalenderDagidDag != other.kalenderDagidDag) {
            return false;
        }
        if (this.innleveringidInnlevering != other.innleveringidInnlevering) {
            return false;
        }
        if (this.brukeridBruker != other.brukeridBruker) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.SystemPK[ idSystem=" + idSystem + ", foreleseridForeleser=" + foreleseridForeleser + ", studentidStudent=" + studentidStudent + ", modulForsideidModulForside=" + modulForsideidModulForside + ", tilbakemeldingidTilbakemelding=" + tilbakemeldingidTilbakemelding + ", kalenderidKalender=" + kalenderidKalender + ", kalenderDagidDag=" + kalenderDagidDag + ", innleveringidInnlevering=" + innleveringidInnlevering + ", brukeridBruker=" + brukeridBruker + " ]";
    }
    
}
