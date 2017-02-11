package euclidean;

import org.apache.commons.cli.*;

public class Main {

    public static void main(String[] args) {

        Options options = new Options();
        options.addOption("u", true, "one of two numbers to find greatest common divisor of");
        options.addOption("w", true, "one of two numbers to find greatest common divisor of");

        CommandLineParser parser = new BasicParser();

        try {
            CommandLine cmd = parser.parse(options, args);
            int u = Integer.parseInt(cmd.getOptionValue("u"));
            int w = Integer.parseInt(cmd.getOptionValue("w"));

            int result = GreatestCommonDivisor.find(u, w);

            System.out.println(String.format("Greatest common divisor for numbers %d and %d is %d.", u, w, result));

        } catch (ParseException | NumberFormatException e) {
            System.out.println("Invalid parameters.\n");
            new HelpFormatter().printHelp("java -jar target/gcd-1.0.jar -u 12 -w 6", options);
        }
    }
}
