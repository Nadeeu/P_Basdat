/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class deleteData extends javax.swing.JFrame {
    String connectionUr1
                = "jdbc:sqlserver://LAPTOP-77JR298K;"
                + "database=Projek_Basdat;"
                + "user=sa;"
                + "password=mdaf;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
    /**
     * Creates new form addData
     */
    public deleteData() {
        initComponents();
        populateComboBox();
        namaPelanggan.setEnabled(false);
        statusPengambilan.setEnabled(false);
        noHP.setEnabled(false);
        alamat.setEnabled(false);
        keluhan.setEnabled(false);
        ketPeng.setEnabled(false);
        merek.setEnabled(false);
        tanggalD.setEnabled(false);
        tanggalM.setEnabled(false);
        tanggalY.setEnabled(false);
        KsiUnit.setEnabled(false);
        alamatToko.setEnabled(false);
        bodyCapCB.setEnabled(false);
        hotShoeCB.setEnabled(false);
        lensCapCB.setEnabled(false);
        rearCapCB.setEnabled(false);
        taliCB.setEnabled(false);
        filterUVCB.setEnabled(false);
        bodyCapSpnr.setEnabled(false);
        hotShoeSpnr.setEnabled(false);
        lensCapSpnr.setEnabled(false);
        rearCapSpnr.setEnabled(false);
        taliSpnr.setEnabled(false);
        filterUVSpnr.setEnabled(false);
    }
    
    public void populateComboBox(){
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_3";
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
                while(resultSet.next()){
                    noNota.addItem(resultSet.getString(1));
                }
                noNota.setSelectedIndex(0);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    
    public void populateComboBox2(){
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_1 WHERE No_Nota='"+noNota.getSelectedItem().toString()+"'";
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
                while(resultSet.next()){
                    kodeUnit.addItem(resultSet.getString(2));
                }
                kodeUnit.setSelectedIndex(0);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public void populateField(){
        ResultSet resultSet = null;
        String no_Nota = noNota.getSelectedItem().toString();
        String kode_Unit = kodeUnit.getSelectedItem().toString();
        String selectSql = "Select e.Nama_Pelanggan, c.Status_Pengambilan, e.WA_Pelanggan,"+
                    "e.Alamat_Pelanggan, b.Keluhan, b.Ket_Pengerjaan, h.Model_Barang,"+
                    "c.Tanggal, a.Kondisi_Unit, c.Alamat_Toko, STRING_AGG(g.Perlengkapan,','), STRING_AGG(g.Jumlah_Barang, ',') "+
                    "FROM FD_1 a JOIN FD_3 c ON a.No_Nota = c.No_Nota "+
                    "JOIN FD_5 e ON e.Nama_Pelanggan = c.Nama_Pelanggan "+
                    "JOIN FD_2 b ON a.Kode_Unit = b.Kode_Unit "+
                    "JOIN FD_7 g ON a.Kode_Unit = g.Kode_Unit "+
                    "JOIN FD_8 h ON a.Kode_Unit = h.Kode_Unit "+
                    "WHERE a.No_Nota = '"+no_Nota+
                    "' AND a.Kode_Unit = '"+kode_Unit+"' "+
                    "GROUP BY e.Nama_Pelanggan, c.Status_Pengambilan, e.WA_Pelanggan,\n" +
                    "e.Alamat_Pelanggan, b.Keluhan, b.Ket_Pengerjaan, h.Model_Barang,\n" +
                    "c.Tanggal, a.Kondisi_Unit, c.Alamat_Toko";
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
                while(resultSet.next()){
                    namaPelanggan.setText(resultSet.getString(1));
                    if(resultSet.getString(2).equalsIgnoreCase("selesai")){
                        statusPengambilan.setSelectedIndex(0);
                    } else if(resultSet.getString(2).equalsIgnoreCase("batal")){
                        statusPengambilan.setSelectedIndex(1);
                    }
                    noHP.setText(resultSet.getString(3));
                    alamat.setText(resultSet.getString(4));
                    keluhan.setText(resultSet.getString(5));
                    if(resultSet.getString(6).equalsIgnoreCase("Pembersihan")){
                        ketPeng.setSelectedIndex(0);
                    } else if(resultSet.getString(6).equalsIgnoreCase("Ganti Lampu Flash")){
                        ketPeng.setSelectedIndex(1);
                    } else if(resultSet.getString(6).equalsIgnoreCase("Reset Sistem")){
                        ketPeng.setSelectedIndex(2);
                    } else if(resultSet.getString(6).equalsIgnoreCase("Ganti Lensa")){
                        ketPeng.setSelectedIndex(3);
                    } else if(resultSet.getString(6).equalsIgnoreCase("Kamera Diambil")){
                        ketPeng.setSelectedIndex(4);
                    }
                    merek.setText(resultSet.getString(7));
                    tanggalD.setText(resultSet.getString(8).split("/")[0]);
                    tanggalM.setText(resultSet.getString(8).split("/")[1]);
                    tanggalY.setText(resultSet.getString(8).split("/")[2]);
                    if(resultSet.getString(9).equalsIgnoreCase("baik")){
                        KsiUnit.setSelectedIndex(0);
                    } else if(resultSet.getString(9).equalsIgnoreCase("lecet")){
                        KsiUnit.setSelectedIndex(1);
                    } else if(resultSet.getString(9).equalsIgnoreCase("rusak")){
                        KsiUnit.setSelectedIndex(2);
                    }
                    if(resultSet.getString(10).equalsIgnoreCase("baik")){
                        alamatToko.setSelectedIndex(0);
                    } else if(resultSet.getString(10).equalsIgnoreCase("lecet")){
                        alamatToko.setSelectedIndex(1);
                    }
                    String[] perkap = resultSet.getString(11).split(",");
                    String[] jumlah = resultSet.getString(12).split(",");
                    bodyCapCB.setSelected(false);
                    hotShoeCB.setSelected(false);
                    lensCapCB.setSelected(false);
                    rearCapCB.setSelected(false);
                    taliCB.setSelected(false);
                    filterUVCB.setSelected(false);
                    bodyCapSpnr.setEnabled(false);
                    hotShoeSpnr.setEnabled(false);
                    lensCapSpnr.setEnabled(false);
                    rearCapSpnr.setEnabled(false);
                    taliSpnr.setEnabled(false);
                    filterUVSpnr.setEnabled(false);
                    bodyCapSpnr.setValue(0);
                    hotShoeSpnr.setValue(0);
                    lensCapSpnr.setValue(0);
                    rearCapSpnr.setValue(0);
                    taliSpnr.setValue(0);
                    filterUVSpnr.setValue(0);
                    for(int i=0; i<perkap.length; i++){
                        if(perkap[i].equalsIgnoreCase("body cap")){
                            bodyCapCB.setSelected(true);
                            bodyCapSpnr.setEnabled(true);
                            bodyCapSpnr.setValue(Integer.parseInt(jumlah[i]));
                        } if(perkap[i].equalsIgnoreCase("hot shoe")){
                            hotShoeCB.setSelected(true);
                            hotShoeSpnr.setEnabled(true);
                            hotShoeSpnr.setValue(Integer.parseInt(jumlah[i]));
                        } if(perkap[i].equalsIgnoreCase("lens cap")){
                            lensCapCB.setSelected(true);
                            lensCapSpnr.setEnabled(true);
                            lensCapSpnr.setValue(Integer.parseInt(jumlah[i]));
                        } if(perkap[i].equalsIgnoreCase("rear cap")){
                            rearCapCB.setSelected(true);
                            rearCapSpnr.setEnabled(true);
                            rearCapSpnr.setValue(Integer.parseInt(jumlah[i]));
                        } if(perkap[i].equalsIgnoreCase("tali")){
                            taliCB.setSelected(true);
                            taliSpnr.setEnabled(true);
                            taliSpnr.setValue(Integer.parseInt(jumlah[i]));
                        } if(perkap[i].equalsIgnoreCase("UV filter")){
                            filterUVCB.setSelected(true);
                            filterUVSpnr.setEnabled(true);
                            filterUVSpnr.setValue(Integer.parseInt(jumlah[i]));
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        KsiUnit = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        alamatToko = new javax.swing.JComboBox<>();
        namaPelanggan = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        noHP = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        keluhan = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tanggalD = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        merek = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tanggalM = new javax.swing.JTextField();
        tanggalY = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        bodyCapCB = new javax.swing.JCheckBox();
        hotShoeCB = new javax.swing.JCheckBox();
        rearCapCB = new javax.swing.JCheckBox();
        taliCB = new javax.swing.JCheckBox();
        lensCapCB = new javax.swing.JCheckBox();
        filterUVCB = new javax.swing.JCheckBox();
        bodyCapSpnr = new javax.swing.JSpinner();
        hotShoeSpnr = new javax.swing.JSpinner();
        lensCapSpnr = new javax.swing.JSpinner();
        rearCapSpnr = new javax.swing.JSpinner();
        taliSpnr = new javax.swing.JSpinner();
        filterUVSpnr = new javax.swing.JSpinner();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        statusPengambilan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ketPeng = new javax.swing.JComboBox<>();
        noNota = new javax.swing.JComboBox<>();
        kodeUnit = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel19.setText("No. Nota");

        jLabel20.setText("Kode Unit");

        jLabel21.setText("Kondisi Unit");

        KsiUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baik", "Lecet", "Rusak" }));
        KsiUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KsiUnitActionPerformed(evt);
            }
        });

        jLabel22.setText("Alamat Toko");

        alamatToko.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jalan Cianjur", "Jalan Trunojoyo" }));
        alamatToko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTokoActionPerformed(evt);
            }
        });

        namaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPelangganActionPerformed(evt);
            }
        });

        jLabel23.setText("Status Pengambilan");

        jLabel24.setText("Nama Pelanggan");

        noHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHPActionPerformed(evt);
            }
        });

        jLabel25.setText("Alamat Pelanggan");

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        jLabel26.setText("No. HP Pelanggan");

        jLabel27.setText("Keluhan");

        keluhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluhanActionPerformed(evt);
            }
        });

        jLabel28.setText("Keterangan Pengerjaan");

        tanggalD.setText("DD");
        tanggalD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalDActionPerformed(evt);
            }
        });

        jLabel29.setText("Merek/Model");

        merek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merekActionPerformed(evt);
            }
        });

        jLabel30.setText("Tanggal");

        tanggalM.setText("MM");
        tanggalM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalMActionPerformed(evt);
            }
        });

        tanggalY.setText("YYYY");
        tanggalY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalYActionPerformed(evt);
            }
        });

        jLabel31.setText("Perlengkapan");

        bodyCapCB.setText("Body Cap");
        bodyCapCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyCapCBActionPerformed(evt);
            }
        });

        hotShoeCB.setText("Hot Shoe");
        hotShoeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotShoeCBActionPerformed(evt);
            }
        });

        rearCapCB.setText("Rear Cap");
        rearCapCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rearCapCBActionPerformed(evt);
            }
        });

        taliCB.setText("Tali");
        taliCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taliCBActionPerformed(evt);
            }
        });

        lensCapCB.setText("Lens Cap");
        lensCapCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lensCapCBActionPerformed(evt);
            }
        });

        filterUVCB.setText("UV Filter Lens");
        filterUVCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterUVCBActionPerformed(evt);
            }
        });

        addBtn.setText("Delete");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        statusPengambilan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selesai", "Batal" }));

        jLabel1.setText("+62");

        ketPeng.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pembersihan", "Ganti Lampu Flash", "Reset Sistem", "Ganti Lensa", "Kamera Diambil" }));

        noNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noNotaActionPerformed(evt);
            }
        });

        kodeUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeUnitActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel27)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(109, 109, 109)
                                .addComponent(ketPeng, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(statusPengambilan, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(noHP, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(keluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(merek, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tanggalD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tanggalM, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tanggalY, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(alamatToko, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(KsiUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bodyCapCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bodyCapSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hotShoeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hotShoeSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lensCapSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lensCapCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rearCapCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rearCapSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(taliCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(taliSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(filterUVSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(filterUVCB))))))
                        .addContainerGap(167, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(noNota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kodeUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn)
                        .addGap(127, 127, 127))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(noNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(kodeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(statusPengambilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(noHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(keluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(ketPeng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tanggalD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggalM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggalY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(KsiUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(alamatToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bodyCapCB)
                        .addComponent(hotShoeCB)
                        .addComponent(lensCapCB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyCapSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotShoeSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lensCapSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rearCapCB)
                    .addComponent(taliCB)
                    .addComponent(filterUVCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterUVSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rearCapSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taliSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KsiUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KsiUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KsiUnitActionPerformed

    private void alamatTokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTokoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTokoActionPerformed

    private void namaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPelangganActionPerformed

    private void noHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noHPActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void keluhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluhanActionPerformed

    private void tanggalDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalDActionPerformed

    private void merekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merekActionPerformed

    private void tanggalMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalMActionPerformed

    private void tanggalYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalYActionPerformed

    private void bodyCapCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyCapCBActionPerformed
        if(bodyCapCB.isSelected()){
            bodyCapSpnr.setEnabled(true);
        } else{
            bodyCapSpnr.setEnabled(false);
        }
    }//GEN-LAST:event_bodyCapCBActionPerformed

    private void hotShoeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotShoeCBActionPerformed
        if(hotShoeCB.isSelected()){
            hotShoeSpnr.setEnabled(true);
        } else{
            hotShoeSpnr.setEnabled(false);
        }
    }//GEN-LAST:event_hotShoeCBActionPerformed

    private void lensCapCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lensCapCBActionPerformed
        if(lensCapCB.isSelected()){
            lensCapSpnr.setEnabled(true);
        } else{
            lensCapSpnr.setEnabled(false);
        }
    }//GEN-LAST:event_lensCapCBActionPerformed

    private void rearCapCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rearCapCBActionPerformed
        if(rearCapCB.isSelected()){
            rearCapSpnr.setEnabled(true);
        } else{
            rearCapSpnr.setEnabled(false);
        }
    }//GEN-LAST:event_rearCapCBActionPerformed

    private void taliCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taliCBActionPerformed
        if(taliCB.isSelected()){
            taliSpnr.setEnabled(true);
        } else{
            taliSpnr.setEnabled(false);
        }
    }//GEN-LAST:event_taliCBActionPerformed

    private void filterUVCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterUVCBActionPerformed
        if(filterUVCB.isSelected()){
            filterUVSpnr.setEnabled(true);
        } else{
            filterUVSpnr.setEnabled(false);
        }
    }//GEN-LAST:event_filterUVCBActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int opm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin untuk menghapus data?", "Perhatian!" ,JOptionPane.OK_CANCEL_OPTION);
        if(opm==JOptionPane.OK_OPTION){
            String no_Nota = noNota.getModel().getSelectedItem().toString();
            String kode_Unit = kodeUnit.getModel().getSelectedItem().toString();
            String namaP = namaPelanggan.getText();
            String status = statusPengambilan.getModel().getSelectedItem().toString();
            String noHPP = noHP.getText();
            String alamatP = alamat.getText();
            String kel = keluhan.getText();
            String ket = ketPeng.getModel().getSelectedItem().toString();
            String model = merek.getText();
            String hari = tanggalD.getText();
            String bulan = tanggalM.getText();
            String tahun = tanggalY.getText();
            String ksi = KsiUnit.getModel().getSelectedItem().toString();
            String alamatT = alamatToko.getModel().getSelectedItem().toString();
            String selectSql = "";
            ResultSet resultSet = null;
            
            
            //FD_1
            selectSql = "DELETE FROM FD_1 WHERE No_Nota = '"+ no_Nota+"' AND Kode_Unit = '"+kode_Unit+"'";
            resultSet = null;    
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //FD_2
            selectSql = "DELETE FROM FD_2 WHERE Kode_Unit = '"+kode_Unit+"'";
            resultSet = null;    
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //FD_3
            selectSql = "DELETE FROM FD_3 WHERE No_Nota = '"+no_Nota+"'";
            resultSet = null;    
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //FD_5
            selectSql = "DELETE FROM FD_5 WHERE Nama_Pelanggan = '"+namaP+"'";
            resultSet = null;    
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //FD_7
            selectSql = "DELETE FROM FD_7 WHERE Kode_Unit = '"+kode_Unit+"'";
            resultSet = null;    
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //FD_8
            selectSql = "DELETE FROM FD_8 WHERE Kode_Unit = '"+kode_Unit+"'";
            resultSet = null;    
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            Form_Basdat formbd = new Form_Basdat();
            formbd.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        int opm = JOptionPane.showConfirmDialog(null, "Apakah Anda tidak jadi menghapus data?", "Perhatian!" ,JOptionPane.OK_CANCEL_OPTION);
        
        if(opm==JOptionPane.OK_OPTION){
            Form_Basdat formbd = new Form_Basdat();
            formbd.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void kodeUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeUnitActionPerformed
        
    }//GEN-LAST:event_kodeUnitActionPerformed

    private void noNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noNotaActionPerformed
        ResultSet resultSet = null;
        kodeUnit.removeAllItems();
        String selectSql = "SELECT * FROM FD_1 WHERE No_Nota='"+noNota.getSelectedItem().toString()+"'";
            try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(selectSql);
                while(resultSet.next()){
                    kodeUnit.addItem(resultSet.getString(2));
                }
                kodeUnit.setSelectedIndex(0);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_noNotaActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        namaPelanggan.setEnabled(true);
        statusPengambilan.setEnabled(true);
        noHP.setEnabled(true);
        alamat.setEnabled(true);
        keluhan.setEnabled(true);
        ketPeng.setEnabled(true);
        merek.setEnabled(true);
        tanggalD.setEnabled(true);
        tanggalM.setEnabled(true);
        tanggalY.setEnabled(true);
        KsiUnit.setEnabled(true);
        alamatToko.setEnabled(true);
        bodyCapCB.setEnabled(true);
        hotShoeCB.setEnabled(true);
        lensCapCB.setEnabled(true);
        rearCapCB.setEnabled(true);
        taliCB.setEnabled(true);
        filterUVCB.setEnabled(true);
        populateField();
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(deleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> KsiUnit;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> alamatToko;
    private javax.swing.JCheckBox bodyCapCB;
    private javax.swing.JSpinner bodyCapSpnr;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JCheckBox filterUVCB;
    private javax.swing.JSpinner filterUVSpnr;
    private javax.swing.JCheckBox hotShoeCB;
    private javax.swing.JSpinner hotShoeSpnr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField keluhan;
    private javax.swing.JComboBox<String> ketPeng;
    private javax.swing.JComboBox<String> kodeUnit;
    private javax.swing.JCheckBox lensCapCB;
    private javax.swing.JSpinner lensCapSpnr;
    private javax.swing.JTextField merek;
    private javax.swing.JTextField namaPelanggan;
    private javax.swing.JTextField noHP;
    private javax.swing.JComboBox<String> noNota;
    private javax.swing.JCheckBox rearCapCB;
    private javax.swing.JSpinner rearCapSpnr;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> statusPengambilan;
    private javax.swing.JCheckBox taliCB;
    private javax.swing.JSpinner taliSpnr;
    private javax.swing.JTextField tanggalD;
    private javax.swing.JTextField tanggalM;
    private javax.swing.JTextField tanggalY;
    // End of variables declaration//GEN-END:variables
}
