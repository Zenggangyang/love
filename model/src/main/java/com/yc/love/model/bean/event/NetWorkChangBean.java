package com.yc.love.model.bean.event;

import java.util.List;

/**
 * Created by mayn on 2019/5/18.
 */

public class NetWorkChangBean {
    public List<String> connectionTypeList;

    public NetWorkChangBean(List<String> connectionTypeList) {
        this.connectionTypeList = connectionTypeList;
    }
}
