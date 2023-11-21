package cadastroUser;

public class BaseCadastroUser {


		private String usuario;
		private String senha;
		private String nomeCompleto;
		
		public BaseCadastroUser() {
		}
		
		public BaseCadastroUser(String usuario, String senha, String nomeCompleto) {
			super();
			this.usuario = usuario;
			this.senha = senha;
			this.nomeCompleto = nomeCompleto;
		}
		
		
		public String getusuario() {
			return usuario;
		}
		public void setusuario(String usuario) {
			this.usuario = usuario;
		}
		public String getsenha() {
			return senha;
		}
		public void setsenha(String senha) {
			this.senha = senha;
		}
		public String getnomeCompleto() {
			return nomeCompleto;
		}
		public String setnomeCompleto(String nomeCompleto) {
			return nomeCompleto;
		}
		
		@Override
		public String toString() {
			return "User [usuario=" + usuario + ", senha=" + senha + ", nomeCompleto=" + nomeCompleto + "]";
		}
	}


