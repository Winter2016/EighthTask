package mypckg;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Ксения on 4/19/2016.
 */
public class BuyerDAO implements Serializable {
    private javax.sql.DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void addLine(Buyer buyer)
    {
        String sql = "insert into buyer(id, name, region, discount) values(?, ?, ?, ?);";
        jdbcTemplate.update(sql,new Object[] {buyer.getId(), buyer.getName(), buyer.getRegion(), buyer.getDiscount()} );
    }

    public void deleteLine(int id) {
        String sql = "delete from buyer where id =?;";
        jdbcTemplate.update(sql, new Object[] {id});
    }
    public void deleteAll() {
        String sql = "delete from buyer;";
        jdbcTemplate.update(sql, new Object[]{});
    }

    public List<Buyer> searchAll()
    {
        String sql = "select * from buyer;";
        return jdbcTemplate.query(sql, new BuyerMapper());
    }

    public Buyer searchLine(int id)
    {
        String sql = "select * from buyer where id = ?;";
        Buyer buyer = (Buyer) jdbcTemplate.queryForObject(sql, new Object[] {id}, new BuyerMapper());
        return buyer;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
}
