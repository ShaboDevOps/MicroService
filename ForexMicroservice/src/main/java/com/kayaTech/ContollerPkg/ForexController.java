package com.kayaTech.ContollerPkg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kayaTech.Model.ExchangeValue;
import com.kayaTech.Service.ExchangeValueRepo;

@RestController
public class ForexController {
	
	@Autowired
	private Environment env;
	@Autowired
	private ExchangeValueRepo eValueRepo;
	
	
	@GetMapping("/change/{from}/to/{to}")
	public ExchangeValue changeCurrency(@PathVariable String from, @PathVariable String to) {
		
		
		ExchangeValue eValue = eValueRepo.findByFromAndTo(from, to);
		//String portNo = env.getProperty("local.server.port");
		//eValue.setPort(Integer.parseInt(portNo));
		
		return eValue;
	}
	@PostMapping("/add")
	public String addCurrency(@RequestBody ExchangeValue eValue) {
	System.out.println("================exe==========");
	System.out.println("id : "+eValue.getId()+"\nfrom : "+eValue.getFrom()+"\nconversionMaltiple : "+eValue.getConversionMaltiple());
		eValueRepo.save(eValue);
		return "new conversion Added";
	}

}
