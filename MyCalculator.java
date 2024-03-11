package Calculator;

/**
 *
 * @author Orio
 */

public class MyCalculator extends javax.swing.JFrame {
    String operandl = "";
    String operator = "";
    
    boolean isEqualSign = false;
 
    public MyCalculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtKetqua = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSo1 = new javax.swing.JButton();
        btnSo2 = new javax.swing.JButton();
        btnSo3 = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnCanBac2 = new javax.swing.JButton();
        btnSo4 = new javax.swing.JButton();
        btnSo5 = new javax.swing.JButton();
        btnSo6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnPhanTram = new javax.swing.JButton();
        btnSo7 = new javax.swing.JButton();
        btnSo8 = new javax.swing.JButton();
        btnSo9 = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnPhanSo = new javax.swing.JButton();
        btnSo0 = new javax.swing.JButton();
        btnDaoDau = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel1.setText("Calculator");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtKetqua)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtKetqua, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        btnSo1.setText("1");
        btnSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo1);

        btnSo2.setText("2");
        btnSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo2);

        btnSo3.setText("3");
        btnSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo3);

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnChia);

        btnCanBac2.setText("sqrt");
        btnCanBac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanBac2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnCanBac2);

        btnSo4.setText("4");
        btnSo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo4);

        btnSo5.setText("5");
        btnSo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo5);

        btnSo6.setText("6");
        btnSo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo6);

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnNhan);

        btnPhanTram.setText("%");
        btnPhanTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanBac2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPhanTram);

        btnSo7.setText("7");
        btnSo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo7);

        btnSo8.setText("8");
        btnSo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo8);

        btnSo9.setText("9");
        btnSo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo9);

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnCong);

        btnPhanSo.setText("1/x");
        btnPhanSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanBac2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnPhanSo);

        btnSo0.setText("0");
        btnSo0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSo0);

        btnDaoDau.setText("+/-");
        btnDaoDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaoDauActionPerformed(evt);
            }
        });
        jPanel2.add(btnDaoDau);

        btnXoa.setText("C");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa);

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        jPanel2.add(btnTru);

        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel2.add(btnBang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    // Bam phim so hien thi len man hinh
    private void btnSo1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // Phuong thuc su ly khi bam tiep so se mat so cu di
        if(isEqualSign){
        	isEqualSign = false;
            txtKetqua.setText("");
        }
        
        // Phuong thuc su ly su kien de so hien len man hinh
        String cmd = evt.getActionCommand();
        
        txtKetqua.setText(txtKetqua.getText() + cmd);
    }                                      
   
    // Dao dau am duong
    private void btnDaoDauActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        try {
            double value = Double.parseDouble(txtKetqua.getText());
            value = - value;
            
            
            txtKetqua.setText("" + value);
        } catch(Exception e){
            e.printStackTrace();
        }
    }                                         

    // Phuong thuc su ly su kien cho cac dau: " + - * / "
    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {                                        

        String cmd = evt.getActionCommand();
        
        operator = cmd;
        operandl = txtKetqua.getText();
        
        txtKetqua.setText("");
    }                                       

    // Hien thi cac ket qua da tinh len man hinh
    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        if(txtKetqua.getText().equals("") || operandl.equals("")){
            return;
        }
        
        try {
            double oprand1 = Double.parseDouble(operandl);
            double oprand2 = Double.parseDouble(txtKetqua.getText());
            double ketqua = 0;
            if(operator.equals("+")){
                ketqua = oprand1 + oprand2;
            }else if(operator.equals("-")){
                ketqua = oprand1 - oprand2;
            }else if(operator.equals("*")){
                ketqua = oprand1 * oprand2;
            }else if(operator.equals("/")){
                ketqua = oprand1 / oprand2;
            }
            
            txtKetqua.setText("" + ketqua);
            isEqualSign = true;
            } catch (Exception e) {
                e.printStackTrace();
        }
    }                                       

    
    // Xoa nhung gi xuat hien len man hinh
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
        txtKetqua.setText("");
        operandl = "";
        operator = "";
        isEqualSign = false;
    }                                      

    // Tinh can bac 2 - phan tram - phan so
    private void btnCanBac2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        if(txtKetqua.getText().equals("")){
            return;
        }
        
        String cmd = evt.getActionCommand();
        
        try{
            double value = Double.parseDouble(txtKetqua.getText());
            
            if(cmd.equals("sqrt")){
                value = Math.sqrt(value);
            }else if(cmd.equals("%")){
                value = value * 100;
            }else if(cmd.equals("1/x")){
                value = 1/value;
            }
            
            txtKetqua.setText("" + value);
            isEqualSign = true;
        }catch(Exception e){
            e.printStackTrace();
        }
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MyCalculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnCanBac2;
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnDaoDau;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnPhanSo;
    private javax.swing.JButton btnPhanTram;
    private javax.swing.JButton btnSo0;
    private javax.swing.JButton btnSo1;
    private javax.swing.JButton btnSo2;
    private javax.swing.JButton btnSo3;
    private javax.swing.JButton btnSo4;
    private javax.swing.JButton btnSo5;
    private javax.swing.JButton btnSo6;
    private javax.swing.JButton btnSo7;
    private javax.swing.JButton btnSo8;
    private javax.swing.JButton btnSo9;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKetqua;
    // End of variables declaration                   
}
