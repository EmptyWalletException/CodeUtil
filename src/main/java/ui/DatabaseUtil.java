/*
 * DatabaseUtil.java
 *
 * Created on __DATE__, __TIME__
 */

package ui;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import database.Util;

/**
 * 代码生成器  V2.4
 *
 * @author
 *
 */
public class DatabaseUtil extends javax.swing.JFrame {

	/** Creates new form DatabaseUtil */
	public DatabaseUtil() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel2 = new JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField3 = new javax.swing.JTextField();
		jLabel5 = new JLabel();

		//setTitle("\u4f20\u667a\u5218\u5907\u4ee3\u7801\u751f\u6210\u56682.3");
		setTitle("代码生成器2.4");
		setBackground(new java.awt.Color(204, 255, 204));
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}

			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jLabel1.setText("\u9009\u62e9\u6570\u636e\u5e93\u7c7b\u578b");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "--请选择--" }));

		jLabel2.setText("\u7528\u6237\u540d");

		jLabel3.setText("\u5bc6\u7801");

		jLabel4.setText("\u6570\u636e\u5e93");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "--请选择数据库--" }));

		jButton1.setText("\u6d4b\u8bd5\u8fde\u63a5");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setLabel("\u8df3\u8fc7");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField3.setText("127.0.0.1");

		jLabel5.setText("\u670d\u52a1\u5668IP");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(75, 75, 75)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3)
												.addComponent(jLabel5)
												.addComponent(jLabel1)
												.addComponent(jLabel2)
												.addComponent(jLabel4)
												.addComponent(jButton1))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		99,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(34, 34,
																		34)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jComboBox2,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						0,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jComboBox1,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						0,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						174,
																						Short.MAX_VALUE)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						174,
																						Short.MAX_VALUE))))
								.addGap(106, 106, 106)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(53, 53, 53)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel4)
												.addComponent(
														jComboBox2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2))
								.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		dispose();
		System.exit(0);
		System.out.println("释放");
	}

	private void formWindowClosed(java.awt.event.WindowEvent evt) {
		dispose();
		System.exit(0);
		System.out.println("释放");
	}

	

	private void formWindowOpened(java.awt.event.WindowEvent evt) {
		setLocationRelativeTo(null);

		dbMap = xml.ConfigXml.readConfig();

		for (String key : dbMap.keySet()) {
			this.jComboBox1.addItem(key);
		}

	}
	
	Map<String, Map<String, String>> dbMap;
	Util util;
	Map<String, String> propertyMap ;
	String db = "";
	
	
	
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		

		if (this.jButton2.getText().equals("下一步")) {
			this.jButton2.setText("运行中...");
			this.jButton2.setEnabled(false);
			
			
			try {
				db = this.jComboBox2.getSelectedItem().toString();
			} catch (Exception e1) {
			}
			
			util = new Util();
			util.setDbName(db);//设置数据库名称
			//获取指定数据库的属性
			util.setDbType(this.jComboBox1.getSelectedItem().toString());

			propertyMap = dbMap.get(util.getDbType());
			String url=  propertyMap.get("url").replace("[ip]", this.jTextField3.getText());
			url=url.replace("[db]", db);
			
			
			
			
			util.setDriverName(propertyMap.get("driverName"));				
			util.setUrl(url);
			util.setDbName(db);
			util.setIp(this.jTextField3.getText());
			util.setUserName(this.jTextField1.getText());
			util.setPassWord(this.jTextField2.getText());

			if(url.indexOf("&amp;")<0 && url.indexOf("&")>0)
			{
				url=url.replace("&", "&amp;");
			}
			
			propertyMap.put("url", url);
			
			final Thread t=new Thread(new Runnable(){
				  public void run(){
					  try{
						//获取当前文件夹下的模板目录下的所有文件夹
							String basePath = new File("").getAbsolutePath() + "\\db";

							xml.DatabaseXml.writeDatabaseXml(util,propertyMap, basePath);
					  }catch (Exception e) {
					     e.printStackTrace();
					     JOptionPane.showMessageDialog(null, "发生错误", "错误详情请查看error.log",
									JOptionPane.INFORMATION_MESSAGE);
					  }
					  
					  CodeUtil codeUtil = new CodeUtil();
						codeUtil.setVisible(true);
						codeUtil.setDbInfo(db, jTextField1.getText(),
							jTextField2.getText());

					  setVisible(false);
					  
				  }}
				 );
			t.start();
			
		 }else
		 {
			 CodeUtil codeUtil = new CodeUtil();
				codeUtil.setVisible(true);
				codeUtil.setDbInfo(db, jTextField1.getText(),
					jTextField2.getText());

			  setVisible(false);
		 }

		
	

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//
		jButton1.setText("连接中...");
		jButton1.setEnabled(false);
		
		final Thread t=new Thread(new Runnable(){
			  public void run(){
				  try{
				
					    Util util = new Util();

						Map<String, String> map = dbMap.get(jComboBox1.getSelectedItem());
						util.setDriverName(map.get("driverName"));
						String url=map.get("url").replace("[ip]", jTextField3.getText()).replace("[db]", "");;
					
						util.setUrl(url);
						
						util.setUserName(jTextField1.getText());
						util.setPassWord(jTextField2.getText());
					  
						List<String> catalogs = util.getSchemas();
						jComboBox2.removeAllItems();
						for (String c : catalogs) {
							jComboBox2.addItem(c);
						}
						
						JOptionPane.showMessageDialog(null, "连接成功", "提示",
									JOptionPane.DEFAULT_OPTION);
						jButton2.setText("下一步");
					  
				  }catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, "无法加载驱动类", "提示",
								JOptionPane.OK_OPTION);
						
				  } catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, "无法连接数据库，请核对连接信息是否正确", "提示",
								JOptionPane.OK_OPTION);
						
				   }catch (Exception e) {
				     e.printStackTrace();
				     JOptionPane.showMessageDialog(null, "发生错误", "错误详情请查看error.log",
								JOptionPane.INFORMATION_MESSAGE);
				   
				  }
				  
				  jButton1.setEnabled(true);
				  jButton1.setText("测试连接");
				  
			  }}
			 );
		t.start();
		

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DatabaseUtil().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}