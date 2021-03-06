import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a Id");
		String brightness = JOptionPane.showInputDialog("Enter a bright level of Mood Lamp");

		
		// Elevator call
		Elevator myElevator = new Elevator (id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security (id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting (id+ " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting (id+ " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights (id+ " / Mood Lamp");
		moodLamp.setBright(Double.parseDouble(brightness));
		moodLamp.on();
		
		
	}

}
