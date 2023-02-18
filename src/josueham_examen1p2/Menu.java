/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package josueham_examen1p2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.*;

public class Menu extends javax.swing.JFrame {

    static Scanner ingrese = new Scanner(System.in);

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        FrameCrud.setSize(490, 450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameCrud = new javax.swing.JFrame();
        TabbedPane = new javax.swing.JTabbedPane();
        PanelLaptop = new javax.swing.JPanel();
        LabelIP = new javax.swing.JLabel();
        FieldIP = new javax.swing.JTextField();
        LabelMask = new javax.swing.JLabel();
        FieldMask = new javax.swing.JTextField();
        LabelHost = new javax.swing.JLabel();
        FieldHost = new javax.swing.JTextField();
        BtnRegresar = new javax.swing.JButton();
        BtnGuardarLaptop1 = new javax.swing.JButton();
        OpcionNoRGB1 = new javax.swing.JRadioButton();
        OpcionSiRGB1 = new javax.swing.JRadioButton();
        LabelRGB1 = new javax.swing.JLabel();
        FieldRes1 = new javax.swing.JTextField();
        FieldMarca1 = new javax.swing.JTextField();
        LabelMarca1 = new javax.swing.JLabel();
        LabelResolucion1 = new javax.swing.JLabel();
        PanelEscritorio = new javax.swing.JPanel();
        LabelRam1 = new javax.swing.JLabel();
        FieldRAM = new javax.swing.JTextField();
        LabelCantAlmacen1 = new javax.swing.JLabel();
        FieldAlmacen = new javax.swing.JTextField();
        LabelGrafica1 = new javax.swing.JLabel();
        BtnTieneGraf = new javax.swing.JRadioButton();
        BtnNoTieneGraf = new javax.swing.JRadioButton();
        LabelIP1 = new javax.swing.JLabel();
        FieldIP1 = new javax.swing.JTextField();
        LabelMask1 = new javax.swing.JLabel();
        FieldMask1 = new javax.swing.JTextField();
        LabelHost1 = new javax.swing.JLabel();
        FieldHost1 = new javax.swing.JTextField();
        BtnHDD = new javax.swing.JRadioButton();
        LabelTipoAlmacen1 = new javax.swing.JLabel();
        BtnSDD = new javax.swing.JRadioButton();
        BtnGuardarDesktop1 = new javax.swing.JButton();
        BtnRegresarDesk = new javax.swing.JButton();
        PanelListar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaListar = new javax.swing.JTextArea();
        PanelEliminar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaElim = new javax.swing.JTextArea();
        LabelPos = new javax.swing.JLabel();
        TextFieldElim = new javax.swing.JTextField();
        BtnElimPC = new javax.swing.JButton();
        LabelPos1 = new javax.swing.JLabel();
        BtnGrupoRGB = new javax.swing.ButtonGroup();
        GrupoGrafica = new javax.swing.ButtonGroup();
        GrupoAlmacen = new javax.swing.ButtonGroup();
        BtnCrudPC = new javax.swing.JButton();
        BtnIngresarPC = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();

        TabbedPane.setBackground(new java.awt.Color(0, 51, 153));
        TabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        TabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabbedPaneStateChanged(evt);
            }
        });

        PanelLaptop.setBackground(new java.awt.Color(153, 153, 255));
        PanelLaptop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PanelLaptop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelIP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelIP.setText("IP");
        PanelLaptop.add(LabelIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 29, -1, -1));

        FieldIP.setText("192.168.");
        FieldIP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.add(FieldIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 59, 130, 40));

        LabelMask.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMask.setText("Máscara de Red");
        PanelLaptop.add(LabelMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 117, -1, -1));

        FieldMask.setText("255.255.255.");
        FieldMask.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.add(FieldMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 160, 130, 40));

        LabelHost.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelHost.setText("HostName");
        PanelLaptop.add(LabelHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 212, -1, -1));

        FieldHost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.add(FieldHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 248, 130, 40));

        BtnRegresar.setBackground(new java.awt.Color(0, 51, 153));
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        PanelLaptop.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 130, 40));

        BtnGuardarLaptop1.setBackground(new java.awt.Color(0, 51, 153));
        BtnGuardarLaptop1.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarLaptop1.setText("Guardar Laptop");
        BtnGuardarLaptop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarLaptop1ActionPerformed(evt);
            }
        });
        PanelLaptop.add(BtnGuardarLaptop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        OpcionNoRGB1.setText("No tiene");
        OpcionNoRGB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.add(OpcionNoRGB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        BtnGrupoRGB.add(OpcionSiRGB1);
        OpcionSiRGB1.setText("Si tiene");
        OpcionSiRGB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.add(OpcionSiRGB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        LabelRGB1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelRGB1.setText("RGB");
        PanelLaptop.add(LabelRGB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        FieldRes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.add(FieldRes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 160, 30));

        FieldMarca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelLaptop.add(FieldMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 160, 30));

        LabelMarca1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMarca1.setText("Marca de la Laptop");
        PanelLaptop.add(LabelMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        LabelResolucion1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelResolucion1.setText("Resolucion");
        PanelLaptop.add(LabelResolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        TabbedPane.addTab("Agregar Laptop", PanelLaptop);

        PanelEscritorio.setBackground(new java.awt.Color(153, 153, 255));

        LabelRam1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelRam1.setText("Cantidad de RAM");

        LabelCantAlmacen1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelCantAlmacen1.setText("Cantidad de Almacenamiento");

        LabelGrafica1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelGrafica1.setText("Tarjeta Gráfica");

        GrupoGrafica.add(BtnTieneGraf);
        BtnTieneGraf.setText("Si tiene");

        GrupoGrafica.add(BtnNoTieneGraf);
        BtnNoTieneGraf.setText("No tiene");

        LabelIP1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelIP1.setText("IP");

        FieldIP1.setText("192.168.");

        LabelMask1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelMask1.setText("Máscara de Red");

        FieldMask1.setText("255.255.255.");

        LabelHost1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelHost1.setText("HostName");

        GrupoAlmacen.add(BtnHDD);
        BtnHDD.setText("HDD");

        LabelTipoAlmacen1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelTipoAlmacen1.setText("Tipo de Almacenamiento");

        GrupoAlmacen.add(BtnSDD);
        BtnSDD.setText("SDD");

        BtnGuardarDesktop1.setBackground(new java.awt.Color(0, 51, 153));
        BtnGuardarDesktop1.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarDesktop1.setText("Guardar PC de Escritorio");
        BtnGuardarDesktop1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGuardarDesktop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarDesktop1ActionPerformed(evt);
            }
        });

        BtnRegresarDesk.setBackground(new java.awt.Color(0, 51, 153));
        BtnRegresarDesk.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresarDesk.setText("Regresar");
        BtnRegresarDesk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegresarDesk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarDeskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEscritorioLayout = new javax.swing.GroupLayout(PanelEscritorio);
        PanelEscritorio.setLayout(PanelEscritorioLayout);
        PanelEscritorioLayout.setHorizontalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(BtnGuardarDesktop1))
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FieldIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnRegresarDesk, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelMask1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelHost1)
                                .addComponent(FieldMask1)
                                .addComponent(FieldHost1)))
                        .addGap(72, 72, 72)
                        .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCantAlmacen1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                                .addComponent(BtnHDD)
                                .addGap(60, 60, 60)
                                .addComponent(BtnSDD))
                            .addComponent(LabelTipoAlmacen1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelEscritorioLayout.createSequentialGroup()
                                    .addComponent(BtnTieneGraf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnNoTieneGraf))
                                .addComponent(FieldAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelGrafica1)))))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEscritorioLayout.createSequentialGroup()
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FieldRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(LabelIP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelRam1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166))
        );
        PanelEscritorioLayout.setVerticalGroup(
            PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEscritorioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addComponent(LabelIP1)
                        .addGap(6, 6, 6)
                        .addComponent(FieldIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addComponent(LabelRam1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FieldRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMask1)
                    .addComponent(LabelCantAlmacen1))
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(FieldMask1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(LabelHost1)
                        .addGap(12, 12, 12)
                        .addComponent(FieldHost1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FieldAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelGrafica1)
                        .addGap(18, 18, 18)
                        .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnTieneGraf)
                            .addComponent(BtnNoTieneGraf))))
                .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEscritorioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LabelTipoAlmacen1)
                        .addGap(22, 22, 22)
                        .addGroup(PanelEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnHDD)
                            .addComponent(BtnSDD)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEscritorioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnRegresarDesk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(BtnGuardarDesktop1))
        );

        TabbedPane.addTab("Agregar PC de Escritorio", PanelEscritorio);

        PanelListar.setBackground(new java.awt.Color(153, 153, 255));

        TextAreaListar.setColumns(20);
        TextAreaListar.setRows(5);
        jScrollPane1.setViewportView(TextAreaListar);

        javax.swing.GroupLayout PanelListarLayout = new javax.swing.GroupLayout(PanelListar);
        PanelListar.setLayout(PanelListarLayout);
        PanelListarLayout.setHorizontalGroup(
            PanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PanelListarLayout.setVerticalGroup(
            PanelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Listar PC", PanelListar);

        PanelEliminar.setBackground(new java.awt.Color(153, 153, 255));

        TextAreaElim.setColumns(20);
        TextAreaElim.setRows(5);
        jScrollPane2.setViewportView(TextAreaElim);

        LabelPos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelPos.setText("Posicion a Eliminar");

        BtnElimPC.setBackground(new java.awt.Color(0, 51, 153));
        BtnElimPC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnElimPC.setForeground(new java.awt.Color(255, 255, 255));
        BtnElimPC.setText("Eliminar");
        BtnElimPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimPCActionPerformed(evt);
            }
        });

        LabelPos1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelPos1.setText("Listas de PC's");

        javax.swing.GroupLayout PanelEliminarLayout = new javax.swing.GroupLayout(PanelEliminar);
        PanelEliminar.setLayout(PanelEliminarLayout);
        PanelEliminarLayout.setHorizontalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldElim)))
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(BtnElimPC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        PanelEliminarLayout.setVerticalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPos1)
                .addGap(7, 7, 7)
                .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addComponent(LabelPos)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldElim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(BtnElimPC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Eliminar PC", PanelEliminar);

        javax.swing.GroupLayout FrameCrudLayout = new javax.swing.GroupLayout(FrameCrud.getContentPane());
        FrameCrud.getContentPane().setLayout(FrameCrudLayout);
        FrameCrudLayout.setHorizontalGroup(
            FrameCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
        FrameCrudLayout.setVerticalGroup(
            FrameCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCrudPC.setBackground(new java.awt.Color(0, 51, 153));
        BtnCrudPC.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrudPC.setText("Crud PC");
        BtnCrudPC.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnCrudPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCrudPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrudPCActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCrudPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 106, 121, 45));

        BtnIngresarPC.setBackground(new java.awt.Color(0, 51, 153));
        BtnIngresarPC.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresarPC.setText("Ingrese PC");
        BtnIngresarPC.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnIngresarPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIngresarPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarPCActionPerformed(evt);
            }
        });
        getContentPane().add(BtnIngresarPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 169, 121, 45));

        BtnSalir.setBackground(new java.awt.Color(0, 51, 153));
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("Salir");
        BtnSalir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 241, 121, 45));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        LabelTitulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LabelTitulo.setText("Menu Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(LabelTitulo)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        BtnSalir.setBackground(Color.red);
        BtnSalir.setForeground(Color.white);
        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnCrudPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrudPCActionPerformed
        this.setVisible(false);
        FrameCrud.setSize(600, 570);
        FrameCrud.setLocationRelativeTo(null);
        FrameCrud.setVisible(true);
    }//GEN-LAST:event_BtnCrudPCActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrameCrud.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnIngresarPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarPCActionPerformed
        if (compus.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay PC's en el sistema, por favor ingrese");
            this.setVisible(true);
        } else {
            this.setVisible(false);
            System.out.println(listarPadre());
            System.out.println("Ingrese la PC que desea: ");
            int pos = ingrese.nextInt();

            System.out.println(compus.get(pos).getHostname() + "#");
            String cadena = ingrese.next(); //Por si acaso en la ejecucion no te fijaste, aquí es donde se ve el dato despues de ingresar la posicion de la pc
            //Cuando es por ejemplo andres# se lee
            if (cadena.equals("ping_") || cadena.equals("ping")) {
                com.ping(compus, pos);
            } else if (cadena.equals("show")) {
                System.out.println(listarPC());
                this.setVisible(true);
                
            } else if (cadena.equals("exit")) {
                this.setVisible(true);
            }
            
        }

    }//GEN-LAST:event_BtnIngresarPCActionPerformed

    private void BtnGuardarLaptop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarLaptop1ActionPerformed
        String ip = FieldIP.getText();
        String mask = FieldMask.getText();
        String host = FieldHost.getText();
        String marca = FieldMarca1.getText();
        String res = FieldRes1.getText();
        boolean rgb = false;
        if (OpcionSiRGB1.isSelected()) {
            rgb = true;
        } else if (OpcionNoRGB1.isSelected()) {
            rgb = false;
        }

        compus.add(new Laptop(marca, res, rgb, ip, mask, host));
        JOptionPane.showMessageDialog(null, "Laptop Agregada");

    }//GEN-LAST:event_BtnGuardarLaptop1ActionPerformed

    private void TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabbedPaneStateChanged
        if (TabbedPane.getSelectedIndex() == 3) {
            TextAreaElim.setText(listarPadre());
        }
        if (TabbedPane.getSelectedIndex() == 2) {
            TextAreaListar.setText(listarPadre());
        }

    }//GEN-LAST:event_TabbedPaneStateChanged

    private void BtnElimPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimPCActionPerformed

        String cadena = TextFieldElim.getText();

        if (esNumero(cadena)) {
            compus.remove(Integer.parseInt(cadena));
            JOptionPane.showMessageDialog(null, "Posicion eliminada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Solo se aceptan numeros");
        }
    }//GEN-LAST:event_BtnElimPCActionPerformed

    private void BtnRegresarDeskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarDeskActionPerformed
        FrameCrud.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_BtnRegresarDeskActionPerformed

    private void BtnGuardarDesktop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarDesktop1ActionPerformed
        String ip = FieldIP1.getText();
        String mask = FieldMask1.getText();
        String host = FieldHost1.getText();
        String strRam = FieldRAM.getText();
        int RAM = Integer.parseInt(strRam);

        String strAlm = FieldAlmacen.getText();
        int Alm = Integer.parseInt(strAlm);

        boolean grafica = false;
        if (BtnTieneGraf.isSelected()) {
            grafica = true;
        } else if (BtnNoTieneGraf.isSelected()) {
            grafica = false;
        }

        boolean tipo = false;
        if (BtnHDD.isSelected()) {
            tipo = false;
        } else if (BtnSDD.isSelected()) {
            tipo = true;
        }

        compus.add(new PC_Escritorio(RAM, Alm, tipo, grafica, ip, mask, host));
        JOptionPane.showMessageDialog(null, "PC de Escritorio Agregada");
    }//GEN-LAST:event_BtnGuardarDesktop1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public String listarPC() {

        String cadena = "";
        for (PC o : compus) {
            if (o instanceof PC) {
                cadena += compus.indexOf(o) + "- " + o + "\n";
            }
        }
        return cadena;

    }//Fin metodo listar

    public String listarPadre() {
        String cadena = "";
        for (PC compu : compus) {
            if (compu instanceof PC) {
                cadena += "Posicion: " + compus.indexOf(compu)
                        + "\nIP: " + compu.getIP()
                        + "\nMascara: " + compu.getMascara()
                        + "\nHostName: " + compu.getHostname();
            }
        }
        return cadena;
    }

    public static boolean esNumero(String cadena) {
        for (char o : cadena.toCharArray()) {
            if (!Character.isDigit(o)) {
                return false;
            }
        }
        return true;
    }

    public int decToBin(int dec) {
        if (dec < 2) {
            return dec;
        } else {
            return dec % 2 + decToBin(dec / 2) * 10;
        }
    }//Fin del metodo de decToBin
    ArrayList<PC> compus = new ArrayList();
    PC com = new PC();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrudPC;
    private javax.swing.JButton BtnElimPC;
    private javax.swing.ButtonGroup BtnGrupoRGB;
    private javax.swing.JButton BtnGuardarDesktop1;
    private javax.swing.JButton BtnGuardarLaptop1;
    private javax.swing.JRadioButton BtnHDD;
    private javax.swing.JButton BtnIngresarPC;
    private javax.swing.JRadioButton BtnNoTieneGraf;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnRegresarDesk;
    private javax.swing.JRadioButton BtnSDD;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JRadioButton BtnTieneGraf;
    private javax.swing.JTextField FieldAlmacen;
    private javax.swing.JTextField FieldHost;
    private javax.swing.JTextField FieldHost1;
    private javax.swing.JTextField FieldIP;
    private javax.swing.JTextField FieldIP1;
    private javax.swing.JTextField FieldMarca1;
    private javax.swing.JTextField FieldMask;
    private javax.swing.JTextField FieldMask1;
    private javax.swing.JTextField FieldRAM;
    private javax.swing.JTextField FieldRes1;
    private javax.swing.JFrame FrameCrud;
    private javax.swing.ButtonGroup GrupoAlmacen;
    private javax.swing.ButtonGroup GrupoGrafica;
    private javax.swing.JLabel LabelCantAlmacen1;
    private javax.swing.JLabel LabelGrafica1;
    private javax.swing.JLabel LabelHost;
    private javax.swing.JLabel LabelHost1;
    private javax.swing.JLabel LabelIP;
    private javax.swing.JLabel LabelIP1;
    private javax.swing.JLabel LabelMarca1;
    private javax.swing.JLabel LabelMask;
    private javax.swing.JLabel LabelMask1;
    private javax.swing.JLabel LabelPos;
    private javax.swing.JLabel LabelPos1;
    private javax.swing.JLabel LabelRGB1;
    private javax.swing.JLabel LabelRam1;
    private javax.swing.JLabel LabelResolucion1;
    private javax.swing.JLabel LabelTipoAlmacen1;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JRadioButton OpcionNoRGB1;
    private javax.swing.JRadioButton OpcionSiRGB1;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelEscritorio;
    private javax.swing.JPanel PanelLaptop;
    private javax.swing.JPanel PanelListar;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JTextArea TextAreaElim;
    private javax.swing.JTextArea TextAreaListar;
    private javax.swing.JTextField TextFieldElim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
