package mailclientapp;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import static java.lang.reflect.Array.set;
import javax.swing.WindowConstants;


public class InfoDialog extends javax.swing.JDialog {
    private static final long serialVersionUID = 1L;

    public InfoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        System.out.println("Jestem w konstruktorze InfoDialog");
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int)screenSize.getWidth();
        int h = (int)screenSize.getHeight();
        
        Dimension windowSize = getSize();
        int x = (int)windowSize.getWidth();
        int y = (int)windowSize.getHeight();
        
        setLocation((w/2)-(x/2), (h/2)-(y/2));
        toFront();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informacje o aplikacji");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                setVisible(false);
            }
        });

        pack();
        setResizable(false);
    }

    private void initComponents() {
        jLabelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelInfo.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabelInfo.setText("<html>Aplikacja stworzona przez Patryka Siudę z " +
            "pomocą Marcina Stracha.<br>(C) 2015.</html>");

        pack();
    }


    public static void main(String[] args) {
        System.out.println("Jestem w main");
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Jestem na końcu run() w InfoDialog");
            }
        });
    }


    private javax.swing.JLabel jLabelInfo;
}
