package WM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WM {
    
    public static void main(String [] args) {
    	Scanner input=new Scanner(System.in);
    	
    	try {
    		
    		File imageFile=new File("C:\\Users\\islei\\OneDrive\\Desktop\\Encryption\\Ass1\\tiger.jpg");
    		BufferedImage originaImage=ImageIO.read(imageFile);
    		
    		
    		Graphics2D graphics2D=originaImage.createGraphics();
    		
    		
    		String waterMArketText="laith nemer";
    		Font font=new Font("Arial",Font.BOLD,30);
    		graphics2D.setColor(Color.blue);
    		graphics2D.setFont(font);
//			/*
//			 * Col or waterMatkColor=new Color(255,0,0,100);
//			 * graphics2D.setColor(waterMatkColor);
//			 */
    		
    		int x=originaImage.getWidth()-130;
    		int y=originaImage.getHeight()-130;
    		
    		graphics2D.drawString(waterMArketText, x, y);
    		graphics2D.dispose();
    		
    		File newWaterMarkSave=new File("C:\\Users\\islei\\OneDrive\\Desktop\\Encryption\\Ass1\\laith.jpg");
    		
    		ImageIO.write(originaImage, "jpg", newWaterMarkSave);
    	 	
    		
    		System.out.println("Seccesfuly ...");
    		
    	}catch (Exception e) {
			// TODO: handle exception
		}
    }
}
