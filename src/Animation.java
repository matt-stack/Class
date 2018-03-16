//T Harvey
//based loosely on http://www.java2s.com/Code/JavaAPI/java.awt/GraphicsdrawImageImageimgintxintyImageObserverob.htm
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation extends JPanel {

	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	
    final int frameCount = 10;
    int picNum = 0;
    BufferedImage[] pics1;
    BufferedImage[] pics2;
    BufferedImage[] pics3;
    BufferedImage[] pics4;
    BufferedImage[] pics5;
    BufferedImage[] pics6;
    BufferedImage[] pics7;
    BufferedImage[] pics8;
    int xloc = 0;
    int yloc = 0;
    final int xIncr = 11;
    final int xDecr = -11;
    final int yIncr = 11;
    final int yDecr = -11;
    final static int frameWidth = 500;
    final static int frameHeight = 300;
    final static int imgWidth = 165;
    final static int imgHeight = 165;

    //Override this JPanel's paint method to cycle through picture array and draw images
    public void paint(Graphics g) {
    	picNum = (picNum + 1) % frameCount;
    	if (xloc <= 0) { //left boundary, turn right
    		left = false;
    		right = true;
    	}
    	if (xloc >= frameWidth-imgWidth) { //right boundary, turn left
    		right = false;
    		left = true;
    	}
    	if (yloc <= 0) { //top boundary, turn down
    		up = false;
    		down = true;
    	}
    	if (yloc >= frameHeight-imgHeight) { //bottom boundary, turn up
    		down = false;
    		up = true;
    	}
    	
    	
    	if (down == true && right == true) { // down right
    		g.drawImage(pics1[picNum], xloc+=xIncr, yloc+=yIncr, Color.gray, this);
    	}
    	if (down == true && left == true) { // down left
    		g.drawImage(pics2[picNum], xloc+=xDecr, yloc+=yIncr, Color.gray, this);
    	}
    	if (up == true && left == true) { // up left
    		g.drawImage(pics3[picNum], xloc+=xDecr, yloc+=yDecr, Color.gray, this);
    	}
    	if (up == true && right == true) { // up right
    		g.drawImage(pics4[picNum], xloc+=xIncr, yloc+=yDecr, Color.gray, this);
    	}
    	
    	
    	// TODO: Keep the orc from walking off-screen, turn around when bouncing off walls.
		//Be sure that animation picture direction matches what is happening on screen.
    }

    //Make frame, loop on repaint and wait
    public static void main(String[] args) {
    	JFrame frame = new JFrame();
    	frame.getContentPane().add(new Animation());
    	frame.setBackground(Color.gray);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(frameWidth, frameHeight);
    	frame.setVisible(true);
    	for(int i = 0; i < 1000; i++){
    		frame.repaint();
    		try {
    			Thread.sleep(100);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }

    //Constructor: get image, segment and store in array
    public Animation(){
    	BufferedImage img1 = createImage(1);
    	BufferedImage img2 = createImage(2);
    	BufferedImage img3 = createImage(3);
    	BufferedImage img4 = createImage(4);
    	BufferedImage img5 = createImage(5);
    	BufferedImage img6 = createImage(6);
    	BufferedImage img7 = createImage(7);
    	BufferedImage img8 = createImage(8);
    	pics1 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics1[i] = img1.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	pics2 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics2[i] = img2.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	pics3 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics3[i] = img3.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	pics4 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics4[i] = img4.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	pics5 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics5[i] = img5.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	pics6 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics6[i] = img6.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	pics7 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics7[i] = img7.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	pics8 = new BufferedImage[10];
    	for (int i = 0; i < frameCount; i++) {
    		pics8[i] = img8.getSubimage(imgWidth*i, 0, imgWidth, imgHeight);
    	}
    	
    	
    	// TODO: Change this constructor so that at least eight orc animation pngs are loaded
    }  
    
    //Read image from file and return
    private BufferedImage createImage(int which){
    	BufferedImage bufferedImage1;
    	BufferedImage bufferedImage2;
    	BufferedImage bufferedImage3;
    	BufferedImage bufferedImage4;
    	BufferedImage bufferedImage5;
    	BufferedImage bufferedImage6;
    	BufferedImage bufferedImage7;
    	BufferedImage bufferedImage8;
    	if (which == 1) {
	    	try {
	    		bufferedImage1 = ImageIO.read(new File("orc/orc_forward_southeast.png"));
	    		return bufferedImage1;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}

    	if (which == 2) {
	    	try {
	    		bufferedImage2 = ImageIO.read(new File("orc/orc_forward_southwest.png"));
	    		return bufferedImage2;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}

    	if (which == 3) {
	    	try {
	    		bufferedImage3 = ImageIO.read(new File("orc/orc_forward_northwest.png"));
	    		return bufferedImage3;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}

    	if (which == 4) {
	    	try {
	    		bufferedImage4 = ImageIO.read(new File("orc/orc_forward_northeast.png"));
	    		return bufferedImage4;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}
    	
    	if (which == 5) {
	    	try {
	    		bufferedImage5 = ImageIO.read(new File("orc/orc_forward_north.png"));
	    		return bufferedImage5;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}

    	if (which == 6) {
	    	try {
	    		bufferedImage6 = ImageIO.read(new File("orc/orc_forward_east.png"));
	    		return bufferedImage6;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}

    	if (which == 7) {
	    	try {
	    		bufferedImage7 = ImageIO.read(new File("orc/orc_forward_south.png"));
	    		return bufferedImage7;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}

    	if (which == 8) {
	    	try {
	    		bufferedImage8 = ImageIO.read(new File("orc/orc_forward_west.png"));
	    		return bufferedImage8;
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
    	}
	    	


	    	
    	return null;
    	
    	// TODO: Change this method so you can load other orc animation bitmaps
    }
}