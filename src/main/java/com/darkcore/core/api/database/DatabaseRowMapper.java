package com.darkcore.core.api.database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Функциональный интерфейс для маппинга строк базы данных в объекты.
 */
@FunctionalInterface
public interface DatabaseRowMapper<T> {
    T mapRow(ResultSet rs) throws SQLException;
}
