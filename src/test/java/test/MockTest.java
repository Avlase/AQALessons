package test;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import okhttp3.OkHttpClient;
import com.github.tomakehurst.wiremock.WireMockServer;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class MockTest {
    int port = 9090;
    int responseCode = 288;
    String fakeUrl = "http://localhost:"+ port +"/somerequest";
    OkHttpClient client = new OkHttpClient.Builder().build();
    WireMockServer wireMockServer
            = new WireMockServer(new WireMockConfiguration().port(port));

    @BeforeClass
    public void beforeClass(){
        wireMockServer.start();
        WireMock.configureFor(port);
        WireMock.stubFor(
                WireMock.get(
                        WireMock.urlEqualTo("/somerequest")
                ).willReturn(
                        WireMock.aResponse()
                                .withStatus(288)
                                .withHeader("cache-control", "no-transform")
                                .withFixedDelay(1016)
                )
        );
    }
    @AfterClass
    public void AfterClass(){
        wireMockServer.stop();
    }
    @Test
    public void checkStatus() throws IOException {
        var request = new Request.Builder()
                .url(fakeUrl)
                .build();
        try (var response = client.newCall(request).execute()){
            var code = response.code();
            Assert.assertEquals(code, responseCode, "Response should be " + responseCode + " but got " + code);
        }
    }
    @Test
    public void checkHeader() throws IOException{
        String headerValue = "no-transform";
        var request = new Request.Builder()
                .url(fakeUrl)
                .build();
        try (Response response = client.newCall(request).execute()) {
            Assert.assertEquals(response.header("cache-control"), headerValue, "cache-control header should have value " + headerValue);
        }
    }
}
