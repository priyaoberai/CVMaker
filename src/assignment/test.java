/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


import com.itextpdf.text.*;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;

import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import javax.swing.text.Segment;
//import com.itextpdf.text.*;

/**
 *
 * @author Dell
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test() {
        initComponents();
        this.setBounds(1, 1,1000,700);
        p1.setVisible(false);
        p2.setVisible(false);
       // p1.setBounds(200,10, 500,500);
        //p2.setBounds(200,10, 500,500);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jButton1.setText("Hobby");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(50, 50, 100, 30);

        jButton2.setText("education");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(50, 110, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 220, 380);

        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setLayout(null);

        jLabel1.setText("panel 2");
        p2.add(jLabel1);
        jLabel1.setBounds(160, 50, 130, 60);

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setLayout(null);

        jLabel2.setText("panel1");
        p1.add(jLabel2);
        jLabel2.setBounds(70, 60, 90, 40);

        p2.add(p1);
        p1.setBounds(0, -170, 560, 380);

        jPanel1.add(p2);
        p2.setBounds(270, 200, 490, 310);

        jButton3.setText("pdf");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 450, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 980, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
         p1.setBounds(200,10, 500,500);
        p2.setBounds(200,10, 500,500);
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.setVisible(true);
         p1.setBounds(200,10, 500,500);
        p2.setBounds(200,10, 500,500);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
        try{
            Document d = new Document();
            PdfWriter writer=PdfWriter.getInstance((com.itextpdf.text.Document) d,new FileOutputStream("C:\\Users\\Dell\\Desktop\\java PDF\\Motivation.pdf"));
            System.out.print("pdf Created");
            d.open();
            Paragraph p=new Paragraph("Ayushi Resume");
            p.setAlignment(Element.ALIGN_CENTER);
            d.add(p);
            p=new Paragraph("\n \n");
            d.add(p);
            p=new Paragraph("Resume Done");
            p.setAlignment(Element.ALIGN_LEFT);
            d.add(p);
            d.close();
            writer.close();
            
            
        }
        catch(FileNotFoundException e)
        {
            
        } catch (DocumentException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }


//     Document doc = new Document() {
//         @Override
//         public int getLength() {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void addDocumentListener(DocumentListener listener) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void removeDocumentListener(DocumentListener listener) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void addUndoableEditListener(UndoableEditListener listener) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void removeUndoableEditListener(UndoableEditListener listener) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public Object getProperty(Object key) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void putProperty(Object key, Object value) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void remove(int offs, int len) throws BadLocationException {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public String getText(int offset, int length) throws BadLocationException {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void getText(int offset, int length, Segment txt) throws BadLocationException {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public Position getStartPosition() {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public Position getEndPosition() {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public Position createPosition(int offs) throws BadLocationException {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public javax.swing.text.Element[] getRootElements() {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public javax.swing.text.Element getDefaultRootElement() {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//
//         @Override
//         public void render(Runnable r) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//         }
//     };  
//try  
//{  
////generate a PDF at the specified location  
//PdfWriter writer = PdfWriter.getInstance((com.itextpdf.text.Document) doc, new FileOutputStream("C:\\Users\\Dell\\Desktop\\java PDF\\Motivation.pdf"));  
//System.out.println("PDF created.");  
////opens the PDF  
////doc.open();  
//////adds paragraph to the PDF file  
////doc.add(new Paragraph("If you're offered a seat on a rocket ship, don't ask what seat! Just get on."));   
//////close the PDF file  
////doc.close();  
//////closes the writer  
//writer.close();  
//}   
//catch (FileNotFoundException e)  
//{  
//}       catch (DocumentException ex) {  
//            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
//        }  

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables
}
