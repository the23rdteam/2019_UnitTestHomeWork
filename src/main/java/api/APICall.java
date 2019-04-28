package api;

import domain.Shoe;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ShoeRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;

@Service
public class APICall {

    @Autowired
    private ShoeRepository shoeRepository;
    JSONParser parser = new JSONParser();

    public Shoe parsingJSONData(JSONObject object){

        Shoe shoe = new Shoe(
                (String)object.get("title"),
                (String)object.get("link"),
                (String)object.get("image"),
                (Integer)object.get("lprice"),
                (Integer)object.get("hprice"),
                (String)object.get("mallName"),
                (Integer) object.get("producetType"));
        return shoe;
    }

    public void start(){
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
                else {
                    br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                }
                StringBuffer response = new StringBuffer();
                Object obj = parser.parse(br);
                JSONObject jsonObject = (JSONObject) obj;

                JSONArray array = (JSONArray) jsonObject.get("items");
                Iterator<JSONObject> iterator = array.iterator();
                while(iterator.hasNext()){
                    JSONObject obj1 = iterator.next();
                    shoeRepository.save(parsingJSONData(obj1));

                }
                br.close();

            }
            catch(Exception e){
                System.out.println(e);
            }
        }

}
