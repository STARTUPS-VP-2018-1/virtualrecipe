/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.LaboratorioInterface;
import br.com.virtualrecipe.dominio.Laboratorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class LaboratorioBusiness implements LaboratorioInterface {

    @Override
    public Laboratorio cadastrarLaboratorio(Laboratorio laboratorio) {
        BancoDeDados.laboratoriBDFake.add(laboratorio);
        return laboratorio;
        
    }
   

    @Override
    public List<Laboratorio> buscarLaboratorioPorNome(String nome) {
        List<Laboratorio> listaDeLaboratorioEncontrados = new ArrayList<Laboratorio>();        
        
        for(int i = 0; i< BancoDeDados.laboratoriBDFake.size();i++){
            Laboratorio laboratorio = BancoDeDados.laboratoriBDFake.get(i);
            if(laboratorio.getNomeLab().startsWith(nome)){
                listaDeLaboratorioEncontrados.add(laboratorio);
            }           
        }
        return listaDeLaboratorioEncontrados;
    }


    @Override
    public List<Laboratorio> buscarLaboratorioPorTelefone(Integer telefone) {
          for (Laboratorio laboratorio: BancoDeDados.laboratoriBDFake){
            if(laboratorio.getTelefone1Lab()== telefone){
                return (List<Laboratorio>) laboratorio;
            }
        }return null;
    }

    @Override
    public List<Laboratorio> buscarTodosLaboratorios() {
        return BancoDeDados.laboratoriBDFake;
    }
    
    
}