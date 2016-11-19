package com.base.handler;


import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;


import com.base.model.User;


//import com.niit.bean.User;


@Component
public class RegistrationHandler {

	public User initFlow(){
		return new User();
	}

	


	public String validateDetails(User user,MessageContext messageContext){
		String status = "success";
		
		if(user.getFirstname().isEmpty()){
		messageContext.addMessage(new MessageBuilder().error().source(
				"firstname").defaultText("Firstname cannot be Empty").build());
		status = "failure";
		System.out.println("firstname fail");
	}
	if(user.getMiddlename().isEmpty()){
		messageContext.addMessage(new MessageBuilder().error().source(
				"middlename").defaultText("Middlename cannot be Empty").build());
		status = "failure";
		System.out.println("middlename fail");
	}
	if(user.getLastname().isEmpty()){
		messageContext.addMessage(new MessageBuilder().error().source(
				"lastname").defaultText("Lastname cannot be Empty").build());
		status = "failure";
		System.out.println("middlename fail");
	}
		if(user.getUsername().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"name").defaultText("Username cannot be Empty").build());
			status = "failure";
			System.out.println("username fail");
		}
	/*	if(user.getId().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"id").defaultText("UserId cannot be Empty").build());
			status = "failure";
			System.out.println("userid fail");
		}*/
		if(user.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("Password cannot be Empty").build());
			status = "failure";
			System.out.println("password fail");
		}
		if(user.getConfirmpassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"confirmpassword").defaultText("Confirmed Password cannot be Empty").build());
			status = "failure";
			System.out.println("cpassword fail");
		}
		if(!user.getConfirmpassword().equals(user.getPassword())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"confirmpassword").defaultText("Passwords do not match").build());
			status = "failure";
			System.out.println("check password fail");
		}
		
			if(user.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
			System.out.println("emailid fail");
		}

		
		return status;
	}
}