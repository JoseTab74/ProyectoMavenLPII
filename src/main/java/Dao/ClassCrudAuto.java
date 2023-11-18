package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iautoable;
import model.TblAuto;

public class ClassCrudAuto implements Iautoable {

	@Override
	public void RegistrarAuto(TblAuto tblauto) {
		// establecer conexion con la unidad de 
        // persistencia
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENDOS");
	    EntityManager em=fabri.createEntityManager();
		
		// iniciamos la transaccion
		em.getTransaction().begin();
		
		// registramos
		em.persist(tblauto);
		//Confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
		
	}// Fin del metodo Registrar

	@Override
	public void ActualizarAuto(TblAuto tblauto) {
		// establecer conexion con la unidad de 
        // persistencia
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENDOS");
	    EntityManager em=fabri.createEntityManager();
		
		// iniciamos la transaccion
		em.getTransaction().begin();
		
		// actualizar
		em.merge(tblauto);
		//Confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}// Fin del metodo Actualizar

	@Override
	public void EliminarAuto(TblAuto tblauto) {
		// establecer conexion con la unidad de 
        // persistencia
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENDOS");
	    EntityManager em=fabri.createEntityManager();
		
		// iniciamos la transaccion
		em.getTransaction().begin();
		
		// Recuperampos el codigo a eliminar
		TblAuto elim=em.merge(tblauto);
		//Eliminamos
		em.remove(elim);
		//Confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}// Fin del metodo Eliminar

	@Override
	public List<TblAuto> ListarAuto() {
		// establecer conexion con la unidad de 
        // persistencia
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENDOS");
	    EntityManager em=fabri.createEntityManager();
		
		// iniciamos la transaccion
		em.getTransaction().begin();
		
		// LISTAR
		List<TblAuto> listar = em.createQuery("select a from TblAuto a ", TblAuto.class).getResultList();

		//Confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		return listar;
	} // Fin del metodo Listar Auto

	@Override
	public TblAuto BuscarAuto(TblAuto tblauto) {
		// establecer conexion con la unidad de 
        // persistencia
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoLPIIMAVENDOS");
	    EntityManager em=fabri.createEntityManager();
		
		// iniciamos la transaccion
		em.getTransaction().begin();
		//Buscar por codigo
		TblAuto buscar=em.find(TblAuto.class, tblauto.getIdauto());
		//Confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		return buscar;
	}// Fin del metodo Buscar
	
	

} // fin de la colasse CruAuto
