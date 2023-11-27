package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public final class RegistraceForm {
    @NotNull
    @NotEmpty
    private  String pohlavi;

    private  Long vek;

    @NotNull
    @NotEmpty
    private  String jmeno;

    @NotNull
    @NotEmpty
    private  String prijmeni;

    @NotNull
    private  String datumNarozeni;

    @NotNull
    @NotEmpty
    private  String turnus;
    private  String email;
    private  String telefon;

    public RegistraceForm(String pohlavi,
                          Long vek,
                          String jmeno,
                          String prijmeni,
                          String datumNarozeni,
                          String turnus,
                          String email,
                          String telefon
    ) {
        this.pohlavi = pohlavi;
        this.vek = vek;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.turnus = turnus;
        this.email = email;
        this.telefon = telefon;
    }

    public RegistraceForm() {

        pohlavi = null;
        vek = null;
        jmeno = null;
        prijmeni = null;
        datumNarozeni =  null;
        turnus = null;
        email = null;
        telefon = null;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public void setVek(Long vek) {
        this.vek = vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public Long getVek() {
        return vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public String getTurnus() {
        return turnus;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (RegistraceForm) obj;
        return Objects.equals(this.pohlavi, that.pohlavi) &&
                Objects.equals(this.vek, that.vek) &&
                Objects.equals(this.jmeno, that.jmeno) &&
                Objects.equals(this.prijmeni, that.prijmeni) &&
                Objects.equals(this.datumNarozeni, that.datumNarozeni) &&
                Objects.equals(this.turnus, that.turnus) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.telefon, that.telefon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pohlavi, vek, jmeno, prijmeni, datumNarozeni, turnus, email, telefon);
    }

    @Override
    public String toString() {
        return "RegistraceForm[" +
                "pohlavi=" + pohlavi + ", " +
                "vek=" + vek + ", " +
                "jmeno=" + jmeno + ", " +
                "prijmeni=" + prijmeni + ", " +
                "datumNarozeni=" + datumNarozeni + ", " +
                "turnus=" + turnus + ", " +
                "email=" + email + ", " +
                "telefon=" + telefon + ']';
    }

}
