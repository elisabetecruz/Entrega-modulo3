package Model;

public class Passagem {
	
        private int Id_passagem;
		private double Preco;
		public double Destino;
		public String Nome_passageiro;
		public String Telefone;
		public double Origem;
		public Passagem(){
			}
		
		public Passagem(int id_passagem, double preco, double destino, String nome_passageiro, String telefone,
				double origem) {
			super();
			Id_passagem = id_passagem;
			Preco = preco;
			Destino = destino;
			Nome_passageiro = nome_passageiro;
			Telefone = telefone;
			Origem = origem;
		}

		public int getId_passagem() {
			return Id_passagem;
		}

		public void setId_passagem(int id_passagem) {
			Id_passagem = id_passagem;
		}

		public double getPreco() {
			return Preco;
		}

		public void setPreco(double preco) {
			Preco = preco;
		}

		public double getDestino() {
			return Destino;
		}

		public void setDestino(double destino) {
			Destino = destino;
		}

		public String getNome_passageiro() {
			return Nome_passageiro;
		}

		public void setNome_passageiro(String nome_passageiro) {
			Nome_passageiro = nome_passageiro;
		}

		public String getTelefone() {
			return Telefone;
		}

		public void setTelefone(String telefone) {
			Telefone = telefone;
		}

		public double getOrigem() {
			return Origem;
		}

		public void setOrigem(double origem) {
			Origem = origem;
		}
		
       
	
		
	}



