package branch;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class Account {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HashMap<Integer,Details> hmap = new HashMap<Integer,Details>();
		
		hmap.put(2, new Details(465534634, "Anmar", "Al-Qutayri"));
		
		
		System.out.println("Account: "+ hmap.get(2));
		
//		hmap.remove(2);
//		
//		System.out.println(hmap.get(2));
	
        ObjectMapper mapper = new ObjectMapper();
        String json;
         try {
			json = mapper.writeValueAsString(hmap);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
	
	
	}
	
	

}
