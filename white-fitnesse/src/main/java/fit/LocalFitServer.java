package fit;

public class LocalFitServer extends FitServer {

    public static void main(final String[] argv) throws Exception {
        argv[0] = "localhost";
        FitServer.main(argv);
    }

}
