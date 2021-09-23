package users;

public class Usuarios {
private String id = "";
private String clave="";
public String getId() {
    return id;
}
public void setId(String userid) {
    this.id = userid;
}
public String getClave() {
    return clave;
}
public void setClave(String clave) {
    this.clave = clave;
}

public boolean getValidarUsuario(){
boolean val=false;
String u []= {"01","02","03","04"};// declarar arreglo con datos
String c []= {"C01","C02","C03","C04"};
//int us []= {01,02,03,04,05,06,07};
for (int i=0; i<u.length;i++){
  if((u[i].equals(id)) && c[i].equals(clave) ){
  val=true;
  i=u.length;
  }

}



    return val;
}

}
