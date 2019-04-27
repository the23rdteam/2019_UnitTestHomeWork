package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class APICall {
    public static void main(String[] args)
    {
        String clientId = "W90G63SjqPpgkaFPFC3Z";
        String clientSecret = "wucSoAp5D0";
        try{
            String text = URLEncoder.encode("운동화","UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/shop.json?query="+text;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode == 200)
            {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            }
            else{
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while((inputLine = br.readLine())!= null){
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
