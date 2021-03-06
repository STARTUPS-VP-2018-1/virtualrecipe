/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.PacienteInterface;
import br.com.virtualrecipe.dominio.Paciente;
import br.com.virtualrecipe.dominio.PacienteExames;
import br.com.virtualrecipe.dominio.PacienteReceitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class PacienteBusiness implements PacienteInterface {

    @Override
    public Paciente cadastrarPaciente(Paciente paciente) {
        BancoDeDados.pacienteBDFake.add(paciente);
      return paciente;
    }

    @Override
    public Paciente buscaPaciente(Integer cpf) {
        for (Paciente paciente: BancoDeDados.pacienteBDFake){
            if(paciente.getCpf() == cpf){
                return paciente;
            }
        }return null;
    }

    @Override
    public List<Paciente> buscarPacientePorNome(String nome) {
          List<Paciente> listaDePacienteEncontrados = new ArrayList<Paciente>();        
        
        for(int i = 0; i< BancoDeDados.pacienteBDFake.size();i++){
            Paciente paciente = BancoDeDados.pacienteBDFake.get(i);
            if(paciente.getNomePaciente().startsWith(nome)){
                listaDePacienteEncontrados.add(paciente);
            }           
        }
        return listaDePacienteEncontrados;
    }

    @Override
    public List<Paciente> buscarTodosPacientes() {
        return BancoDeDados.pacienteBDFake;
    }

    @Override
    public List<PacienteReceitas> buscarReceitaPaciente(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PacienteExames> buscarExamePaciente(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
