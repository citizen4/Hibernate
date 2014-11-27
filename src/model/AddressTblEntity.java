package model;

import javax.persistence.*;


@Entity
@Table(name = "address_tbl", schema = "", catalog = "")
public class AddressTblEntity
{
    private Integer id;
    private String nachname;
    private String vorname;
    private String plz;
    private String ort;
    private String strasse;
    private String telefon;
    private String mobil;
    private String email;

    @Id
    @Column(name = "ID")
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "NACHNAME")
    public String getNachname()
    {
        return nachname;
    }

    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    @Basic
    @Column(name = "VORNAME")
    public String getVorname()
    {
        return vorname;
    }

    public void setVorname(String vorname)
    {
        this.vorname = vorname;
    }

    @Basic
    @Column(name = "PLZ")
    public String getPlz()
    {
        return plz;
    }

    public void setPlz(String plz)
    {
        this.plz = plz;
    }

    @Basic
    @Column(name = "ORT")
    public String getOrt()
    {
        return ort;
    }

    public void setOrt(String ort)
    {
        this.ort = ort;
    }

    @Basic
    @Column(name = "STRASSE")
    public String getStrasse()
    {
        return strasse;
    }

    public void setStrasse(String strasse)
    {
        this.strasse = strasse;
    }

    @Basic
    @Column(name = "TELEFON")
    public String getTelefon()
    {
        return telefon;
    }

    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }

    @Basic
    @Column(name = "MOBIL")
    public String getMobil()
    {
        return mobil;
    }

    public void setMobil(String mobil)
    {
        this.mobil = mobil;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressTblEntity that = (AddressTblEntity) o;

        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (mobil != null ? !mobil.equals(that.mobil) : that.mobil != null) return false;
        if (nachname != null ? !nachname.equals(that.nachname) : that.nachname != null) return false;
        if (ort != null ? !ort.equals(that.ort) : that.ort != null) return false;
        if (plz != null ? !plz.equals(that.plz) : that.plz != null) return false;
        if (strasse != null ? !strasse.equals(that.strasse) : that.strasse != null) return false;
        if (telefon != null ? !telefon.equals(that.telefon) : that.telefon != null) return false;
        if (vorname != null ? !vorname.equals(that.vorname) : that.vorname != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nachname != null ? nachname.hashCode() : 0);
        result = 31 * result + (vorname != null ? vorname.hashCode() : 0);
        result = 31 * result + (plz != null ? plz.hashCode() : 0);
        result = 31 * result + (ort != null ? ort.hashCode() : 0);
        result = 31 * result + (strasse != null ? strasse.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (mobil != null ? mobil.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
