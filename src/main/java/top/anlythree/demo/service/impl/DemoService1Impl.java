package top.anlythree.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anlythree.demo.service.DemoService1;
import top.anlythree.demo.service.DemoService2;

/**
 * @author wangli
 * @date 2020/9/4 16:16
 */
@Service
public class DemoService1Impl implements DemoService1 {

    @Autowired
    private DemoService2Impl demoService2Impl;
}
