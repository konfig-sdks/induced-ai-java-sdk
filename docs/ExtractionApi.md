# ExtractionApi

All URIs are relative to *https://api.induced.ai/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fromUrl**](ExtractionApi.md#fromUrl) | **POST** /extract | Extract data from a URL |
| [**getResult**](ExtractionApi.md#getResult) | **GET** /extract/{id} | Get extraction result |


<a name="fromUrl"></a>
# **fromUrl**
> ExtractionFromUrlResponse fromUrl(extractionFromUrlRequest).execute();

Extract data from a URL

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.InducedAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExtractionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.induced.ai/api/v1";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    InducedAi client = new InducedAi(configuration);
    String url = "url_example";
    String query = "query_example";
    String columns = "columns_example";
    Integer limit = 56;
    String format = "json";
    try {
      ExtractionFromUrlResponse result = client
              .extraction
              .fromUrl()
              .url(url)
              .query(query)
              .columns(columns)
              .limit(limit)
              .format(format)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getRequestId());
      System.out.println(result.getTimeTaken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtractionApi#fromUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExtractionFromUrlResponse> response = client
              .extraction
              .fromUrl()
              .url(url)
              .query(query)
              .columns(columns)
              .limit(limit)
              .format(format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtractionApi#fromUrl");
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
| **extractionFromUrlRequest** | [**ExtractionFromUrlRequest**](ExtractionFromUrlRequest.md)|  | |

### Return type

[**ExtractionFromUrlResponse**](ExtractionFromUrlResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Data extracted successfully |  -  |

<a name="getResult"></a>
# **getResult**
> ExtractionGetResultResponse getResult(id).execute();

Get extraction result

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.InducedAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExtractionApi;
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
      ExtractionGetResultResponse result = client
              .extraction
              .getResult(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getData());
      System.out.println(result.getRequestId());
      System.out.println(result.getTimeTaken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtractionApi#getResult");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExtractionGetResultResponse> response = client
              .extraction
              .getResult(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtractionApi#getResult");
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

[**ExtractionGetResultResponse**](ExtractionGetResultResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Extraction result retrieved successfully |  -  |

