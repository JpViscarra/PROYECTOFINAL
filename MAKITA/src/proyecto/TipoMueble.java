package proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoMueble {
	   private int IdTipoMueble;
       private String Nombre;
       private String Descripcion;
       private LeerConsola leerConsola;

	public TipoMueble()
	{
		IdTipoMueble=0;
       Nombre="";
       Descripcion="";
       leerConsola= new LeerConsola();
	}
