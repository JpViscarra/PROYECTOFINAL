package proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Venta {
	 private int IdVenta;
     private String Fecha;
     private int MontoTotal ;
     private int IdCliente ;
     private int IdEmpleado ;
     private LeerConsola leerConsola;

	public Venta()
	{
		IdVenta=0;
     Fecha="";
     MontoTotal =0;
     IdCliente =0;
     IdEmpleado =0;
     leerConsola= new LeerConsola();
	}

	public Venta(int IdVenta, String Fecha, int MontoTotal , int IdCliente  , int IdEmpleado  )
 {
     this.IdVenta=IdVenta;
     this.Fecha=Fecha;
     this.MontoTotal =MontoTotal ;
     this.IdCliente =IdCliente ;
     this.IdEmpleado =IdEmpleado ;
 }

	public Venta(int codigo, OperacionesSQL operacionesSQL) throws SQLException
	{
		leerConsola = new LeerConsola();

		String  query = "SELECT *  ";
		query +=       "FROM   Ventas ";
		query +=       "WHERE  IdVenta = " + codigo;

		ResultSet rs = operacionesSQL.selectSQL(query);
