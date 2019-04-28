import api.APICall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class ApplicationRun {

    public static void main(String[] args)
    {
        APICall apiCall = new APICall();
        apiCall.start();
    }
}
