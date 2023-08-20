package Logica;

import GUI.*;

public class logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Producto.ActualizarID();
        //Proveedor.AsignarIdProveedorPorCategoria();
        //Categoria.AsignarIdCategoriaPorProducto();
        // TODO code application logic here
        Administrador tico = new Administrador();
        tico.setVisible(true);
        tico.setResizable(false);
        tico.setLocationRelativeTo(null);

        Usuario tico2 = new Usuario();
        tico2.setVisible(true);
        tico2.setResizable(false);
        tico2.setLocationRelativeTo(null);
    }

}
