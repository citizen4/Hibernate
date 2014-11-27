package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "address_tbl", schema = "", catalog = "")
public class Address
{
   @Id
   @Column(name = "ID")
   private Long id;

   @Column(name = "VORNAME")
   private String firstName;
   @Column(name = "NACHNAME")
   private String lastName;
   @Column(name = "PLZ")
   private String zipCode;
   @Column(name = "ORT")
   private String city;
   @Column(name = "STRASSE")
   private String street;
   @Column(name = "EMAIL")
   private String email;
   @Column(name = "TELEFON")
   private String phone;
   @Column(name = "MOBIL")
   private String cellPhone;


   public long getId()
   {
      return id;
   }

   public void setId(long id)
   {
      this.id = id;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getZipCode()
   {
      return zipCode;
   }

   public void setZipCode(String zipCode)
   {
      this.zipCode = zipCode;
   }

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getStreet()
   {
      return street;
   }

   public void setStreet(String street)
   {
      this.street = street;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public String getCellPhone()
   {
      return cellPhone;
   }

   public void setCellPhone(String cellPhone)
   {
      this.cellPhone = cellPhone;
   }
}
