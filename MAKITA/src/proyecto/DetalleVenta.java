package proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DetalleVenta {
	 private int IdDetalleVenta;
     private int IdVenta;
     private int IdMueble;
     private int Cantidad;
     private int PrecioVenta ;
     private LeerConsola leerConsola;

	public DetalleVenta()
	{
		IdDetalleVenta=0;
     IdVenta=0;
     IdMueble=0;
     Cantidad=0;
     PrecioVenta =0;
     leerConsola= new LeerConsola();
	}

	public DetalleVenta(int IdDetalleVenta, int IdVenta, int IdMueble, int Cantidad , int PrecioVenta  )
 {
     this.IdDetalleVenta=IdDetalleVenta;
     this.IdVenta=IdVenta;
     this.IdMueble=IdMueble;
     this.Cantidad=Cantidad;
     this.PrecioVenta =PrecioVenta ;
 }

	public DetalleVenta(int codigo, OperacionesSQL operacionesSQL) throws SQLException
	{
		leerConsola = new LeerConsola();

		

		String query = "SELECT *  ";
		query +=       "FROM   DetalleVenta ";
		query +=       "WHERE  IdDetalleVenta = " + codigo;

		ResultSet rs = operacionesSQL.selectSQL(query);

		if (rs.next())
		{
			this.IdDetalleVenta = rs.getInt(1);
			this.IdVenta = rs.getInt(2);
			this.IdMueble = rs.getInt(3);
			this.Cantidad = rs.getInt(4);
         this.PrecioVenta =rs.getInt(5);
			
		}
		else
		{
			this.IdDetalleVenta = 0;
			this.IdVenta=0;
         this.IdMueble=0;
         this.Cantidad=0;
         this.PrecioVenta =0;
		}

		operacionesSQL.cerrar();

	}
