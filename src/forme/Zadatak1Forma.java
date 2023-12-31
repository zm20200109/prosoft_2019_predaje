/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import controller.Controller;
import java.util.List;
import model.PoreskaStopa;
import model.Proizvod;
import model.Proizvodjac;

/**
 *
 * @author Acer
 */
public class Zadatak1Forma extends javax.swing.JFrame {

    /**
     * Creates new form Zadatak1Forma
     */
    private Proizvod izabraniProizvod; 
    public Zadatak1Forma() {
        initComponents();
        popuniProizvodima();
        popuniPoreskimStopama();
        popuniProizvodjacima();
        txtSifraProizvoda.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbProizvodi = new javax.swing.JComboBox<>();
        btnAzuriraj = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSifraProizvoda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNazivroizvoda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCena = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbPoreskaStopa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbProizvodjac = new javax.swing.JComboBox<>();
        btnSacuvajPromene = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Proizvodi");

        cbProizvodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProizvodiActionPerformed(evt);
            }
        });

        btnAzuriraj.setText("Azuriraj");
        btnAzuriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzurirajActionPerformed(evt);
            }
        });

        jLabel2.setText("SIfra");

        jLabel3.setText("Naziv");

        jLabel4.setText("Cena");

        jLabel5.setText("Poreska stopa: ");

        jLabel6.setText("Proizvodjac: ");

        btnSacuvajPromene.setText("Sacuvaj promene");
        btnSacuvajPromene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajPromeneActionPerformed(evt);
            }
        });

        jButton1.setText("Odustani");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnAzuriraj, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSifraProizvoda)
                                            .addComponent(txtNazivroizvoda)
                                            .addComponent(txtCena, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPoreskaStopa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbProizvodjac, 0, 331, Short.MAX_VALUE))))
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSacuvajPromene, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAzuriraj, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSifraProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNazivroizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbPoreskaStopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSacuvajPromene, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbProizvodjac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProizvodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProizvodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProizvodiActionPerformed

    private void btnAzurirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzurirajActionPerformed
        // TODO add your handling code here:
        izabraniProizvod= (Proizvod) cbProizvodi.getSelectedItem(); //zato sto getSelectedItem vraca Object
        txtSifraProizvoda.setText(String.valueOf(izabraniProizvod.getSifra()));
        txtNazivroizvoda.setText(izabraniProizvod.getNaziv());
        txtCena.setText(String.valueOf(izabraniProizvod.getCena()));
        cbPoreskaStopa.setSelectedItem(izabraniProizvod.getPs());
        cbProizvodjac.setSelectedItem(izabraniProizvod.getProizvodjac());
        
        
    }//GEN-LAST:event_btnAzurirajActionPerformed

    private void btnSacuvajPromeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajPromeneActionPerformed
        izabraniProizvod.setCena(Double.parseDouble(txtCena.getText()));
        izabraniProizvod.setNaziv(txtNazivroizvoda.getText());
        izabraniProizvod.setProizvodjac((Proizvodjac) cbProizvodjac.getSelectedItem());
        izabraniProizvod.setPs((PoreskaStopa) cbPoreskaStopa.getSelectedItem());
        System.out.println(izabraniProizvod);
    }//GEN-LAST:event_btnSacuvajPromeneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzuriraj;
    private javax.swing.JButton btnSacuvajPromene;
    private javax.swing.JComboBox<Object> cbPoreskaStopa;
    private javax.swing.JComboBox<Object> cbProizvodi;
    private javax.swing.JComboBox<Object> cbProizvodjac;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCena;
    private javax.swing.JTextField txtNazivroizvoda;
    private javax.swing.JTextField txtSifraProizvoda;
    // End of variables declaration//GEN-END:variables

    private void popuniProizvodima() {
        List<Proizvod> proizvodi = Controller.getInstance().getProizvodi();
        cbProizvodi.removeAllItems();
        for(Proizvod p: proizvodi){
            cbProizvodi.addItem(p);
        }
        
    }

    private void popuniPoreskimStopama() {
        List<PoreskaStopa> poreskeStope = Controller.getInstance().getPoreskeStope();
        cbPoreskaStopa.removeAllItems();
        for (PoreskaStopa ps: poreskeStope){
            cbPoreskaStopa.addItem(ps);
        
        }
    
    
    }

    private void popuniProizvodjacima() {
        cbProizvodjac.removeAllItems();
        List<Proizvodjac> proizvodjaci = Controller.getInstance().getProizvodjaci();
        for(Proizvodjac p: proizvodjaci){
            cbProizvodjac.addItem(p);
        }
    }
}
