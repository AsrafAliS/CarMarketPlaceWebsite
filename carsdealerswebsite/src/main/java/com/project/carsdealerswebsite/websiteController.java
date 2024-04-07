package com.project.carsdealerswebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.carsdealerswebsite.model.SignupDetails;
import com.project.carsdealerswebsite.model.SignupService;




@Controller
public class websiteController {
	
	@Autowired
    private SignupService signupService;
	
	
	@RequestMapping("/")
	public String login()
	{
		
		
		
		return "loginpage";
	}
	
	
	
	@GetMapping("/signup")
	public String singup() {
		return "signupform";
	}
	
	
	@GetMapping("/signin")
	public String signin() {
		
		return "signin";
	}
	
	
	 @PostMapping("/signupdetails")
	    public String processSignupForm(@RequestParam("username") String username,
	                                    @RequestParam("email") String email,
	                                    @RequestParam("address") String address,
	                                    @RequestParam("phone") String phone,
	                                    @RequestParam("password") String password,
	                                    @RequestParam("confirmpassword") String confirmPassword) {
	        // Check if passwords match
	        if (!password.equals(confirmPassword)) {
	            // Passwords don't match, handle the error (e.g., return to signup form with error message)
	            return "redirect:/signup?error=password";
	        }

	        // Create a SignupDetails object with the form data
	        SignupDetails signupDetails = new SignupDetails(null, username, email, address, phone, password, confirmPassword);

	        try {
	            // Save the signup details using the SignupService
	            signupService.saveSignupDetails(signupDetails);
	        } catch (IllegalArgumentException e) {
	            // Handle the case where the username already exists
	            return "redirect:/signup?error=usernameExists";
	        }

	        // Redirect to a success page
	        return "signin";
	    }
	 
	 
	 @PostMapping("/signinpoint")
	    public String processSigninForm(@RequestParam("username") String username,
	                                    @RequestParam("password") String password) {
	        // Check if the provided credentials are valid
	        if (signupService.authenticate(username, password)) {
	            // Authentication successful, redirect to a success page
	            return "dashboard"; // Replace "/success" with your success page URL
	        } else {
	            // Authentication failed, redirect back to the sign-in page with an error message
	            return "redirect:/signin?error"; // Add query parameter for error handling
	        }
	    }
	 
	 
	 @RequestMapping("/service")
	 public String serviceform() {
		 return "service";
	 }
	 
	 
	 @RequestMapping("/about")
	 public String aboutform() {
		 return"aboutus";
	 }
	 
	 @RequestMapping("/drive")
	 public String driveform() {
		 return"testdrive";
	 }
	 
	 //callback
	 
	 @RequestMapping("/callback")
	 public String callback() {
		 return"contactform";
	 }
	 
	 
	 @GetMapping("/callback")
	 public String brandpagecallback() {
		 return"contactform";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @RequestMapping("/bmw")
	 public String bmwpage() {
		 return"bmwbrandpage";
	 }
	 
	 
	 @RequestMapping("/audi")
	 public String audipage() {
		 return"audibrandpage";
	 }
	 
	 
	 @RequestMapping("/ferrari")
	 public String ferraripage() {
		 return"ferraribrandpage";
	 }
	 
	 
	 @RequestMapping("/tesla")
	 public String teslapage() {
		 return"teslabrandpage";
	 }
	 
	 @RequestMapping("/mustang")
	 public String mustangpage() {
		 return"mustangbrandpage";
	 }
	 
	 @RequestMapping("/jaguar")
	 public String jaguarpage() {
		 return"jaguarbrandpage";
	 }
	 
	 @RequestMapping("/lexus")
	 public String lexuspage() {
		 return"lexusbrandpage";
	 }
	 
	 @RequestMapping("/benz")
	 public String benzpage() {
		 return"benzbrandpage";
	 }
	 
	 
	 @RequestMapping("/carspec")
	 public String carspec() {
		 return"bmwdummy";
	 }
	 
	 
	 
	 
	 
	 @GetMapping("/contact")
	 public String contactformredirect() {
		 return "contactform";
	 }
	 
	 
	 
	 
	 
	 //for bmw car lists
	 
	 @GetMapping("/bmwfirstrowimageone")
	 public String redirectToCarspecificationpage() {
		 return "Thebmwseriesgranlimousine";
	 }
	 
	 
	 @GetMapping("/bmwfirstrowimagetwo")
	 public String redirectToCarspecificationpage2() {
		 return "thebmwseriessedan";
	 }
	 
	 
	 @GetMapping("/bmwfirstrowimagethree")
	 public String redirectToCarspecificationpage3() {
		 return "theallnewbmwcoupe";
	 }
	 
	 
	 @GetMapping("/bmwfirstrowimagefour")
	 public String redirectToCarspecificationpage4() {
		 return "thebmwmeigthcompetitioncoupe";
	 }
	 
	 
	 
	 @GetMapping("/bmwsecondrowimageone")
	 public String redirectToCarspecificationpage11() {
		 return "thefirsteverbmwdrivemfourtyi";
	 }
	 
	 
	 @GetMapping("/bmwsecondrowimagetwo")
	 public String redirectToCarspecificationpage12() {
		 return "thebmwxseven";
	 }
	 
	 
	 @GetMapping("/bmwsecondrowimagethree")
	 public String redirectToCarspecificationpage13() {
		 return "thenewbmwxfive";
	 }
	 
	 
	 @GetMapping("/bmwsecondrowimagefour")
	 public String redirectToCarspecificationpage14() {
		 return "thebmwxthree";
	 }
	 
	 
	 @GetMapping("/bmwsecondrowimagefive")
	 public String redirectToCarspecificationpage15() {
		 return "thebmwxone";
	 }
	 
	 @GetMapping("/bmwthirdrowimageone")
	 public String redirectToCarspecificationpage31() {
		 return "thebmwxm";
	 }
	 
	 
	 @GetMapping("/bmwthirdrowimagetwo")
	 public String redirectToCarspecificationpage32() {
		 return "thefullyelectricbmwifour";
	 }
	 
	 
	 @GetMapping("/bmwthirdrowimagethree")
	 public String redirectToCarspecificationpage33() {
		 return "thefullyelectricbmwiseven";
	 }
	 
	 
	 @GetMapping("/bmwthirdrowimagefour")
	 public String redirectToCarspecificationpage34() {
		 return "thefirsteverbmwisevenmseventy";
	 }
	 
	 
	 @GetMapping("/bmwthirdrowimagefive")
	 public String redirectToCarspecificationpage35() {
		 return "thebmwseriesprotection";
	 }
	 
	 
	 @GetMapping("/bmwthirdrowimagesix")
	 public String redirectToCarspecificationpage36() {
		 return "later";
	 }
	 
	 
	 @GetMapping("/bmwthirdrowimageseventh")
	 public String redirectToCarspecificationpage37() {
		 return "later";
	 }
	 
	 
	
	 
	 
	 
	 
	 
	 

	 //for Audi car lists
	 
	 @GetMapping("/audifirstrowimageone")
	 public String redirectToCarspecificationpage22() {
		 return "Qeightetron";
	 }
	 
	 
	 @GetMapping("/audifirstrowimagetwo")
	 public String redirectToCarspecificationpage23() {
		 return "Qeigthsportbacketron";
	 }
	 
	 
	 @GetMapping("/audifirstrowimagethree")
	 public String redirectToCarspecificationpage25() {
		 return "audietrongt";
	 }
	 
	 
	 @GetMapping("/audifirstrowimagefour")
	 public String redirectToCarspecificationpage26() {
		 return "audirsetrongt";
	 }
	 
	 
	 
	 @GetMapping("/audisecondrowimageone")
	 public String redirectToCarspecificationpage27() {
		 return "afoursedan";
	 }
	 
	 
	 @GetMapping("/audisecondrowimagetwo")
	 public String redirectToCarspecificationpage28() {
		 return "rsfivesportback";
	 }
	 
	 
	 @GetMapping("/audisecondrowimagethree")
	 public String redirectToCarspecificationpage29() {
		 return "asixsedan";
	 }
	 
	 
	 @GetMapping("/audisecondrowimagefour")
	 public String redirectToCarspecificationpage30() {
		 return "audiaeigthl";
	 }
	 
	 
	 @GetMapping("/audisecondrowimagefive")
	 public String redirectToCarspecificationpage315() {
		 return "qthreesportback";
	 }
	 
	 @GetMapping("/audithirdrowimageone")
	 public String redirectToCarspecificationpage322() {
		 return "qeight";
	 }
	 
	 
	 @GetMapping("/audithirdrowimagetwo")
	 public String redirectToCarspecificationpage331() {
		 return "rsqeigth";
	 }
	 
	 
	 @GetMapping("/audithirdrowimagethree")
	 public String redirectToCarspecificationpage342() {
		 return "audiqthree";
	 }
	 
	 
	 @GetMapping("/audithirdrowimagefour")
	 public String redirectToCarspecificationpage356() {
		 return "later";
	 }
	 
	 
	 @GetMapping("/audithirdrowimagefive")
	 public String redirectToCarspecificationpage368() {
		 return "later";
	 }
	 
	 
	 @GetMapping("/audithirdrowimagesix")
	 public String redirectToCarspecificationpage379() {
		 return "later";
	 }
	 
	 
	 @GetMapping("/audithirdrowimageseventh")
	 public String redirectToCarspecificationpage38() {
		 return "later";
	 }
	 
	 
	 
	 
	 
	 //benz cars 
	 
	 
	 

	 //for Audi car lists
	 
	 @GetMapping("/benzfirstrowimageone")
	 public String redirectToCarspecificationpage221() {
		 return "benzeqslimousine";
	 }
	 
	 
	 @GetMapping("/benzfirstrowimagetwo")
	 public String redirectToCarspecificationpage232() {
		 return "benzaclasslimousine";
	 }
	 
	 
	 @GetMapping("/benzfirstrowimagethree")
	 public String redirectToCarspecificationpage254() {
		 return "benzeclasslimousinelwb";
	 }
	 
	 
	 @GetMapping("/benzfirstrowimagefour")
	 public String redirectToCarspecificationpage263() {
		 return "benzsclass";
	 }
	 
	 
	 
	 @GetMapping("/benzsecondrowimageone")
	 public String redirectToCarspecificationpage227() {
		 return "benzmercedesmaybachsclass";
	 }
	 
	 
	 @GetMapping("/benzsecondrowimagetwo")
	 public String redirectToCarspecificationpage284() {
		 return "benzeqb";
	 }
	 
	 
	 @GetMapping("/benzsecondrowimagethree")
	 public String redirectToCarspecificationpage229() {
		 return "benzglb";
	 }
	 
	 
	 @GetMapping("/benzsecondrowimagefour")
	 public String redirectToCarspecificationpage310() {
		 return "benzgle";
	 }
	 
	 
	 @GetMapping("/benzsecondrowimagefive")
	 public String redirectToCarspecificationpage3165() {
		 return "benzcoupe";
	 }
	 
	 @GetMapping("/benzthirdrowimageone")
	 public String redirectToCarspecificationpage3232() {
		 return "benzmercedesamggtdoorcoupe";
	 }
	 
	 
	 @GetMapping("/benzthirdrowimagetwo")
	 public String redirectToCarspecificationpage3321() {
		 return "benzeclasscabriolet";
	 }
	 
	 
	 @GetMapping("/benzthirdrowimagethree")
	 public String redirectToCarspecificationpage3422() {
		 return "benzmercedesmaybachgls";
	 }
	 
	 
	 @GetMapping("/benzthirdrowimagefour")
	 public String redirectToCarspecificationpage3564() {
		 return "later";
	 }
	 
	 
	 @GetMapping("/benzthirdrowimagefive")
	 public String redirectToCarspecificationpage33368() {
		 return "later";
	 }
	 
	 
	 @GetMapping("/benzthirdrowimagesix")
	 public String redirectToCarspecificationpage3729() {
		 return "later";
	 }
	 
	 
	 @GetMapping("/benzthirdrowimageseventh")
	 public String redirectToCarspecificationpage389() {
		 return "later";
	 }
	 
	
	 
	 
	 
	 
	 //ferrari cars 
	 
	 
	 

	 //for Audi car lists
	 
	 @GetMapping("/ferrarifirstrowimageone")
	 public String redirectToCarspecificationkdpage22() {
		 return "ferrarisfxxninty";
	 }
	 
	 
	 @GetMapping("/ferrarifirstrowimagetwo")
	 public String redirecaatToCarspecificationpage23() {
		 return "ferrarisfnintyspider";
	 }
	 
	 
	 @GetMapping("/ferrarifirstrowimagethree")
	 public String redirectToCfdarspecificationpage25() {
		 return "ferrariplrosangue";
	 }
	 
	 
	 @GetMapping("/ferrarifirstrowimagefour")
	 public String redirectTjboCarspecificationpage26() {
		 return "ferraritheeightonetwogts";
	 }
	 
	 
	 
	 @GetMapping("/ferrarisecondrowimageone")
	 public String redirectToCarspekkkcificationpage27() {
		 return "ferraritwoninesixgtb";
	 }
	 
	 
	 @GetMapping("/ferrarisecondrowimagetwo")
	 public String redirecknjkbtToCarspecificationpage28() {
		 return "ferrarisfnintytradale";
	 }
	 
	 
	 @GetMapping("/ferrarisecondrowimagethree")
	 public String redirecakjbtToCarspecificationpage29() {
		 return "ferrariroma";
	 }
	 
	 
	 @GetMapping("/ferrarisecondrowimagefour")
	 public String redirectToCnkknkarspecificationpage30() {
		 return "ferrariportofinom";
	 }
	 
	 
	 
	 
	 
	 //tesla cars 
	 
	 
	 
	//for Audi car lists
	 
		 @GetMapping("/teslafirstrowimageone")
		 public String redirectToCarspddecificationkdpage22() {
			 return "teslamodels";
		 }
		 
		 
		 @GetMapping("/teslafirstrowimagetwo")
		 public String redirecaatToCasrspecificationpage23() {
			 return "teslamodelthree";
		 }
		 
		 
		 @GetMapping("/teslafirstrowimagethree")
		 public String redirectToCfdarspecififcationpage25() {
			 return "teslamodelx";
		 }
		 
		 
		 @GetMapping("/teslafirstrowimagefour")
		 public String redirectTjboCarspaecificationpage26() {
			 return "teslamodel";
		 }
		 
		 
	 
	 
	
		 
		 
		 
		 
		 //for mustang car lists
		 
		 @GetMapping("/mustangfirstrowimageone")
		 public String redirectToCarspelscificationkdpage22() {
			 return "mustangecoboostfastback";
		 }
		 
		 
		 @GetMapping("/mustangfirstrowimagetwo")
		 public String redirecaatToaaCarspecificationpage23() {
			 return "mustangecoboostpremiumfastback";
		 }
		 
		 
		 @GetMapping("/mustangfirstrowimagethree")
		 public String redirectToCfwwwwwdarspecificationpage25() {
			 return "mustangecoboostconvertible";
		 }
		 
		 
		 @GetMapping("/mustangfirstrowimagefour")
		 public String rediresdkdsctTjboCarspecificationpage26() {
			 return "mustangecoboostpremiumconvertible";
		 }
		 
		 
		 
		 @GetMapping("/mustangsecondrowimageone")
		 public String redirectToCarspkjsdekkkcificationpage27() {
			 return "mustanggtfastback";
		 }
		 
		 
		 @GetMapping("/mustangsecondrowimagetwo")
		 public String redirecknjkbtkdToCarspecificationpage28() {
			 return "mustanggtpremiumfastback";
		 }
		 
		 
		 @GetMapping("/mustangsecondrowimagethree")
		 public String redirecakjbtTdwknwoCarspecificationpage29() {
			 return "mustanggtpremiumconvertible";
		 }
		 
		 
		 @GetMapping("/mustangsecondrowimagefour")
		 public String redirectToCnkskdkknkarspecificationpage30() {
			 return "mustangdarkhorsepremium";
		 }
	
	




		//for jaguar car lists
		
		@GetMapping("/jaguarfirstrowimageone")
		public String redirectToCarspecifjkdicationkdpage22() {
			 return "jaguarftype";
		}
		
		
		@GetMapping("/jaguarfirstrowimagetwo")
		public String redirecaatToCarspkbdaecificationpage23() {
			 return "jaguarfpace";
		}
		
		
		@GetMapping("/jaguarfirstrowimagethree")
		public String redirectToCfdakjbrspecificationpage25() {
			 return "jaguarftypetwo";
		}
		
		
		@GetMapping("/jaguarfirstrowimagefour")
		public String redirectTjboCaakjfbarspecificationpage26() {
			 return "jaguarftypethree";
		}
		
		
		
		@GetMapping("/jaguarsecondrowimageone")
		public String redirectToCaasjkdbrspekkkcificationpage27() {
			 return "jaguarxe";
		}
		
		
		@GetMapping("/jaguarsecondrowimagetwo")
		public String redirecknjkbtadToCarspecificationpage28() {
			 return "jaguarxf";
		}
		
		
		@GetMapping("/jaguarsecondrowimagethree")
		public String redirecakjbtadToCarspecificationpage29() {
			 return "jaguarxkseries";
		}
		
		
		@GetMapping("/jaguarsecondrowimagefour")
		public String redirectToCqqnkknkarspecificationpage30() {
			 return "jaguarxftwo";
		}
		
		
		
		
		 //for lexus car lists
		 
		 @GetMapping("/lexusfirstrowimageone")
		 public String redirectToCarsjkbpecificationkdpage22() {
			 return "lexuslc";
		 }
		 
		 
		 @GetMapping("/lexusfirstrowimagetwo")
		 public String redirecaatToaadCarspecificationpage23() {
			 return "lexusls";
		 }
		 
		 
		 @GetMapping("/lexusfirstrowimagethree")
		 public String redirectToCfdarspecificgsationpage25() {
			 return "lexuses";
		 }
		 
		 
		 @GetMapping("/lexusfirstrowimagefour")
		 public String redirectTjboCarspecifsgicationpage26() {
			 return "lexuslstwo";
		 }
		 
		 
		 
		 @GetMapping("/lexussecondrowimageone")
		 public String redirectToCarspekkkscsificationpage27() {
			 return "lexusrx";
		 }
		 
		 
		 @GetMapping("/lexussecondrowimagetwo")
		 public String redirecknjkbtToCarddddspecificationpage28() {
			 return "lexusnx";
		 }
		 
		 
		 @GetMapping("/lexussecondrowimagethree")
		 public String redirecakjbtToCasssrspecificationpage29() {
			 return "lexuslctwo";
		 }
		 
		 
		 @GetMapping("/lexussecondrowimagefour")
		 public String redirectToCnkknkarspecssaificationpage30() {
			 return "lexuslcthree";
		 }
		 
		
}
			
			
			
		
		
