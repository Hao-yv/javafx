package src.com.DAO.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import src.com.DAO.POLO.Store;
import src.com.DAO.Utils.JDBCUtilsByDruid;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BasicesDao<T> {

    private QueryRunner queryRunner = new QueryRunner();

    public int update(String sql, Object... parm) throws SQLException {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConn();
            int update = queryRunner.update(connection, sql, parm);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(connection, null, null);
        }
    }

    //
    public List<T> queueMulti(String sql, Class<T> clazz, Object... parm) throws SQLException {

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConn();
            List<T> querylist = queryRunner.query(connection, sql, new BeanListHandler<>(clazz), parm);
            return querylist;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(connection, null, null);
        }
    }

    public T QuerySing(String sql, Class<T> clazz, Object... parm) throws SQLException {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConn();
            return queryRunner.query(connection, sql, new BeanHandler<>(clazz), parm);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(connection, null, null);
        }
    }

    public Object QuerySclar(String sql, Object... parm) throws SQLException {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConn();
            return queryRunner.query(connection, sql, new ScalarHandler<>(), parm);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(connection, null, null);
        }
    }

}
