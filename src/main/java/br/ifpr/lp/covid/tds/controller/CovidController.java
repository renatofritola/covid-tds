/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.controller;

import br.ifpr.lp.covid.tds.view.DadosCovid;
import br.ifpr.lp.covid.tds.model.DadosPais;
import br.ifpr.lp.covid.tds.service.CovidService;

/**
 *
 * @author Renato
 */
public class CovidController {
    
    CovidService covidService = new CovidService();
    
    public DadosPais getDadosBrasil(){
    
        return covidService.getDadosCovidBrasil();
        
    }
    
}
