package Model;

import java.sql.SQLException;
import java.util.ArrayList;
import DAO.ClienteDAO;

public class Cliente {

    private int id;
    private String nome;
    private int telefone;
    private String email;
    private final ClienteDAO dao;

    public Cliente() {
        this.dao = new ClienteDAO();
    }

    public Cliente(int id, String nome, int telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dao = new ClienteDAO();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Telefone: " + this.getTelefone()
                + "\n Email: " + this.getEmail();
    }

    public ArrayList getMinhaListac() {
        //return AlunoDAO.MinhaLista;
        return dao.getMinhaListac();
    }

    public boolean UpdateClienteBD(int id, String nome, int telefone, String email) {
        Cliente objeto = new Cliente(id, nome, telefone, email);
        
        dao.UpdateClienteBD(objeto);
        return true;
    }

    public boolean InsertClienteBD(String nome, int telefone, String email) throws SQLException {
        int id = this.maiorID() + 1;
        Cliente objeto = new Cliente(id, nome, telefone, email);
//        AlunoDAO.MinhaLista.add(objeto);
        dao.InsertClienteBD(objeto);
        return true;

    }
    
    public boolean DeleteClienteBD(int id) {
//        int indice = this.procuraIndice(id);
//        AlunoDAO.MinhaLista.remove(indice);
        dao.DeleteClienteBD(id);
        return true;
    }
    
    private int maiorID() throws SQLException {
//    public int maiorID(){
//        return ClientaDAO.maiorID();
        return dao.maiorID();
    }
}
