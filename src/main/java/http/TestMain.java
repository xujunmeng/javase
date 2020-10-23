package http;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;
import java.util.logging.Logger;

public class TestMain {

    public static final String CONNECT_TIMEOUT = "CONNECT_TIMEOUT";
    public static final String CONNECTION_REQUEST_TIMEOUT = "CONNECTION_REQUEST_TIMEOUT";
    public static final String SOCKET_TIMEOUT = "SOCKET_TIMEOUT";


    public static void main(String[] args) {

        ExecutorService exec = Executors.newFixedThreadPool(10);
        //容量为10的阻塞队列
        BlockingQueue<Future<String>> queue = new LinkedBlockingDeque<>(100000);
        //实例化CompletionService
        CompletionService<String> completionService = new ExecutorCompletionService<>(exec, queue);

        for(int i = 0 ; i < 100000 ; i++){
            completionService.submit(() -> {
                String url = "http://localhost:8280/test/user/add";
                String result = null;
                try {
                    result = doGet(url, null, new HashMap<>());
                    System.out.println("result : " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return result;
            });
        }

        for(int i = 0 ; i < 100000 ; i++){
            try {
                Future<String> take = completionService.take();
                System.out.println("task : " + take.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        exec.shutdown();
    }


    public static String doGet(String url, String params, Map<String, Integer> requestTimeout) throws Exception {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        HttpGet httpGet = null;
        String result = "";

        try {

            httpClient = HttpClients.createDefault();
            // 创建httpGet远程连接实例
            if (StringUtils.isNotEmpty(params)) {
                httpGet = new HttpGet(url + "?" + params);
            } else {
                httpGet = new HttpGet(url);
            }
            // 为httpGet实例设置配置
            httpGet.setConfig(buildRequestConfig(requestTimeout));
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                result = EntityUtils.toString(entity, Charset.forName("UTF-8"));
            }

        } catch (IOException e) {
            throw new RuntimeException("发送GET请求异常", e);
        } finally {
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return result;
    }

    private static RequestConfig buildRequestConfig(Map<String, Integer> requestTimeout) {
        // 配置请求参数实例
        return RequestConfig.custom().setConnectTimeout(requestTimeout.getOrDefault(CONNECT_TIMEOUT, 3000))
                .setConnectionRequestTimeout(requestTimeout.getOrDefault(CONNECTION_REQUEST_TIMEOUT, 3000))
                .setSocketTimeout(requestTimeout.getOrDefault(SOCKET_TIMEOUT, 3000))
                .build();
    }

}
