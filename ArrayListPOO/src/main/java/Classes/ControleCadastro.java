/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

public class ControleCadastro {

    private ArrayList<Funcionario> ListaFuncionarios = new ArrayList<>();

    public boolean salvar(Funcionario f) {
        if (f != null) {
            ListaFuncionarios.add(f);
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Funcionario> retornarTodos(){
        return ListaFuncionarios;
    }
}
