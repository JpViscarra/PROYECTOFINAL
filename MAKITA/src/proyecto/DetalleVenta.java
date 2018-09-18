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
