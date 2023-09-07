
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tchit
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfTaskName = new javax.swing.JTextField();
        labelTaskCategory = new javax.swing.JLabel();
        tfTaskCategory = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReadFile = new javax.swing.JButton();
        btnWriteFile = new javax.swing.JButton();
        cbViewBy = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTasks = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Task Manager");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel2.setOpaque(false);

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Task Name");

        tfTaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTaskNameActionPerformed(evt);
            }
        });

        labelTaskCategory.setForeground(new java.awt.Color(255, 102, 0));
        labelTaskCategory.setText("Task Category");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReadFile.setText("Read From...");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });

        btnWriteFile.setText("Write to...");
        btnWriteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteFileActionPerformed(evt);
            }
        });

        cbViewBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"All Categories", "Complete", "Incomplete"}));
        cbViewBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViewByActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTaskName)
                    .addComponent(labelTaskCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTaskCategory))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnWriteFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(cbViewBy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(114, 114, 114))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTaskCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTaskCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReadFile)
                    .addComponent(btnWriteFile)
                    .addComponent(cbViewBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task Name", "Task Category", "Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableTasks.setOpaque(false);
        jScrollPane1.setViewportView(tableTasks);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String[] getUniqueValuesFromColumn(String columnName){
        DefaultTableModel model = (DefaultTableModel) tableTasks.getModel();
        int columnIndex = model.findColumn(columnName);
        int rowCount = model.getRowCount();

        if (columnIndex != -1){
            Set<String> uniqueValues = new HashSet<>();

            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++){
                String cellValue = (String) model.getValueAt(rowIndex, columnIndex);
                uniqueValues.add(cellValue);
            }

            return uniqueValues.toArray(new String[0]);
        } else {
            return new String[0];       // Column Not found
        }
}
  
    private void updateCategoryComboBox(){
        // Get the initial values
        String[] initialValues = new String[]{"All Categories", "Complete", "Incomplete"};

        // Get the dynamic values from the table
        String[] dynamicValues = getUniqueValuesFromColumn("Task Category");
        
        // Create an array to hold the initial values and dynamic values
        String[] allValues = new String[initialValues.length + dynamicValues.length];
        System.arraycopy(initialValues, 0, allValues, 0, initialValues.length);
        System.arraycopy(dynamicValues, 0, allValues, initialValues.length, dynamicValues.length);
         
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(allValues);
        cbViewBy.setModel(comboBoxModel);
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tfTaskName.setText("");
        tfTaskCategory.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // GET the values from user
        String taskName = tfTaskName.getText();
        String taskCategory = tfTaskCategory.getText();
        boolean isComplete = false;

        if (taskName.isEmpty() | taskCategory.isEmpty())
        {
            JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Try again",
                JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableTasks.getModel();
            model.addRow(new Object[] {taskName, taskCategory, isComplete});
            updateCategoryComboBox();
        }
        
        tfTaskName.setText("");
        tfTaskCategory.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfTaskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTaskNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTaskNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tableTasks.getSelectedRow();
        
        if (row < 0){
            JOptionPane.showMessageDialog(this,
                    "No row is selected. Please select a row",
                    "Select row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableTasks.getModel();
            model.removeRow(row);
            updateCategoryComboBox();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbViewByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViewByActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableTasks.getModel();    // Retrieve Table model
        DefaultTableModel filteredModel = new DefaultTableModel(
                new Object[][]{}, new String[]{"Task Name", "Task Category", "Completed"}
        );
        
        String selectedItem = (String) cbViewBy.getSelectedItem();              // Retrieve selected Category
        int rowCount = model.getRowCount();                                     // Retrieve number of rows
        
        if (selectedItem.equals("Complete"))
        {
            int columnIndex = model.findColumn("Completed");        // Retrieve the index of the Category column
            
            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
            {
                boolean complete = (boolean) model.getValueAt(rowIndex, columnIndex);
                
                if (complete)
                {
                    Object[] rowData = new Object[]
                    {
                        model.getValueAt(rowIndex, 0), 
                        model.getValueAt(rowIndex, 1), 
                        model.getValueAt(rowIndex, 2)
                    };
                    filteredModel.addRow(rowData);
                }
            }
        } 
        else if (selectedItem.equals("Incomplete"))
        {
            int columnIndex = model.findColumn("Completed");        // Retrieve the index of the Category column
            
            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
            {
                boolean complete = (boolean) model.getValueAt(rowIndex, columnIndex);
                
                if (complete)
                {
                    Object[] rowData = new Object[]
                    {
                        model.getValueAt(rowIndex, 0), 
                        model.getValueAt(rowIndex, 1), 
                        model.getValueAt(rowIndex, 2)
                    };
                    filteredModel.addRow(rowData);
                }
            }
        }
        else 
        {
            int columnIndex = model.findColumn("Task Category");        // Retrieve the index of the Category column

            for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
            {
                String categoryValue = (String) model.getValueAt(rowIndex, columnIndex);

                if (selectedItem.equals(categoryValue))
                {
                    Object[] rowData = new Object[] 
                    {
                        model.getValueAt(rowIndex, 0), 
                        model.getValueAt(rowIndex, 1), 
                        model.getValueAt(rowIndex, 2)
                    };
                    filteredModel.addRow(rowData);
                }
            }
        }
        
        // Clear the original Table
        model.setRowCount(0);
        tableTasks.setModel(filteredModel);
        
        // Create a custom cell renderer for the "Completed" column
        TableCellRenderer checkboxRenderer = new DefaultTableCellRenderer(){
            private final JCheckBox checkbox = new JCheckBox();
            
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
                if (value instanceof Boolean){
                    checkbox.setSelected((Boolean) value);
                }
                return checkbox;
            }
        };
        
        // Set the custom cell renderer for the "Completed" column
        TableColumn column = tableTasks.getColumnModel().getColumn(2);
        column.setCellRenderer(checkboxRenderer);
    }//GEN-LAST:event_cbViewByActionPerformed

    private void btnWriteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteFileActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableTasks.getModel();
        Vector<Vector> tableData = model.getDataVector();
        
        // Saving objects in a file
        try{
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            output.writeObject(tableData);
            
            output.close();
            file.close();
            
            System.out.println("Table data has been saved to file bin");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnWriteFileActionPerformed

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        try{
            FileInputStream file = new FileInputStream("file.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            
            @SuppressWarnings("unchecked")
            Vector<Vector> tableData = (Vector<Vector>) input.readObject();
            
            input.close();
            file.close();
            
            System.out.println("Table data has been read from file bin");
            
            DefaultTableModel model = (DefaultTableModel) tableTasks.getModel();
            model.setRowCount(0);
            for (Vector<Object> rowData : tableData){
                model.addRow(rowData.toArray());
            }
            
            System.out.println("Table data has been loaded from file.bin.");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading data from file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnReadFileActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReadFile;
    private javax.swing.JButton btnWriteFile;
    private javax.swing.JComboBox<String> cbViewBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTaskCategory;
    private javax.swing.JTable tableTasks;
    private javax.swing.JTextField tfTaskCategory;
    private javax.swing.JTextField tfTaskName;
    // End of variables declaration//GEN-END:variables


}
