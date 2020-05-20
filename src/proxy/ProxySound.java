package proxy;

public class ProxySound implements Sound {

	private RealSound realSound;
	private String fileName;
	
	public ProxySound(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void play() {

		//if not connected return;
		if(realSound == null) {
			realSound = new RealSound(this.fileName);
		}
		
		realSound.play();
	}

}
