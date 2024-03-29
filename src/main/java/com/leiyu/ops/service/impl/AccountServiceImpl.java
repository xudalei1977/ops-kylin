package leiyu.ops.service.impl;

import leiyu.ops.entity.Account;
import leiyu.ops.mapper.AccountMapper;
import leiyu.ops.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author RippleChan
 * @date 2018-07-05
 * @time 14:51
 */
@Service
@Transactional(readOnly = true)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Map<String, Object>> myQuery() {
        return accountMapper.myQuery();
    }

    @Override
    public List<Account> queryAll() {
        return accountMapper.queryAll();
    }

    @Override
    public Object page() {
        List<Account> page = accountMapper.page();
        return page;
    }


}
