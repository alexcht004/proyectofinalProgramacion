package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class controlBaseDeDatos extends Conexion {

    public boolean registrarProducto(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO productos (codigo, nombre, precio , cantidad) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean modificarProducto(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE productos SET nombre=?, precio=?, cantidad=? WHERE codigo=? ";
        //String sql = "UPDATE productos SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, pro.getCodigo());
            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getCantidad());
            //ps.setInt(4, pro.getId());
            ps.setString(4, pro.getCodigo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminarProducto(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM productos WHERE codigo=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean buscarProducto(Producto pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM productos WHERE codigo=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               ///////////pro.setId( Integer.parseInt(rs.getString("id")));
               pro.setCodigo(rs.getString("codigo"));
               pro.setNombre(rs.getString("nombre"));
               pro.setPrecio(Double.parseDouble(rs.getString("precio")));
               pro.setCantidad(Integer.parseInt(rs.getString("cantidad")));
               return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean registrarCliente(Cliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO clientes (codigo, nombre,domicilio, rfc , telefono) VALUES(?,?,?,?,?)";

        try {
           ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCodigo());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getDomicilio());
            ps.setString(4, cli.getRfc());
            ps.setString(5, cli.getTelefono());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean modificarCliente(Cliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE clientes SET nombre=?,domicilio=?, rfc=?, telefono=? WHERE codigo=? ";

        try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, cli.getCodigo());
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getDomicilio());
            ps.setString(3, cli.getRfc());
            ps.setString(4, cli.getTelefono());
            ps.setString(5,cli.getCodigo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminarCliente(Cliente cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM clientes WHERE codigo=? ";
          
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,cli.getCodigo());
            //ps.setInt(1, cli.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
           
    
    }
    //////////////////////////////////////////////////////////////////////////
    public boolean buscarCliente(Cliente cli) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM clientes WHERE codigo=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCodigo());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               //cli.setId( Integer.parseInt(rs.getString("id")));
               cli.setCodigo(rs.getString("codigo"));
               cli.setNombre(rs.getString("nombre"));
               cli.setDomicilio(rs.getString("domicilio"));
               cli.setRfc(rs.getString("rfc"));
               cli.setTelefono(rs.getString("telefono"));
               return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    

    public boolean registrarEmpleado(Empleados em) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO empleados (nss, nombre,domicilio ,fecha_ingreso ,fecha_nacimiento, telefono) VALUES(?,?,?,?,?,?)";

        try {
           ps = con.prepareStatement(sql);
            ps.setString(1, em.getNss());
            ps.setString(2,em.getNombre());
            ps.setString(3, em.getDomicilio());
            ps.setString(4, em.getFechaIngreso());
            ps.setString(5, em.getFechaNacimiento());
            ps.setString(6, em.getTelefono());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean modificarEmpleado(Empleados em) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE empleados SET nss=?, domicilio=?, fecha_ingreso=?,fecha_nacimiento=?, telefono=? WHERE nombre=? ";
        //String sql = "UPDATE empleados SET nss=?, nombre=?,domicilio=?, fecha_ingreso=?,fecha_nacimiento=?, telefono=? WHERE id=? ";
        try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, em.getNss());
            ps.setString(1, em.getNss());
            //ps.setString(1, em.getNombre());
            ps.setString(2, em.getDomicilio());
            ps.setString(3, em.getFechaIngreso());
            ps.setString(4, em.getFechaNacimiento());
            ps.setString(5, em.getTelefono());
            ps.setString(6, em.getNombre());
            //ps.setInt(7, em.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminarEmpleado(Empleados em) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        //String sql = "DELETE FROM empleados WHERE nombre=? ";
        String sql = "DELETE FROM empleados WHERE nss=? ";
        try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, em.getNombre());
            ps.setString(1, em.getNss());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean buscarEmpleado(Empleados em) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        //String sql = "SELECT * FROM empleados WHERE nombre=? ";
        String sql = "SELECT * FROM empleados WHERE nss=? ";
        try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, em.getNombre());
            ps.setString(1, em.getNss());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               //em.setId( Integer.parseInt(rs.getString("id")));
              //em.setNombre(rs.getString("nombre"));

               em.setNss(rs.getString("nss"));
               em.setNombre(rs.getString("nombre"));
               em.setDomicilio(rs.getString("domicilio"));
               em.setFechaIngreso(rs.getString("fecha_ingreso"));
               em.setFechaNacimiento(rs.getString("fecha_nacimiento"));
               em.setTelefono(rs.getString("telefono"));
               return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    } 

 
     public boolean registrarCitas(Citas ci) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO citas (descripcion, fecha, hora , tipo) VALUES(?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ci.getDescripcion());
            ps.setString(2, ci.getFecha());
            ps.setString(3, ci.getHora());
            ps.setString(4, ci.getTipo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean modificarCita(Citas ci) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        //String sql = "UPDATE citas SET descripcion=?, fecha=?,hora=?,  tipo=? WHERE id=? ";
        String sql = "UPDATE citas SET  fecha=?,hora=?,  tipo=? WHERE descripcion=? ";
         try {
            ps = con.prepareStatement(sql);
            //ps.setString(1, ci.getDescripcion());
            ps.setString(1, ci.getFecha());
            ps.setString(2, ci.getHora());
            ps.setString(3, ci.getTipo());
            ps.setString(4, ci.getDescripcion());
            ps.execute();
            return true;
/*
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ci.getDescripcion());
            ps.setString(2, ci.getFecha());
            ps.setString(3, ci.getHora());
            ps.setString(4, ci.getTipo());
            ps.setInt(5, ci.getId());
            ps.execute();
            return true;*/
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminarCita(Citas ci) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM citas WHERE hora=? AND fecha=?";
        //String sql = "DELETE FROM citas WHERE hora=? AND fecha=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ci.getHora());
             ps.setString(2, ci.getFecha());
          
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    ///////////////////////////////
//////////////////////////////////////////
    public boolean buscarCitas(Citas ci) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        System.out.println("prueba");
        String sql = "SELECT * FROM citas WHERE descripcion=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ci.getDescripcion());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
              // ci.setId( Integer.parseInt(rs.getString("id")));
               //ci.setFecha(rs.getString("fecha"));
               ci.setDescripcion(rs.getString("descripcion"));
               ci.setFecha(rs.getString("fecha"));
               ci.setHora(rs.getString("hora"));
               ci.setTipo(rs.getString("tipo"));
             
               return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }



}

