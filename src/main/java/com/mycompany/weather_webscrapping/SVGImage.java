/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.weather_webscrapping;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JLabel;

/**
 *
 * @author pinar
 */
public class SVGImage extends JLabel{
    private FlatSVGIcon svgIcon;
    //Veri çektiğimiz sitedeki resimleri dönüştürmek için kullanılan sınıf
    public void setSvgImage(String url){
        try{
            URL imageUrl = new URL(url);
            
            svgIcon = new FlatSVGIcon(imageUrl);
            setIcon(svgIcon);
        }catch(MalformedURLException ex){
            System.out.println("URL Yanlış");
        }
    }
}
