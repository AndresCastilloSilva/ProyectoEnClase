/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.PreparedStatement;
import java.util.List;
import modelo.dto.UsuarioDTO;
import modelo.interfaces.Obligacion;
import conexion.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ANDRES
 */
public class UsuarioDAO implements Obligacion<UsuarioDTO> {

    private static final ConexionMySQL con = ConexionMySQL.getInstance();

    private static final String VALIDAR_US = "SELECT * FROM tb_usuario WHERE correo = ? AND clave = ? ";

    @Override
    public boolean create(UsuarioDTO nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UsuarioDTO> readALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDTO read(UsuarioDTO filter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(UsuarioDTO item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(UsuarioDTO item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsuarioDTO valSesion(UsuarioDTO item) throws SQLException {

        UsuarioDTO nn = null;
        PreparedStatement ps;
        try {
            ps = con.getCnn().prepareStatement(VALIDAR_US);
            ps.setString(1, item.getCorreo());
            ps.setString(2, item.getClave());
            ResultSet rs = null;
            rs = ps.executeQuery();
            if (rs.next()) {
                nn = new UsuarioDTO(
                        rs.getInt("id"),
                        rs.getString("nombre1"),
                        rs.getString("nombre2"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("n_identificacion"),
                        rs.getString("correo")
                );
            
             }
        } catch(SQLException ex){
                System.out.println("eroor al validar usuario: "+ ex.getMessage());
                } finally {
                        con.cerrarConexion();
                        }

            return nn;

       

    }}

