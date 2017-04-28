public class PlayMusic {
	
	static boolean  playButton=true;
	
	public static void play(){
		if(playButton){
			System.out.println("Music is playing");
		}
		else {
			System.out.println("Music is paused");
		}
	}

	public static void main(String[] args) {
			/* this is another function example  */
		
		play();

	}

}
