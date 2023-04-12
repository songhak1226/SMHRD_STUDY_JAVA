package 마우스;

public class MouseMain {

	public static void main(String[] args) {
		Mouse m1 = new Mouse();
		m1.rightClick();
		m1.leftClick();
		m1.drag();
		
		WheelMouse m2 = new WheelMouse();
		m2.leftClick();
		m2.drag();
		m2.scroll();
		
		
		HealthMouse m3 = new HealthMouse();
		m3.fatigueReduction();
		m3.leftClick();
		m3.rightClick();
		m3.drag();
		m3.scroll();

	}

}
