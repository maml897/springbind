package springbind;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.validation.DataBinder;

public class BindTest1 {
	public static void main(String[] args) {
		User user = new User();
		DataBinder db = new DataBinder(user);


		Map<String, String> map = new HashMap<>();
		map.put("id", "123");
		map.put("aa", "123");
		map.put("price", "172.525");
		PropertyValues pvs = new MutablePropertyValues(map);
		db.bind(pvs);
		
		System.out.println(user.getId());
		System.out.println(user.getPrice().doubleValue());
	}
}
