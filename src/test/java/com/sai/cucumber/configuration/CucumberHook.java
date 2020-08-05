package com.sai.cucumber.configuration;

import com.sai.cucumber.TestApplication;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;

public class CucumberHook implements ConcurrentEventListener {
    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, event->configure());
        eventPublisher.registerHandlerFor(TestRunFinished.class, event->clean());
    }

    private void clean() {

    }

    private void configure() {
        TestApplication app = new TestApplication();
        app.launchApp();
    }
}
