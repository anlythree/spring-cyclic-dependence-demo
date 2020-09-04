package top.anlythree.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anlythree.demo.service.DemoService1;
import top.anlythree.demo.service.DemoService2;

/**
 * @author wangli
 * @date 2020/9/4 16:17
 */
@Service
public class DemoService2Impl implements DemoService2 {

    @Autowired
    private DemoService1Impl demoService1Impl;
}
