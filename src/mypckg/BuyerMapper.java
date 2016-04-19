package mypckg;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Ксения on 4/19/2016.
 */
public class BuyerMapper implements RowMapper<Buyer> {
    @Override
    public Buyer mapRow(ResultSet resultSet, int i) throws SQLException {
        Buyer buyer = new Buyer();
        buyer.setId(resultSet.getInt("id"));
        buyer.setName(resultSet.getString("name"));
        buyer.setRegion(resultSet.getString("region"));
        buyer.setDiscount(resultSet.getDouble("discount"));
        return buyer;
    }
}
