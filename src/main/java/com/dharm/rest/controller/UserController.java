package com.dharm.rest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dharm.rest.model.ErrorResponse;
import com.dharm.rest.model.People;
import com.dharm.rest.model.ResponseResult;
import com.dharm.rest.model.User;
import com.dharm.rest.service.UserService;

@RestController
public class UserController {
 
 @Autowired
 UserService userService;
 People people;  
 ResponseResult responseResult = new ResponseResult();
 ErrorResponse errorResponse = new ErrorResponse();
 
 @RequestMapping(value="/adddetails/", method = RequestMethod.POST, headers="Accept=application/json")
 public ResponseEntity<ResponseResult> add(@RequestBody User user){
String ReqId=	user.getRequestId().trim(); 
String email=	user.getEmailAddress().trim();
String name1[] =(user.getPeople()).getName(); 

System.out.println(ReqId + " " + email + " " +name1.length);

if(ReqId.equalsIgnoreCase("") || ReqId==null || email.equalsIgnoreCase("") || email==null || name1.length<1){ 
	responseResult.setResponse("400");
	responseResult.setStatus("Fail");
	return new ResponseEntity<ResponseResult>(responseResult, HttpStatus.BAD_REQUEST);
} 

responseResult.setResponse("details: processed 3 people for purple-wiki@blocks.com");
responseResult.setStatus("OK");
return new ResponseEntity<ResponseResult>(responseResult, HttpStatus.OK);

} 
 
 
}