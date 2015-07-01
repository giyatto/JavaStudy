package ch7;

public class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}
	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}
	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public void setChannel(int channel) {
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		setChannel(prevChannel);
	}
	
}
