public class LogLevels {
    
     static String message(String logLine) {
         return logLine.split(": ", 2)[1].trim();
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.split(": ", 2)[0];
        return logLevel.replace("[","").replace("]","").toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] parts = logLine.split(": ", 2);
        String level = parts[0].replace("[","(").replace("]",")").toLowerCase();
        String message = parts[1].trim();
        return message + " " + level;
    }
}
