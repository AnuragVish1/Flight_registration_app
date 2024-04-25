"use client"
import Link from 'next/link'
import {useState, useEffect} from 'react'
import React from 'react'





function registration() {
  const [user_name, setuser_name] = useState('');
  const [password, setPassword] = useState('');
  const [loginFailed, setLoginFailed] = useState(false);
  const [email, setEmail] = useState('');
  const [Phone, setPhone] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();
    const isValid = (data, user_name, password) => {
      // Assuming 'data' is an array of user objects with 'user_name' and 'password' properties
      const user = data.some(user => user.user_name == user_name && user.password == password);
      console.log(user);
      return user; // will return true if user is found, false otherwise
    }
    try {
      const response = await fetch('http://localhost:8080/planes/get_reservations ', {
        method: 'GET',
        headers: {
          'Content-Type': 'application/json',
        }
      });
      const data = await response.json();
      console.log(data);
      console.log(user_name)
      console.log(password)

      const isUserValid = isValid(data, user_name, password);
      if (isUserValid) {
      // Handle valid user
        console.log('User is valid');

      } else {
      // Handle invalid user
        console.log('User is invalid');
        setLoginFailed(true);

      }
      console.log("asdasd");

      // Handle response data
    } catch (error) {
      console.error('Error:', error);
    }
  };

  

  //check if user_name matches in the json respons

  return (
    
    <div className="Main_container">
    <div className="Border_container">
      <div className="Container">
        <div className="form_Container">
        <div className="form_page">
          <div className="form_login">
          <div className="title">
            <h2>Welcome to BooknFly</h2>  
            </div>
          <div className="detail">
            
            <label className="user_name">User Name</label>
            <input type="user_name" placeholder="Enter your user name" value={user_name} onChange={(e) => setuser_name(e.target.value)}/>
            <label className="password" >Password</label>
            <input type="password" placeholder="Enter your password" value={password} onChange={(e) => setPassword(e.target.value)} />
            <label className="email" >Email</label>
            <input type="email" placeholder="Enter your email" value={email} onChange={(e) => setEmail(e.target.value)} />
            <label className="phone" >Phone</label>
            <input type="phone" placeholder="Enter your phone" value={Phone} onChange={(e) => setPhone(e.target.value)} />
            <button onClick={handleSubmit} className="login_btn">Login</button>
            <p>Don't have an account? <Link href="/users">Sign Up</Link></p>
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