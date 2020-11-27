//package utils;
//
//import api.TestCase;
//import com.alibaba.fastjson.JSON;
//import com.github.checkpoint.CheckPointUtils;
//import com.github.checkpoint.JsonCheckResult;
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.MapHandler;
//import org.apache.commons.lang3.StringUtils;
//
//import java.sql.SQLException;
//
//public class DbCheck {
//
//	public static String check(TestCase testcase) {
//		if(StringUtils.isEmpty(testcase.getDbchecksql())|| StringUtils.isEmpty(testcase.getDbcheckpoint())) {
//			return "没有设置数据库检查";
//		}
//
//		String sql =testcase.getDbchecksql();
//		QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
//		try {
//			System.out.println("dbcheck "+sql+" checkpoint "+testcase.getDbcheckpoint());
//			Object map = runner.query(sql, new MapHandler());
//			String json= JSON.toJSONString(map);
//			System.out.println(json);
//			JsonCheckResult jsonCheckResult = CheckPointUtils.check(json, testcase.getDbcheckpoint());
//			if(jsonCheckResult.isResult()) {
//				return "数据库检查成功";
//			}else {
//				return "数据库检查失败";
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return "检查点异常";
//	}
//
//}
