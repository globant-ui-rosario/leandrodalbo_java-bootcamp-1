package keypoint7;

public class AudioPlayer {

	private State state;

	public AudioPlayer() {

		this.state = new Stopped();
	}

	public void play() {

		this.state = new PlayingMusic();
		this.state.doAction();
	}

	public void stop() {

		this.state = new Stopped();
		this.state.doAction();

	}

	public void pause() {

		this.state = new Paused();
		this.state.doAction();

	}

}
