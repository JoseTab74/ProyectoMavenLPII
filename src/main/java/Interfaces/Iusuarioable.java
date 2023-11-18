package Interfaces;

import java.util.List;

import model.TblUsuario;
import model.TblAuto;

public interface Iusuarioable {
	 //declaramos los metodos
	public void RegistrarUsuario(TblUsuario tblusu);
	public void ActualizarUsuario(TblUsuario tblusu);
	public void EliminarUsuario(TblUsuario tblusu);
	public List<TblUsuario> ListarUsaurio();
	public  TblUsuario BuscarUsuario (TblUsuario tblusu);
	public String ValidarUsuario(TblUsuario tblusu);

}
