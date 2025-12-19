package inheritance;

	class Tv {
		void sound() {
			System.out.println("sound");
		}
		void picture() {
			System.out.println("picture");
		}
	}
	class threeDTV extends Tv {
		void threeD() {
			System.out.println("threeD");
		}
		void dolbyAudio() {
			System.out.println("dolyAudio");
		}
	}
	class SmartTv extends threeDTV{
		void internet() {
			System.out.println("internet");
		}
		void fullHD() {
			System.out.println("fullHD");
		}
	}
public class test1 {

	public static void main(String[] args) {
		SmartTv s1 = new SmartTv();
		s1.fullHD();
		s1.internet();
		s1.threeD();
		s1.dolbyAudio();
		s1.sound();
		s1.picture();
		
		threeDTV t1 = new threeDTV();
		t1.sound();
		t1.picture();
		t1.threeD();
		t1.dolbyAudio();
		

	}

}
