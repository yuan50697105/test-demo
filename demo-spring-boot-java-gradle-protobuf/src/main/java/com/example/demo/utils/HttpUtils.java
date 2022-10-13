package com.example.demo.utils;

import com.example.demo.protobuf.MessageUserEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class HttpUtils {
    public static HttpResponse doPost(String uri, MessageUserEntity.MessageUserRequest message) throws Exception {
        CloseableHttpResponse closeableHttpResponse = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost post = new HttpPost(uri);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(message.toByteArray());
            InputStreamEntity inputStreamEntity = new InputStreamEntity(inputStream);
            post.setEntity(inputStreamEntity);
            post.addHeader("Content-Type", "application/x-protobuf");
            closeableHttpResponse = httpclient.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // httpclient.close();
        }
        return closeableHttpResponse;
    }
}
