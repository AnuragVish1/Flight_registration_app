"use client"


import React, { useState } from 'react'
import './flight_cards'
function dashboard() {

  const [departure_location, setDeparture_location] = useState("");
  const [arrival_location, setArrival_location] = useState("");
  const [departure_date, setDeparture_date] = useState("");
  const [flight_available, setFlight_available] = useState(false);
  function isHere(flights, departure_location, departure_date, arrival_location){
    // Assuming 'data' is an array of user objects with 'user_name' and 'password' properties
   
    return flights.findIndex(flight => 
      flight.current_location === departure_location &&
      flight.date === departure_date &&
      flight.destination === arrival_location
    ); // will return true if user is found, false otherwise
  }
  

  const handle_submit = async () =>{

    console.log(departure_date);
    console.log(departure_location);
    console.log(arrival_location);

    try {
      const response = await fetch('http://localhost:8080/planes/all_flights ', {
        method: 'GET',
        headers: {
          'Content-Type': 'application/json',
        }
      });
      const flight_details = await response.json();
      console.log(flight_details);
      
      const index_of_flight = isHere(flight_details,departure_location,departure_date,arrival_location);
      console.log(index_of_flight);
      if (index_of_flight != -1)
      {
        setFlight_available(true);
        console.log(flight_available);
      }
      else{
        
      }

    }
      catch (error) {
        console.error('Error:', error);
      }

     
    }

    

  
  return (
    <div>
    <div className="main_dashboard_container">
      <div className="box">
        <div className="icon-seperator">
        <img src="/flight_takeoff_FILL0_wght300_GRAD200_opsz24.svg" alt="" />
        <div className="fields">
          
      <label>From</label><br/>
      <input type="text" placeholder="From" name= "current_location" value={departure_location} onChange={(e) => setDeparture_location(e.target.value)}/>
      </div>
      </div>
      <div className="icon-seperator">
      <img src="/flight_land_FILL0_wght300_GRAD200_opsz24.svg" alt="" />
      <div className="fields">
      <label>To</label><br/>
      <input type="text" placeholder="To" name= "Destination" value={arrival_location} onChange={(e) => setArrival_location(e.target.value)} />
      </div>
      </div>
      <div className="icon-seperator">
      <img src="/calendar_month_FILL0_wght300_GRAD0_opsz24.svg" className="calender" alt="" />
      <div className="fields"><label>Date</label><br/>
      <input type="date" placeholder="Departure Date" name= "date" value={departure_date} onChange={(e) => setDeparture_date(e.target.value)} />
      </div>
      </div>
      <div className="icon-seperator">
      <img src="/calendar_month_FILL0_wght300_GRAD0_opsz24.svg" alt=""/>
      <div className="fields">
      <label>Return Date</label><br/>
      <input type="date" placeholder="Return" name= "return_date" />

      </div>
      <button onClick={handle_submit}>Proceed</button>      
      </div>
      </div>
    </div>
    
    <button className="proceed_btn">Proceed</button>

    {flight_available && (<flight_cards/>)}
    </div>
  )
}

export default dashboard