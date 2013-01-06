package eu.testproject.ws;

import javax.jws.WebService;

import eu.testproject.dto.SayHiDTO;

@WebService(endpointInterface = "eu.testproject.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(SayHiDTO dto) 
	{
		System.out.println("client message"+ dto.getHi());
		return "Hello from server";
	}
}