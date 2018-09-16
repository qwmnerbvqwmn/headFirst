package headFirst_CommandPattern;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		RemoteControl rc = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		rc.setCommand(0, lightOnCommand, lightOffCommand);
		//SimpleRemoteControlTest(rc, 0);
		
		TV tv = new TV();
	    TVOnCommand tvOnCommand = new TVOnCommand(tv);
	    TVOffCommand tvOffCommand = new TVOffCommand(tv);
		rc.setCommand(1, tvOnCommand, tvOffCommand);
		//SimpleRemoteControlTest(rc, 1);
		
		Command[] onCmd = {lightOnCommand, tvOnCommand};
		Command[] offCmd = {lightOffCommand, tvOffCommand};
		rc.setCommand(2, new FullCommand(onCmd), new FullCommand(offCmd));
		SimpleRemoteControlTest(rc, 2);
		System.out.println(tv.getSound());
		
		
//		TVSetSound50 set50 = new TVSetSound50(tv);
//		Command[] onCmd2 = {tvOnCommand, set50};
//		Command[] offCmd2 = {tvOffCommand, 
		
	}

	public static void SimpleRemoteControlTest(RemoteControl rc, int slot) {
		rc.onButtonWasPressed(slot);
		rc.offButtonWasPressed(slot);
		rc.undoCommandPressed();
		
	}
}
