import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		System.out.println("vou conectar ...");
		String url = "jdbc:mysql://localhost:3306/bb";
		String user = "root";
		String password = "root";
		Connection c = null;

		try {

			c = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("STATUS--->Erro ao conectar: "+e);
		}

		if (c != null) {

			System.out.println("STATUS--->Conectado com sucesso!");



			try {
				// clausula SQL
				String sql = "SELECT * FROM Usuario";

				// Carregamento do sql para o PS
				PreparedStatement ps = c.prepareStatement(sql);

				// Executa o comando que consulta todos os registros de usuarios do BD e
				// armazena no rs
				ResultSet rs = ps.executeQuery();


				// percorre cada linha que retornou da consulta do BD e cria um
				// usuario em memoria e adiciona na lista
				while (rs.next()) {

					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("nome"));
					System.out.println(rs.getString("email"));
					System.out.println(rs.getString("senha"));
				} 


			} catch (SQLException e) {
				System.out.println("Erro ao consultar Usuarios: " + e);
			}

			try {
				c.close();
				System.out.println("STATUS--->Desconectado com sucesso");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		} else {

			System.out.println("STATUS--->Não foi possivel realizar conexão");

		}

	}

}
