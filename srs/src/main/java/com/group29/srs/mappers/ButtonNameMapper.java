package com.group29.srs.mappers;

import com.group29.srs.model.ButtonName;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ButtonNameMapper implements RowMapper<ButtonName> {
    @Override
    public ButtonName mapRow(ResultSet resultSet, int index) throws SQLException {
        ButtonName bn = new ButtonName();
        bn.setCourse_code(resultSet.getString("firstname"));
        bn.setName(resultSet.getString("lastname"));
        bn.setSection_number(resultSet.getInt("mail"));
        return bn;
    }
}