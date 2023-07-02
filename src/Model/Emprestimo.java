package Model;

import java.sql.SQLException;
import java.util.ArrayList;
import DAO.EmprestimoDAO;

public class Emprestimo {

    private int id_Emprestimo;
    private int idCliente;
    private int idFerramenta;
    private String dataEmprestimo;
    private String dataDevolucao;
    private final EmprestimoDAO dao;    
    
    public Emprestimo() {
        this.dao = new EmprestimoDAO();
    }
    

    public Emprestimo(int idEmprestimo, int idCliente, int idFerramenta, String dataEmprestimo, String dataDevolucao) {
        this.id_Emprestimo = idEmprestimo;
        this.idCliente = idCliente;
        this.idFerramenta = idFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.dao = new EmprestimoDAO();
    }

    public int getId_Emprestimo() {
        return id_Emprestimo;
    }

    public void setId_Emprestimo(int id_Emprestimo) {
        this.id_Emprestimo = id_Emprestimo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
    @Override
    public String toString() {
        return "\n ID: " + this.getId_Emprestimo()
                + "\n IdCliente: " + this.getIdCliente()
                + "\n IdIdFerramenta: " + this.getIdFerramenta()
                + "\n DataEmprestimo: " + this.getDataEmprestimo()
                + "\n DataDevolucao: " + this.getDataDevolucao();
    }

    public ArrayList getMinhaListae() {
        //return AlunoDAO.MinhaLista;
        return dao.getMinhaListae();
    }

    public boolean UpdateEmprestimoBD(int id_Emprestimo, int idCliente, int idFerramenta, String dataEmprestimo, String dataDevolucao) {
        Emprestimo objeto= new Emprestimo(id_Emprestimo, idCliente, idFerramenta, dataEmprestimo, dataDevolucao);
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.set(indice, objeto);
        dao.UpdateEmprestimoBD(objeto);
        return true;
    }

    public boolean InsertEmprestimoBD(int idCliente, int idFerramenta, String dataEmprestimo, String dataDevolucao) throws SQLException {
        int id = this.maiorIDEmprestimo() + 1;
        Emprestimo objeto = new Emprestimo(id, idCliente, idFerramenta, dataEmprestimo, dataDevolucao);
//        AlunoDAO.MinhaLista.add(objeto);
        dao.InsertEmprestimoBD(objeto);
        return true;
    }
    
    private int maiorIDEmprestimo() throws SQLException{
//    public int maiorID(){
//        return FerramentaDAO.maiorID();
        return dao.maiorID();
    }
    
    public boolean DeleteEmprestimoBD(int id) {
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.remove(indice);
        dao.DeleteEmprestimoBD(id);
        return true;
    }
}




