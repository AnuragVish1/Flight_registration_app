"use client"
import userService from '@/services/userService'
import Link from 'next/link'
import {useState, useEffect} from 'react'
import React from 'react'
import { Router, useRouter } from 'next/navigation';
import { Alert, AlertDescription, AlertTitle } from "@/components/ui/alert"
import { AlertDestructive } from "../Alertbox"





function registration() {
  const [user, setUser] = useState({
    user_name: "",
    password: "",
    email: "",
    phone_number: "",
    date_of_birth: ""
  })

  const router = useRouter();


  const [registration_failed, setRegistration_failed] = useState(false);

  const handleChange = (e) => {
    const value = e.target.value;
    setUser({...user, [e.target.name]: value})
  }

  function isValid(userData){
    if (userData.user_name == "")
      {
        alert("Please enter your name");
      } 
      else if (userData.password == "")
      {
        alert("Please enter your password");
      }
      else if (userData.email === "")
      {
        alert("Please enter your email");
      }
      else if (userData.phone_number == "")
      {
        alert("Please enter your phone number");
      }
      else if (userData.date_of_birth == isNaN)
      {
        alert("Please enter a valid phone number");
      }
      else if ((userData.phone_number).length != 10)
      {
        alert("Please enter 10 digit phone number");
      }
      else if (userData.date_of_birth ==""){
        alert("Please enter your date of birth");
      }
      else{
        return true;
      }
  }
  const handleSubmit = (e) => {
    e.preventDefault();
      if(isValid(user)){
        userService.newUser(user).then((response) => {
          console.log(response);
          router.push('/users/home_page');
        }).catch((error) => {
          console.log(error);
        })
      }
    }
   


  

  //check if user_name matches in the json respons

  return (
    
    <div className="Registration_Main_container">
    <div className="Registration_Border_container">
      <div className="Registration_Container">
        <div className="form_Container">
        <div className="form_registration_page">
          <div className="form_registration">
          <div className="titles">
            <h2>Welcome to BooknFly</h2>  
            </div>
          <div className="details">
            <label className="user_name">User Name</label>
            <input type="text" placeholder="Enter your user name" name= "user_name" value={user.user_name} onChange={(e) => handleChange(e)}/>
            <label className="password" >Password</label>
            <input type="password" placeholder="Enter your password" name="password" value={user.password} onChange={(e) => handleChange(e)}/>
            <label className="email" >Email</label>
            <input type="email" placeholder="Enter your email" name="email" value={user.email} onChange={(e) => handleChange(e)} />
            <label className="phone" >Phone</label>
            <input type="phone" placeholder="Enter your phone" name="phone_number" value={user.phone_number} onChange={(e) => handleChange(e)} />
            <label className="Date of birth" >Date of Birth</label>
            <input type="date" placeholder="Enter your phone" name="date_of_birth" value={user.date_of_birth} onChange={(e) => handleChange(e)}/>
            <button onClick={handleSubmit} className="login_btn">Sign Up</button>
            <p>Already have an accouunt? <Link href="/users">Login In</Link></p>
          </div>
        </div>
        
      </div>
    
          <div className="image_holder"></div>
          </div>
        </div>
      </div>
    </div>
    
  
  )
}

export default registration