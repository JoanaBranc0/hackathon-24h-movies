package org.academiadecodigo.hackaton.converters.javabank;

import org.academiadecodigo.hackaton.command.javabank.AccountDto;
import org.academiadecodigo.hackaton.persistence.model.javabank.account.Account;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * A {@link Converter} implementation, responsible for {@link Account} to {@link AccountDto} type conversion
 */
@Component
public class AccountToAccountDto extends AbstractConverter<Account, AccountDto> {

    /**
     * Converts the account model object into an account DTO
     *
     * @param account the account
     * @return the account DTO
     */
    @Override
    public AccountDto convert (Account account) {

        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setType(account.getAccountType());
        accountDto.setBalance(String.valueOf(account.getBalance()));

        return accountDto;
    }

}