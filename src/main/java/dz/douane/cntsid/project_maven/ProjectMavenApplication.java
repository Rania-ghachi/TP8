package dz.douane.cntsid.project_maven;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class ProjectMavenApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public ProjectMavenApplication(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public static void main(String[] args) {

		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:postgresql://localhost:5432/sb001");
		config.setUsername("postgres");
		config.setPassword("rania");
		DataSource dataSource = new HikariDataSource(config);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		ProjectMavenApplication main = new ProjectMavenApplication(jdbcTemplate);

		SpringApplication.run(ProjectMavenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Map<String, Object>> records = jdbcTemplate.queryForList("SELECT * FROM wilaya");
		for (Object record : records) {
			System.out.println(record.toString());
		}
	}
}
