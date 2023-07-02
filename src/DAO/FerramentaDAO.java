package DAO;

import Model.Ferramenta;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FerramentaDAO {

    public static ArrayList<Ferramenta> MinhaListaf = new ArrayList<Ferramenta>();

    public FerramentaDAO() {
    }

    public int maiorIDFerramenta() throws SQLException {

        int maiorIDFerramenta = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_ferramenta) id_ferramenta FROM tb_ferramenta");
            res.next();
            maiorIDFerramenta = res.getInt("id_ferramenta");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorIDFerramenta;
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
            System.out.println("Não foi possivel conectar...");
            return null;
        }
    }

    public ArrayList getMinhaListaf() {

        MinhaListaf.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramenta");
            while (res.next()) {

                int id = res.getInt("id_ferramenta");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custo = res.getDouble("custo_da_ferramenta");

                Ferramenta objeto = new Ferramenta(id, nome, marca, custo);

                MinhaListaf.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MinhaListaf;
    }

    public boolean InsertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramenta(id_ferramenta,nome,marca,custo_da_ferramenta) VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId_ferramenta());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getCusto());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public boolean DeleteFerramentaBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferramenta WHERE id_ferramenta = " + id);
            stmt.close();

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateFerramentaBD(Ferramenta objeto) {

        String sql = "UPDATE tb_ferramenta set nome = ?,marca = ?,custo_da_ferramenta = ? WHERE id_ferramenta = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getCusto());
            stmt.setInt(4, objeto.getId_ferramenta());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Ferramenta carregaFerramenta(int id) {

        Ferramenta objeto = new Ferramenta();
        objeto.setId_ferramenta(id);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramenta WHERE id_ferramenta = " + id);
            res.next();

            objeto.setId_ferramenta(res.getInt("id_ferramenta"));
            objeto.setNome(res.getString("nome"));
            objeto.setMarca(res.getString("marca"));
            objeto.setCusto(res.getDouble("custo_da_ferramenta"));

            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
}
