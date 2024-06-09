package com.ust.LP2.c4;
interface Logger {
    void logInfo(String msg);
    void logError(String err);
}

class FileLogger implements Logger {
    @Override
    public void logInfo(String msg) {
        System.out.println("File Info: " + msg);
    }

    @Override
    public void logError(String err) {
        System.out.println("File Error: " + err);
    }
}

class DatabaseLogger implements Logger {
    @Override
    public void logInfo(String msg) {
        System.out.println("DB Info: " + msg);
    }

    @Override
    public void logError(String err) {
        System.out.println("DB Error: " + err);
    }
}

class Application {
    private Logger log;

    Application(Logger log) {
        this.log = log;
    }

    void performApplicationTask() {
        log.logInfo("task started");
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            log.logError("error occurred: " + e.getMessage());
        }
        log.logInfo("task completed");
    }
}
public class EncapsulationAndInterface {
    public static void main(String[] args) {
        Logger fileLog = new FileLogger();
        Logger dbLog = new DatabaseLogger();

        Application app1 = new Application(fileLog);
        Application app2 = new Application(dbLog);

        System.out.println("Using FileLog:");
        app1.performApplicationTask();

        System.out.println("Using DbLog:");
        app2.performApplicationTask();
    }
}
