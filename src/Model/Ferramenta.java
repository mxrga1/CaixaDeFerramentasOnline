package Model;

import java.sql.SQLException;
import java.util.ArrayList;
import DAO.FerramentaDAO;

public class Ferramenta {

    private int id_ferramenta;
    private String nome;
    private String marca;
    private double custo;
    private final FerramentaDAO dao;

    public Ferramenta() {
        this.dao = new FerramentaDAO();
    }

    public Ferramenta(int id_ferramenta, String nome, String marca, double custo) {
        this.id_ferramenta = id_ferramenta;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.dao = new FerramentaDAO();
    }

    public int getId_ferramenta() {
        return id_ferramenta;
    }

    public void setId_ferramenta(int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId_ferramenta()
                + "\n Nome: " + this.getNome()
                + "\n Marca: " + this.getMarca()
                + "\n Custo: " + this.getCusto();
    }

    public ArrayList getMinhaListaf() {
        //return AlunoDAO.MinhaLista;
        return dao.getMinhaListaf();
    }

    public boolean UpdateFerramentaBD(int id_ferramenta, String nome, String marca, double custo) {
        Ferramenta objeto = new Ferramenta(id_ferramenta, nome, marca, custo);
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.set(indice, objeto);
        dao.UpdateFerramentaBD(objeto);
        return true;
    }

    public boolean InsertFerramentaBD(String nome, String marca, Double custo) throws SQLException {
        int id = this.maiorIDFerramenta() + 1;
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
//        AlunoDAO.MinhaLista.add(objeto);
        dao.InsertFerramentaBD(objeto);
        return true;
    }
    
    private int maiorIDFerramenta() throws SQLException{
//    public int maiorID(){
//        return FerramentaDAO.maiorID();
        return dao.maiorIDFerramenta();
    }
    
    public boolean DeleteFerramentaBD(int id) {
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.remove(indice);
        dao.DeleteFerramentaBD(id);
        return true;
    }
}
