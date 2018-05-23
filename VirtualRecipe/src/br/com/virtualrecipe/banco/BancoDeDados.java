/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.virtualrecipe.banco;

import br.com.virtualrecipe.dominio.Consultorio;
import br.com.virtualrecipe.dominio.Endereco;
import br.com.virtualrecipe.dominio.Farmaceutico;
import br.com.virtualrecipe.dominio.Laboratorio;
import br.com.virtualrecipe.dominio.Medico;
import br.com.virtualrecipe.dominio.Paciente;
import br.com.virtualrecipe.dominio.PacienteExames;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author melis_000
 */
public class BancoDeDados {
    public static List<Farmaceutico> farmaceuticoBDFake =  new LinkedList<Farmaceutico>();
    public static List<Medico> medicoBDFake =  new LinkedList<Medico>();
    public static List<Paciente> pacienteBDFake =  new LinkedList<Paciente>();
    public static LinkedList<Paciente> pacienteReceitasBDFake =  new LinkedList<Paciente>();
    public static LinkedList<Paciente> pacienteExamesBDFake =  new LinkedList<Paciente>();
    public static List<Laboratorio> laboratoriBDFake =  new LinkedList<Laboratorio>();
    public static List<Consultorio> consultorioBDFake =  new LinkedList<Consultorio>();
    public static List<Endereco> enderecoBDFake =  new LinkedList<Endereco>();
}
