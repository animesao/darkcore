package com.darkcore.core.api.economy;

import java.util.UUID;
import com.darkcore.core.api.common.IResult;

public interface IEconomyManager {
    IResult<Double> getBalance(UUID uuid);
    IResult<Void> setBalance(UUID uuid, double amount);
    boolean hasAmount(UUID uuid, double amount);
    IResult<Void> deposit(UUID uuid, double amount);
    IResult<Void> withdraw(UUID uuid, double amount);
    
    String formatCurrency(double amount);
    String getCurrencySymbol();
    
    IResult<Void> createAccount(UUID uuid);
    boolean accountExists(UUID uuid);
    
    IResult<Void> pay(UUID from, UUID to, double amount);
    IResult<Double> getTopBalance(int rank);
}
