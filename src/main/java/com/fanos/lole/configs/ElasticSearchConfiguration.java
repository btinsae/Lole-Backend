///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.fanos.lole.configs;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.node.NodeBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
///**
// *
// * @author win8
// */
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.fanos.lole.repositories")
//public class ElasticSearchConfiguration {
//
//    @Bean
//    NodeBuilder nodeBuilder() {
//        return new NodeBuilder();
//    }
//
//    @Bean
//    ElasticsearchOperations elasticsearchOperations() {
//        File tmpDir = null;
//        try {
//            tmpDir = File.createTempFile("tmp-elastic", Long.toString(System.nanoTime()));
//        } catch (IOException ex) {
//            Logger.getLogger(ElasticSearchConfiguration.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Settings.Builder elasicsearchSettings
//                = Settings.settingsBuilder()
//                        .put("http-enabled", "true")
//                        .put("index.number_of_shards", "1")
//                        .put("path.data", new File(tmpDir, "data").getAbsolutePath())
//                        .put("path.logs", new File(tmpDir, "logs").getAbsolutePath())
//                        .put("path.work", new File(tmpDir, "work").getAbsolutePath())
//                        .put("path.home", tmpDir);
//        return new ElasticsearchTemplate(nodeBuilder()
//                .local(true)
//                .settings(elasicsearchSettings.build())
//                .node()
//                .client());
//    }
//}
