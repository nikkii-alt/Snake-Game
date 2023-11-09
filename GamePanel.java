
	import javax.swing.JFrame;

	public class GamePanel extends JFrame
	{
	  GamePanel() //constructor
	  {
		 this.add(new GameFrame());
		 this.setTitle("Snake Game");
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setResizable(true);
		 this.pack();
		 this.setVisible(true);
		 this.setLocationRelativeTo(null);
		 }
}
