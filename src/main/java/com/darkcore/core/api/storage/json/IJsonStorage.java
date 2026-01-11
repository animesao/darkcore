package com.darkcore.core.api.storage.json;

import java.util.Optional;

/**
 * API для простого сохранения и загрузки данных в формате JSON.
 */
public interface IJsonStorage {
    <T> void save(String key, T object);
    <T> Optional<T> load(String key, Class<T> clazz);
    boolean exists(String key);
    void delete(String key);
}
