package com.qf.service;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

/**
 * Created by Administrator on 2018/3/13.
 */
public class TestActi {
    //生成工作流的表
    public void creatTable() {
        //配置引擎
        ProcessEngineConfiguration configuration
                = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        //设置数据库的四个属性
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/db_activiti?characterEncoding=utf-8");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("root");
        //设置支持表的更新
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        //得到工作流引擎的对象
        ProcessEngine processEngine = configuration.buildProcessEngine();

    }
    public void createTableWithXML(){
        //加载配置

        ProcessEngineConfiguration configuration
                = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activi.cfg.xml");
        //得到工作流引擎的对象
        ProcessEngine processEngine = configuration.buildProcessEngine();

    }

    public static void main(String[] args) {
        TestActi testActi = new TestActi();
        testActi.creatTable();
//        testActi.createTableWithXML();
    }
}

