package com.icms.sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Data access object encapsulating all JDBC operations for a person.
 */
public class MessageDAO {
    private DataSource dataSource;

    /**
     * Create new data access object with data source.
     */
    public MessageDAO(DataSource newDataSource) throws SQLException {
        setDataSource(newDataSource);
    }

    /**
     * Get data source which is used for the database operations.
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Set data source to be used for the database operations.
     */
    public void setDataSource(DataSource newDataSource) throws SQLException {
        this.dataSource = newDataSource;
        //checkTable();
    }

    /**
     * Get all persons from the table.
     */
    public List<Message> selectAllMessageFromDevice(String device) throws SQLException {
        Connection connection = dataSource.getConnection();
        try {
        	// DEVICE DI ESEMPIO = 40DDCFBBD6CCB52A3309
            PreparedStatement pstmt = connection
                    .prepareStatement("SELECT G_CREATED, C_TIMESTAMP, C_CIAOOONE FROM SYSTEM.T_IOT_" + device);
            ResultSet rs = pstmt.executeQuery();
            ArrayList<Message> list = new ArrayList<Message>();
            while (rs.next()) {
            	Message mex = new Message();
            	mex.setSystem_timestamp(rs.getDate(1));
            	mex.setTIMESTAMP(rs.getDate(2));
            	mex.setCiaone(rs.getDouble(3));
                list.add(mex);
            }
            return list;
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    /**
     * Check if the person table already exists and create it if not.
     */
    @SuppressWarnings("unused")
	private void checkTable() throws SQLException {
        Connection connection = null;

        try {
        	// SE VUOI FARE QUALCHE QUERY PREPARATORIA
            connection = dataSource.getConnection();
            PreparedStatement pstmt = connection
                    .prepareStatement("SELECT * ....");
            pstmt.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
