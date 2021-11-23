package com.narae.design.observer.scratch;

public class Simulator {
    public static void main(String[] args) {
        TelemetryData telemetryData = new TelemetryData();

        CurrentDataMonitor currentDataMonitor = new CurrentDataMonitor(telemetryData);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(telemetryData);
        PredictionMonitor predictionMonitor = new PredictionMonitor(telemetryData);

        telemetryData.setMeasurements(30.25f, 40);
        telemetryData.setMeasurements(23, 10.63f);
        telemetryData.setMeasurements(299.84f, 200);
    }
}
