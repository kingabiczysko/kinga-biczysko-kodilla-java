package com.kodilla.jdbc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredPostTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("HOW_MANY");

        }
        assertEquals(0, howMany);

    }

    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=FALSE ";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When

        String sqlProcedureCall2 = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall2);


        //Then
        String sqlCheckTable2 = "SELECT COUNT(*) AS COUNT_BEST FROM BOOKS WHERE BESTSELLER =TRUE";
        ResultSet resultSet = statement.executeQuery(sqlCheckTable2);
        int count_best = -1;
        if(resultSet.next()){
            count_best = resultSet.getInt("COUNT_BEST");
        }
        assertEquals(1, count_best);
    }
}
