# TaskApi

All URIs are relative to *https://api.induced.ai/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**execute**](TaskApi.md#execute) | **POST** /autonomous | Execute an Autonomous Task |


<a name="execute"></a>
# **execute**
> TaskExecuteResponse execute(taskExecuteRequest).execute();

Execute an Autonomous Task

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.InducedAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TaskApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.induced.ai/api/v1";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    InducedAi client = new InducedAi(configuration);
    String task = "task_example";
    try {
      TaskExecuteResponse result = client
              .task
              .execute()
              .task(task)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getRequestId());
      System.out.println(result.getTimeTaken());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#execute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TaskExecuteResponse> response = client
              .task
              .execute()
              .task(task)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TaskApi#execute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskExecuteRequest** | [**TaskExecuteRequest**](TaskExecuteRequest.md)|  | |

### Return type

[**TaskExecuteResponse**](TaskExecuteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task executed successfully |  -  |

