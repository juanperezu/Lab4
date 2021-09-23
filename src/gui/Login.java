package gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
String ruta="/imagenes/";  
//1. Declaraciones  
JLabel lblUsuario,lblClave; 
JTextField txtUsuario;
JPasswordField txtClave;
JButton btnAceptar,btnCancelar;



public Login(){
setTitle("Ingreso al sistema");
setLayout(null);//Ignora distribuciones automàticas y aceptar coordenadas definidas
setSize(600, 400);


setLocationRelativeTo(this);
//2.Inicialar objetos con los contructores de cada clase
lblUsuario = new JLabel("Usuario");
lblClave = new JLabel("Clave");
txtUsuario = new JTextField("");
txtClave = new JPasswordField("");
btnAceptar = new JButton("Aceptar");
btnCancelar = new JButton("Cancelar");
//3. Agregar coordenadas y tamaños a los objetos creados

lblUsuario.setBounds(10,20,100,20);
txtUsuario.setBounds(110,20,100,20);
btnAceptar.setBounds(220,20,100,20);

lblClave.setBounds(10,40,100,20);
txtClave.setBounds(110,40,100,20);
btnCancelar.setBounds(220,40,100,20); 

add(lblUsuario);
txtUsuario.setToolTipText("Ingrese el usuario asignado");
add(txtUsuario);
add(lblClave);
add(txtClave);

btnCancelar.addActionListener(this);
btnAceptar.addActionListener(this);

add(btnAceptar);
add(btnCancelar);
txtClave.setToolTipText("Ingrese el usuario asignado");


setVisible(true);
} // constructor de la class Login   
public void actionPerformed(ActionEvent boton) {
if (boton.getSource()==btnCancelar){
    setBorrar();
}

}// fin actionPerformed
public void setBorrar(){
txtClave.setText("");
txtUsuario.setText("");
setTitle("Operación cancelada");

}

}// fin de la clase
