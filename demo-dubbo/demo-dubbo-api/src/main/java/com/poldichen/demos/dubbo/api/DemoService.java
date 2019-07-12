package com.poldichen.demos.dubbo.api;

import java.util.List;

public interface DemoService {

    List<String> getPermissions(int id);
}
