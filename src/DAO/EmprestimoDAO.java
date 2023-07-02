package DAO;

import Model.Emprestimo;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;



public class EmprestimoDAO {
    
    public static ArrayList<Emprestimo> MinhaListae = new ArrayList<Emprestimo>();

    public EmprestimoDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorIDEmprestimo = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_emprestimo) id_emprestimo FROM tb_emprestimo");
            res.next();
            maiorIDEmprestimo = res.getInt("id_emprestimo");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorIDEmprestimo;
    }

    public Connection getConexao() {

        Connection connection = null;  //instancia da conexao

        try {

            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexao
            String server = "localhost"; //caminho do MySQL
            String database = "db_ferramentas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "admin";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    public ArrayList getMinhaListae() {

        MinhaListae.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo");
            while (res.next()) {

                int idEmprestimo = res.getInt("id_emprestimo");
                int idCliente = res.getInt("id_cliente");
                int idFerramenta = res.getInt("id_ferramenta");
                String dataEmprestimo = res.getString("data_emprestimo");
                String dataDevolucao = res.getString("data_devolucao");

                Emprestimo objeto = new Emprestimo(idEmprestimo, idCliente, idFerramenta, dataEmprestimo, dataDevolucao);

                MinhaListae.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaListae;
    }

    public boolean InsertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimo(id_emprestimo,id_cliente,id_ferramenta,data_emprestimo,data_devolucao) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId_Emprestimo());
            stmt.setInt(2, objeto.getIdCliente());
            stmt.setInt(3, objeto.getIdFerramenta());
            stmt.setString(4, objeto.getDataEmprestimo());
            stmt.setString(5, objeto.getDataDevolucao());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public boolean DeleteEmprestimoBD(int id_Emprestimo) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimo WHERE id_emprestimo = " + id_Emprestimo);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    //d_emprestimo, id_cliente, id_ferramenta, data_emprestimo, data_devolucao
    public boolean UpdateEmprestimoBD(Emprestimo objeto) {

        String sql = "UPDATE tb_emprestimo set id_cliente = ?,id_ferramenta = ?,data_emprestimo = ?,data_devolucao = ? WHERE id_emprestimo = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getIdCliente());
            stmt.setInt(2, objeto.getIdFerramenta());
            
//            java.util.String utilString = new java.util.String();
//            java.sql.String sqlString = new java.sql.String(utilString.getTime());
            
            stmt.setString(3, objeto.getDataEmprestimo());
            stmt.setString(4, objeto.getDataDevolucao());
            stmt.setInt(5, objeto.getId_Emprestimo());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Emprestimo carregaEmprestimo(int id) {

        Emprestimo objeto = new Emprestimo();
        objeto.setId_Emprestimo(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimo WHERE id_emprestimo = " + id);
            res.next();

            objeto.setId_Emprestimo(res.getInt("id_emprestimo"));
            objeto.setIdCliente(res.getInt("id_cliente"));
            objeto.setIdFerramenta(res.getInt("id_ferramenta"));
            objeto.setDataEmprestimo(res.getString("data_emprestimo"));
            objeto.setDataDevolucao(res.getString("data_devolucao"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
}

