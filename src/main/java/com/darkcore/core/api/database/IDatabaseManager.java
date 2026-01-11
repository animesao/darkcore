package com.darkcore.core.api.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.CompletableFuture;

/**
 * API для управления базами данных (MySQL и SQL).
 * Предоставляет мощные асинхронные инструменты для работы с данными.
 */
public interface IDatabaseManager {
    /**
     * Устанавливает соединение с базой данных на основе конфигурации.
     * @throws SQLException если подключение не удалось
     */
    void connect() throws SQLException;

    /**
     * Закрывает текущее соединение.
     * @throws SQLException если возникла ошибка при закрытии
     */
    void disconnect() throws SQLException;

    /**
     * @return Активный объект Connection для прямого доступа к JDBC.
     * @throws SQLException если соединение отсутствует
     */
    Connection getConnection() throws SQLException;

    /**
     * Выполняет операцию обновления (INSERT, UPDATE, DELETE) асинхронно.
     * @param query SQL запрос
     * @param params Параметры запроса
     * @return CompletableFuture с количеством затронутых строк
     */
    CompletableFuture<Integer> executeUpdateAsync(String query, Object... params);

    /**
     * Выполняет запрос (SELECT) асинхронно и маппит результат.
     * @param query SQL запрос
     * @param mapper Интерфейс для преобразования ResultSet в объект
     * @param params Параметры запроса
     * @return CompletableFuture с результатом запроса
     */
    <T> CompletableFuture<T> executeQueryAsync(String query, DatabaseRowMapper<T> mapper, Object... params);

    /**
     * @return true, если соединение активно и готово к работе.
     */
    boolean isConnected();
}
