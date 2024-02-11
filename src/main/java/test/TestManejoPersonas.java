package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        //Insertando un nuevo objeto de tipo Persona
//        Usuario usuarioNuevo = new Usuario("Mario", "111");
//        usuarioDao.insertar(usuarioNuevo);

        //Modificar un objeto de persona existente
//        Usuario usuarioModificar = new Usuario(1, "Juan Carlos", "Esparza");
//        usuarioDao.actualizar(usuarioModificar);

        //Eliminar un registro
//        Usuario usuarioEliminar = new Usuario(1);
//        usuarioDao.eliminar(usuarioEliminar);
//        
//        //Listado Usuario
        List<Usuario> usuarios = usuarioDao.seleccionar();

        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });
    }
}
