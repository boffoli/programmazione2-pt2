




public class QT extends JApplet{
	// to be defined
	private class TabbedPane extends JPanel{
		//to be defined
		private class JPanelCluster extends JPanel{
			//to be defined
			private JButton executeButton;
			JPanelCluster(String buttonName, java.awt.event.ActionListener a){
			//to be defined
			}
		}
			
		TabbedPane() {
			super(new GridLayout(1, 1)); 
			JTabbedPane tabbedPane = new JTabbedPane();
			//copy img in src Directory and bin directory
			java.net.URL imgURL = getClass().getResource("img/db.jpg");
			ImageIcon iconDB = new ImageIcon(imgURL);
			panelDB = new JPanelCluster("MINE", new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
						learningFromDBAction();
					}
					catch (SocketException e1) {
						System.out.println(e1);
						
					}
					catch (FileNotFoundException e1) {
						System.out.println(e1);
						
					} catch (IOException e1) {
						System.out.println(e1);
						
					} catch (ClassNotFoundException e1) {
						System.out.println(e1);
						
					}
				
					
				}
		      });
	        tabbedPane.addTab("DB", iconDB, panelDB,
	                "Does nothing");
	      
	        imgURL = getClass().getResource("img/file.jpg");
	        ImageIcon iconFile = new ImageIcon(imgURL);
			panelFile = new JPanelCluster("STORE FROM FILE",new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
						learningFromFileAction();
					}
					catch (SocketException e1) {
						System.out.println(e1);
						
					}
					catch (FileNotFoundException e1) {
						System.out.println(e1);
						
					} catch (IOException e1) {
						System.out.println(e1);
						
					} catch (ClassNotFoundException e1) {
						System.out.println(e1);
						
					}
				
					
				}
		      });
	        tabbedPane.addTab("FILE", iconFile, panelFile,
	                "Does nothing");
	        //Add the tabbed pane to this panel.
	        add(tabbedPane);         
	        //The following line enables to use scrolling tabs.
	        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		}
		private void learningFromDBAction()throws SocketException,IOException,ClassNotFoundException{
			
			//to be defined
			
		}

		
		private void learningFromFileAction() throws SocketException,IOException,ClassNotFoundException{

			
			//to be defined
		
	}

	public void init(){
		
		
		
		TabbedPane tab=new TabbedPane();
		getContentPane().setLayout(new GridLayout(1,1));
		getContentPane().add(tab);
		
		String ip=this.getParameter("ServerIP");
		
		int port=new Integer(this.getParameter("Port")).intValue();
		try
		{
		InetAddress addr = InetAddress.getByName(ip); //ip
		System.out.println("addr = " + addr);
		Socket socket = new Socket(addr, port); //Port
		System.out.println(socket);
		
		out = new ObjectOutputStream(socket.getOutputStream());
		in = new ObjectInputStream(socket.getInputStream()); 
		}
		catch(IOException e){
			
			
			System.exit(0);
		}
		
	}
}
