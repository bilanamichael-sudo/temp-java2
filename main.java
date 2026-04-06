import java.util.*;
import javax.swing.JOptionPane;

public class main{
    

    public static void main(String[] args) {
      int edad;
      Scanner entrada = new Scanner(System.in);



        System.out.println("Ingrese la edad: ");
        edad = entrada.nextInt();

        if(edad < 18){
            JOptionPane.showMessageDialog(null, "Es menor de edad");

        }else{
            JOptionPane.showMessageDialog(null, "Es mayor de edad");
        }
    }
}