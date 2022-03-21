/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.weather_webscrapping;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JLabel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 *
 * @author pinar
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        //Şehirleri string içerisinde tutuyoruz.
        String[] sehirler ={"Adana","Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin",
            "Aydın", "Balıkesir","Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
            "Çankırı", "Çorum","Denizli","Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum ", "Eskişehir",
            "Gaziantep", "Giresun","Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir",
            "Kars", "Kastamonu", "Kayseri","Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya ", "Malatya",
            "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya",
            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon  ", "Tunceli", "Şanlıurfa", "Uşak",
            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt ", "Karaman", "Kırıkkale", "Batman", "Şırnak",
            "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük ", "Kilis", "Osmaniye ", "Düzce"};
        
        //Panele tablo şeklinde kullanak için satır ve sütun görevini gören layaout yapıyı oluşturduk.
        GridLayout lyt = new GridLayout(0,4); //paneli bölmek için grid oluşturduk.
        pnl_result.setLayout(lyt);
        
        //Combobox içine sehirler dizisini ekledik.
        DefaultComboBoxModel<String> model = new
        DefaultComboBoxModel<>(sehirler);
        cmb_states.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_result = new javax.swing.JPanel();
        btn_get = new javax.swing.JButton();
        cmb_states = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnl_resultLayout = new javax.swing.GroupLayout(pnl_result);
        pnl_result.setLayout(pnl_resultLayout);
        pnl_resultLayout.setHorizontalGroup(
            pnl_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        pnl_resultLayout.setVerticalGroup(
            pnl_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        btn_get.setText("Getir");
        btn_get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_get, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_states, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_get)
                    .addComponent(cmb_states, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getActionPerformed
       //farklı bir şehir seçtiğimiz zaman önceki bilgileri kaldırıp görüntülüyor.
        if(pnl_result.getComponents().length != 0){
            Component[] lst = pnl_result.getComponents();
            for(Component elm : lst){
                pnl_result.remove(elm);
            }
        }
          //başlıklar oluşturuluyor ve jpanele ekleniyor.
        String[] labelsTexts = {"Tarih" , "Durum" , "°C(min)" , "°C(max)"};
        
        JLabel[] labels = new JLabel[labelsTexts.length];
        Font font = new Font("Arial" , Font.BOLD , 24);   
        
        for(int i = 0 ; i<labels.length ; i++){
            labels[i] = new JLabel(labelsTexts[i] , JLabel.CENTER);
            labels[i].setFont(font);
            pnl_result.add(labels[i]);
        }
        
        //üst üste gelmemesi için her çalıştırdığımızda yenileniyor.
        pnl_result.revalidate();
        
        //verileri çektiğimiz sitenin urlsi
        String url = "https://www.mgm.gov.tr/tahmin/il-ve-ilceler.aspx?il=" 
                + cmb_states.getSelectedItem().toString();
        
        //Gecko bir web taracıyıdır.Geckodriver ise Firefox tarayıcısına bağlantıyı sağlar.Selenium kullandığımız için Geckodrivera ihtiyacımız vardır.
        System.setProperty("webdriver.gecko.driver","C:\\Users\\pinar\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        FirefoxOptions opt = new FirefoxOptions();
        opt.addArguments("--headless");
        WebDriver driver = new FirefoxDriver(opt);
        driver.get(url);
        
        //verileri çektiğimiz sitenin koduna bakarak yönlendirme yapıyoruz.
        WebElement selectElement = driver.findElement(By.id("_4_5gunluk"));
        List<WebElement> selectedColumns = selectElement.findElements(By.tagName("td"));
        
        //Tabloyu oluşturan kodlar durum/°Cminmax/tarih
        for(int i = 0; i < 60; i+=12){
            JLabel lbl_tarih = new JLabel();
            lbl_tarih.setText(selectedColumns.get(i).getText());
            pnl_result.add(lbl_tarih);
            
            String imgPath = selectedColumns.get(i + 1).findElement(By.tagName("img")).getAttribute("src");
            SVGImage img_hadise = new SVGImage();
            img_hadise.setSvgImage(imgPath);
            pnl_result.add(img_hadise);
            
            JLabel lbl_min = new JLabel();
            lbl_min.setText(selectedColumns.get(i + 2).getText());
            pnl_result.add(lbl_min);
            
            JLabel lbl_max = new JLabel();
            lbl_max.setText(selectedColumns.get(i + 3).getText());
            pnl_result.add(lbl_max);
            
        }
    }//GEN-LAST:event_btn_getActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_get;
    private javax.swing.JComboBox<String> cmb_states;
    private javax.swing.JPanel pnl_result;
    // End of variables declaration//GEN-END:variables
}
