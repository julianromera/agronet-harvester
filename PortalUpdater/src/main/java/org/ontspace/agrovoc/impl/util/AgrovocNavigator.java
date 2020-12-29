/*
ont-space - The ontology-based resource metadata repository
Copyright (c) 2006-2011, Information Eng. Research Unit - Univ. of Alcalá
http://www.cc.uah.es/ie
This library is free software; you can redistribute it and/or modify it under
the terms of the GNU Lesser General Public License as published by the Free
Software Foundation; either version 2.1 of the License, or (at your option)
any later version.
This library is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
details.
You should have received a copy of the GNU Lesser General Public License along
with this library; if not, write to the Free Software Foundation, Inc.,
59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package org.ontspace.agrovoc.impl.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.ontspace.agrovoc.impl.AgrovocConcept;
import org.ontspace.agrovoc.ws.WSparser;
import org.ontspace.agrovoc.ws.WSinvoker;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Test interface for the Agrovoc web service
 *
 */
public class AgrovocNavigator extends javax.swing.JFrame {

    private static AgrovocConcept _agrc;
    private static final String language = "en";

    /** Creates new form AgrovocNavigator */
    public AgrovocNavigator() {
        initComponents();
        renderTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfInput = new javax.swing.JTextField();
        navigateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfAbout = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfLabel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfScope = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jtfInvokeTime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfParseTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agrovoc Navigator");

        jtfInput.setText("http://aims.fao.org/aos/common/c_category");

        navigateButton.setText("Navigate");
        navigateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Root concept in AGROVOC: http://aims.fao.org/aos/common/c_category");

        jLabel2.setText("About");

        jLabel3.setText("Label");

        jLabel4.setText("Scope");

        jLabel5.setText("Date");

        jLabel6.setText("Relations for the selected concept:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("WS call time:");

        jLabel8.setText("XML parse time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                        .addComponent(jtfAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfDate, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                                        .addComponent(jtfScope, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)))
                                .addComponent(jtfInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(5, 5, 5)
                        .addComponent(navigateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfInvokeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfParseTime, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navigateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfScope, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfInvokeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtfParseTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navigateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateButtonActionPerformed
        try {
            wsCall(jtfInput.getText());
            renderConcept();
        } catch (Exception ex) {
            Logger.getLogger(AgrovocNavigator.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_navigateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            try {
                int row = jTable1.getSelectedRow();
                int column = jTable1.getColumn("URI").getModelIndex();
                String uri = (String) jTable1.getValueAt(row, column);
                jtfInput.setText(uri);
                wsCall(uri);
            } catch (Exception ex) {
                Logger.getLogger(AgrovocNavigator.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void wsCall(String uri) throws Exception {
        long initialTime, finalTime;
        initialTime = System.currentTimeMillis();
        String response = WSinvoker.getTermInfo(uri);
        finalTime = System.currentTimeMillis();
        jtfInvokeTime.setText(finalTime - initialTime + " ms");
        initialTime = System.currentTimeMillis();
        _agrc = WSparser.parseSKOS(response);
        finalTime = System.currentTimeMillis();
        jtfParseTime.setText(finalTime - initialTime + " ms");
        renderConcept();
    }

    private void renderConcept() {
        if (_agrc != null) {
            jtfAbout.setText(_agrc.getAbout());
            jtfDate.setText(_agrc.getChangeNote());
            jtfLabel.setText(_agrc.getPrefLabel(language));
            jtfScope.setText(_agrc.getScopeNote(language));
            renderTable();
        }
    }

    private void renderTable() {
        Object[] columns = {"Concept","URI","Relation"};
        Object[][] matrix;
        if (_agrc != null){
            List<AgrovocConcept> broader = _agrc.getBroader();
            List<AgrovocConcept> narrower = _agrc.getNarrower();
            List<String> relatedKeys = new ArrayList<String>();
            HashMap<String,AgrovocConcept> related = _agrc.getRelated();
            for (Iterator iter = _agrc.getRelated().keySet().iterator(); iter.hasNext(); ){
                String key = (String) iter.next();
                relatedKeys.add(key);
            }

            int size = broader.size() + narrower.size() + related.size();
            matrix = new Object[size][columns.length];
            int i = 0;
            for (AgrovocConcept b : broader){
                matrix[i][0] = b.getPrefLabel(language);
                matrix[i][1] = b.getAbout();
                matrix[i][2] = "Broader";
                i++;
            }
            for (AgrovocConcept n : narrower){
                matrix[i][0] = n.getPrefLabel(language);
                matrix[i][1] = n.getAbout();
                matrix[i][2] = "Narrower";
                i++;
            }
            for (String r : relatedKeys){
                matrix[i][0] = related.get(r).getPrefLabel(language);
                matrix[i][1] = related.get(r).getAbout();
                matrix[i][2] = "Related (" + r.substring(0,r.lastIndexOf("::")) + ")";
                i++;
            }
        }
        else{
            matrix = new Object[0][columns.length];
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
            columns
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new AgrovocNavigator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfAbout;
    private javax.swing.JTextField jtfDate;
    private javax.swing.JTextField jtfInput;
    private javax.swing.JTextField jtfInvokeTime;
    private javax.swing.JTextField jtfLabel;
    private javax.swing.JTextField jtfParseTime;
    private javax.swing.JTextField jtfScope;
    private javax.swing.JButton navigateButton;
    // End of variables declaration//GEN-END:variables
}