package ch6;

public class MyTv {

	public boolean isPowerOn;
	public int channel;
	public int volume;
	private final int MAX_VOLUME = 100;
	private final int MIN_VOLUME = 0;
	private final int MAX_CHANNEL = 100;
	private final int MIN_CHANNEL = 1;

	public void turnOnOff() {
		if (isPowerOn) {
			isPowerOn = false;
		} else {
			isPowerOn = true;
		}
	}

	public void volumeUp() {
		if (volume < MAX_VOLUME) {
			volume++;
		}
	}

	public void volumeDown() {
		if (volume > MIN_VOLUME) {
			volume--;
		}
	}

	public void channelUp() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
	}

	public void channelDown() {
		if (channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
	}

}
