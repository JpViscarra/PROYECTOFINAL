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
