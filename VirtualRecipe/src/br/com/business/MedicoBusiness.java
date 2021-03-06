/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.MedicoInterface;
import br.com.virtualrecipe.dominio.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class MedicoBusiness implements MedicoInterface {

    @Override
    public Medico cadastrarMedico(Medico medico) {
        BancoDeDados.medicoBDFake.add(medico);
        return medico;
    }

    @Override
    public Medico buscarMedico(Integer crm) {
        for (Medico medico: BancoDeDados.medicoBDFake){
            if(medico.getCrm() == crm){
                return medico;
            }
        }return null;
    }

    @Override
    public List<Medico> buscarFarmaceuticoPorNome(String nome) {
        List<Medico> listaDeMedicoEncontrados = new ArrayList<Medico>();        
        
        for(int i = 0; i< BancoDeDados.medicoBDFake.size();i++){
            Medico medico = BancoDeDados.medicoBDFake.get(i);
            if(medico.getNomeMedico().startsWith(nome)){
                listaDeMedicoEncontrados.add(medico);
            }           
        }
        return listaDeMedicoEncontrados;
    }

    @Override
    public List<Medico> buscarTodosMedicos() {
        return BancoDeDados.medicoBDFake;
    }
  
        
}
