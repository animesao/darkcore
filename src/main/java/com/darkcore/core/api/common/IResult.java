package com.darkcore.core.api.common;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Enhanced Result wrapper for flexible API operations.
 */
public interface IResult<T> {
    boolean isSuccess();
    Optional<T> getData();
    String getMessage();
    
    void ifSuccess(Consumer<T> action);
    void ifFailure(Consumer<String> action);
    
    <R> IResult<R> map(Function<T, R> mapper);
    T orElse(T defaultValue);
    T orElseGet(java.util.function.Supplier<? extends T> supplier);
}
