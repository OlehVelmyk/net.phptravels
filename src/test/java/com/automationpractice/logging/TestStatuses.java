package com.automationpractice.logging;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestStatuses implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        CustomReporter.log("Test " + "'" + iTestResult.getName() + "'" + " is started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        CustomReporter.log("Test " + "'" + iTestResult.getName() + "'" + " success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        CustomReporter.log("Test " + "'" + iTestResult.getName() + "'" + " skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        CustomReporter.log("On Start " + "'" + iTestContext.getName() + "'");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        CustomReporter.log("On Finish " + "'" + iTestContext.getName() + "'");
    }
}
