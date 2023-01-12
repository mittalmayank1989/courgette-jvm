package courgette.runtime;

import courgette.api.CourgetteOptions;

import java.time.Instant;

public class CourgetteProperties {
    private final CourgetteOptions courgetteOptions;
    private final String sessionId;
    private final Instant sessionStartTime;
    private final Integer maxThreads;

    public CourgetteProperties(CourgetteOptions courgetteOptions, String sessionId, Integer maxThreads) {
        this.courgetteOptions = courgetteOptions;
        this.sessionId = sessionId;
        this.sessionStartTime = Instant.now();
        this.maxThreads = maxThreads;
    }

    public CourgetteOptions getCourgetteOptions() {
        return courgetteOptions;
    }

    public String getSessionId() {
        return sessionId;
    }

    public Instant getSessionStartTime() {
        return sessionStartTime;
    }

    public Integer getMaxThreads() {
        return maxThreads;
    }
}
