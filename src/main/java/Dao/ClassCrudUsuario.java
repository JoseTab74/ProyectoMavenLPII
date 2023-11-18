package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Interfaces.Iusuarioable;
import model.TblUsuario;

public class ClassCrudUsuario implements Iusuarioable {

	@Override
	public void RegistrarUsuario(TblUsuario tblusu) {
		// TODO Auto-generated method stub
		
	} //fin del metodo Registrar...

	@Override
	public void ActualizarUsuario(TblUsuario tblusu) {
		// TODO Auto-generated method stub
		
	}//fin del metodo Actualizar...

	@Override
	public void EliminarUsuario(TblUsuario tblusu) {
		// TODO Auto-generated method stub
		
	}//fin del metodo eliminar...

	@Override
	public List<TblUsuario> ListarUsaurio() {
		// TODO Auto-generated method stub
		return null;
	}//finn del metodo listar...

	@Override
	public TblUsuario BuscarUsuario(TblUsuario tblusu) {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo Buscar...

	@Override
	public String ValidarUsuario(TblUsuario tblusu) {
		// establecemos conexion con la unidad de persistencia
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENDOS");
		//para gestionar entidades...
		EntityManager em=fabrica.createEntityManager();
		//iniciamos  la transaccion...
		em.getTransaction().begin(); 
		Query consulta=em.createQuery("select u from TblUsuario u where u.usuario=:x and u.password=:y",TblUsuario.class); //u alias para TblUsuario clase model
		//pasamos los parametros
		consulta.setParameter("x", tblusu.getUsuario());
		consulta.setParameter("y", tblusu.getPassword());
		String mensaje="";
		TblUsuario u;
		try{
			u=(TblUsuario) consulta.getSingleResult();
			mensaje="existe";
			
		}catch(Exception ex){
			u=null;
			mensaje="noexiste";
			
		}
		
		return mensaje;
	}//Fin del metodo Validar...
	

	

}// fin de la clase ClassCrudUsuario

