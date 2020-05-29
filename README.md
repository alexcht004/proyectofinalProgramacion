# proyectofinalProgramacion
# Modelo
## citas
En esta parte lo que hacemos es crear la clase cita, esta formada por los atributos.

public class Citas {
    private int id;
    private String descripcion,fecha;
    private String hora;
    private String tipo;

a continuación hacemos los constructores  de  cada atributo.

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
…………………………………………….

## CONEXIÓN
En esta parte, conectamos nuesta apicacion con la base de datos de PHPMYADMIN.

public class Conexion {
    ////////////// cON ESTO  CONECTAMOS LA APLICACION CON NUESTRA BASE DE DATOS
    
    private static final String base = "personas";
    private static final String user = "root";
    private static final String password = "manolo";
    private static final String url = "jdbc:mysql://localhost:3307/" + base+"?autoReconnect=true&useSSL=false";
    private static Connection con = null;
    
## control Base De Datos.
En esta parte asignamos a las opciones las cualidades de integrar, modifiar y eliminar  datos en la base de datos.


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
