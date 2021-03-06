
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Home-User
 */
public class Clients extends javax.swing.JFrame {

    public static boolean first_join = true;
    public static String role;

    /**
     * Creates new form Clients
     */
    public Clients() {
        initComponents();
        setTitle("Penalty Kick");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ResultDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        Action = new javax.swing.JTextArea();
        p1s = new javax.swing.JTextField();
        p2s = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Status = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        LeftMidOut = new javax.swing.JButton();
        LeftBottomOut = new javax.swing.JButton();
        RightMidOut = new javax.swing.JButton();
        LeftTopOut = new javax.swing.JButton();
        RightTopOut = new javax.swing.JButton();
        CenterTopOut = new javax.swing.JButton();
        RightBottomOut = new javax.swing.JButton();
        pos1 = new javax.swing.JButton();
        pos5 = new javax.swing.JButton();
        pos2 = new javax.swing.JButton();
        pos4 = new javax.swing.JButton();
        pos6 = new javax.swing.JButton();
        pos3 = new javax.swing.JButton();

        javax.swing.GroupLayout ResultDialogLayout = new javax.swing.GroupLayout(ResultDialog.getContentPane());
        ResultDialog.getContentPane().setLayout(ResultDialogLayout);
        ResultDialogLayout.setHorizontalGroup(
            ResultDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ResultDialogLayout.setVerticalGroup(
            ResultDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penalty Kick");
        setResizable(false);

        Action.setColumns(20);
        Action.setRows(5);
        jScrollPane1.setViewportView(Action);

        p1s.setText("0");
        p1s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1sActionPerformed(evt);
            }
        });

        p2s.setText("0");
        p2s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2sActionPerformed(evt);
            }
        });

        jLabel1.setText("Player 1 Score: ");

        jLabel2.setText("Player 2 Score:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        Status.setViewportView(jTextArea1);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        LeftMidOut.setText("LeftMidOut");
        LeftMidOut.setActionCommand("Button_Out1");
        LeftMidOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftMidOutActionPerformed(evt);
            }
        });

        LeftBottomOut.setText("LeftBottomOut");
        LeftBottomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftBottomOutActionPerformed(evt);
            }
        });

        RightMidOut.setText("RightMidOut");
        RightMidOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightMidOutActionPerformed(evt);
            }
        });

        LeftTopOut.setText("LeftTopOut");

        RightTopOut.setText("RightTopOut");
        RightTopOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightTopOutActionPerformed(evt);
            }
        });

        CenterTopOut.setText("CenterTopOut");
        CenterTopOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CenterTopOutActionPerformed(evt);
            }
        });

        RightBottomOut.setText("RightBottomOut");
        RightBottomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightBottomOutActionPerformed(evt);
            }
        });

        pos1.setText("pos1");
        pos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos1ActionPerformed(evt);
            }
        });

        pos5.setText("pos5");
        pos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos5ActionPerformed(evt);
            }
        });

        pos2.setText("pos2");
        pos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos2ActionPerformed(evt);
            }
        });

        pos4.setText("pos4");
        pos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos4ActionPerformed(evt);
            }
        });

        pos6.setText("pos6");
        pos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos6ActionPerformed(evt);
            }
        });

        pos3.setText("pos3");
        pos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LeftBottomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LeftMidOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightMidOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RightBottomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LeftTopOut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CenterTopOut, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RightTopOut, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CenterTopOut, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LeftTopOut, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RightTopOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LeftMidOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RightMidOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LeftBottomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RightBottomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(p1s, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(p2s, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Status))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1s, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2s, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1sActionPerformed

    private void LeftMidOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftMidOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LeftMidOutActionPerformed

    private void LeftBottomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftBottomOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LeftBottomOutActionPerformed

    private void RightMidOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightMidOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RightMidOutActionPerformed

    private void RightTopOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightTopOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RightTopOutActionPerformed

    private void CenterTopOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CenterTopOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CenterTopOutActionPerformed

    private void RightBottomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightBottomOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RightBottomOutActionPerformed

    private void pos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos1ActionPerformed
        try {
            Action.append("SELECT POSITION1\n");
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("POSITION1");
            pw.flush();
            String turn = br.readLine();
            System.out.println("turn " + turn);
            String msg = br.readLine();
            System.out.println(msg + "\n");
            Action.append(msg + "\n");
            String msg_score1 = br.readLine();
            p1s.setText(msg_score1);
            String msg_score2 = br.readLine();
            p2s.setText(msg_score2);
            Action.append("p1: " + msg_score1 + "\n");
            Action.append("p2: " + msg_score2 + "\n");
            String nextturn = br.readLine();
            if (Integer.parseInt(nextturn) > 10) {
                System.out.println("GGEZ");
                String match_result = br.readLine();
                Action.append(match_result);
                JOptionPane.showMessageDialog(null, match_result, "Result", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_pos1ActionPerformed

    private void pos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos5ActionPerformed
        try {
            Action.append("SELECT POSITION5\n");
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("POSITION5");
            pw.flush();
            String turn = br.readLine();
            System.out.println("turn " + turn);
            String msg = br.readLine();
            System.out.println(msg + "\n");
            Action.append(msg + "\n");
            String msg_score1 = br.readLine();
            p1s.setText(msg_score1);
            String msg_score2 = br.readLine();
            p2s.setText(msg_score2);
            Action.append("p1: " + msg_score1 + "\n");
            Action.append("p2: " + msg_score2 + "\n");

            String nextturn = br.readLine();
            if (Integer.parseInt(nextturn) > 10) {
                System.out.println("GGEZ");
                String match_result = br.readLine();
                Action.append(match_result);
                JOptionPane.showMessageDialog(null, match_result, "Result", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_pos5ActionPerformed

    private void pos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos2ActionPerformed
        try {
            Action.append("SELECT POSITION2\n");
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("POSITION2");
            pw.flush();

            String turn = br.readLine();
            System.out.println("turn " + turn);
            String msg = br.readLine();
            System.out.println(msg + "\n");
            Action.append(msg + "\n");
            String msg_score1 = br.readLine();
            p1s.setText(msg_score1);
            String msg_score2 = br.readLine();
            p2s.setText(msg_score2);
            Action.append("p1: " + msg_score1 + "\n");
            Action.append("p2: " + msg_score2 + "\n");

            String nextturn = br.readLine();
            if (Integer.parseInt(nextturn) > 10) {
                System.out.println("GGEZ");
                String match_result = br.readLine();
                Action.append(match_result);
                JOptionPane.showMessageDialog(null, match_result, "Result", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_pos2ActionPerformed

    private void pos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos4ActionPerformed
        try {
            Action.append("SELECT POSITION4\n");
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("POSITION4");
            pw.flush();

            String turn = br.readLine();
            System.out.println("turn " + turn);
            String msg = br.readLine();
            System.out.println(msg + "\n");
            Action.append(msg + "\n");
            String msg_score1 = br.readLine();
            p1s.setText(msg_score1);
            String msg_score2 = br.readLine();
            p2s.setText(msg_score2);
            Action.append("p1: " + msg_score1 + "\n");
            Action.append("p2: " + msg_score2 + "\n");

            String nextturn = br.readLine();
            if (Integer.parseInt(nextturn) > 10) {
                System.out.println("GGEZ");
                String match_result = br.readLine();
                Action.append(match_result);
                JOptionPane.showMessageDialog(null, match_result, "Result", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_pos4ActionPerformed

    private void pos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos6ActionPerformed
        try {
            Action.append("SELECT POSITION6\n");
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("POSITION6");
            pw.flush();

            String turn = br.readLine();
            System.out.println("turn " + turn);
            String msg = br.readLine();
            System.out.println(msg + "\n");
            Action.append(msg + "\n");
            String msg_score1 = br.readLine();
            p1s.setText(msg_score1);
            String msg_score2 = br.readLine();
            p2s.setText(msg_score2);
            Action.append("p1: " + msg_score1 + "\n");
            Action.append("p2: " + msg_score2 + "\n");

            String nextturn = br.readLine();
            if (Integer.parseInt(nextturn) > 10) {
                String match_result = br.readLine();
                System.out.println("GGEZ");
                Action.append(match_result);
                JOptionPane.showMessageDialog(null, match_result, "Result", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_pos6ActionPerformed

    private void pos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos3ActionPerformed

        try {
            Action.append("SELECT POSITION3\n");
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("POSITION3");
            pw.flush();

            String turn = br.readLine();
            System.out.println("turn " + turn);
            String msg = br.readLine();
            System.out.println(msg + "\n");
            Action.append(msg + "\n");
            String msg_score1 = br.readLine();
            p1s.setText(msg_score1);
            String msg_score2 = br.readLine();
            p2s.setText(msg_score2);
            Action.append("p1: " + msg_score1 + "\n");
            Action.append("p2: " + msg_score2 + "\n");
            String nextturn = br.readLine();
            if (Integer.parseInt(nextturn) > 10) {
                String match_result = br.readLine();
                System.out.println("GGEZ");
                Action.append(match_result);
                JOptionPane.showMessageDialog(null, match_result, "Result", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_pos3ActionPerformed

    private void p2sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2sActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        try {
            Socket s = new Socket("127.0.0.1", 23410);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream());
//            pw.println("join");
//            pw.flush();
//            String msg_role = br.readLine();
//            role = msg_role;
//            System.out.println("you are " + role);
//            br.close();
//            pw.close();
//            s.close();
//            first_join = false;

        } catch (Exception e) {

            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Action;
    private javax.swing.JButton CenterTopOut;
    private javax.swing.JButton LeftBottomOut;
    private javax.swing.JButton LeftMidOut;
    private javax.swing.JButton LeftTopOut;
    private javax.swing.JDialog ResultDialog;
    private javax.swing.JButton RightBottomOut;
    private javax.swing.JButton RightMidOut;
    private javax.swing.JButton RightTopOut;
    private javax.swing.JScrollPane Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField p1s;
    private javax.swing.JTextField p2s;
    private javax.swing.JButton pos1;
    private javax.swing.JButton pos2;
    private javax.swing.JButton pos3;
    private javax.swing.JButton pos4;
    private javax.swing.JButton pos5;
    private javax.swing.JButton pos6;
    // End of variables declaration//GEN-END:variables
}
