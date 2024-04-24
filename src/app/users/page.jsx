
import Link from 'next/link'
import React from 'react'
import styles from '../page.module.css'

function login() {
  return (
    
    <div className="Main_container">
    <div className="Border_container">
      <div className="Container">
        <div className="form_Container">
        <div className="form_page">
          <div className="form_login">
          <div className="title">
            <h2>BooknFly</h2>  
            </div>
          <div className="detail">
            
            <label className="email">Email</label>
            <input type="email" placeholder="Enter your email" />
            <label className="password">Password</label>
            <input type="password" placeholder="Enter your password" />
            <button className="login_btn">Login</button>
            <p>Don't have an account? <Link href="/registration">Sign Up</Link></p>
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

export default login