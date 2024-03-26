<div align="center">

[![Visit Inducedai](./header.png)](https://induced.ai)

# [Inducedai](https://induced.ai)

Building the next evolution of actionable AI.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=InducedAI&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>induced-ai-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:induced-ai-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/induced-ai-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.induced.ai/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AutonomousApi* | [**getResult**](docs/AutonomousApi.md#getResult) | **GET** /autonomous/{id} | Get Autonomous Task Result
*AutonomousApi* | [**terminateTask**](docs/AutonomousApi.md#terminateTask) | **POST** /autonomous/{id}/stop | Stop an Autonomous Task
*ExtractionApi* | [**fromUrl**](docs/ExtractionApi.md#fromUrl) | **POST** /extract | Extract data from a URL
*ExtractionApi* | [**getResult**](docs/ExtractionApi.md#getResult) | **GET** /extract/{id} | Get extraction result
*FeedbackApi* | [**submission**](docs/FeedbackApi.md#submission) | **POST** /autonomous/{id}/feedback | Provide Feedback for an Autonomous Task
*TaskApi* | [**execute**](docs/TaskApi.md#execute) | **POST** /autonomous | Execute an Autonomous Task


## Documentation for Models

 - [AutonomousGetResultResponse](docs/AutonomousGetResultResponse.md)
 - [AutonomousGetResultResponseData](docs/AutonomousGetResultResponseData.md)
 - [AutonomousGetResultResponseDataRun](docs/AutonomousGetResultResponseDataRun.md)
 - [AutonomousGetResultResponseDataRunStepsInner](docs/AutonomousGetResultResponseDataRunStepsInner.md)
 - [ExtractionFromUrlRequest](docs/ExtractionFromUrlRequest.md)
 - [ExtractionFromUrlResponse](docs/ExtractionFromUrlResponse.md)
 - [ExtractionFromUrlResponseData](docs/ExtractionFromUrlResponseData.md)
 - [ExtractionGetResultResponse](docs/ExtractionGetResultResponse.md)
 - [ExtractionGetResultResponseData](docs/ExtractionGetResultResponseData.md)
 - [ExtractionGetResultResponseDataRun](docs/ExtractionGetResultResponseDataRun.md)
 - [ExtractionGetResultResponseDataRunOutput](docs/ExtractionGetResultResponseDataRunOutput.md)
 - [FeedbackSubmissionRequest](docs/FeedbackSubmissionRequest.md)
 - [TaskExecuteRequest](docs/TaskExecuteRequest.md)
 - [TaskExecuteResponse](docs/TaskExecuteResponse.md)
 - [TaskExecuteResponseData](docs/TaskExecuteResponseData.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
