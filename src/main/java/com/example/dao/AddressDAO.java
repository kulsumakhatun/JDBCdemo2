package com.example.dao;

import com.example.data.Address;
import com.example.data.Standard;
import com.example.util.DbConnection;

import java.sql.*;

public class AddressDAO {
    public int insertIntoAdress(Address address) throws SQLException, ClassNotFoundException {

        int rows = 0;

        Connection connection = DbConnection.getConnection();

        String sql = "Insert into adress (buildingName,street, city, state,pincode, country)" +
                " values(?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement
                (sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, address.getBuildingName());
        preparedStatement.setString(2, address.getStreet());
        preparedStatement.setString(3, address.getCity());
        preparedStatement.setString(4, address.getState());
        preparedStatement.setInt(5, address.getPinCode());
        preparedStatement.setString(6, address.getCountry());

        rows = preparedStatement.executeUpdate();
        int generatedId = 0;
        if(rows == 1){
            //get generated id
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if(generatedKeys.next()){
                generatedId = generatedKeys.getInt(1);
            }
        }
        return generatedId;
    }

}
