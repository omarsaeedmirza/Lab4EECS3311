import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JPanel {
	
	public main()
	
	{
		
	      
	      
	}
	List<MyRectangle> shapeList = new ArrayList <MyRectangle>();
	List<MyCircle> circleList = new ArrayList <MyCircle>();
	List<MySquare> squareList = new ArrayList <MySquare>();
	/**
	 * This method creates two rectangles
	 * @return
	 */
	private List<MyRectangle> createTwoRectangles(){
		Random randomGenerator = new Random();
		
		Color myColor1 = new Color(231, 151, 244);
		MyRectangle rectangleShape1 = new MyRectangle (10, 10, 44, 48, myColor1);
		   
		Color myColor2 = new Color(131, 151, 44);
		MyRectangle rectangleShape2 = new MyRectangle (60, 50, 40, 72, myColor2);///remove
		
		/**MyRectangle rectangleShape3 = new MyRectangle (250, 200, 72, 72, myColor2, 3);
		
		Color myColor3 = new Color(001, 91, 90);
		MyRectangle rectangleShape4 = new MyRectangle (350, 238, 72, 45, myColor3, 1);
		
		Color myColor4 = new Color(71, 151, 144);
		MyRectangle rectangleShape5 = new MyRectangle (450, 288, 72, 72, myColor4, 2);///remove
		
		Color myColor5 = new Color(131, 51, 44);
		MyRectangle rectangleShape6 = new MyRectangle (550, 328, 72, 72, myColor5, 3);**/
		
		
		
		
		shapeList.add(rectangleShape1);
		shapeList.add(rectangleShape2);
		/**shapeList.add(rectangleShape3);
		shapeList.add(rectangleShape4);
		shapeList.add(rectangleShape5);
		shapeList.add(rectangleShape6);**/
		
		
		return shapeList;
	}
	
	private List<MyCircle> createCircle()
	{
		Color myColor2 = new Color(131, 151, 44);
		MyCircle rectangleShape2 = new MyCircle (100, 100, 72, 72, myColor2);
		
		Color myColor4 = new Color(71, 151, 144);
		MyCircle rectangleShape5 = new MyCircle (200, 200, 72, 72, myColor4);
		
		circleList.add(rectangleShape2);
		circleList.add(rectangleShape5);
		
		return circleList;
	}
	
	private List<MySquare> createSquare()
	{
		Color myColor2 = new Color(131, 151, 44);
		MySquare rectangleShape2 = new MySquare (300, 300, 72, myColor2);
		
		Color myColor4 = new Color(71, 151, 144);
		MySquare rectangleShape5 = new MySquare (400, 400, 72, myColor4);
		
		squareList.add(rectangleShape2);
		squareList.add(rectangleShape5);
		
		
		return squareList;
	}
	
	
	
	private void sorting()
	{
		MyRectangle temp;
		MyRectangle temp2;
		for (int i=0;i<5;i++) 
		  {
	    	  if(shapeList.get(i).compareTo(shapeList.get(i+1))<0)
	    	  {
	    		  temp= shapeList.get(i);
	    		  shapeList.set(i, shapeList.get(i+1));
	    		  shapeList.set(i+1, temp);
	    		  System.out.println(1);
	    		  
	    		  
	    	  }
	      }
		//repaint();
		
	}
	
	
	
	
	
	/**
	 * This method displays the created rectangles.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      
      //calling the method that creates two shapes (rectangles)
      List<MyRectangle> shapeList = createTwoRectangles();
      List<MyCircle> circleList= createCircle();
      List<MySquare> squareList = createSquare();
      
      for (MyRectangle shape: shapeList) {
    	  g2d.setColor(shape.getColor());
    	  shape.drawShapee(g2d);
      }
      //sorting();
      
      for(MyCircle circ: circleList)
      {
    	  g2d.setColor(circ.getColor());
    	  circ.drawShape(g2d);
      }
      
      for(MySquare circ: squareList)
      {
    	  g2d.setColor(circ.getColor());
    	  circ.drawShape(g2d);
      }
      
   }
   
   
   
   
   public  void inst(JFrame f, int x)
   {
	   //System.out.println(2);
	   
	   //f.add(z);
	   
	   JButton button= new JButton("Load Shapes");
	      JButton button2= new JButton("Sort Shapes");
	      add(button);
	      add(button2);
	      f.add(this);
	      
	      button2.addActionListener(new ActionListener()
	    		  {

					@Override
					public void actionPerformed(ActionEvent e) {
						sorting();
						
					}
	    	  
	    		  });
	   
	   
   }
   /**
    * This is the main method of the class.
    * @param args
    */
   public static void main(String[] args) {
      
      JFrame frame = new JFrame("Display two shapes (rectangles)");
      main rects= new main();
      rects.inst(frame, 3); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1000, 1000);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      //
      
      
      
   }
}