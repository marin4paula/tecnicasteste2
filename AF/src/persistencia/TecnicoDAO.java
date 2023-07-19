package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controle.Controlador;
public class TecnicoDAO {
	public void inserir() {
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir =
					 conexao.prepareStatement("insert into tecnico (tenico ) values (? ");
			inserir.setString(1, Controlador.aluno);
			
			
			
			inserir.executeUpdate();
			
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}