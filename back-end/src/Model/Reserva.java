package Model;

public class Reserva {


	private int Hotel_Pacotes_Id_Hotel;
	private int Hotel_Pacotes_Pacotes_Id;
	private int Usuario_Usuario;
	public Reserva() {
		
		
	}
	public Reserva(int hotel_Pacotes_Id_Hotel, int hotel_Pacotes_Pacotes_Id, int usuario_Usuario) {
		super();
		Hotel_Pacotes_Id_Hotel = hotel_Pacotes_Id_Hotel;
		Hotel_Pacotes_Pacotes_Id = hotel_Pacotes_Pacotes_Id;
		Usuario_Usuario = usuario_Usuario;
	}
	public int getHotel_Pacotes_Id_Hotel() {
		return Hotel_Pacotes_Id_Hotel;
	}
	public void setHotel_Pacotes_Id_Hotel(int hotel_Pacotes_Id_Hotel) {
		Hotel_Pacotes_Id_Hotel = hotel_Pacotes_Id_Hotel;
	}
	public int getHotel_Pacotes_Pacotes_Id() {
		return Hotel_Pacotes_Pacotes_Id;
	}
	public void setHotel_Pacotes_Pacotes_Id(int hotel_Pacotes_Pacotes_Id) {
		Hotel_Pacotes_Pacotes_Id = hotel_Pacotes_Pacotes_Id;
	}
	public int getUsuario_Usuario() {
		return Usuario_Usuario;
	}
	public void setUsuario_Usuario(int usuario_Usuario) {
		Usuario_Usuario = usuario_Usuario;
	}
		
	
	
}



