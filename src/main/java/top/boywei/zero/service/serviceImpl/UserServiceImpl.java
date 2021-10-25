package top.boywei.zero.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.zero.bean.User;
import top.boywei.zero.mapper.UserMapper;
import top.boywei.zero.service.UserService;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        log.info("login by \"{}\" with password: {}", name, password);
        return userMapper.getInfo(name, password);
    }

}