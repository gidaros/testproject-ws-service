package eu.testproject.ws;

import javax.jws.WebService;

import eu.testproject.dto.SayHiDTO;

@WebService
public interface HelloWorld 
{
    String sayHi(SayHiDTO dto);
}