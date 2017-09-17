package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import DAO.ClienteDAO;
import DAO.DataSource;
import model.Cliente;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainClass extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnRecuperarDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass frame = new MainClass();
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
	public MainClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.CENTER);
		textField.setColumns(8);
		
		btnRecuperarDados = new JButton("Recuperar Dados...");
		btnRecuperarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DataSource dataSource = new DataSource();
				
				ClienteDAO cliDAO = new ClienteDAO(dataSource);
				
				ArrayList<Cliente> lista = cliDAO.readAll();
				
				if(lista != null){
					for(Cliente c : lista){
						textField.setText(textField.getText() + c + "\n");
					}
				}
				
				dataSource.CloseDataSource();
			}
		});
		contentPane.add(btnRecuperarDados, BorderLayout.SOUTH);
	}

}
