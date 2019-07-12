package com.poldichen.demos.dubbo.provider;

import com.poldichen.demos.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author poldi.chen
 * @className DemoServiceImpl
 * @description TODO
 * @date 2019/7/12 10:40
 **/
public class DemoServiceImpl implements DemoService {

    public List<String> getPermissions(int id) {
        List<String> permissions = new ArrayList<>();
        permissions.add("permission-" + id);
        return permissions;
    }
}
