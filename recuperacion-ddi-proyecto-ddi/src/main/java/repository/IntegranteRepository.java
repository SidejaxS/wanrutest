package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.AbstractConnection;
import connection.H2Connection;
import model.Equipos;
import model.Integrante;

public class IntegranteRepository {
    
    private static final String jdbcUrl = "jdbc:h2:file:./src/main/resources/test;";
	AbstractConnection manager = new H2Connection();

    public void insert(Integrante integrante) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		int id = getLastIdIntegrante();
        id++;
		try {
			preparedStatement = conn
					//TODO
					.prepareStatement("INSERT INTO integrante (id,nombre,id_equipo) VALUES (?, ?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, integrante.getNombre());
			preparedStatement.setInt(3, integrante.getIdEquipo());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}

	}

    public void delete(int id) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("DELETE FROM integrante WHERE id = ?"); //TODO
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
	}

    public int getLastIdIntegrante() {
		int last_id = 0;
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
					.prepareStatement("SELECT max(id) as id FROM integrante "); //TODO

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				last_id = resultSet.getInt("id");
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return last_id;
	}

    public List<Integrante> listAll(int id) {
		List<Integrante> listIntegrante = new ArrayList<>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = conn
            .prepareStatement("SELECT * FROM integrante WHERE id_equipo = ?");
            preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Integrante integrante = new Integrante();
                integrante.setNombre(resultSet.getString("nombre"));
                listIntegrante.add(integrante);
            }

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			manager.close(preparedStatement);
			manager.close(conn);
		}
		return listIntegrante;
	}

}
