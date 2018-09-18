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

	public TipoMueble(int IdTipoMueble, String Nombre, String Descripcion )
   {
       this.IdTipoMueble=IdTipoMueble;
       this.Nombre=Nombre;
       this.Descripcion=Descripcion;
   }

	public TipoMueble(int codigo, OperacionesSQL operacionesSQL) throws SQLException
	{
		leerConsola = new LeerConsola();

		//miSQL.abrir();

		String query = "SELECT *  ";
		query +=       "FROM   tipomuebles ";
		query +=       "WHERE  IdTipoMueble = " + codigo;

		ResultSet rs = operacionesSQL.selectSQL(query);

		if (rs.next())
		{
			this.IdTipoMueble = rs.getInt(1);
			this.Nombre = rs.getString(2);
			this.Descripcion = rs.getString(3);
			
		}
		else
		{
			this.IdTipoMueble = 0;
			this.Nombre="";
           this.Descripcion="";
		}

		operacionesSQL.cerrar();
