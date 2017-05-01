package keyPointsFourToSeven;

import java.util.Random;

public class Photo {

	private int photoId;
	private int likes;

	public Photo() {

		Random random = new Random();
		photoId = random.nextInt(10) + 1;
		likes = 0;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getPhotoId() {
		return photoId;
	}

	public void addLike() {
		this.likes++;
	}
}
