/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc146.analisadorstring.controller;

import ufjf.dcc146.analisadorstring.model.Tags;

/**
 *
 * @author brysa
 */
public class FormatoTag {
    private String tag;
    
    public FormatoTag(String tag)
    {
        this.tag = tag.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public void ehValido() throws Exception {
            String [] dados = tag.split(":");
            if(dados[0].contains(" ") || dados[1].charAt(0) != ' ')
            {
               throw new RuntimeException("Atente-se ao formato solicitado");                
            }
            
    }
}
