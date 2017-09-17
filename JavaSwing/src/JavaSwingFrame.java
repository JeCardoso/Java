import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Dimension;


public class JavaSwingFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaSwingFrame frame = new JavaSwingFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JavaSwingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnClick = new JButton("Clique em Mim");
		btnClick.setSize(new Dimension(30, 30));
		btnClick.setPreferredSize(new Dimension(30, 30));
		btnClick.setMinimumSize(new Dimension(30, 30));
		btnClick.setMaximumSize(new Dimension(30, 30));
		btnClick.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClick.setFont(new Font("Arial Black", Font.ITALIC, 24));
		btnClick.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		btnClick.setBackground(UIManager.getColor("MenuItem.selectionBackground"));
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnClick, BorderLayout.SOUTH);
		
		JLabel lblMensagem = new JLabel("Aqui vai aparecer a Mensagem");
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setFont(new Font("SketchFlow Print", Font.PLAIN, 24));
		lblMensagem.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lblMensagem.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblMensagem, BorderLayout.NORTH);
	}

}
