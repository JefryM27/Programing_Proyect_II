package Logica;

import GUI.*;


public class logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administrador tico = new Administrador();
        tico.setVisible(true);
        tico.setResizable(false);
        tico.setLocationRelativeTo(null);
        tico.actualizarTablaCliente();
        tico.actualizarTablaProveedor();
    }
    
}
