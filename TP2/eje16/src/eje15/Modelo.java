package eje15;
import java.security.SecureRandom;
public class Modelo {
private String contraseña;


public String getContraseña() {
return contraseña;
}

public void setContraseña(String contraseña) {
this.contraseña = contraseña.toUpperCase() ;
}
}