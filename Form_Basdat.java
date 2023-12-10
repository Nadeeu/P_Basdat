package javaapplication2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication2.addData;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;import java.sql.DriverManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class Form_Basdat extends javax.swing.JFrame {

    String connectionUr1
            = "jdbc:sqlserver://LAPTOP-77JR298K;"
            + "database=Projek_Basdat;"
            + "user=sa;"
            + "password=mdaf;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";

    public Form_Basdat() {
        initComponents();
        populateFieldFD4();
        populateFieldFD3();
        populateFieldFD2();
        populateFieldFD1();
        populateFieldFD5();
        populateFieldFD6();
        populateFieldFD7();
        populateFieldFD8();
        populateTableFD1();
        populateTableFD2();
        populateTableFD3();
        populateTableFD4();
        populateTableFD5();
        populateTableFD6();
        populateTableFD7();
        populateTableFD8();

    }

    public void populateTableFD2() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_2";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();
                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateTableFD1() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_1";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateTableFD3() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_3";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();

                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2),
                    resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateTableFD4() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_4";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();

                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateTableFD5() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_5";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();

                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateTableFD6() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_6";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();

                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateTableFD7() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_7";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();

                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateTableFD8() {
        ResultSet resultSet = null;
        String selectSql = "SELECT * FROM FD_8";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();

                model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void populateFieldFD2() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_2";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            int i = 1;
            while (resultSet.next()) {
                KeluhanFD2.setText(resultSet.getString(1));
                KodeUnitFD2.setText(resultSet.getString(2));
                KetFD2.setText(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        KeluhanFD2.setEditable(false);
        KodeUnitFD2.setEditable(false);
        KetFD2.setEditable(false);
    }

    public void populateFieldFD1() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_1";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
//               System.out.println(resultSet.getString(1));
                noNotaFD1.setText(resultSet.getString(1));
                KodeUnitFD1.setText(resultSet.getString(2));
                KsiUnitFD1.setText(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        noNotaFD1.setEditable(false);
        KodeUnitFD1.setEditable(false);
        KsiUnitFD1.setEditable(false);
    }

    public void populateFieldFD4() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_4";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
                alamatFD4.setText(resultSet.getString(1));
                txtWA.setText(resultSet.getString(2));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        alamatFD4.setEditable(false);
        txtWA.setEditable(false);
    }

    public void populateFieldFD3() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_3";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
                noNotaFD3.setText(resultSet.getString(1));
                txtNamaToko.setText("Malang Digital Service");
                namaPelangganFD3.setText(resultSet.getString(4));
                tanggalFD3.setText(resultSet.getString(5));
                statusPengambilanFD3.setText(resultSet.getString(6));
                alamatTokoFD3.setText(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        noNotaFD3.setEditable(false);
        txtNamaToko.setEditable(false);
        namaPelangganFD3.setEditable(false);
        tanggalFD3.setEditable(false);
        statusPengambilanFD3.setEditable(false);
        alamatTokoFD3.setEditable(false);
    }

    public void populateFieldFD5() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_5";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            int i = 1;
            while (resultSet.next()) {
                namaPelangganFD5.setText(resultSet.getString(1));
                alamatFD5.setText(resultSet.getString(2));
                noHPFD5.setText(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        namaPelangganFD5.setEditable(false);
        alamatFD5.setEditable(false);
        noHPFD5.setEditable(false);
    }

    public void populateFieldFD6() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_6";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            int i = 1;
            while (resultSet.next()) {
                ketFD6.setText(resultSet.getString(1));
                biayaPengFD6.setText(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ketFD6.setEditable(false);
        biayaPengFD6.setEditable(false);
    }

    public void populateFieldFD7() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_7";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            int i = 1;
            while (resultSet.next()) {
                kodeUnitFD7.setText(resultSet.getString(1));
                perlengkapanFD7.setText(resultSet.getString(2));
                int nilai = Integer.parseInt(resultSet.getString(3));
                jumlahPerlengkapanFD7.setValue(nilai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        kodeUnitFD7.setEditable(false);
        perlengkapanFD7.setEditable(false);
        jumlahPerlengkapanFD7.setEditor(new JSpinner.DefaultEditor(jumlahPerlengkapanFD7));
        jumlahPerlengkapanFD7.setEnabled(false);
    }

    public void populateFieldFD8() {
        ResultSet resultSet = null;
        String selectSql = "SELECT TOP 1 * FROM FD_8";
        try (Connection connection = DriverManager.getConnection(this.connectionUr1);) {

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(selectSql);
            int i = 1;
            while (resultSet.next()) {
                kodeUnitFD8.setText(resultSet.getString(1));
                merekFD8.setText(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        kodeUnitFD8.setEditable(false);
        merekFD8.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        noNotaFD1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        KodeUnitFD1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableFD1 = new javax.swing.JTable();
        addBtnFD1 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        lastBtnFD1 = new javax.swing.JButton();
        searchBtnFD1 = new javax.swing.JButton();
        nextBtnFD1 = new javax.swing.JButton();
        firstBtnFD1 = new javax.swing.JButton();
        backBtnFD1 = new javax.swing.JButton();
        KsiUnitFD1 = new javax.swing.JTextField();
        jButton58 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        KeluhanFD2 = new javax.swing.JTextField();
        KodeUnitFD2 = new javax.swing.JTextField();
        KetFD2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableFD2 = new javax.swing.JTable();
        addBtnFD2 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        lastBtnFD2 = new javax.swing.JButton();
        searchBtnFD2 = new javax.swing.JButton();
        nextBtnFD2 = new javax.swing.JButton();
        firstBtnFD2 = new javax.swing.JButton();
        backBtnFD2 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        searchBtnFD3 = new javax.swing.JButton();
        nextBtnFD3 = new javax.swing.JButton();
        firstBtnFD3 = new javax.swing.JButton();
        backBtnFD3 = new javax.swing.JButton();
        addBtnFD3 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableFD3 = new javax.swing.JTable();
        jButton53 = new javax.swing.JButton();
        lastBtnFD3 = new javax.swing.JButton();
        tanggalFD3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        noNotaFD3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNamaToko = new javax.swing.JTextField();
        namaPelangganFD3 = new javax.swing.JTextField();
        alamatTokoFD3 = new javax.swing.JTextField();
        statusPengambilanFD3 = new javax.swing.JTextField();
        jButton60 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtWA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lastBtnFD4 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        addBtnFD4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableFD4 = new javax.swing.JTable();
        jButton44 = new javax.swing.JButton();
        searchBtnFD4 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        alamatFD4 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namaPelangganFD5 = new javax.swing.JTextField();
        addBtnFD5 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        lastBtnFD5 = new javax.swing.JButton();
        searchBtnFD5 = new javax.swing.JButton();
        nextBtnFD5 = new javax.swing.JButton();
        firstBtnFD5 = new javax.swing.JButton();
        backBtnFD5 = new javax.swing.JButton();
        alamatFD5 = new javax.swing.JTextField();
        noHPFD5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFD5 = new javax.swing.JTable();
        jButton62 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        addBtnFD6 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        lastBtnFD6 = new javax.swing.JButton();
        searchBtnFD6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nextBtnFD6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        firstBtnFD6 = new javax.swing.JButton();
        backBtnFD6 = new javax.swing.JButton();
        ketFD6 = new javax.swing.JTextField();
        biayaPengFD6 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableFD6 = new javax.swing.JTable();
        jButton63 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        searchBtnFD7 = new javax.swing.JButton();
        nextBtnFD7 = new javax.swing.JButton();
        backBtnFD7 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        kodeUnitFD7 = new javax.swing.JTextField();
        lastBtnFD7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        perlengkapanFD7 = new javax.swing.JTextField();
        jumlahPerlengkapanFD7 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        firstBtnFD7 = new javax.swing.JButton();
        addBtnFD7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFD7 = new javax.swing.JTable();
        jButton66 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        merekFD8 = new javax.swing.JTextField();
        firstBtnFD8 = new javax.swing.JButton();
        addBtnFD8 = new javax.swing.JButton();
        searchBtnFD8 = new javax.swing.JButton();
        nextBtnFD8 = new javax.swing.JButton();
        backBtnFD8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        kodeUnitFD8 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        lastBtnFD8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFD8 = new javax.swing.JTable();
        jButton67 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel19.setText("No. Nota");

        noNotaFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noNotaFD1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Kode Unit");

        KodeUnitFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KodeUnitFD1ActionPerformed(evt);
            }
        });

        jLabel21.setText("Kondisi Unit");

        tableFD1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Nota", "Kode Unit", "Kondisi Unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tableFD1);

        addBtnFD1.setText("➕");
        addBtnFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD1ActionPerformed(evt);
            }
        });

        jButton56.setText("♻");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setText("📝");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        lastBtnFD1.setText("⏩");
        lastBtnFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD1ActionPerformed(evt);
            }
        });

        searchBtnFD1.setText("🔍");
        searchBtnFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD1ActionPerformed(evt);
            }
        });

        nextBtnFD1.setText("▶");
        nextBtnFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnFD1ActionPerformed(evt);
            }
        });

        firstBtnFD1.setText("⏪");
        firstBtnFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnFD1ActionPerformed(evt);
            }
        });

        backBtnFD1.setText("◀");
        backBtnFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnFD1ActionPerformed(evt);
            }
        });

        KsiUnitFD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KsiUnitFD1ActionPerformed(evt);
            }
        });

        jButton58.setText("📰");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(addBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KodeUnitFD1)
                            .addComponent(noNotaFD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KsiUnitFD1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(noNotaFD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(KodeUnitFD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(KsiUnitFD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtnFD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane9.addTab("FD1", jPanel1);

        jLabel22.setText("Keluhan");

        jLabel23.setText("Kode Unit");

        jLabel24.setText("Keterangan Pengerjaan ");

        KeluhanFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluhanFD2ActionPerformed(evt);
            }
        });

        KetFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KetFD2ActionPerformed(evt);
            }
        });

        tableFD2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Keluhan", "Kode Unit", "Keterangan Pengerjaan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tableFD2);

        addBtnFD2.setText("➕");
        addBtnFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD2ActionPerformed(evt);
            }
        });

        jButton64.setText("♻");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setText("📝");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        lastBtnFD2.setText("⏩");
        lastBtnFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD2ActionPerformed(evt);
            }
        });

        searchBtnFD2.setText("🔍");
        searchBtnFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD2ActionPerformed(evt);
            }
        });

        nextBtnFD2.setText("▶");
        nextBtnFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnFD2ActionPerformed(evt);
            }
        });

        firstBtnFD2.setText("⏪");
        firstBtnFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnFD2ActionPerformed(evt);
            }
        });

        backBtnFD2.setText("◀");
        backBtnFD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnFD2ActionPerformed(evt);
            }
        });

        jButton59.setText("📰");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(KeluhanFD2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(KodeUnitFD2)
                    .addComponent(KetFD2))
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(firstBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(addBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(KeluhanFD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(KodeUnitFD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(KetFD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtnFD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("FD2", jPanel2);

        searchBtnFD3.setText("🔍");
        searchBtnFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD3ActionPerformed(evt);
            }
        });

        nextBtnFD3.setText("▶");
        nextBtnFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnFD3ActionPerformed(evt);
            }
        });

        firstBtnFD3.setText("⏪");
        firstBtnFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnFD3ActionPerformed(evt);
            }
        });

        backBtnFD3.setText("◀");
        backBtnFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnFD3ActionPerformed(evt);
            }
        });

        addBtnFD3.setText("➕");
        addBtnFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD3ActionPerformed(evt);
            }
        });

        jButton52.setText("♻");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        tableFD3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Nota", "Alamat Toko", "Nama Toko", "Nama Pelanggan", "Tanggal", "Status Pengambilan"
            }
        ));
        jScrollPane6.setViewportView(tableFD3);

        jButton53.setText("📝");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        lastBtnFD3.setText("⏩");
        lastBtnFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD3ActionPerformed(evt);
            }
        });

        jLabel13.setText("No. Nota");

        jLabel14.setText("Alamat Toko");

        jLabel15.setText("Nama Toko");

        jLabel16.setText("Nama Pelanggan");

        jLabel17.setText("Tanggal");

        noNotaFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noNotaFD3ActionPerformed(evt);
            }
        });

        jLabel18.setText("Status Pengambilan");

        txtNamaToko.setText("Malang Digital Service");

        alamatTokoFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTokoFD3ActionPerformed(evt);
            }
        });

        statusPengambilanFD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusPengambilanFD3ActionPerformed(evt);
            }
        });

        jButton60.setText("📰");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(firstBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(addBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel17))
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tanggalFD3)
                            .addComponent(namaPelangganFD3)
                            .addComponent(noNotaFD3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamaToko, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(alamatTokoFD3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(statusPengambilanFD3))
                        .addGap(68, 68, 68))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noNotaFD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(alamatTokoFD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPelangganFD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalFD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(statusPengambilanFD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtnFD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("FD3", jPanel3);

        txtWA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWAActionPerformed(evt);
            }
        });

        jLabel11.setText("Alamat Toko");

        jLabel12.setText("WA Toko");

        lastBtnFD4.setText("⏪");
        lastBtnFD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD4ActionPerformed(evt);
            }
        });

        jButton42.setText("◀");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        addBtnFD4.setText("➕");
        addBtnFD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD4ActionPerformed(evt);
            }
        });

        tableFD4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alamat Toko", "WA Toko"
            }
        ));
        jScrollPane5.setViewportView(tableFD4);

        jButton44.setText("⏩");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        searchBtnFD4.setText("🔍");
        searchBtnFD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD4ActionPerformed(evt);
            }
        });

        jButton46.setText("▶");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        alamatFD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatFD4ActionPerformed(evt);
            }
        });

        jButton28.setText("♻");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton30.setText("📝");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton61.setText("📰");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lastBtnFD4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(101, 101, 101)
                        .addComponent(addBtnFD4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(searchBtnFD4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtWA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alamatFD4)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(alamatFD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastBtnFD4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtnFD4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBtnFD4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("FD4", jPanel4);

        jLabel4.setText("Nama Pelanggan");

        jLabel5.setText("Alamat");

        jLabel8.setText("Nomor HP");

        addBtnFD5.setText("➕");
        addBtnFD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD5ActionPerformed(evt);
            }
        });

        jButton26.setText("♻");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("📝");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        lastBtnFD5.setText("⏩");
        lastBtnFD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD5ActionPerformed(evt);
            }
        });

        searchBtnFD5.setText("🔍");
        searchBtnFD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD5ActionPerformed(evt);
            }
        });

        nextBtnFD5.setText("▶");
        nextBtnFD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnFD5ActionPerformed(evt);
            }
        });

        firstBtnFD5.setText("⏪");
        firstBtnFD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnFD5ActionPerformed(evt);
            }
        });

        backBtnFD5.setText("◀");
        backBtnFD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnFD5ActionPerformed(evt);
            }
        });

        tableFD5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Pelanggan", "Alamat", "Nomor HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableFD5);

        jButton62.setText("📰");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(firstBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(nextBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(alamatFD5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(noHPFD5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(namaPelangganFD5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaPelangganFD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(alamatFD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(noHPFD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtnFD5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("FD5", jPanel5);

        addBtnFD6.setText("➕");
        addBtnFD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD6ActionPerformed(evt);
            }
        });

        jButton34.setText("♻");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("📝");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        lastBtnFD6.setText("⏩");
        lastBtnFD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD6ActionPerformed(evt);
            }
        });

        searchBtnFD6.setText("🔍");
        searchBtnFD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD6ActionPerformed(evt);
            }
        });

        jLabel9.setText("Keterangan Pengerjaan");

        nextBtnFD6.setText("▶");
        nextBtnFD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnFD6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Biaya Pengerjaan");

        firstBtnFD6.setText("⏪");
        firstBtnFD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnFD6ActionPerformed(evt);
            }
        });

        backBtnFD6.setText("◀");
        backBtnFD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnFD6ActionPerformed(evt);
            }
        });

        tableFD6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Keterangan Pengerjaan", "Biaya Pengerjaan"
            }
        ));
        jScrollPane4.setViewportView(tableFD6);

        jButton63.setText("📰");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(firstBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(addBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(biayaPengFD6, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(ketFD6))))
                .addGap(32, 32, 32))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ketFD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(biayaPengFD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtnFD6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("FD6", jPanel6);

        searchBtnFD7.setText("🔍");
        searchBtnFD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD7ActionPerformed(evt);
            }
        });

        nextBtnFD7.setText("▶");
        nextBtnFD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnFD7ActionPerformed(evt);
            }
        });

        backBtnFD7.setText("◀");
        backBtnFD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnFD7ActionPerformed(evt);
            }
        });

        jButton20.setText("♻");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("📝");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        lastBtnFD7.setText("⏩");
        lastBtnFD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD7ActionPerformed(evt);
            }
        });

        jLabel6.setText("Kode Unit");

        jLabel7.setText("Perlengkapan");

        jLabel3.setText("Jumlah Perlengkapan");

        firstBtnFD7.setText("⏪");
        firstBtnFD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnFD7ActionPerformed(evt);
            }
        });

        addBtnFD7.setText("➕");
        addBtnFD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD7ActionPerformed(evt);
            }
        });

        tableFD7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Unit", "Perlengkapan", "Jumlah Perlengkapan"
            }
        ));
        jScrollPane3.setViewportView(tableFD7);

        jButton66.setText("📰");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(firstBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(addBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(0, 60, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jumlahPerlengkapanFD7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                            .addComponent(perlengkapanFD7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(kodeUnitFD7, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                .addGap(35, 35, 35))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kodeUnitFD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(perlengkapanFD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahPerlengkapanFD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtnFD7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("FD7", jPanel7);

        firstBtnFD8.setText("⏪");
        firstBtnFD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnFD8ActionPerformed(evt);
            }
        });

        addBtnFD8.setText("➕");
        addBtnFD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnFD8ActionPerformed(evt);
            }
        });

        searchBtnFD8.setText("🔍");
        searchBtnFD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnFD8ActionPerformed(evt);
            }
        });

        nextBtnFD8.setText("▶");
        nextBtnFD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnFD8ActionPerformed(evt);
            }
        });

        backBtnFD8.setText("◀");
        backBtnFD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnFD8ActionPerformed(evt);
            }
        });

        jButton7.setText("♻");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("📝");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        lastBtnFD8.setText("⏩");
        lastBtnFD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnFD8ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kode Unit");

        jLabel2.setText("Merek/Model");

        tableFD8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Unit", "Merek/Model"
            }
        ));
        jScrollPane1.setViewportView(tableFD8);

        jButton67.setText("📰");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(firstBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(addBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(searchBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(nextBtnFD8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastBtnFD8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(merekFD8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addComponent(kodeUnitFD8, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(35, 35, 35))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeUnitFD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(merekFD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtnFD8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane9.addTab("FD8", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastBtnFD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD8ActionPerformed
        String kodeUnit = tableFD8.getModel().getValueAt(tableFD8.getModel().getRowCount() - 1, 0).toString();
        String merek = tableFD8.getModel().getValueAt(tableFD8.getModel().getRowCount() - 1, 1).toString();

        kodeUnitFD8.setText(kodeUnit);
        merekFD8.setText(merek);
    }//GEN-LAST:event_lastBtnFD8ActionPerformed

    private void backBtnFD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnFD8ActionPerformed
        String currKodeFD8 = kodeUnitFD8.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKodeFD8)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String kode = model.getValueAt(currRow - 1, 0).toString();
        String merek = model.getValueAt(currRow - 1, 1).toString();

        kodeUnitFD8.setText(kode);
        merekFD8.setText(merek);
    }//GEN-LAST:event_backBtnFD8ActionPerformed

    private void nextBtnFD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnFD8ActionPerformed
        String currKodeFD8 = kodeUnitFD8.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKodeFD8)) {
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the last data.");
            return;
        }
        String kodeUnit = model.getValueAt(currRow + 1, 0).toString();
        String merek = model.getValueAt(currRow + 1, 1).toString();

        kodeUnitFD8.setText(kodeUnit);
        merekFD8.setText(merek);
        
    }//GEN-LAST:event_nextBtnFD8ActionPerformed

    private void searchBtnFD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD8ActionPerformed
        kodeUnitFD8.setText("");
        merekFD8.setText("");       
        kodeUnitFD8.setEditable(true);
        merekFD8.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();

        JButton yesFD8 = new JButton("✓");
        JButton noFD8 = new JButton("✕");
        yesFD8.setBounds(250, 130, 40, 40);
        noFD8.setBounds(300, 130, 40, 40);
        jPanel8.add(yesFD8);
        jPanel8.add(noFD8);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_8";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                    while (resultSet.next()) {
                        kodeUnitFD8.setText(resultSet.getString(1));
                        merekFD8.setText(resultSet.getString(2));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                }
                yesFD8.setVisible(false);
                noFD8.setVisible(false);
                kodeUnitFD8.setEditable(false);
                merekFD8.setEnabled(true);
            }
        });

        yesFD8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kode = "";
                kode = kodeUnitFD8.getText();
                String connectionUr1
                        = "jdbc:sqlserver://LAPTOP-77JR298K;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_8 "
                        + "WHERE Kode_Unit ='" + kode + "'";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                }
            }
        });
    }//GEN-LAST:event_searchBtnFD8ActionPerformed

    private void addBtnFD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD8ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD8ActionPerformed

    private void firstBtnFD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnFD8ActionPerformed
        String kodeUnit = tableFD8.getModel().getValueAt(0, 0).toString();
        String merek = tableFD8.getModel().getValueAt(0, 1).toString();

        kodeUnitFD8.setText(kodeUnit);
        merekFD8.setText(merek);
    }//GEN-LAST:event_firstBtnFD8ActionPerformed

    private void searchBtnFD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD7ActionPerformed
        kodeUnitFD7.setText("");
        perlengkapanFD7.setText("");
        kodeUnitFD7.setEditable(true);
        perlengkapanFD7.setEditable(true);
        jumlahPerlengkapanFD7.setValue(Integer.parseInt("0"));
        DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();

        JButton yesFD7 = new JButton("✓");
        JButton noFD7 = new JButton("✕");
        yesFD7.setBounds(250, 155, 40, 40);
        noFD7.setBounds(300, 155, 40, 40);
        jPanel7.add(yesFD7);
        jPanel7.add(noFD7);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_7";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                    while (resultSet.next()) {
                        kodeUnitFD7.setText(resultSet.getString(1));
                        perlengkapanFD7.setText(resultSet.getString(2));
                        jumlahPerlengkapanFD7.setValue(Integer.parseInt(resultSet.getString(3)));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                }
                yesFD7.setVisible(false);
                noFD7.setVisible(false);
                kodeUnitFD7.setEditable(false);
                perlengkapanFD7.setEditable(false);
            }
        });

        yesFD7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kode = "";
                String perlengkapan = "";
                kode = kodeUnitFD7.getText();
                perlengkapan = perlengkapanFD7.getText();
                String connectionUr1
                        = "jdbc:sqlserver://LAPTOP-77JR298K;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                String selectSql = "";
                if(kode.equals("")&&!perlengkapan.equals("")){
                    selectSql="SELECT * FROM FD_7 "
                        + "WHERE Perlengkapan = '" + perlengkapan + "'";
                } else if(!kode.equals("")&&perlengkapan.equals("")){
                    selectSql="SELECT * FROM FD_7 "
                        + "WHERE Kode_Unit = '" + kode+"'";
                } else {
                        selectSql= "SELECT * FROM FD_7 "
                        + "WHERE Kode_Unit = '" + kode
                        + "' AND Perlengkapan = '" + perlengkapan+"'";
                        }
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                }
            }
        });
    }//GEN-LAST:event_searchBtnFD7ActionPerformed

    private void nextBtnFD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnFD7ActionPerformed

        String currKodeFD7 = kodeUnitFD7.getText();
        String currPerFD7 = perlengkapanFD7.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKodeFD7) &&
                model.getValueAt(i,1).toString().equalsIgnoreCase(currPerFD7)){
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the last data.");
            return;
        }
        String kode = model.getValueAt(currRow + 1, 0).toString();
        String perleng = model.getValueAt(currRow + 1, 1).toString();
        
        int jumlahInt = Integer.parseInt(model.getValueAt(currRow + 1, 2).toString());

        kodeUnitFD7.setText(kode);
        perlengkapanFD7.setText(perleng);
        jumlahPerlengkapanFD7.setValue(jumlahInt);
    }//GEN-LAST:event_nextBtnFD7ActionPerformed

    private void backBtnFD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnFD7ActionPerformed
        String currKodeFD2 = kodeUnitFD7.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKodeFD2)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String kode = tableFD7.getModel().getValueAt(currRow - 1, 0).toString();
        String perleng = tableFD7.getModel().getValueAt(currRow - 1, 1).toString();
        String jumlah = tableFD7.getModel().getValueAt(currRow - 1, 2).toString();

        kodeUnitFD7.setText(kode);
        perlengkapanFD7.setText(perleng);
        jumlahPerlengkapanFD7.setValue(Integer.parseInt(jumlah));
    }//GEN-LAST:event_backBtnFD7ActionPerformed

    private void lastBtnFD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD7ActionPerformed
        String kode = tableFD7.getModel().getValueAt(tableFD7.getModel().getRowCount() - 1, 0).toString();
        String perleng = tableFD7.getModel().getValueAt(tableFD7.getModel().getRowCount() - 1, 1).toString();
        String jumlah = tableFD7.getModel().getValueAt(tableFD7.getModel().getRowCount() - 1, 2).toString();
        int jumlahInt = Integer.parseInt(jumlah);

        kodeUnitFD7.setText(kode);
        perlengkapanFD7.setText(perleng);
        jumlahPerlengkapanFD7.setValue(jumlahInt);
    }//GEN-LAST:event_lastBtnFD7ActionPerformed

    private void firstBtnFD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnFD7ActionPerformed
        String kode = tableFD7.getModel().getValueAt(0, 0).toString();
        String perleng = tableFD7.getModel().getValueAt(0, 1).toString();
        String jumlah = tableFD7.getModel().getValueAt(0, 2).toString();

        kodeUnitFD7.setText(kode);
        perlengkapanFD7.setText(perleng);
        jumlahPerlengkapanFD7.setValue(Integer.parseInt(jumlah));
    }//GEN-LAST:event_firstBtnFD7ActionPerformed

    private void addBtnFD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD7ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD7ActionPerformed

    private void addBtnFD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD5ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD5ActionPerformed

    private void lastBtnFD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD5ActionPerformed
        String nama = tableFD5.getModel().getValueAt(tableFD5.getModel().getRowCount() - 1, 0).toString();
        String alamat = tableFD5.getModel().getValueAt(tableFD5.getModel().getRowCount() - 1, 1).toString();
        String noHP = tableFD5.getModel().getValueAt(tableFD5.getModel().getRowCount() - 1, 2).toString();

        namaPelangganFD5.setText(nama);
        alamatFD5.setText(alamat);
        noHPFD5.setText(noHP);
    }//GEN-LAST:event_lastBtnFD5ActionPerformed

    private void searchBtnFD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD5ActionPerformed
        namaPelangganFD5.setText("");
        alamatFD5.setText("");
        noHPFD5.setText("");
        namaPelangganFD5.setEditable(true);
        alamatFD5.setEnabled(false);
        noHPFD5.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250, 155, 40, 40);
        noFD1.setBounds(300, 155, 40, 40);
        jPanel5.add(yesFD1);
        jPanel5.add(noFD1);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_5";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                    while (resultSet.next()) {
                        namaPelangganFD5.setText(resultSet.getString(1));
                        alamatFD5.setText(resultSet.getString(2));
                        noHPFD5.setText(resultSet.getString(3));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                namaPelangganFD5.setEditable(false);
                alamatFD5.setEnabled(true);
                noHPFD5.setEnabled(true);
            }
        });

        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String nama = "";
                nama = namaPelangganFD5.getText();
                String selectSql="";
                selectSql = "SELECT * FROM FD_5 " + "WHERE Nama_Pelanggan='" + nama + "'";
               
                String connectionUr1
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                        alamatFD5.setText(resultSet.getString(2));
                        noHPFD5.setText(resultSet.getString(3));
                    }
                    
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });    
    }//GEN-LAST:event_searchBtnFD5ActionPerformed

    private void nextBtnFD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnFD5ActionPerformed
        String currNamaFD2 = namaPelangganFD5.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currNamaFD2)) {
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the last data.");
            return;
        }
        String nama = model.getValueAt(currRow + 1, 0).toString();
        String alamat = model.getValueAt(currRow + 1, 1).toString();
        String noHP = model.getValueAt(currRow + 1, 2).toString();

        namaPelangganFD5.setText(nama);
        alamatFD5.setText(alamat);
        noHPFD5.setText(noHP);
    }//GEN-LAST:event_nextBtnFD5ActionPerformed

    private void firstBtnFD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnFD5ActionPerformed
        String nama = tableFD5.getModel().getValueAt(0, 0).toString();
        String alamat = tableFD5.getModel().getValueAt(0, 1).toString();
        String noHP = tableFD5.getModel().getValueAt(0, 2).toString();

        namaPelangganFD5.setText(nama);
        alamatFD5.setText(alamat);
        noHPFD5.setText(noHP);
    }//GEN-LAST:event_firstBtnFD5ActionPerformed

    private void backBtnFD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnFD5ActionPerformed
        String currNamaFD2 = namaPelangganFD5.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currNamaFD2)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String nama = model.getValueAt(currRow - 1, 0).toString();
        String alamat = model.getValueAt(currRow - 1, 1).toString();
        String noHp = model.getValueAt(currRow - 1, 2).toString();

        namaPelangganFD5.setText(nama);
        alamatFD5.setText(alamat);
        noHPFD5.setText(noHp);
    }//GEN-LAST:event_backBtnFD5ActionPerformed

    private void addBtnFD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD6ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD6ActionPerformed

    private void lastBtnFD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD6ActionPerformed
        String keterangan = tableFD6.getModel().getValueAt(tableFD6.getModel().getRowCount() - 1, 0).toString();
        String biaya = tableFD6.getModel().getValueAt(tableFD6.getModel().getRowCount() - 1, 1).toString();

        ketFD6.setText(keterangan);
        biayaPengFD6.setText(biaya);
    }//GEN-LAST:event_lastBtnFD6ActionPerformed

    private void searchBtnFD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD6ActionPerformed
        ketFD6.setText("");
        biayaPengFD6.setText("");       
        ketFD6.setEditable(true);
        biayaPengFD6.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();

        JButton yesFD8 = new JButton("✓");
        JButton noFD8 = new JButton("✕");
        yesFD8.setBounds(250, 115, 40, 40);
        noFD8.setBounds(300, 115, 40, 40);
        jPanel6.add(yesFD8);
        jPanel6.add(noFD8);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_6";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                    while (resultSet.next()) {
                        ketFD6.setText(resultSet.getString(1));
                        biayaPengFD6.setText(resultSet.getString(2));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                }
                yesFD8.setVisible(false);
                noFD8.setVisible(false);
                ketFD6.setEditable(false);
                biayaPengFD6.setEnabled(true);
            }
        });

        yesFD8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String keterangan = "";
                keterangan = ketFD6.getText();
                String connectionUr1
                        = "jdbc:sqlserver://LAPTOP-77JR298K;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_6 "
                        + "WHERE Ket_Pengerjaan ='" + keterangan + "'";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                }
            }
        });
    }//GEN-LAST:event_searchBtnFD6ActionPerformed

    private void nextBtnFD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnFD6ActionPerformed
        String currKetFD2 = ketFD6.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKetFD2)) {
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the last data.");
            return;
        }
        String keterangan = model.getValueAt(currRow + 1, 0).toString();
        String biaya = model.getValueAt(currRow + 1, 1).toString();

        ketFD6.setText(keterangan);
        biayaPengFD6.setText(biaya);
    }//GEN-LAST:event_nextBtnFD6ActionPerformed

    private void firstBtnFD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnFD6ActionPerformed
        String keterangan = tableFD6.getModel().getValueAt(0, 0).toString();
        String biaya = tableFD6.getModel().getValueAt(0, 1).toString();

        ketFD6.setText(keterangan);
        biayaPengFD6.setText(biaya);
    }//GEN-LAST:event_firstBtnFD6ActionPerformed

    private void backBtnFD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnFD6ActionPerformed
        String currKetFD2 = ketFD6.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKetFD2)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String keterangan = model.getValueAt(currRow - 1, 0).toString();
        String biaya = model.getValueAt(currRow - 1, 1).toString();

        ketFD6.setText(keterangan);
        biayaPengFD6.setText(biaya);
    }//GEN-LAST:event_backBtnFD6ActionPerformed

    private void txtWAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWAActionPerformed

    private void lastBtnFD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD4ActionPerformed
        String alamat = tableFD4.getModel().getValueAt(0, 0).toString();
        String waToko = tableFD4.getModel().getValueAt(0, 1).toString();

        alamatFD4.setText(alamat);
        txtWA.setText(waToko);
    }//GEN-LAST:event_lastBtnFD4ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        String currAlamat = alamatFD4.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currAlamat)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String alamat = tableFD4.getModel().getValueAt(currRow - 1, 0).toString();
        String waToko = tableFD4.getModel().getValueAt(currRow - 1, 1).toString();

        alamatFD4.setText(alamat);
        txtWA.setText(waToko);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void addBtnFD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD4ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD4ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        String alamat = tableFD4.getModel().getValueAt(tableFD4.getModel().getRowCount() - 1, 0).toString();
        String waToko = tableFD4.getModel().getValueAt(tableFD4.getModel().getRowCount() - 1, 1).toString();

        alamatFD4.setText(alamat);
        txtWA.setText(waToko);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void searchBtnFD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD4ActionPerformed
        alamatFD4.setText("");
        txtWA.setText("");
        alamatFD4.setEditable(true);
        txtWA.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250, 115, 40, 40);
        noFD1.setBounds(300, 115, 40, 40);
        jPanel4.add(yesFD1);
        jPanel4.add(noFD1);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_4";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                    while (resultSet.next()) {
                        alamatFD4.setText(resultSet.getString(1));
                        txtWA.setText(resultSet.getString(2));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                alamatFD4.setEditable(false);
                txtWA.setEnabled(true);
            }
        });

        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String alamat = "";
                alamat = alamatFD4.getText();
                String selectSql="";
                selectSql = "SELECT * FROM FD_4 " + "WHERE Alamat_Toko='" + alamat + "'";
                String connectionUr1
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                        txtWA.setText(resultSet.getString(2));
                    }
                    
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_searchBtnFD4ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        String currAlamat = alamatFD4.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currAlamat)) {
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String alamat = tableFD4.getModel().getValueAt(currRow + 1, 0).toString();
        String waToko = tableFD4.getModel().getValueAt(currRow + 1, 1).toString();

        alamatFD4.setText(alamat);
        txtWA.setText(waToko);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void searchBtnFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD3ActionPerformed
        noNotaFD3.setText("");
        alamatTokoFD3.setText("");
        namaPelangganFD3.setText("");
        tanggalFD3.setText("");
        statusPengambilanFD3.setText("");
        noNotaFD3.setEditable(true);
        txtNamaToko.setEnabled(false);
        alamatTokoFD3.setEnabled(false);
        namaPelangganFD3.setEnabled(false);
        tanggalFD3.setEnabled(false);
        statusPengambilanFD3.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250, 250, 40, 40);
        noFD1.setBounds(300, 250, 40, 40);
        jPanel3.add(yesFD1);
        jPanel3.add(noFD1);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_3";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
                            resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)});
                    }
                    while (resultSet.next()) {
                        noNotaFD3.setText(resultSet.getString(1));
                        alamatTokoFD3.setText(resultSet.getString(2));
                        namaPelangganFD3.setText(resultSet.getString(3));
                        tanggalFD3.setText(resultSet.getString(4));
                        statusPengambilanFD3.setText(resultSet.getString(5));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                noNotaFD3.setEditable(false);
                alamatTokoFD3.setEnabled(true);
                namaPelangganFD3.setEnabled(true);
                tanggalFD3.setEnabled(true);
                statusPengambilanFD3.setEnabled(true);
            }
        });

        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String noNota = "";
                noNota = noNotaFD3.getText();
                String selectSql="";
                selectSql = "SELECT * FROM FD_3 " + "WHERE No_Nota ='" + noNota + "'";
               
                String connectionUr1
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
                        resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)});
                        alamatTokoFD3.setText(resultSet.getString(2));
                        namaPelangganFD3.setText(resultSet.getString(3));
                        tanggalFD3.setText(resultSet.getString(4));
                        statusPengambilanFD3.setText(resultSet.getString(5));
                    }
                    
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        }); 
    }//GEN-LAST:event_searchBtnFD3ActionPerformed

    private void nextBtnFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnFD3ActionPerformed
        String currNoNota = noNotaFD3.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currNoNota)) {
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the last data.");
            return;
        }
        String noNota = tableFD3.getModel().getValueAt(currRow + 1, 0).toString();
        String Alamat = tableFD3.getModel().getValueAt(currRow + 1, 1).toString();
        String namaToko = tableFD3.getModel().getValueAt(currRow + 1, 2).toString();
        String namaPelanggan = tableFD3.getModel().getValueAt(currRow + 1, 3).toString();
        String tanggal = tableFD3.getModel().getValueAt(currRow + 1, 4).toString();
        String status = tableFD3.getModel().getValueAt(currRow + 1, 5).toString();

        noNotaFD3.setText(noNota);
        alamatTokoFD3.setText(Alamat);
        txtNamaToko.setText(namaToko);
        namaPelangganFD3.setText(namaPelanggan);
        tanggalFD3.setText(tanggal);
        statusPengambilanFD3.setText(status);
    }//GEN-LAST:event_nextBtnFD3ActionPerformed

    private void firstBtnFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnFD3ActionPerformed
        String noNota = tableFD3.getModel().getValueAt(0, 0).toString();
        String Alamat = tableFD3.getModel().getValueAt(0, 1).toString();
        String namaToko = tableFD3.getModel().getValueAt(0, 2).toString();
        String namaPelanggan = tableFD3.getModel().getValueAt(0, 3).toString();
        String tanggal = tableFD3.getModel().getValueAt(0, 4).toString();
        String status = tableFD3.getModel().getValueAt(0, 5).toString();
       

        noNotaFD3.setText(noNota);
        alamatTokoFD3.setText(Alamat);
        txtNamaToko.setText(namaToko);
        namaPelangganFD3.setText(namaPelanggan);
        tanggalFD3.setText(tanggal);
        statusPengambilanFD3.setText(status);
    }//GEN-LAST:event_firstBtnFD3ActionPerformed

    private void backBtnFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnFD3ActionPerformed
        String currNoNota = noNotaFD3.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currNoNota)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String noNota = tableFD3.getModel().getValueAt(currRow - 1, 0).toString();
        String Alamat = tableFD3.getModel().getValueAt(currRow - 1, 1).toString();
        String namaToko = tableFD3.getModel().getValueAt(currRow - 1, 2).toString();
        String namaPelanggan = tableFD3.getModel().getValueAt(currRow - 1, 3).toString();
        String tanggal = tableFD3.getModel().getValueAt(currRow - 1, 4).toString();
        String status = tableFD3.getModel().getValueAt(currRow - 1, 5).toString();

        noNotaFD3.setText(noNota);
        alamatTokoFD3.setText(Alamat);
        txtNamaToko.setText(namaToko);
        namaPelangganFD3.setText(namaPelanggan);
        tanggalFD3.setText(tanggal);
        statusPengambilanFD3.setText(status);
    }//GEN-LAST:event_backBtnFD3ActionPerformed

    private void addBtnFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD3ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD3ActionPerformed

    private void lastBtnFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD3ActionPerformed
        String noNota = tableFD3.getModel().getValueAt(tableFD3.getModel().getRowCount() - 1, 0).toString();
        String Alamat = tableFD3.getModel().getValueAt(tableFD3.getModel().getRowCount() - 1, 1).toString();
        String namaToko = tableFD3.getModel().getValueAt(tableFD3.getModel().getRowCount() - 1, 2).toString();
        String namaPelanggan = tableFD3.getModel().getValueAt(tableFD3.getModel().getRowCount() - 1, 3).toString();
        String tanggal = tableFD3.getModel().getValueAt(tableFD3.getModel().getRowCount() - 1, 4).toString();
        String status = tableFD3.getModel().getValueAt(tableFD3.getModel().getRowCount() - 1, 5).toString();

        

        noNotaFD3.setText(noNota);
        alamatTokoFD3.setText(Alamat);
        txtNamaToko.setText(namaToko);
        namaPelangganFD3.setText(namaPelanggan);
        tanggalFD3.setText(tanggal);
        statusPengambilanFD3.setText(status);
    }//GEN-LAST:event_lastBtnFD3ActionPerformed

    private void noNotaFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noNotaFD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noNotaFD1ActionPerformed

    private void KodeUnitFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KodeUnitFD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KodeUnitFD1ActionPerformed

    private void KeluhanFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluhanFD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeluhanFD2ActionPerformed

    private void KetFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KetFD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KetFD2ActionPerformed

    private void addBtnFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD1ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD1ActionPerformed

    private void lastBtnFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD1ActionPerformed
        String noNota = tableFD1.getModel().getValueAt(tableFD1.getModel().getRowCount() - 1, 0).toString();
        String kodeUnit = tableFD1.getModel().getValueAt(tableFD1.getModel().getRowCount() - 1, 1).toString();
        String kondisiUnit = tableFD1.getModel().getValueAt(tableFD1.getModel().getRowCount() - 1, 2).toString();

        noNotaFD1.setText(noNota);
        KodeUnitFD1.setText(kodeUnit);
        KsiUnitFD1.setText(kondisiUnit);
    }//GEN-LAST:event_lastBtnFD1ActionPerformed

    private void searchBtnFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD1ActionPerformed
        noNotaFD1.setText("");
        KodeUnitFD1.setText("");
        KsiUnitFD1.setText("");
        noNotaFD1.setEditable(true);
        KodeUnitFD1.setEditable(true);
        KsiUnitFD1.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250, 155, 40, 40);
        noFD1.setBounds(300, 155, 40, 40);
        jPanel1.add(yesFD1);
        jPanel1.add(noFD1);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_1";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                    while (resultSet.next()) {
                        noNotaFD1.setText(resultSet.getString(1));
                        KodeUnitFD1.setText(resultSet.getString(2));
                        KsiUnitFD1.setText(resultSet.getString(3));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                noNotaFD1.setEditable(false);
                KodeUnitFD1.setEditable(false);
                KsiUnitFD1.setEnabled(true);
            }
        });

        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String noNota = "";
                String kodeUnit = "";
                noNota = noNotaFD1.getText();
                kodeUnit = KodeUnitFD1.getText();
                String selectSql="";
                if(noNota.equals("")&& !kodeUnit.equals("")){
                    selectSql = "SELECT * FROM FD_1 "
                        + "WHERE Kode_unit='" + kodeUnit + "'";
                } else if (kodeUnit.equals("")&& !noNota.equals("")){
                    selectSql = "SELECT * FROM FD_1 "
                        + "WHERE No_Nota='" + noNota + "'";
                } else {
                    selectSql = "SELECT * FROM FD_1 "
                        + "WHERE No_Nota='" + noNota
                        + "' AND Kode_Unit='" + kodeUnit + "'";
                }
                String connectionUr1
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                        KsiUnitFD1.setText(resultSet.getString(3));
                    }
                    
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });    
    }//GEN-LAST:event_searchBtnFD1ActionPerformed

    private void nextBtnFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnFD1ActionPerformed
        String currNoNota = noNotaFD1.getText();
        String currKodeUnit = KodeUnitFD1.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currNoNota)
                    && model.getValueAt(i, 1).toString().equalsIgnoreCase(currKodeUnit)) {
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the last data.");
            return;
        }
        String noNota = model.getValueAt(currRow + 1, 0).toString();
        String kodeUnit = model.getValueAt(currRow + 1, 1).toString();
        String kondisiUnit = model.getValueAt(currRow + 1, 2).toString();

        noNotaFD1.setText(noNota);
        KodeUnitFD1.setText(kodeUnit);
        KsiUnitFD1.setText(kondisiUnit);
    }//GEN-LAST:event_nextBtnFD1ActionPerformed

    private void firstBtnFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnFD1ActionPerformed
        String noNota = tableFD1.getModel().getValueAt(0, 0).toString();
        String kodeUnit = tableFD1.getModel().getValueAt(0, 1).toString();
        String kondisiUnit = tableFD1.getModel().getValueAt(0, 2).toString();

        noNotaFD1.setText(noNota);
        KodeUnitFD1.setText(kodeUnit);
        KsiUnitFD1.setText(kondisiUnit);
    }//GEN-LAST:event_firstBtnFD1ActionPerformed

    private void backBtnFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnFD1ActionPerformed
        String currNoNota = noNotaFD1.getText();
        String currKodeUnit = KodeUnitFD1.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currNoNota)
                    && model.getValueAt(i, 1).toString().equalsIgnoreCase(currKodeUnit)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String noNota = model.getValueAt(currRow - 1, 0).toString();
        String kodeUnit = model.getValueAt(currRow - 1, 1).toString();
        String kondisiUnit = model.getValueAt(currRow - 1, 2).toString();

        noNotaFD1.setText(noNota);
        KodeUnitFD1.setText(kodeUnit);
        KsiUnitFD1.setText(kondisiUnit);
    }//GEN-LAST:event_backBtnFD1ActionPerformed

    private void addBtnFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFD2ActionPerformed
        addData ad = new addData();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnFD2ActionPerformed

    private void lastBtnFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnFD2ActionPerformed
        String keluhan = tableFD2.getModel().getValueAt(tableFD2.getModel().getRowCount() - 1, 0).toString();
        String kodeUnit = tableFD2.getModel().getValueAt(tableFD2.getModel().getRowCount() - 1, 1).toString();
        String keterangan = tableFD2.getModel().getValueAt(tableFD2.getModel().getRowCount() - 1, 2).toString();

        KeluhanFD2.setText(keluhan);
        KodeUnitFD2.setText(kodeUnit);
        KetFD2.setText(keterangan);
    }//GEN-LAST:event_lastBtnFD2ActionPerformed

    private void searchBtnFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnFD2ActionPerformed
        KeluhanFD2.setText("");
        KodeUnitFD2.setText("");
        KetFD2.setText("");
        KeluhanFD2.setEditable(true);
        KodeUnitFD2.setEditable(true);
        KetFD2.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250, 155, 40, 40);
        noFD1.setBounds(300, 155, 40, 40);
        jPanel2.add(yesFD1);
        jPanel2.add(noFD1);

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_2";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                    while (resultSet.next()) {
                        KeluhanFD2.setText(resultSet.getString(1));
                        KodeUnitFD2.setText(resultSet.getString(2));
                        KetFD2.setText(resultSet.getString(3));
                    }
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                KeluhanFD2.setEditable(false);
                KodeUnitFD2.setEditable(false);
                KetFD2.setEnabled(true);
            }
        });

        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String keluhan = "";
                String kodeUnit = "";
                keluhan = KeluhanFD2.getText();
                kodeUnit = KodeUnitFD2.getText();
                String selectSql="";
                if(keluhan.equals("")&& !kodeUnit.equals("")){
                    selectSql = "SELECT * FROM FD_2 "
                        + "WHERE Kode_unit='" + kodeUnit + "'";
                } else if (kodeUnit.equals("")&& !keluhan.equals("")){
                    selectSql = "SELECT * FROM FD_2 "
                        + "WHERE Keluhan='" + keluhan + "'";
                } else {
                    selectSql = "SELECT * FROM FD_2 "
                        + "WHERE Keluhan='" + keluhan
                        + "' AND Kode_Unit='" + kodeUnit + "'";
                }
                String connectionUr1
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
                ResultSet resultSet = null;
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                        KetFD2.setText(resultSet.getString(3));
                    }
                    
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_searchBtnFD2ActionPerformed

    private void nextBtnFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnFD2ActionPerformed
        String currKeluhanFD2 = KeluhanFD2.getText();
        String currKodeUnit = KodeUnitFD2.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKeluhanFD2)
                    && model.getValueAt(i, 1).toString().equalsIgnoreCase(currKodeUnit)) {
                currRow = i;
                break;
            }
        }
        if (currRow == model.getRowCount() - 1) {
            JOptionPane.showMessageDialog(null, "This is the last data.");
            return;
        }
        String keluhan = model.getValueAt(currRow + 1, 0).toString();
        String kodeUnit = model.getValueAt(currRow + 1, 1).toString();
        String keterangan = model.getValueAt(currRow + 1, 2).toString();

        KeluhanFD2.setText(keluhan);
        KodeUnitFD2.setText(kodeUnit);
        KetFD2.setText(keterangan);
    }//GEN-LAST:event_nextBtnFD2ActionPerformed

    private void firstBtnFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnFD2ActionPerformed
        String keluhan = tableFD2.getModel().getValueAt(0, 0).toString();
        String kodeUnit = tableFD2.getModel().getValueAt(0, 1).toString();
        String keterangan = tableFD2.getModel().getValueAt(0, 2).toString();

        KeluhanFD2.setText(keluhan);
        KodeUnitFD2.setText(kodeUnit);
        KetFD2.setText(keterangan);
    }//GEN-LAST:event_firstBtnFD2ActionPerformed

    private void backBtnFD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnFD2ActionPerformed
        String currKeluhanFD2 = KeluhanFD2.getText();
        String currKodeUnit = KodeUnitFD2.getText();
        DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();
        int currRow = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(currKeluhanFD2)
                    && model.getValueAt(i, 1).toString().equalsIgnoreCase(currKodeUnit)) {
                currRow = i;
                break;
            }
        }
        if (currRow == 0) {
            JOptionPane.showMessageDialog(null, "This is the first data.");
            return;
        }
        String Keluhan = model.getValueAt(currRow - 1, 0).toString();
        String kodeUnit = model.getValueAt(currRow - 1, 1).toString();
        String kondisiUnit = model.getValueAt(currRow - 1, 2).toString();

        KeluhanFD2.setText(Keluhan);
        KodeUnitFD2.setText(kodeUnit);
        KetFD2.setText(kondisiUnit);
    }//GEN-LAST:event_backBtnFD2ActionPerformed

    private void noNotaFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noNotaFD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noNotaFD3ActionPerformed

    private void alamatFD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatFD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatFD4ActionPerformed

    private void KsiUnitFD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KsiUnitFD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KsiUnitFD1ActionPerformed

    private void alamatTokoFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTokoFD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTokoFD3ActionPerformed

    private void statusPengambilanFD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusPengambilanFD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusPengambilanFD3ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        deleteData delDat = new deleteData();
        delDat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        merekFD8.setText("");
        merekFD8.setEditable(true);
        DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();

        JButton yesFD8 = new JButton("✓");
        JButton noFD8 = new JButton("✕");
        yesFD8.setBounds(250, 115, 40, 40);
        noFD8.setBounds(300, 115, 40, 40);
        jPanel8.add(yesFD8);
        jPanel8.add(noFD8);
        
        noFD8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_8";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                        if(resultSet.getString(1).equalsIgnoreCase(kodeUnitFD8.getText())) {
                            merekFD8.setText(resultSet.getString(2));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD8.setVisible(false);
                noFD8.setVisible(false);
                merekFD8.setEditable(false);
            }
        });
        
        yesFD8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String kodeUnit = "";
                String merek = "";
                kodeUnit = kodeUnitFD8.getText();
                merek = merekFD8.getText();
                String selectSql="";
                String updateSql="";
                updateSql = "UPDATE FD_8 SET Model_Barang ='"+merek+"' WHERE Kode_Unit ='"+kodeUnit+"';";
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_8";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD8.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        KsiUnitFD1.setText("");
        KsiUnitFD1.setEditable(true);
        DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250, 155, 40, 40);
        noFD1.setBounds(300, 155, 40, 40);
        jPanel1.add(yesFD1);
        jPanel1.add(noFD1);
        
        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_1";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                        if(resultSet.getString(1).equalsIgnoreCase(noNotaFD1.getText()) && resultSet.getString(2).equalsIgnoreCase(KodeUnitFD1.getText())) {
                        	KsiUnitFD1.setText(resultSet.getString(3));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                noNotaFD1.setEditable(false);
                KodeUnitFD1.setEditable(false);
            }
        });
        
        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String noNota = "";
                String kodeUnit = "";
                String KondisiUnit = "";
                noNota = noNotaFD1.getText();
                kodeUnit = KodeUnitFD1.getText();
                KondisiUnit = KsiUnitFD1.getText();
                String selectSql="";
                String updateSql="";
                if(noNota.equals("")&& !kodeUnit.equals("")){
                    updateSql = "UPDATE FD_1 SET Kondisi_Unit ='" + KondisiUnit
                        + "' WHERE Kode_unit='" + kodeUnit + "'";
                } else if (kodeUnit.equals("")&& !noNota.equals("")){
                    updateSql = "UPDATE FD_1 SET Kondisi_Unit ='" + KondisiUnit
                        + "' WHERE No_Nota='" + noNota + "'";
                } else {
                    updateSql = "UPDATE FD_1 SET Kondisi_Unit ='" + KondisiUnit
                        + "' WHERE No_Nota='" + noNota
                        + "' AND Kode_Unit='" + kodeUnit + "'";
                }
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_1";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD1.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
          try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        alamatFD5.setText("");
        noHPFD5.setText("");
        alamatFD5.setEditable(true);
        noHPFD5.setEditable(true);
        DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();

        JButton yesFD5 = new JButton("✓");
        JButton noFD5 = new JButton("✕");
        yesFD5.setBounds(250, 155, 40, 40);
        noFD5.setBounds(300, 155, 40, 40);
        jPanel5.add(yesFD5);
        jPanel5.add(noFD5);
        
        noFD5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_5";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                        if(resultSet.getString(1).equalsIgnoreCase(namaPelangganFD5.getText())) {
                            noHPFD5.setText(resultSet.getString(3));
                            alamatFD5.setText(resultSet.getString(2));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD5.setVisible(false);
                noFD5.setVisible(false);
                alamatFD5.setEditable(false);
                noHPFD5.setEditable(false);
            }
        });
        
        yesFD5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String namaPelanggan = "";
                String alamat = "";
                String noHP = "";
                namaPelanggan = namaPelangganFD5.getText();
                alamat = alamatFD5.getText();
                noHP = noHPFD5.getText();
                String selectSql="";
                String updateSql="";
                updateSql = "UPDATE FD_5 SET Alamat_Pelanggan ='"+alamat+"' WHERE nama_Pelanggan ='"+namaPelanggan+"'; "
                        + "UPDATE FD_5 SET WA_Pelanggan ='"+noHP+"' WHERE nama_Pelanggan='"+namaPelanggan+"'";
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_5";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD5.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        KetFD2.setText("");
        KetFD2.setEditable(true);
        DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250, 155, 40, 40);
        noFD1.setBounds(300, 155, 40, 40);
        jPanel2.add(yesFD1);
        jPanel2.add(noFD1);
        
        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_2";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                        if(resultSet.getString(1).equalsIgnoreCase(KeluhanFD2.getText()) && resultSet.getString(2).equalsIgnoreCase(KodeUnitFD2.getText())) {
                        	KetFD2.setText(resultSet.getString(3));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                KeluhanFD2.setEditable(false);
                KodeUnitFD2.setEditable(false);
            }
        });
        
        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String Keluhan = "";
                String kodeUnit = "";
                String Keterangan = "";
                Keluhan = KeluhanFD2.getText();
                kodeUnit = KodeUnitFD2.getText();
                Keterangan = KetFD2.getText();
                String selectSql="";
                String updateSql="";
                if(Keluhan.equals("")&& !kodeUnit.equals("")){
                    updateSql = "UPDATE FD_2 SET Ket_Pengerjaan ='" + Keterangan
                        + "' WHERE Kode_unit='" + kodeUnit + "'";
                } else if (kodeUnit.equals("")&& !Keluhan.equals("")){
                    updateSql = "UPDATE FD_2 SET Ket_Pengerjaan ='" + Keterangan
                        + "' WHERE Keluhan ='" + Keluhan + "'";
                } else {
                    updateSql = "UPDATE FD_2 SET Ket_Pengerjaan ='" + Keterangan
                        + "' WHERE Keluhan ='" + Keluhan
                        + "' AND Kode_Unit ='" + kodeUnit + "'";
                }
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_2";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD2.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        biayaPengFD6.setText("");
        biayaPengFD6.setEditable(true);
        DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();

        JButton yesFD6 = new JButton("✓");
        JButton noFD6 = new JButton("✕");
        yesFD6.setBounds(250, 115, 40, 40);
        noFD6.setBounds(300, 115, 40, 40);
        jPanel6.add(yesFD6);
        jPanel6.add(noFD6);
        
        noFD6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_6";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                        if(resultSet.getString(1).equalsIgnoreCase(ketFD6.getText())) {
                            biayaPengFD6.setText(resultSet.getString(2));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD6.setVisible(false);
                noFD6.setVisible(false);
                biayaPengFD6.setEditable(false);
            }
        });
        
        yesFD6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String keterangan = "";
                String biayaPengerjaan = "";
                keterangan = ketFD6.getText();
                biayaPengerjaan = biayaPengFD6.getText();
                String selectSql="";
                String updateSql="";
                updateSql = "UPDATE FD_6 SET Biaya_Pengerjaan ='"+biayaPengerjaan+"' WHERE Ket_Pengerjaan ='"+keterangan+"';";
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_6";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD6.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        txtWA.setText("");
        txtWA.setEditable(true);
        DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();

        JButton yesFD6 = new JButton("✓");
        JButton noFD6 = new JButton("✕");
        yesFD6.setBounds(250, 115, 40, 40);
        noFD6.setBounds(300, 115, 40, 40);
        jPanel4.add(yesFD6);
        jPanel4.add(noFD6);
        
        noFD6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_4";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                        if(resultSet.getString(1).equalsIgnoreCase(alamatFD4.getText())) {
                            txtWA.setText(resultSet.getString(2));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD6.setVisible(false);
                noFD6.setVisible(false);
                txtWA.setEditable(false);
            }
        });
        
        yesFD6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String alamat = "";
                String WAToko = "";
                alamat = alamatFD4.getText();
                WAToko = txtWA.getText();
                String selectSql="";
                String updateSql="";
                updateSql = "UPDATE FD_4 SET WA_Toko ='"+WAToko+"' WHERE Alamat_Toko ='"+alamat+"';";
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_4";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD4.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        jumlahPerlengkapanFD7.setValue(0);
        jumlahPerlengkapanFD7.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();

        JButton yesFD7 = new JButton("✓");
        JButton noFD7 = new JButton("✕");
        yesFD7.setBounds(250, 155, 40, 40);
        noFD7.setBounds(300, 155, 40, 40);
        jPanel7.add(yesFD7);
        jPanel7.add(noFD7);
        
        noFD7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_7";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                        if(resultSet.getString(1).equalsIgnoreCase(kodeUnitFD7.getText())&&resultSet.getString(2).equalsIgnoreCase(perlengkapanFD7.getText())) {
                            jumlahPerlengkapanFD7.setValue(Integer.parseInt(resultSet.getString(3)));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD7.setVisible(false);
                noFD7.setVisible(false);
                jumlahPerlengkapanFD7.setEnabled(false);
            }
        });
        
        yesFD7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String kodeUnit = "";
                String perlengkapan = "";
                String jumlah = "";
                kodeUnit = kodeUnitFD7.getText();
                perlengkapan = perlengkapanFD7.getText();
                jumlah = jumlahPerlengkapanFD7.getValue().toString();
                String selectSql="";
                String updateSql="";
                updateSql = "UPDATE FD_7 SET Jumlah_Barang ='"+jumlah+"' WHERE Kode_Unit ='"+kodeUnit+"' AND Perlengkapan='"+perlengkapan+"';";
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_7";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD7.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        alamatTokoFD3.setText("");
        alamatTokoFD3.setEditable(true);
        namaPelangganFD3.setText("");
        namaPelangganFD3.setEditable(true);
        tanggalFD3.setText("");
        tanggalFD3.setEditable(true);
        statusPengambilanFD3.setText("");
        statusPengambilanFD3.setEditable(true);
        DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();

        JButton yesFD1 = new JButton("✓");
        JButton noFD1 = new JButton("✕");
        yesFD1.setBounds(250,250, 40, 40);
        noFD1.setBounds(300, 250, 40, 40);
        jPanel3.add(yesFD1);
        jPanel3.add(noFD1);
        
        noFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ResultSet resultSet = null;
                String selectSql = "SELECT * FROM FD_3";
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), 
                            resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)});
                        if(resultSet.getString(1).equalsIgnoreCase(noNotaFD3.getText())) {
                        	alamatTokoFD3.setText(resultSet.getString(2)); 
                                namaPelangganFD3.setText(resultSet.getString(4));
                                tanggalFD3.setText(resultSet.getString(5));
                                statusPengambilanFD3.setText(resultSet.getString(6));
                        }
                    }
                    
                } catch (SQLException x) {
                    x.printStackTrace();
                } 
                yesFD1.setVisible(false);
                noFD1.setVisible(false);
                noNotaFD3.setEditable(false);
            }
        });
        
        yesFD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (model.getRowCount() > 0) {
                    model.removeRow(0);
                }
                String noNota = "";
                String alamat = "";
                String nama = "";
                String tanggal = "";
                String status = "";
                noNota = noNotaFD3.getText();
                alamat = alamatTokoFD3.getText();
                nama = namaPelangganFD3.getText();
                tanggal = tanggalFD3.getText();
                status = statusPengambilanFD3.getText();
                String selectSql="";
                String updateSql="";
                updateSql = "UPDATE FD_3 SET Alamat_Toko ='" + alamat + "' WHERE No_Nota ='" + noNota + "'; " +
                        "UPDATE FD_3 SET Nama_Pelanggan ='" + nama + "' WHERE No_Nota ='" + noNota + "'; " +
                        "UPDATE FD_3 SET Tanggal ='" + tanggal + "' WHERE No_Nota ='" + noNota + "'; " +
                        "UPDATE FD_3 SET Status_Pengambilan ='" + status + "' WHERE No_Nota ='" + noNota + "'";
                ResultSet resultSet = null;
                selectSql = "SELECT * FROM FD_3";
                
                try (Connection connection = DriverManager.getConnection(connectionUr1);) {
                    Statement statement = connection.createStatement();
                    statement.executeUpdate(updateSql);
                    resultSet = statement.executeQuery(selectSql);
                    DefaultTableModel model = (DefaultTableModel) tableFD3.getModel();
                    while (resultSet.next()) {
                        model.addRow(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), 
                            resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)});
                    }
                } catch (SQLException s) {
                    s.printStackTrace();
                } 
            }
        });
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
        try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
        try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
        try {            
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String connectionUrl 
                        = "jdbc:sqlserver://localhost:1433;"
                        + "database=Projek_Basdat;"
                        + "user=sa;"
                        + "password=mdaf;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
              try (Connection con = DriverManager.getConnection(connectionUrl)) {
                  String reportPath = "C:\\Users\\USER\\OneDrive\\Dokumen\\JavaApplication2\\JavaApplication2\\src\\javaapplication2\\LaporanProjekBasdat.jrxml";
                  JasperReport jr = JasperCompileManager.compileReport(reportPath);
                  JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                  JasperViewer.viewReport(jp);
              }        
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }//GEN-LAST:event_jButton67ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Basdat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Basdat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Basdat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Basdat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Basdat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KeluhanFD2;
    private javax.swing.JTextField KetFD2;
    private javax.swing.JTextField KodeUnitFD1;
    private javax.swing.JTextField KodeUnitFD2;
    private javax.swing.JTextField KsiUnitFD1;
    private javax.swing.JButton addBtnFD1;
    private javax.swing.JButton addBtnFD2;
    private javax.swing.JButton addBtnFD3;
    private javax.swing.JButton addBtnFD4;
    private javax.swing.JButton addBtnFD5;
    private javax.swing.JButton addBtnFD6;
    private javax.swing.JButton addBtnFD7;
    private javax.swing.JButton addBtnFD8;
    private javax.swing.JTextField alamatFD4;
    private javax.swing.JTextField alamatFD5;
    private javax.swing.JTextField alamatTokoFD3;
    private javax.swing.JButton backBtnFD1;
    private javax.swing.JButton backBtnFD2;
    private javax.swing.JButton backBtnFD3;
    private javax.swing.JButton backBtnFD5;
    private javax.swing.JButton backBtnFD6;
    private javax.swing.JButton backBtnFD7;
    private javax.swing.JButton backBtnFD8;
    private javax.swing.JTextField biayaPengFD6;
    private javax.swing.JButton firstBtnFD1;
    private javax.swing.JButton firstBtnFD2;
    private javax.swing.JButton firstBtnFD3;
    private javax.swing.JButton firstBtnFD5;
    private javax.swing.JButton firstBtnFD6;
    private javax.swing.JButton firstBtnFD7;
    private javax.swing.JButton firstBtnFD8;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JSpinner jumlahPerlengkapanFD7;
    private javax.swing.JTextField ketFD6;
    private javax.swing.JTextField kodeUnitFD7;
    private javax.swing.JTextField kodeUnitFD8;
    private javax.swing.JButton lastBtnFD1;
    private javax.swing.JButton lastBtnFD2;
    private javax.swing.JButton lastBtnFD3;
    private javax.swing.JButton lastBtnFD4;
    private javax.swing.JButton lastBtnFD5;
    private javax.swing.JButton lastBtnFD6;
    private javax.swing.JButton lastBtnFD7;
    private javax.swing.JButton lastBtnFD8;
    private javax.swing.JTextField merekFD8;
    private javax.swing.JTextField namaPelangganFD3;
    private javax.swing.JTextField namaPelangganFD5;
    private javax.swing.JButton nextBtnFD1;
    private javax.swing.JButton nextBtnFD2;
    private javax.swing.JButton nextBtnFD3;
    private javax.swing.JButton nextBtnFD5;
    private javax.swing.JButton nextBtnFD6;
    private javax.swing.JButton nextBtnFD7;
    private javax.swing.JButton nextBtnFD8;
    private javax.swing.JTextField noHPFD5;
    private javax.swing.JTextField noNotaFD1;
    private javax.swing.JTextField noNotaFD3;
    private javax.swing.JTextField perlengkapanFD7;
    private javax.swing.JButton searchBtnFD1;
    private javax.swing.JButton searchBtnFD2;
    private javax.swing.JButton searchBtnFD3;
    private javax.swing.JButton searchBtnFD4;
    private javax.swing.JButton searchBtnFD5;
    private javax.swing.JButton searchBtnFD6;
    private javax.swing.JButton searchBtnFD7;
    private javax.swing.JButton searchBtnFD8;
    private javax.swing.JTextField statusPengambilanFD3;
    private javax.swing.JTable tableFD1;
    private javax.swing.JTable tableFD2;
    private javax.swing.JTable tableFD3;
    private javax.swing.JTable tableFD4;
    private javax.swing.JTable tableFD5;
    private javax.swing.JTable tableFD6;
    private javax.swing.JTable tableFD7;
    private javax.swing.JTable tableFD8;
    private javax.swing.JTextField tanggalFD3;
    private javax.swing.JTextField txtNamaToko;
    private javax.swing.JTextField txtWA;
    // End of variables declaration//GEN-END:variables
}
