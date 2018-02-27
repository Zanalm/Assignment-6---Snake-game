import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
//		UserInterface GUI = new UserInterface();
//		GUI.Initialization();
//		
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                new DrawSnake();

           
            }
        });

	}

}
