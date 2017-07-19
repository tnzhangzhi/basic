package com.zhz.service.impl;

import com.zhz.dao.mapper.ContentMapper;
import com.zhz.dao.mapper.UserMapper;
import com.zhz.domain.Content;
import com.zhz.domain.User;
import com.zhz.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by zz1987 on 17/7/19.
 */
@Service("testService")
public class TestServiceImpl implements TestService{

    Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    UserMapper userMapper;

    @Autowired
    ContentMapper contentMapper;

    public void test() {
        User user = userMapper.selectByPrimaryKey(100);
        Content content = contentMapper.selectByPrimaryKey(248);
        logger.info("user name is {}",user.getUsername());
        logger.info("conten name is {}",content.getFilename());
    }
}
