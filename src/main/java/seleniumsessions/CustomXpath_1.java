package seleniumsessions;

import org.openqa.selenium.By;

public class CustomXpath_1 {

	public static void main(String[] args) {

		// xpath : address of the element in HTML DOM

		// Hubspot.com is url using
		// 1. abs xpath //html/body/div/div/div/ul/li/a // shifting element change Dom
		// change not use
		// 2. relative xpath //input[@id = 'test'] good to use
		// 3. custom/relative xpath

		// Formulae :
		// htmltag[@prop = 'value'] // eg using 1 property
		// input[@id='username']
		// *[@id= 'username']

		// htmltag[@prop1='value' and @prop2 = 'value'] //eg using 2 properties by using
		// and operator
		// input[@id='username' and @type='email']

		// button[@id='loginBtn' and @type='submit'] // for button
		// button[@id='loginBtn' and @type] // for button this also is valid

		// button[@id and @type] //this is also valid , but displays 2 elements
		// button[@id='ssoBtn' and @type] // valid for 2 element

		// For hubspot.com.login
		// i18n-string[text()='Sign up'] // for link text...specific for text

		// for hubspot
		// i18n-string[text()='Remember me'] //remember me
		// *[text()='Remember me'] // any element avilable inside dom with have same
		// text
		// div/input // 2 elements   direct child
		// div//input // 3 elements  direct + indirect child both
		
		
		// CONTAINS FUNCTION
		
		//input[contains(@id,'user')]                 // inside 2 params so , is used  // used for partialpart
		
        //		<input id ='test_123'>
		//      <input id ='test_132'>             // To handle this below is solution
		//      <input id ='test_321'>
		
		
		//input[contains(@id,'test_')]                // especial case for dynamic ids
		
		//input[contains(@id,'username') and @type='email' ]             // using 2 properties contains and without contains
		//input[contains(@id,'username') and contains(@type, 'email') ]  // using both properties contains
		
		//i18n-string[contains(@data-key,'login.signupLink.cta') and text()='Sign up' ]    // using contains() and text()
		
		
		
//===============================================================================================================================		

		// For CRMpro Url
		// input // 3 elements
		// input[@name='username'] // for usename
		// (//input[@class='form-control'])[2] // wrap it and selsect by indexwise...for
		// pwd
		// (//input[@class='form-control'])[position()=2] // postion()
		// (//input[@class='form-control'])[last()] // last()

		// for crmpro

		// a[text()='Sign Up'] // for sign up
		// OR
		// a[@href='https://register.freecrm.com/register/'] //not prefer since href can
		// change on dev, staging and prod environment
		// For Crmpro
		// For Knowledge , for Interview point of view
		// ul[@class='nav navbar-nav navbar-right']/li/a // here we achieve 6 elements
		// ul[@class='nav navbar-nav navbar-right']/li/a[text()='Pricing'] // for
		// specific element OR
		// li/a[text()='Pricing'] // specific 1 element as above OR
		// a[text()='Pricing'] // same as above and is best approach
		
		
//=====================================================================================================================================		

		// Blazemeter.com horizontal ul

		// ul[@class='list-nav-links']/li/a // here 6 elements
		// ul[@class='list-nav-links']/li/a[text()='BLOG'] //specific elements

		// for vertical links
		// div[@id='main_b_footer_second_block']/ul/li/a // here 9 elements single slash
		// means direct child
		// div[@id='main_b_footer_second_block']//li/a double slash jumps by ignoring ul
		// ..with indirect child
		
		
//===========================================================================================================
		// CUSTOM CSS SELECTOR  // CASCADED STYLE SHEET Url here is hubspot
		//id......> #id or htmltag#id
		//class...>.className or htmltag.className
		// htmltag.c1.c2.c3.....cn    or
		//.c1.c2.c3
		
		// #username or //input#username         using id here
		//.login-email                           using class here
		//input.login-email
		//    input.form-control.private-form__control.login-email
		
	//	input.login-email#username           // can use id and class both at time   or
	//	input.form-control.private-form__control.login-email#username		
		
		// imp interview question
		By email=By.className("login-email");
		By email1=By.xpath("//input[@class='form-control private-form__control login-email']"); // no .used
		By email2=By.cssSelector("input.form-control.private-form__control.login-email");   // .is used
		
//		==================== also css can be write as--------------------------------------
		
	//	input[id='username']                         using 1 property
	//	input[id='username'][type='email']           using 2 property
		
		// For parent and child relations
	//	div.private-form__input-wrapper >input#username   Or
	// 	//	div.private-form__input-wrapper input#username   This is also valid
		
	//	ul.list-nav-links>li  6 elemnets using css parent child ...and url is blazemeter
		
	//	===========================================================Hubspot==============css==
//		input[id*='user']                 // contains()  use * in css eg
//      input[id^='user']		          // startswith  use ^ in css
//      input[id$='name'] 		          //endingwith use   $ in css
//      input#username,input#password		// multiple elements using , operator 2 css used
//     input#username,input#password,#loginBtn       // 3 elements		
//      input.login-email,input#password,#loginBtn		
		
//   ul.list-nav-links li:nth-of-type(n)		  // nth of type incss  // for bazemeter
	
				

	}

}
