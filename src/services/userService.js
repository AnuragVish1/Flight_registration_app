const USER_PATH = "http://localhost:8080/planes/reservation"

import axios from "axios"
class userService{
    newUser(employee){
        return axios.post(USER_PATH, employee)
    }
}

export default new userService;