/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.lp.covid.tds.service;

import br.ifpr.lp.covid.tds.model.DadosPais;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Renato
 */
public class CovidService {

    private static final String URL_API = "https://api.covid19api.com/summary";

    public DadosPais getDadosCovidBrasil() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        
        HttpURLConnection con = null;
        
        DadosPais dados = new DadosPais();
        
        try {
            URL url = new URL(URL_API);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();

            switch (con.getResponseCode()) {
                case 200:
                    System.out.println("JSON recebido!");
                    String json = getJson(url);

                    JsonParser parser = new JsonParser();
                    JsonObject obj = (JsonObject) parser.parse(json);

                    Set<Entry<String, JsonElement>> el = obj.entrySet();
                    
                    JsonArray paises = obj.getAsJsonArray("Countries");
                    
                    
                    for(JsonElement value : paises){
                        if (value.getAsJsonObject().get("Country").getAsString().equalsIgnoreCase("Brazil")){
                            
                            dados.setPais(value.getAsJsonObject().get("Country").getAsString());
                            dados.setNovasMortes(value.getAsJsonObject().get("NewDeaths").getAsLong());
                            dados.setNovosCasos(value.getAsJsonObject().get("NewConfirmed").getAsLong());
                            dados.setNovosRecuperados(value.getAsJsonObject().get("NewRecovered").getAsLong());
                            dados.setTotalRecuperados(value.getAsJsonObject().get("TotalRecovered").getAsLong());
                            dados.setTotalDeCasos(value.getAsJsonObject().get("TotalConfirmed").getAsLong());
                            dados.setTotalMorte(value.getAsJsonObject().get("TotalDeaths").getAsLong());
                            dados.setDataAtualizacao(sdf.parse(value.getAsJsonObject().get("Date").getAsString()));
                        }
                        
                    }   
                    
                    System.out.println("Brasil: "+dados.toString());
                    
                    break;
                    
                case 500:
                    System.out.println("Status 500");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
        
        return dados;
    }

    public static String getJson(URL url) {
        if (url == null) {
            throw new RuntimeException("URL é null");
        }

        String html = null;
        StringBuilder sB = new StringBuilder();
        try (BufferedReader bR = new BufferedReader(new InputStreamReader(url.openStream()))) {
            while ((html = bR.readLine()) != null) {
                sB.append(html);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sB.toString();
    }
}
