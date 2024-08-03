import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;

public class TextEditor extends JFrame implements ActionListener{

    JMenuBar menuBar;
    JMenu file;
    JMenuItem open;
    JMenuItem save;
    JMenuItem exit;
    JTextArea textArea;
    JScrollPane scrollPane;
    JButton colorButton;
    JSpinner spinner;
    JLabel label;
    JComboBox comboBox;

    TextEditor(){
//---------------------------------------------------------
        menuBar= new JMenuBar();
        file=new JMenu("File");

        open=new JMenuItem("Open");
        open.addActionListener(this);
        save=new JMenuItem("Save");
        save.addActionListener(this);
        exit=new JMenuItem("Exit");
        exit.addActionListener(this);

        file.add(open);
        file.add(save);
        file.add(exit);

        menuBar.add(file);
//--------------------------------------------------------------

        textArea=new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial",Font.PLAIN,20));

        scrollPane=new JScrollPane(textArea);
        scrollPane.setBounds(40,80,500,500);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

//===============================================================

        colorButton=new JButton("Color");
        colorButton.setBounds(10,10,100,40);
        colorButton.addActionListener(this);

//=====================================================================
        label=new JLabel("Font-size:");
        label.setBounds(130,10,90,40);
        label.setOpaque(true);

        spinner=new JSpinner();
        spinner.setBounds(200,10,90,40);
        spinner.setValue(20);
        spinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int)spinner.getValue()));
            }
            
        });

//========================================================================

        String[] font=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        comboBox=new JComboBox<>(font);
        comboBox.setBounds(350,10,200,40);
        comboBox.addActionListener(this);
        comboBox.setSelectedItem("Arial");

//========================================================================
        this.setJMenuBar(menuBar);
        this.add(scrollPane);
        this.add(colorButton);
        this.add(spinner);
        this.add(label);
        this.add(comboBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TEXT EDITOR");
        this.setSize(600,700);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            textArea.setFont(new Font((String) comboBox.getSelectedItem(),Font.PLAIN,textArea.getFont().getSize()));
        }
        if(e.getSource()==colorButton){
            JColorChooser colorChooser=new JColorChooser();
            Color color=colorChooser.showDialog(null, "Pick a color", Color.BLACK);
            textArea.setForeground(color);
        }
        //=============================================================================================
        if(e.getSource()==open){
            JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
			fileChooser.setFileFilter(filter);
			
			int response = fileChooser.showOpenDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				Scanner fileIn = null;
				
				try {
					fileIn = new Scanner(file);
					if(file.isFile()) {
						while(fileIn.hasNextLine()) {
							String line = fileIn.nextLine()+"\n";
							textArea.append(line);
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
					fileIn.close();
				}
			}
        }
        if(e.getSource()==save){
            JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			
			int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file;
				PrintWriter fileOut = null;
				
				file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				try {
					fileOut = new PrintWriter(file);
					fileOut.println(textArea.getText());
				} 
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
					fileOut.close();
				}			
			}
        }
        if(e.getSource()==exit){
            System.exit(0);
        }
    }
    
}
