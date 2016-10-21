package DAO;

import javax.persistence.Query;

import org.hibernate.Session;

import dominio.Usuario;

public class DAOUsuario {

	public static Usuario login(String nombre, String clave) {
		Usuario resultado = null;
		try {
			Session sesion = ORM.INSTANCE.openSession();
			Query query = sesion.createQuery("from Usuario where nombre = :usuario and clave =MD5( :clave)");
			query.setParameter("usuario", nombre);
			query.setParameter("clave", clave);
			resultado = (Usuario)query.getSingleResult();
		} catch (Exception e) {
			System.out.println("El usuario no existe");
		}
		return resultado;
	}

	public static void registro(String usuario, String clave, String email) {
		// TODO Auto-generated method stub
		//usuario creado y luego meterlo en la BBDD
				Usuario nuevoUsuario = new Usuario();
				nuevoUsuario.setNombre(usuario);
				nuevoUsuario.setClave(clave);
				nuevoUsuario.setEmail(email);
				
		
	}

}
