package com.LifeStyle.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.LifeStyle.Entitymodels.User_Login;
import com.LifeStyle.Entitymodels.UserExercise;
import com.LifeStyle.Services.User_LoginServices;
import com.LifeStyle.Entitymodels.ExerciseList;
import com.LifeStyle.Entitymodels.FoodList;
import com.LifeStyle.Entitymodels.MealType;
import com.LifeStyle.Entitymodels.UserFoodIntake;
import com.LifeStyle.Entitymodels.UserPersonal;
import com.LifeStyle.Entitymodels.UserProfile;
import com.LifeStyle.Services.ExerciseListServices;
import com.LifeStyle.Services.FoodListServices;
import com.LifeStyle.Services.UserExerciseServices;
import com.LifeStyle.Services.UserFoodIntakeServices;
import com.LifeStyle.Services.UserPersonalServices;
import com.LifeStyle.Services.UserProfileServices;
//import com.LifeStyle.Services.;

@Controller
@SessionAttributes(value = { "sUserId", "sUserEmail" })
public class MainController {

	static Date dateobj = new Date();

	public static String GenerateCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		String stringDate = dateFormat.format(dateobj);

		return stringDate;
	}

	User_Login globalUser = new User_Login();

	@ModelAttribute("sUserId")
	public int setUpUserId() {
		return 0;
	}

	@ModelAttribute("sUserEmail")
	public String setUpUserEmail() {
		return null;
	}

	@RequestMapping(value = { "/", "/index" })
	public ModelAndView showIndex() {
		return new ModelAndView("index1");
	}

	@RequestMapping(value = { "/Signup", "/Register" })
	public ModelAndView registerEmployee() {
		return new ModelAndView("UserRegistration1");
	}

	@RequestMapping("/profileDetails")
	public ModelAndView getprofileDetails() {
		return new ModelAndView("ProfileRegistration1");
	}

	@RequestMapping("/addUser")
	public ModelAndView insertUser(@ModelAttribute User_Login user) {
		ModelAndView mav = new ModelAndView();

		globalUser = user;

		User_LoginServices user_loginServices = new User_LoginServices();
		boolean result = user_loginServices.addUser(user);

		String message = result ? "user saved" : "try again, not saved";

		if (message == "user saved") {
			mav.addObject("sUserEmail", user.getEmail());
			mav.setViewName("ProfileRegistration1");
		} else {
			mav.addObject("messageResult", message);
			mav.setViewName("profile");
		}
		return mav;

	}

	@RequestMapping(value = { "/loginUser", "/login", "/Sign in" })
	public ModelAndView getLogin() {
		return new ModelAndView("login1");
	}

	@RequestMapping("/validateUser")
	public ModelAndView login(@ModelAttribute User_Login user) {
		ModelAndView mav = new ModelAndView();

//		UserProfileServices upServices = new UserProfileServices();
//		int uprofileId = upServices.getProfileId(email);

		User_LoginServices user_loginServices = new User_LoginServices();
		User_Login userlist = new User_Login();
		userlist = user_loginServices.validateUser(user);
		String message = null;
		System.out.println(userlist);
		System.out.println(user);

		if (userlist == null) {

			message = "not registered";

			mav.addObject("messageResult", message);
			mav.setViewName("message");

			return mav;
		} else if (!(userlist.getPassword()).contentEquals(user.getPassword())) {
			message = "passwords doesnt match try again";
			mav.addObject("messageResult", message);
			mav.setViewName("message");
			return mav;
		}

//		else ((userlist.equals(user)) || ((userlist.getEmail()).equalsIgnoreCase(user.getEmail()))){
//			message = "user logged in";
//			mav.setViewName("home");
////			sUserId", "sUserEmail
//			UserProfileServices upServices = new UserProfileServices();
//			int uprofileId = upServices.getProfileId(user.getEmail());
//			mav.addObject("sUserEmail", user.getEmail());
//			mav.addObject("sUserId", uprofileId);
//
//			return mav;
		else {
			message = "user logged in";
			mav.setViewName("home");
//			sUserId", "sUserEmail
			UserProfileServices upServices = new UserProfileServices();
			int uprofileId = upServices.getProfileId(user.getEmail());
			mav.addObject("sUserEmail", user.getEmail());
			mav.addObject("sUserId", uprofileId);
		}
		return mav;

	}

	@RequestMapping("/registerUserProfile")
	public ModelAndView registerProfile(@ModelAttribute UserProfile uprofile,
//			@RequestParam("id") double id ,
			@RequestParam("height") double stheight, @RequestParam("weight") double Weight,
			@RequestParam("desiredweight") double dWeight, @RequestParam("age") int stage,
			@RequestParam("gender") String stgender) {

		ModelAndView mav = new ModelAndView();

		UserProfileServices uprofileservices = new UserProfileServices();
		boolean result = uprofileservices.Registration(uprofile, globalUser);
		System.out.println(result);

		String message = result ? "profile registered" : "try again, not saved";

		if (message == "profile registered") {
			mav.addObject("sUserId", uprofile.getId());
			mav.setViewName("persinfo1");

		} else {
			mav.addObject("messageResult", message);
			mav.setViewName("profile");
		}
		return mav;
	}

	@RequestMapping("/registerUserPersonal")
	public ModelAndView registerProfile(@ModelAttribute UserPersonal upersonal) {

		ModelAndView mav = new ModelAndView();

		UserPersonalServices upersonalservices = new UserPersonalServices();
		boolean result = upersonalservices.addPersonalinfo(upersonal, globalUser);
		System.out.println(result);

		String message = result ? "profile registered" : "try again, not saved";

		if (message == "profile registered") {
			mav.setViewName("home");
			return mav;
		} else {
			mav.addObject("messageResult", message);
			mav.setViewName("profile");
			return mav;
		}

	}

	@RequestMapping(value = { "/FoodDiary" })
	public ModelAndView showfood() {
		return new ModelAndView("tofood1");
	}

	// handler for adding user food intake
	@RequestMapping(value = "/searchfood", method = RequestMethod.POST)
	public ModelAndView showFoodList(@RequestParam("menu") String menu) {
		System.out.println("The menuname is " + menu);
		ModelAndView mav = new ModelAndView();
		FoodListServices foodst = new FoodListServices();
		List<FoodList> foodlist = foodst.getByFoodName(menu);

		for (FoodList f : foodlist) {
			System.out.println(f.toString());
		}
		mav.addObject("FoodList", foodlist);
		mav.setViewName("tofood1");

		return mav;
	}

// handler for adding user food intake	
	@RequestMapping(value = "/adduserfoodConsumption", method = RequestMethod.POST)
	public ModelAndView addUserfoodintake(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email, @RequestParam("foodId") int foodId,
			@RequestParam("servings") int servings, @RequestParam("type") MealType type) {

		User_Login user = new User_Login();
		user.setEmail(email);

		UserProfile profile = new UserProfile();
		UserProfileServices ups = new UserProfileServices();
		profile = ups.findProfile(uprofileId);

		FoodList food = new FoodList();
//				exercise.setId(exerciseId);

		FoodListServices fls = new FoodListServices();
		food = fls.findFoodItems(foodId);

		UserFoodIntake ufoodtake = new UserFoodIntake();
		ufoodtake.setProfile(profile);
		ufoodtake.setFood(food);
		ufoodtake.setServings(servings);
		ufoodtake.setdate(GenerateCurrentDate());
		ufoodtake.setType(type);

		ModelAndView mav = new ModelAndView();

		UserFoodIntakeServices usfoodservices = new UserFoodIntakeServices();

		boolean result = usfoodservices.addFoodIntake(ufoodtake);
		System.out.println(result);

		String message = result ? "user food intake added" : "try again, not saved";

		if (message == "user food intake added") {
			mav.addObject("messageResult", message);
			mav.setViewName("profile");
		} else {
			mav.addObject("messageResult", message);
			mav.setViewName("profile");
		}
		return mav;
	}

//handler for exercise page
	@RequestMapping(value = { "/Exercise" })
	public ModelAndView showExercise() {
		return new ModelAndView("toexercise1");
	}

//	handler for searching exercise
	@RequestMapping(value = "/searchExercise", method = RequestMethod.POST)
	public ModelAndView showExerciseList(@RequestParam("exercise") String exercise) {
		System.out.println("The username is " + exercise);
		ModelAndView mav = new ModelAndView();
		ExerciseListServices exServ = new ExerciseListServices();
		List<ExerciseList> exerciselist = exServ.getByExerciseName(exercise);

		for (ExerciseList e : exerciselist) {
			System.out.println(e.toString());
		}
		mav.addObject("exerciseList", exerciselist);
		mav.setViewName("toexercise1");

		return mav;
	}

//	handler for entering user exercise
	@RequestMapping(value = "/adduserExercise", method = RequestMethod.POST)
	public ModelAndView addUserExercise(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email, @RequestParam("exerciseId") int exerciseId,
			@RequestParam("duration") int duration) {

//		
//		String sUserEmail = "hin.com";   // replace this two lines by using @SessionAttribute
//		int sUserId = 2;

		User_Login user = new User_Login();
		user.setEmail(email);

		UserProfile profile = new UserProfile();
		UserProfileServices ups = new UserProfileServices();
		profile = ups.findProfile(uprofileId);

//		profile.setUser(user);
//		profile.setId(uprofileId);

		ExerciseList exercise = new ExerciseList();
//		exercise.setId(exerciseId);

		ExerciseListServices els = new ExerciseListServices();
		exercise = els.findExercise(exerciseId);

//		List<ExerciseList> exercise = new ArrayList<ExerciseList>();
//		exercise.add(e);

		UserExercise uexercise = new UserExercise();
		uexercise.setProfile(profile);
		uexercise.setExercise(exercise);
		uexercise.setDuration(duration);
		uexercise.setDate(GenerateCurrentDate());

		ModelAndView mav = new ModelAndView();

		UserExerciseServices usexservices = new UserExerciseServices();

		boolean result = usexservices.addUserExercise(uexercise);
		System.out.println(result);

		String message = result ? "user exercise added" : "try again, not saved";

		if (message == "user exercise added") {
			mav.addObject("messageResult", message);
			mav.setViewName("profile");
		} else {
			mav.addObject("messageResult", message);
			mav.setViewName("profile");
		}
		return mav;
	}

// handler for finding totalcals by consumer in  day
	@RequestMapping(value = "/totalcals", method = RequestMethod.GET)
	public ModelAndView totalCalorieUser(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {

		ModelAndView mav = new ModelAndView();

		UserFoodIntakeServices ufoodintakeservices = new UserFoodIntakeServices();
		double totalcalsconsumed = ufoodintakeservices.getTotalCals(email, GenerateCurrentDate());

		UserExerciseServices uexerciseservices = new UserExerciseServices();
		double metval = uexerciseservices.getMetValue(email, GenerateCurrentDate());

		double usercal = totalcalsconsumed - metval;
		System.out.println(usercal);

		if (usercal == 0) {
			String message = "No Entries for calibrating,Enter the values";

			mav.addObject("result", usercal);
			mav.addObject("tcmessageResult", message);
			mav.setViewName("myboard");
		} else {
			mav.addObject("tcmessageResult", usercal);
			mav.setViewName("myboard");
		}
		return mav;
	}

	// handler for finding total bmr

	@RequestMapping(value = "/bmr", method = RequestMethod.GET)
	public ModelAndView bmr(@SessionAttribute("sUserId") int uprofileId, @SessionAttribute("sUserEmail") String email) {

		ModelAndView mav = new ModelAndView();

		UserProfileServices uprofileservices = new UserProfileServices();
		double bmr = uprofileservices.getBmr(uprofileId);
		System.out.print(bmr);

		mav.addObject("bmrmessageResult", bmr);
		mav.setViewName("myboard");

		return mav;
	}

	// handler for finding tdee
	@RequestMapping(value = "/tdee", method = RequestMethod.GET)
	public ModelAndView tdee(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {

		ModelAndView mav = new ModelAndView();

		UserProfileServices uprofileservices = new UserProfileServices();
		double tdee = uprofileservices.getTdee(uprofileId);
		System.out.print(tdee);

		mav.addObject("tdeemessageResult", tdee);
		mav.setViewName("myboard");

		return mav;
	}

// handler for finding calsburned

	@RequestMapping(value = "/calsburned", method = RequestMethod.GET)
	public ModelAndView caloriesBurned(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email)
//			@RequestParam("weight") double weight)
	{

		ModelAndView mav = new ModelAndView();

		UserExerciseServices uexerciseservices = new UserExerciseServices();
		double metval = uexerciseservices.getMetValue(email, GenerateCurrentDate());
		System.out.println(metval);

		UserProfileServices upservices = new UserProfileServices();
		double uweight = upservices.findWeight(uprofileId);
		System.out.println(uweight);

		double calsburned = (metval * uweight);
		System.out.println(calsburned);

		if (calsburned == 0) {
			String message = "No Entries for caliberating,Enter the values";
			mav.addObject("result", calsburned);
			mav.addObject("bmessageResult", message);
			mav.setViewName("myboard");
		} else {
			mav.addObject("bmessageResult", calsburned);
			mav.setViewName("myboard");
		}
		return mav;
	}

	// handler for finding total cals from food
	@RequestMapping(value = "/totalcalsfood", method = RequestMethod.GET)
	public ModelAndView totalCalorieFood(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email)
//			@RequestParam("weight") double weight)
	{

		ModelAndView mav = new ModelAndView();

		UserFoodIntakeServices ufoodintakeservices = new UserFoodIntakeServices();
		double totalcalsconsumed = ufoodintakeservices.getTotalCals(email, GenerateCurrentDate());
		System.out.println(totalcalsconsumed);

		if (totalcalsconsumed == 0) {
			String message = "No Entries for calibrating,Enter the values";
			mav.addObject("result", totalcalsconsumed);
			mav.addObject("cmessageResult", message);
			mav.setViewName("myboard");
		} else {
			mav.addObject("cmessageResult", totalcalsconsumed);
			mav.setViewName("myboard");
		}
		return mav;
	}

	// handler for finding total carbohydrates
	@RequestMapping(value = "/totalcarbs", method = RequestMethod.GET)
	public ModelAndView totalCarbs(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {

		ModelAndView mav = new ModelAndView();

		UserFoodIntakeServices ufoodintakeservices = new UserFoodIntakeServices();
		double totalcarbs = ufoodintakeservices.getTotalCarbs(email, GenerateCurrentDate());
		System.out.println(totalcarbs);

		if (totalcarbs == 0) {
			String message = "No Entries for caliberating,Enter the values";
			mav.addObject("result", totalcarbs);
			mav.addObject("carbmessageResult", message);
			mav.setViewName("myboard");
		} else {
			mav.addObject("carbmessageResult", totalcarbs);
			mav.setViewName("myboard");
		}
		return mav;
	}

	// handler for finding total protein
	@RequestMapping(value = "/totalprotein", method = RequestMethod.GET)
	public ModelAndView totalprotein(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {

		ModelAndView mav = new ModelAndView();

		UserFoodIntakeServices ufoodintakeservices = new UserFoodIntakeServices();
		double totalprotein = ufoodintakeservices.getTotalProtein(email, GenerateCurrentDate());
		System.out.println(totalprotein);

		if (totalprotein == 0) {
			String message = "No Entries for caliberating,Enter the values";
			mav.addObject("result", totalprotein);
			mav.addObject("pmessageResult", message);
			mav.setViewName("myboard");
		} else {
			mav.addObject("pmessageResult", totalprotein);
			mav.setViewName("myboard");
		}
		return mav;
	}

// handler for finding total fat
	@RequestMapping(value = "/totalfat", method = RequestMethod.GET)
	public ModelAndView totalFat(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {

		ModelAndView mav = new ModelAndView();

		UserFoodIntakeServices ufoodintakeservices = new UserFoodIntakeServices();
		double totalfat = ufoodintakeservices.getTotalFat(email, GenerateCurrentDate());
		System.out.println(totalfat);

		if (totalfat == 0) {
			String message = "No Entries for caliberating,Enter the values";
			mav.addObject("result", totalfat);
			mav.addObject("fmessageResult", message);
			mav.setViewName("myboard");
		} else {
			mav.addObject("fmessageResult", totalfat);
			mav.setViewName("myboard");
		}
		return mav;
	}

//	handler for mapping the homepage

	@RequestMapping("/home")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("/contact")
	public ModelAndView getContact() {
		return new ModelAndView("contact");
	}

//	handler for finding the profile to update the user profile
	@RequestMapping("/Profile")
	public ModelAndView updateUser(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {
		ModelAndView mav = new ModelAndView();
		System.out.println(uprofileId);
		UserProfileServices upserv = new UserProfileServices();
		UserProfile uprofile = upserv.findProfile(uprofileId);

		System.out.println(uprofile.getId());
		mav.addObject("uprofile", uprofile);
		mav.setViewName("viewprofile");

		return mav;
	}

//	updateUserProfile

	@RequestMapping(value = { "/updateUserProfile" }, method = RequestMethod.POST)
	public ModelAndView saveUpdateUser(@ModelAttribute UserProfile uprofile,
			@SessionAttribute("sUserId") int uprofileId, @SessionAttribute("sUserEmail") String email) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("uprofile", uprofile);
		mav.setViewName("updateProfile1");

		return mav;
	}

	@RequestMapping(value = { "/saveUserProfile" }, method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute UserProfile uprofile, @SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {
		ModelAndView mav = new ModelAndView();

		boolean result = false;
		UserProfileServices upserv = new UserProfileServices();
		result = upserv.updateProfile(uprofile);

		String message = result ? "user" + email + uprofile.getId() + " updated"
				: "user" + email + uprofile.getId() + " NOT updated";

		if (result == true) {
			mav.addObject("uprofile", uprofile);
			mav.setViewName("viewprofile");
			mav.addObject("messageResult", message);
		}

		else {
			mav.addObject("uprofile", uprofile);
			mav.setViewName("updateProfile1");
			mav.addObject("messageResult", message);
		}

		return mav;
	}

// handler for myboard page(finding all metrices at once)
	@RequestMapping("/MyBoard")
	public ModelAndView getMyAccount(@SessionAttribute("sUserId") int uprofileId,
			@SessionAttribute("sUserEmail") String email) {

		ModelAndView mav = new ModelAndView();
//	estimated weeks
		UserProfileServices uprofileservices = new UserProfileServices();
		int estimatedweeks = uprofileservices.estimateWeeks(uprofileId);

//	suggested cals
		double suggestedcals = uprofileservices.estimatedDailyCals(uprofileId);

//  total fat consumed in a day
		UserFoodIntakeServices ufoodintakeservices = new UserFoodIntakeServices();
		double totalfat = ufoodintakeservices.getTotalFat(email, GenerateCurrentDate());

//	total user cals consumed in a day
		double totalcalsconsumed = ufoodintakeservices.getTotalCals(email, GenerateCurrentDate());

//	total met	
		UserExerciseServices uexerciseservices = new UserExerciseServices();
		double metval = uexerciseservices.getMetValue(email, GenerateCurrentDate());

//	bmr
		double bmr = uprofileservices.getBmr(uprofileId);

// total protein
		double totalprotein = ufoodintakeservices.getTotalProtein(email, GenerateCurrentDate());

//	total carbs
		double totalcarbs = ufoodintakeservices.getTotalCarbs(email, GenerateCurrentDate());

//	cals burned through exercise

		double metval1 = uexerciseservices.getMetValue(email, GenerateCurrentDate());
		UserProfileServices upservices = new UserProfileServices();
		double uweight = upservices.findWeight(uprofileId);
		System.out.println(uweight);
		double calsburned = (metval1 * uweight);

//	total cals by user in a day

		double usercal = totalcalsconsumed - calsburned;

//	tdee	
		double tdee = uprofileservices.getTdee(uprofileId);

		mav.addObject("estimatedweeks", estimatedweeks);
		mav.addObject("suggestedcals", suggestedcals);
		mav.addObject("bmrResult", bmr);
		mav.addObject("tdeeResult", tdee);
		mav.addObject("usercalResult", usercal);
		mav.addObject("totalfoodcalsResult", totalcalsconsumed);
		mav.addObject("totalcalsburnedResult", calsburned);
		mav.addObject("totalproteinResult", totalprotein);
		mav.addObject("totalcarbsResult", totalcarbs);
		mav.addObject("totalfatResult", totalfat);
		mav.setViewName("myboard");

		return mav;

	}

}
