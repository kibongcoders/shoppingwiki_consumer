package com.kibong.shoppingwiki_consumer.kafka.dto;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ContentsLogConsumer {

    @KafkaListener(topics = "creat-contents-log")
    @Transactional
    public void listenCreateContentsLog(JSONObject jsonObject){
        log.info("contentsLogData={}", jsonObject);
    }
}
