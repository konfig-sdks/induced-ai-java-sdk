/*
 * Autonomous API
 * Building the next evolution of actionable AI.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.TaskExecuteRequest;
import com.konfigthis.client.model.TaskExecuteResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskApi
 */
@Disabled
public class TaskApiTest {

    private static TaskApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TaskApi(apiClient);
    }

    /**
     * Execute an Autonomous Task
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String task = null;
        TaskExecuteResponse response = api.execute()
                .task(task)
                .execute();
        // TODO: test validations
    }

}
