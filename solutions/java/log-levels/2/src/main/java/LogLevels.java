public class LogLevels {
    
     static String message(String logLine) {
         return logLine.split(": ", 2)[1].trim();
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.split(": ", 2)[0];
        return logLevel.replace("[","").replace("]","").toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " (" + level + ")";
    }
}
