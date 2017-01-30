package lea.mySqlAdress;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by john on 30.01.17.
 */
public class HomeDao implements Home, InitializingBean {
    private DataSource dataSource;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//----------------------------------------------------------------------------------------------------------------------

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate=namedParameterJdbcTemplate;

    }

//----------------------------------------------------------------------------------------------------------------------
    @Override
    public List<Contact> findAll() {
        String sql = "select first_name, second_name, telephon, town\n" +
                      "from adress";

        return namedParameterJdbcTemplate.query(sql, new ContactMapper() );
    }

//----------------------------------------------------------------------------------------------------------------------


    @Override
    public void afterPropertiesSet() throws Exception {
        if (dataSource == null) {
            throw new BeanCreationException("----------- errroro");
        }
        if (namedParameterJdbcTemplate == null) {
            throw new BeanCreationException("-------------errooor - ----   namedParameterJdbcTemplate");
        }

    }


//----------------------------------------------------------------------------------------------------------------------


    private static final class ContactMapper implements RowMapper <Contact> {
        @Override
        public Contact mapRow(ResultSet resultSet, int i) throws SQLException {
            Contact contact = new Contact();
            contact.setFirst_name(resultSet.getString("first_name"));
            contact.setSecond_name(resultSet.getString("second_name"));
            contact.setTelephon(resultSet.getInt("telephon"));
            contact.setTown(resultSet.getString("town"));
//            System.out.println("- contact---"+contact.toString());
            return contact;
        }
    }




}
