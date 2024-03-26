# FeedbackApi

All URIs are relative to *https://api.induced.ai/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submission**](FeedbackApi.md#submission) | **POST** /autonomous/{id}/feedback | Provide Feedback for an Autonomous Task |


<a name="submission"></a>
# **submission**
> submission(id, feedbackSubmissionRequest).execute();

Provide Feedback for an Autonomous Task

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.InducedAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FeedbackApi;
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
    Boolean feedback = true;
    try {
      client
              .feedback
              .submission(id)
              .feedback(feedback)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackApi#submission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .feedback
              .submission(id)
              .feedback(feedback)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling FeedbackApi#submission");
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
| **feedbackSubmissionRequest** | [**FeedbackSubmissionRequest**](FeedbackSubmissionRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Feedback received successfully |  -  |

