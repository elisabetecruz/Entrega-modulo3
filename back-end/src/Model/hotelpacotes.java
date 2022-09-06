package Model;

public class hotelpacotes {
	
      
		private int Id_Hotel;
		private String Endereco;
		private String Telefone;
		private String cnpj;
		private String Servisos;
		private double Precos;
		private int Id_pacotes;
		public hotelpacotes() {
			
			
		}
		public hotelpacotes(int id_Hotel, String endereco, String telefone, String cnpj, String servisos, double precos,
				int id_pacotes) {
			super();
			Id_Hotel = id_Hotel;
			Endereco = endereco;
			Telefone = telefone;
			this.cnpj = cnpj;
			Servisos = servisos;
			Precos = precos;
			Id_pacotes = id_pacotes;
		}
		public int getId_Hotel() {
			return Id_Hotel;
		}
		public void setId_Hotel(int id_Hotel) {
			Id_Hotel = id_Hotel;
		}
		public String getEndereco() {
			return Endereco;
		}
		public void setEndereco(String endereco) {
			Endereco = endereco;
		}
		public String getTelefone() {
			return Telefone;
		}
		public void setTelefone(String telefone) {
			Telefone = telefone;
		}
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public String getServisos() {
			return Servisos;
		}
		public void setServisos(String servisos) {
			Servisos = servisos;
		}
		public double getPrecos() {
			return Precos;
		}
		public void setPrecos(double precos) {
			Precos = precos;
		}
		public int getId_pacotes() {
			return Id_pacotes;
		}
		public void setId_pacotes(int id_pacotes) {
			Id_pacotes = id_pacotes;
		}
      
      
}
		

