import java.util.*;

public class Person{
  private int id;
  private int id_number;
  private int id_type;
  private String name;
  private String last_name;
  private Date birth_date;
  private char gender;
  private String email;
  private String phone;

  public Person(){
  }
  public Person(int id, int id_number, int id_type, String name, String last_name, Date birth_date, char gender, String email, String phone){
    this.id = id;
    this.id_number = id_number;
    this.id_type = id_type;
    this.name = name;
    this.last_name = last_name;
    this.birth_date = birth_date;
    this.gender = gender;
    this.email = email;
    this.phone = phone;
 }

 public int getId(){
   return id;
 }
  public void setId(int id){
    this.id = id;
  }
  public int getId_number(){
    return id_number;
  }
  
  public void setId_number(int id_number){
    this.id_number = id_number;
  }
  public int getId_type() {
    return id_type;
  }
  public void setId_type(int id_type) {
    this.id_type = id_type;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLast_name() {
    return last_name;
  }
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
  public Date getBirth_date() {
    return birth_date;
  }
  public void setBirth_date(Date birth_date) {
    this.birth_date = birth_date;
  }
  public char getGender() {
    return gender;
  }
  public void setGender(char gender) {
    this.gender = gender;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  @Override

  public String toString(){
    char n = '\n'; 
    return
          "Registro: "+getId()+n+
          "DNI: "+getId_number()+n+
          "Documento: "+getId_type()+n+
          "Nombre: "+getName()+n+
          "Apellido: "+getLast_name()+n+
          "Fecha Nacimiento: "+getBirth_date()+n+
          "Genero: "+getGender()+n+
          "Email: "+getEmail()+n+
          "Telefono: "+getPhone()+n;
  }

}
