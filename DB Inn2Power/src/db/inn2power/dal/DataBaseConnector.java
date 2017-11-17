/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.inn2power.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author pgn
 */
public class DataBaseConnector
{
    private SQLServerDataSource dataSource;
    
    public DataBaseConnector()
    {
        dataSource = new SQLServerDataSource();
        dataSource.setServerName("EASV-DB2");
        dataSource.setPortNumber(1433);
        dataSource.setDatabaseName("Inn2Power");
        dataSource.setUser("CS2017A_40");
        dataSource.setPassword("CS2017A_40");
    }
    
    public Connection getConnection() throws SQLServerException
    {
        return dataSource.getConnection();
    }
    
}