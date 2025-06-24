package javaapplication;

/**
 * Basic Swing GUI frame generated using NetBeans Form Editor.
 * Displays a "Hello World!" message with a single "OK" button that closes the app.
 */
public class JHelloFrame extends javax.swing.JFrame {

    /**
     * Constructor: Initializes all Swing components and layout.
     */
    public JHelloFrame() {
        initComponents(); // Auto-generated GUI initialization
    }

    /**
     * Auto-generated method to initialize UI components.
     * NetBeans Form Editor uses this method to reconstruct the layout.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();     // Label component
        jButton1 = new javax.swing.JButton();   // Button component

        // Frame settings
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false); // Frame size is fixed

        // Label settings
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // Font size 24
        jLabel1.setText("Hello World!"); // Display text

        // Button settings
        jButton1.setBackground(new java.awt.Color(0, 153, 51)); // Green background
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseApp(evt); // Custom handler to exit app
            }
        });

        // Layout configuration using GroupLayout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(255, 255, 255)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(280, 280, 280)
                                                .addComponent(jButton1)))
                                .addContainerGap(290, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(86, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(100, 100, 100))
        );

        pack(); // Auto-sizes the frame to fit preferred sizes of components
    }

    /**
     * Event handler that closes the application when the OK button is clicked.
     */
    private void jCloseApp(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * Main method to launch the GUI.
     */
    public static void main(String args[]) {
        try {
            // Set Nimbus look and feel if available
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(JHelloFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Run GUI on the Event Dispatch Thread (EDT)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHelloFrame().setVisible(true);
            }
        });
    }

    // GUI component declarations (auto-managed by NetBeans Form Editor)
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
}
