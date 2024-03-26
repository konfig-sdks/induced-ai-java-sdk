# AutonomousApi

All URIs are relative to *https://api.induced.ai/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResult**](AutonomousApi.md#getResult) | **GET** /autonomous/{id} | Get Autonomous Task Result |
| [**terminateTask**](AutonomousApi.md#terminateTask) | **POST** /autonomous/{id}/stop | Stop an Autonomous Task |


<a name="getResult"></a>
# **getResult**
> AutonomousGetResultResponse getResult(id).execute();

Get Autonomous Task Result

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.InducedAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutonomousApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.induced.ai/api/v1";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    InducedAi client = new InducedAi(configuration);
    String id = "id_example";
    try {
      AutonomousGetResultResponse result = client
              .autonomous
              .getResult(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getRequestId());
      System.out.println(result.getTimeTaken());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutonomousApi#getResult");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutonomousGetResultResponse> response = client
              .autonomous
              .getResult(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutonomousApi#getResult");
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
| **id** | **String**|  | |

### Return type

[**AutonomousGetResultResponse**](AutonomousGetResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task result retrieved successfully |  -  |

<a name="terminateTask"></a>
# **terminateTask**
> terminateTask(id).execute();

Stop an Autonomous Task

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.InducedAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutonomousApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.induced.ai/api/v1";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    InducedAi client = new InducedAi(configuration);
    String id = "id_example";
    try {
      client
              .autonomous
              .terminateTask(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutonomousApi#terminateTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .autonomous
              .terminateTask(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutonomousApi#terminateTask");
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
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task stopped successfully |  -  |

