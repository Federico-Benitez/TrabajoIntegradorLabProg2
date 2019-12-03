/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajointegrador;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

/**
 *
 * @author fede
 */
public class App extends javax.swing.JFrame {    

    /**
     * Creates new form App
     */
    public App() {
    	addWindowListener(new AdaptadorVentana());
        Toolkit sistema = Toolkit.getDefaultToolkit(); // nos proporciona un kit de herramientas gráficas
	Image icono = sistema.getImage("birome.jpg");
	setIconImage(icono);
        initComponents();
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRecordatorios = new javax.swing.JList<>();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoContenido = new javax.swing.JTextArea("default");
        boxColores = new javax.swing.JComboBox<>();
        boxFuentes = new javax.swing.JComboBox<>();
        textoTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAbrir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEliminarTodo = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recordatorios");
        setResizable(false);

        listaRecordatorios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaRecordatorios);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModificarMouseClicked(evt);
            }
        });

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
            }
        });

        textoContenido.setColumns(20);
        textoContenido.setRows(5);
        textoContenido.setText("");
        textoContenido.setToolTipText("Contenido del recordatorio");
        jScrollPane2.setViewportView(textoContenido);

        boxColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo ", "Azul", "Negro", "Blanco", "Verde" }));

        String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        boxFuentes.setModel(new javax.swing.DefaultComboBoxModel<>(fuentes));

        textoTitulo.setText("");
        textoTitulo.setToolTipText("Titulo de su recordatorio..");

        jLabel1.setText("Titulo");

        jLabel2.setText("Contenido");

        jButtonAbrir.setText("Abrir recordatorio");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jLabel3.setText("Fuente");

        jLabel4.setText("Color de fuente");

        jButtonEliminarTodo.setText("Eliminar Todo");
        jButtonEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jButtonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(textoTitulo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxFuentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxColores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(boxFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(boxColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAbrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminarTodo)
                            .addComponent(jButtonAgregar))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {                                            

        String titulo = textoTitulo.getText();
        String cont = textoContenido.getText();
        //para comprobar que valor se obtuvo de los colores y fuentes
        String color = boxColores.getSelectedItem().toString();
        String fuente = boxFuentes.getSelectedItem().toString();
        agregar(titulo, cont, parsearFuente(fuente), parsearColor(color));
        
        //reinicializar campos
        textoTitulo.setText("");
        textoContenido.setText("");
        boxFuentes.setSelectedItem(boxFuentes.getItemAt(0));
        boxColores.setSelectedItem(boxColores.getItemAt(0));
        
        //actualizar la lista que contiene los recordatorios en la ventana
        actualizarLista();
    }                                           
    
    private Color parsearColor (String elemento) {
        
        if (elemento.equals("Rojo ")) return Color.red;
        if (elemento.equals("Azul")) return Color.blue;
        if (elemento.equals("Negro")) return Color.BLACK;
        if (elemento.equals("Verde")) return Color.GREEN;
        if (elemento.equals("Blanco")) return Color.WHITE;
      
        return null;
        
    }
    
    private void actualizarLista() {
        modeloLista = new DefaultListModel();
        for (Recordatorios r : contenedorRecordatorios.getListaRecordatorios()){
         modeloLista.addElement(r.getTituloRecordatorio());
         listaRecordatorios.setModel(modeloLista);
        }
        
    }
    
    
    private Font parsearFuente(String elemento) {                
        return new Font(elemento, Font.BOLD, 12);
    }
    
    private void agregar(String titulo, String contenido, Font f, Color c) {
        
        if (contenido.equals("")) {
            JOptionPane.showMessageDialog (null,"Se debe llenar el campo 'contenido'");
            return;
        }
        else {
            if (titulo.equals("")) {
                contenedorRecordatorios.agregarRecordatorio(new Recordatorios(f, c));
            }
            else {
                contenedorRecordatorios.agregarRecordatorio(new Recordatorios(titulo, contenido, f, c));
            }
        }
        
    }
    
    
    private void jButtonModificarMouseClicked(java.awt.event.MouseEvent evt) {                                              
        
        if (listaRecordatorios.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun recordatorio");
            return;
        }
        
        int indice = buscarRecordatorio(listaRecordatorios.getSelectedValue());
        
        String titulo = contenedorRecordatorios.getListaRecordatorios().get(indice).getTituloRecordatorio();
        String contenido = contenedorRecordatorios.getListaRecordatorios().get(indice).getContenidoRecordatorio();
        int color = buscarColor(contenedorRecordatorios.getListaRecordatorios().get(indice).colorToString());
        int fuente = buscarFuente(contenedorRecordatorios.getListaRecordatorios().get(indice).fuenteToString());
        VentanaInteriorModificar mod = new VentanaInteriorModificar(titulo, contenido, color, fuente);
        mod.setVisible(true);
        this.setEnabled(false); //se desactiva la ventana principal, hasta que se termine de modificar
    }                                             
    
    private int buscarRecordatorio(String titulo){
        for (int i = 0; i < contenedorRecordatorios.getListaRecordatorios().size(); i++) {
           if(contenedorRecordatorios.getListaRecordatorios().get(i).getTituloRecordatorio().equals(titulo)){
               return i;
           } 
        }
        return -1;
    }
    
    private int buscarColor(String color) {
        for (int i = 0; i < boxColores.getModel().getSize(); i++) {
            String c = boxColores.getModel().getElementAt(i);
            if (color.equals(c)){ 
                return i;
            } 
        }
        return -1;
    }
    
    private int buscarFuente(String fuente) {
        
        for (int i = 0; i < boxFuentes.getModel().getSize(); i++) {
            String f = boxFuentes.getModel().getElementAt(i);
            if (f.equals(fuente)) {
                return i;
            }
        }
        return -1;
    }
    
    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {                                             
        
        if (contenedorRecordatorios.getListaRecordatorios().size() == 1) {
            modeloLista.clear();
            contenedorRecordatorios.getListaRecordatorios().clear();
        }
        
        String titulo = listaRecordatorios.getSelectedValue();
        contenedorRecordatorios.eliminarRecordatorio(titulo);
        actualizarLista();
    }                                            
    
    private void jButtonEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
        contenedorRecordatorios.getListaRecordatorios().clear();
        modeloLista.clear();
    }                                                   

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
        if (listaRecordatorios.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "No se selecciono ningun recordatorio");
            return;
        }

        int indice = buscarRecordatorio(listaRecordatorios.getSelectedValue());
        Recordatorios r = contenedorRecordatorios.getListaRecordatorios().get(indice);
        String titulo = r.getTituloRecordatorio();
        String cont = r.getContenidoRecordatorio();
        Font fuente = r.getFuente();
        Color color = r.getColorFuente();

        VentanaAbrir abrir = new VentanaAbrir(titulo,cont,color,fuente);
        abrir.setVisible(true);

    }                                            
    
    public JComboBox getComboBoxColor() {
        return boxColores;
    }
    
    public JComboBox getComboBoxFuente() {
        return boxFuentes;
    }
    
    public ContenedorRecordatorios getContenedor() {
        return this.contenedorRecordatorios;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
   private DefaultListModel modeloLista = new DefaultListModel();
   private ContenedorRecordatorios contenedorRecordatorios = new ContenedorRecordatorios();
    
    //Variables declaradas por el generador de codigo.
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> boxColores;
    private javax.swing.JComboBox<String> boxFuentes;
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminarTodo;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JList<String> listaRecordatorios;
    private javax.swing.JTextArea textoContenido;
    private javax.swing.JTextField textoTitulo;
    // End of variables declaration  
                 
}
