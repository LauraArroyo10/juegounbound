/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.unbound.vista;

import com.mycompany.unbound.controlador.ControladorPrincipal;
import com.mycompany.unbound.modelo.AreaJuego;
import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public class GUILaberinto extends javax.swing.JFrame {

    private AreaJuego areaJuego;

    /**
     * Creates new form GUILaberinto
     */
    public GUILaberinto(ControladorPrincipal controlador) {
        initComponents();
        escuchar(controlador);
        this.areaJuego = new AreaJuego();
    }

    public void escuchar(ControladorPrincipal controlador) {
        btnMenu.addActionListener(controlador);

    }
//
//    public void paint(Graphics g) {
//        super.paint(g);
//        areaJuego.paintComponent(g);
//    }
//
//    public void actualizarJuego() {
//        // Actualiza juego
//        areaJuego.actualizarEstado();
//        repaint();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        panelLaberinto1 = new com.mycompany.unbound.vista.PanelLaberinto();
        espacioCorazon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visual_menu.png"))); // NOI18N
        btnMenu.setActionCommand("showInGameMenu");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, -1, -1));

        espacioCorazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visual_espacioVidas.png"))); // NOI18N

        javax.swing.GroupLayout panelLaberinto1Layout = new javax.swing.GroupLayout(panelLaberinto1);
        panelLaberinto1.setLayout(panelLaberinto1Layout);
        panelLaberinto1Layout.setHorizontalGroup(
            panelLaberinto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaberinto1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(espacioCorazon)
                .addContainerGap(1087, Short.MAX_VALUE))
        );
        panelLaberinto1Layout.setVerticalGroup(
            panelLaberinto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaberinto1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(espacioCorazon)
                .addContainerGap(782, Short.MAX_VALUE))
        );

        getContentPane().add(panelLaberinto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel espacioCorazon;
    private com.mycompany.unbound.vista.PanelLaberinto panelLaberinto1;
    // End of variables declaration//GEN-END:variables
}
