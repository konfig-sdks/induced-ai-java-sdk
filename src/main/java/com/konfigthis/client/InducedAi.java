package com.konfigthis.client;

import com.konfigthis.client.api.AutonomousApi;
import com.konfigthis.client.api.ExtractionApi;
import com.konfigthis.client.api.FeedbackApi;
import com.konfigthis.client.api.TaskApi;

public class InducedAi {
    private ApiClient apiClient;
    public final AutonomousApi autonomous;
    public final ExtractionApi extraction;
    public final FeedbackApi feedback;
    public final TaskApi task;

    public InducedAi() {
        this(null);
    }

    public InducedAi(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.autonomous = new AutonomousApi(this.apiClient);
        this.extraction = new ExtractionApi(this.apiClient);
        this.feedback = new FeedbackApi(this.apiClient);
        this.task = new TaskApi(this.apiClient);
    }

}
