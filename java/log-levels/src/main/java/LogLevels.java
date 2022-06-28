public class LogLevels {
    
    public static String message(String logLine) {
        logLine = logLine.substring(logLine.indexOf(":") + 1);
        logLine = logLine.trim();
        return logLine;
    }

    public static String logLevel(String logLine) {
        logLine = logLine.substring(1,logLine.indexOf("]"));
        logLine = logLine.toLowerCase();
        return logLine;
    }

    public static String reformat(String logLine) {
        String stringMessage = logLine.substring(logLine.indexOf(":") + 1);
        stringMessage = stringMessage.trim();
        String stringLevel = logLine.substring(1,logLine.indexOf("]"));
        stringLevel = stringLevel.toLowerCase();
        stringLevel = " (" + stringLevel + ")";
        logLine = stringMessage.concat(stringLevel);
        return logLine;
        
    }


}
class Main {
  public static void main(String []args) {
    System.out.println(LogLevels.message("[WARNING]:                Disk almost full\r\n"));
    System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
    System.out.println(LogLevels.reformat("[INFO]: Operation completed"));  
  }
}