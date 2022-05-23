
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class frm_splashscreen extends javax.swing.JFrame
{

    public frm_splashscreen()
    {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
    }

    public void splash()
    {

        try
        {
            Thread.sleep(1000);
            for (int i = 0; i <= 4; i++)
            {
                if (i == 0)
                {
                    lbl_splash_txt.setText("Connecting to Database...");
                    Thread.sleep(1500);
                }
                else if (i == 1)
                {
                    lbl_splash_txt.setText("Importing Files...");
                    Thread.sleep(1500);
                }
                else if (i == 2)
                {
                    lbl_splash_txt.setText("Almost there...");
                    Thread.sleep(1500);
                }
                else if (i == 3)
                {
                    lbl_splash_txt.setText("Opening Application..");
                    Thread.sleep(1500);
                }
                else
                {
                    this.dispose();
                    frm_login login2 = new frm_login();
                    login2.setVisible(true);
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnl_bg_splash = new javax.swing.JPanel();
        lbl_spalsh_img = new javax.swing.JLabel();
        lbl_splash_img = new javax.swing.JLabel();
        lbl_splash_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        pnl_bg_splash.setBackground(new java.awt.Color(25, 37, 55));

        lbl_spalsh_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_spalsh_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/splash_screen.png"))); // NOI18N
        lbl_spalsh_img.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_spalsh_imgMouseClicked(evt);
            }
        });

        lbl_splash_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_splash_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/splash_loading.gif"))); // NOI18N

        lbl_splash_txt.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lbl_splash_txt.setForeground(new java.awt.Color(204, 204, 204));
        lbl_splash_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnl_bg_splashLayout = new javax.swing.GroupLayout(pnl_bg_splash);
        pnl_bg_splash.setLayout(pnl_bg_splashLayout);
        pnl_bg_splashLayout.setHorizontalGroup(
            pnl_bg_splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bg_splashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_spalsh_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lbl_splash_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_splash_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_bg_splashLayout.setVerticalGroup(
            pnl_bg_splashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bg_splashLayout.createSequentialGroup()
                .addComponent(lbl_spalsh_img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_splash_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lbl_splash_img, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg_splash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg_splash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_spalsh_imgMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_spalsh_imgMouseClicked
    {//GEN-HEADEREND:event_lbl_spalsh_imgMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_spalsh_imgMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[])
    {

        frm_splashscreen s = new frm_splashscreen();
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                s.setVisible(true);
            }
        });
        s.splash();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_spalsh_img;
    private javax.swing.JLabel lbl_splash_img;
    private static javax.swing.JLabel lbl_splash_txt;
    private javax.swing.JPanel pnl_bg_splash;
    // End of variables declaration//GEN-END:variables
}
