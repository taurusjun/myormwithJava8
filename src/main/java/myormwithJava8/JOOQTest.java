package myormwithJava8;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;

import com.mtech.generated.test.Tables;

public class JOOQTest {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		String userName = "sa";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/test";
		try {

			// GenerationTool tool = new GenerationTool();
			// Configuration configuration = tool.load(new FileInputStream(
			// new File("conf.xml")));
			// tool.run(configuration);

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			Result<Record> result = DSL.using(conn).select().from(Tables.TUSER)
					.fetch();
			conn.close();
		} catch (Exception e) {
			// You'll probably want to handle the exceptions in a real app
			// Don't ever do this silence catch(Exception e) thing. I've seen
			// this in
			// live code and it is horrendous.
			e.printStackTrace();
		}
	}

}
