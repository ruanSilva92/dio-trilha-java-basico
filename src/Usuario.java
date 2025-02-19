
public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV Ligada?: " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume Atual: " +smartTv.volume);
		
		smartTv.ligar();
		
		System.out.println("TV Ligada?: " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("TV Ligada?: " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		System.out.println("Volume Atual: " +smartTv.volume);
		
		smartTv.mudarCanal(50);
		System.out.println("Canal Atual: " + smartTv.canal);
		
		smartTv.diminuirCanal();
		System.out.println("Canal Atual: " + smartTv.canal);
		
		smartTv.aumentarCanal();
		System.out.println("Canal Atual: " + smartTv.canal);
		

	}

}
