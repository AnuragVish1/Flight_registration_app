import React, { useState } from 'react'
function dashboard() {

  const [departure_location, setDeparture_location] = useState("");
  const [arrival_location, setArrival_location] = useState("");
  const [departure_date, setDeparture_date] = useState("");
 


  return (
    
    <div className="main_dashboard_container">
      <div className="box">
        <div className="icon-seperator">
        <img src="/flight_takeoff_FILL0_wght300_GRAD200_opsz24.svg" alt="" />
        <div className="fields">
          
      <label>From</label><br/>
      <input type="text" placeholder="From" name= "current_location" />
      </div>
      </div>
      <div className="icon-seperator">
      <img src="/flight_land_FILL0_wght300_GRAD200_opsz24.svg" alt="" />
      <div className="fields">
      <label>To</label><br/>
      <input type="text" placeholder="To" name= "Destination" />
      </div>
      </div>
      <div className="icon-seperator">

      <img src="/calendar_month_FILL0_wght300_GRAD0_opsz24.svg" className="calender" alt="" />
      <div className="fields"><label>Date</label><br/>
      <input type="date" placeholder="Departure Date" name= "date" />
      </div>
      </div>
      <div className="icon-seperator">
      <img src="/calendar_month_FILL0_wght300_GRAD0_opsz24.svg" alt="" />
      <div className="fields">
      <label>Return Date</label><br/>
      <input type="date" placeholder="Return" name= "return_date" />
      </div>
      </div>
      </div>


    </div>
  )
}

export default dashboard