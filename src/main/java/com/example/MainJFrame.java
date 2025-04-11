package com.example;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.license4j.License;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

//
// EXMAPLE VALID LICENSE KEY =  FVC5J-5UKKH-248MZ-FW8KE-YA8P6
//
public class MainJFrame extends javax.swing.JFrame {

    private final static Color RED = new java.awt.Color(219, 4, 4);
    private final static Color GREEN = new java.awt.Color(9, 171, 49);

    public MainJFrame() {
        initComponents();

        setLocationRelativeTo(null);

        licenseKeyjTextField.requestFocus();
    }

    /**
     * To update GUI fields after.
     */
    private void workerDone() {
        statusjLabel.setText("");
        searchUSBjButton.setEnabled(true);
        licenseKeyjTextField.requestFocus();

        if (License.getInstance().getSystemInformation().getUSBDongleMountPath() != null) {
            writeLicensejButton.setEnabled(true);
            licenseKeyjTextField.setEditable(true);

            namejTextField.setText(License.getInstance().getSystemInformation().getUSBDongleName());
            productIdjTextField.setText(License.getInstance().getSystemInformation().getUSBDongleProductId());
            vendorIdjTextField.setText(License.getInstance().getSystemInformation().getUSBDongleVendorId());
            serialjTextField.setText(License.getInstance().getSystemInformation().getUSBDongleSerial());
        } else {
            writeLicensejButton.setEnabled(false);
            licenseKeyjTextField.setEditable(false);

            namejTextField.setText("NO USB DONGLE DETECTED");
            productIdjTextField.setText("");
            vendorIdjTextField.setText("");
            serialjTextField.setText("");
        }

        if (License.getInstance().getStatus().isValid()) {
            removeLicensejButton.setEnabled(true);

            licenseKeyjTextField.setForeground(GREEN);
            licenseKeyjTextField.setText(License.getInstance().getLicenseInformation().getLicenseKey());
            fullnamejTextField.setText(License.getInstance().getLicenseeInformation().getFullName());
            emailjTextField.setText(License.getInstance().getLicenseeInformation().getEMail());
            companyjTextField.setText(License.getInstance().getLicenseeInformation().getCompany());
        } else {
            removeLicensejButton.setEnabled(false);

            licenseKeyjTextField.setForeground(RED);
            licenseKeyjTextField.setText("ENTER LICENSE KEY HERE TO WRITE");
            fullnamejTextField.setText("");
            emailjTextField.setText("");
            companyjTextField.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchUSBjButton = new javax.swing.JButton();
        writeLicensejButton = new javax.swing.JButton();
        statusjLabel = new javax.swing.JLabel();
        removeLicensejButton = new javax.swing.JButton();
        companyjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        fullnamejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        licenseKeyjTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        serialjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productIdjTextField = new javax.swing.JTextField();
        vendorIdjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USB Dongle Creator");

        searchUSBjButton.setText("Search USB");
        searchUSBjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUSBjButtonActionPerformed(evt);
            }
        });

        writeLicensejButton.setText("Write License");
        writeLicensejButton.setEnabled(false);
        writeLicensejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeLicensejButtonActionPerformed(evt);
            }
        });

        statusjLabel.setForeground(new java.awt.Color(255, 0, 51));
        statusjLabel.setText(" ");

        removeLicensejButton.setText("Remove License");
        removeLicensejButton.setEnabled(false);
        removeLicensejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLicensejButtonActionPerformed(evt);
            }
        });

        companyjTextField.setEditable(false);

        jLabel8.setText("Company:");

        jLabel7.setText("E-Mail:");

        emailjTextField.setEditable(false);

        fullnamejTextField.setEditable(false);

        jLabel6.setText("Full Name:");

        jLabel5.setText("License Key:");

        licenseKeyjTextField.setEditable(false);

        serialjTextField.setEditable(false);

        jLabel4.setText("Serial Number:");

        jLabel3.setText("Product Id:");

        productIdjTextField.setEditable(false);

        vendorIdjTextField.setEditable(false);

        jLabel2.setText("Vendor Id:");

        jLabel1.setText("Name:");

        namejTextField.setEditable(false);

        jLabel9.setText("Example License Key:");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("3J9DD-MVAPS-EMBET-8U8ZA-S7JG3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(removeLicensejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(writeLicensejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchUSBjButton))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namejTextField)
                            .addComponent(vendorIdjTextField)
                            .addComponent(productIdjTextField)
                            .addComponent(serialjTextField)
                            .addComponent(licenseKeyjTextField)
                            .addComponent(fullnamejTextField)
                            .addComponent(emailjTextField)
                            .addComponent(companyjTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)))))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {searchUSBjButton, writeLicensejButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vendorIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(serialjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(licenseKeyjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fullnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(companyjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchUSBjButton)
                    .addComponent(writeLicensejButton)
                    .addComponent(statusjLabel)
                    .addComponent(removeLicensejButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchUSBjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUSBjButtonActionPerformed
        statusjLabel.setText("searching...");
        searchUSBjButton.setEnabled(false);
        writeLicensejButton.setEnabled(false);

        SwingWorker worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {

                /**
                 * Searches for USB sticks plugged-in.
                 *
                 * It searches for an empty file "license.l4j" in the USB stick.
                 * It can be any filename, just create an empty file in the USB
                 * stick.
                 */
                License.getInstance().getBuilder()
                        .product("DBB0047AC46D7BF16FEB57075E81C5C8")
                        .usbDongle(null, null, "license.l4j")
                        .build();

                return null;
            }

            @Override
            protected void done() {
                workerDone();
            }
        };
        worker.execute();
    }//GEN-LAST:event_searchUSBjButtonActionPerformed

    private void writeLicensejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeLicensejButtonActionPerformed
        statusjLabel.setText("writing...");
        searchUSBjButton.setEnabled(false);
        writeLicensejButton.setEnabled(false);

        SwingWorker worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Build again by including detected USB stick vendor id and product id.
                // If you are using the same brand and model USB sticks to for licensing, define vendor id and product id
                // in your software license validation code like below.
                // If you are planning to use the same brand but if product Ids may change, then set product id to null.
                License.getInstance().getBuilder()
                        .product("DBB0047AC46D7BF16FEB57075E81C5C8")
                        .usbDongle(
                                vendorIdjTextField.getText(), // detected USB stick vendor id
                                productIdjTextField.getText(), // detected USB stick product id
                                "license.l4j" // file name
                        )
                        .build();

                // validate method will write the license file if given license key is valid
                // and a license usage will be created in License Server, see License Usages page.
                // hostname and other will be updated if customer use the dongle on a internet connected computer.
                License.getInstance().validate(licenseKeyjTextField.getText().trim());

                return null;
            }

            @Override
            protected void done() {
                workerDone();

                if (!License.getInstance().getStatus().isValid()) {
                    JOptionPane.showMessageDialog(null, License.getInstance().getStatus().getMessage(), "License Error", ERROR_MESSAGE);
                }
            }
        };
        worker.execute();
    }//GEN-LAST:event_writeLicensejButtonActionPerformed

    private void removeLicensejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLicensejButtonActionPerformed
        statusjLabel.setText("removing...");
        searchUSBjButton.setEnabled(false);
        writeLicensejButton.setEnabled(false);

        SwingWorker worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    // remove license file and create an empty file
                    Path licenseFile = Paths.get(License.getInstance().getLicenseInformation().getLicenseDataSaveLocation());

                    Files.delete(licenseFile);
                    Files.createFile(licenseFile);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // to update the License instance
                License.getInstance().validate();

                return null;
            }

            @Override
            protected void done() {
                workerDone();
            }
        };
        worker.execute();
    }//GEN-LAST:event_removeLicensejButtonActionPerformed

    public static void main(String args[]) {
        try {
            FlatLaf.registerCustomDefaultsSource("themes");
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField companyjTextField;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTextField fullnamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField licenseKeyjTextField;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField productIdjTextField;
    private javax.swing.JButton removeLicensejButton;
    private javax.swing.JButton searchUSBjButton;
    private javax.swing.JTextField serialjTextField;
    private javax.swing.JLabel statusjLabel;
    private javax.swing.JTextField vendorIdjTextField;
    private javax.swing.JButton writeLicensejButton;
    // End of variables declaration//GEN-END:variables
}
