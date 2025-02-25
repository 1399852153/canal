package com.alibaba.otter.canal.client.adapter.hbase.test;

import com.alibaba.otter.canal.client.adapter.hbase.support.HbaseTemplate;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.junit.Test;

public class HBaseConnectionTest {

    @Test
    public void test01() {
        Configuration hbaseConfig = HBaseConfiguration.create();
        hbaseConfig.set("hbase.zookeeper.quorum", "hb-bp1vk27j30qh7n6fv-002.hbase.rds.aliyuncs.com:2181,hb-bp1vk27j30qh7n6fv-001.hbase.rds.aliyuncs.com:2181,hb-bp1vk27j30qh7n6fv-003.hbase.rds.aliyuncs.com:2181");
//        hbaseConfig.set("hbase.zookeeper.property.clientPort", "2181");
        hbaseConfig.set("zookeeper.znode.parent", "/hbase");
        HbaseTemplate hbaseTemplate = new HbaseTemplate(hbaseConfig);
        System.out.println(hbaseTemplate.tableExists("ttt"));
        System.out.println(hbaseTemplate.tableExists("my_test"));

    }
}
