package Model;

public class Usuario {
	
	private int Id_Usuario;
		private String Nome_Usuario;
		private String Telefone_Usuario;
		private String cpf;
		private String Endereco;
		public Usuario() {
			
		}
		 
		public Usuario(int id_Usuario, String nome_Usuario, String telefone_Usuario, String cpf, String endereco) {
			super();
			Id_Usuario = id_Usuario;
			Nome_Usuario = nome_Usuario;
			Telefone_Usuario = telefone_Usuario;
			this.cpf = cpf;
			Endereco = endereco;
		}

		public int getId_Usuario() {
			return Id_Usuario;
		}
		public void setId_Usuario(int id_Usuario) {
			Id_Usuario = id_Usuario;
		}
		public String getNome_Usuario() {
			return Nome_Usuario;
		}
		public void setNome_Usuario(String nome_Usuario) {
			Nome_Usuario = nome_Usuario;
		}
		public String getTelefone_Usuario() {
			return Telefone_Usuario;
		}
		public void setTelefone_Usuario(String telefone_Usuario) {
			Telefone_Usuario = telefone_Usuario;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEndereco() {
			return Endereco;
		}
		public void setEndereco(String endereco) {
			Endereco = endereco;
		}

		public Usuario(int id_Usuario, String nome_Usuario, String telefone_Usuario, String cpf, String endereco) {
					super();
					Id_Usuario = id_Usuario;
					Nome_Usuario = nome_Usuario;
					Telefone_Usuario = telefone_Usuario;
					this.cpf = cpf;
					Endereco = endereco;
				}
		
		
    }



