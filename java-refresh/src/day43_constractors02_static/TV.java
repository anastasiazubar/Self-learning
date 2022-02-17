package day43_constractors02_static;

public class TV {
	private int channel;
	private int volumeLevel;
	private boolean on;
	private String brand;
	
	
	
	
	/*
	 * Scanners
	 */
	public TV() {
		channel=1;
		volumeLevel=1;
		brand = "undefined";
		
		System.out.println("Creating TV object using no Args - constructor");
	}
	
		//overloaded constructor
	public TV(String brand) {
		System.out.println("Creating TV object using 1 Args - constructor");
		this.brand=brand;
	}
		
	
	/*
	 * 	Methods
	 */
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(on && channel>0 && channel<121) {
					this.channel = channel;
		}else {
			System.out.println("ERROR: TV is either off or invalid channel");
		}
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(on && volumeLevel>=1 && volumeLevel<=7) {
			this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either off or invalid VolumeLevel");
		}	
	}
	
	public boolean isOn() {
		return on;
	}
	public void turnOn() {
		if(isOn()==false) {
			this.on = true;
		}else {
			System.out.println("TV is already off");
		}
	}

	public void channelUp() {
		if(isOn() && channel<120 && channel>0 ) {
			channel++;
		}
	}
	public void channelDown() {
		if(isOn() && channel<121 && channel>1 ) {
			channel--;
		}
	}

	public void volumeUp() {
		if(isOn() && volumeLevel<7 && volumeLevel>0 ) {
			volumeLevel++;
		}
	}
	public void volumeDown() {
		if(isOn() && volumeLevel<8 && volumeLevel>1 ) {
			volumeLevel--;
		}
	}

}
