package com.automationpractice.logging;

import org.testng.Reporter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomReporter {

    public static void logAction(String message) {
        Reporter.log("<br />" + "<span  style=\"font-weight: bold; color: #ff0000\">" + "STEP: " + message + "</span>" + "<br />");
    }

    public static void log(String message) {
        Reporter.log(String.format("[%-12s] %s", LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME),
                message + "<br />"));
    }
}
