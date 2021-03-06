/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.business;

import br.com.virtualrecipe.banco.BancoDeDados;
import br.com.virtualrecipe.business.interfaces.FarmaceuticoInterface;
import br.com.virtualrecipe.dominio.Farmaceutico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class FarmaceuticoBusiness implements FarmaceuticoInterface{

    @Override
    public Farmaceutico cadastrarFarmaceutico(Farmaceutico farmaceutico) {
     BancoDeDados.farmaceuticoBDFake.add(farmaceutico);
        return farmaceutico;   
    }

    @Override
    public Farmaceutico buscarFarmaceutico(Integer crf) {
         for (Farmaceutico farmaceutico: BancoDeDados.farmaceuticoBDFake){
            if(farmaceutico.getCrf() == crf){
                return farmaceutico;
            }
        }return null;
    }

    @Override
    public List<Farmaceutico> buscarFarmaceuticoPorNome(String nome) {
            List<Farmaceutico> listaDeFarmaceuticoEncontrados = new ArrayList<Farmaceutico>();        
        
        for(int i = 0; i< BancoDeDados.farmaceuticoBDFake.size();i++){
            Farmaceutico farmaceutico = BancoDeDados.farmaceuticoBDFake.get(i);
            if(farmaceutico.getNomeFarmaceutico().startsWith(nome)){
                listaDeFarmaceuticoEncontrados.add(farmaceutico);
            }           
        }
        return listaDeFarmaceuticoEncontrados;
    }



    @Override
    public List<Farmaceutico> buscarTodosFarmaceuticos() {
      return BancoDeDados.farmaceuticoBDFake;
    }    
    
}