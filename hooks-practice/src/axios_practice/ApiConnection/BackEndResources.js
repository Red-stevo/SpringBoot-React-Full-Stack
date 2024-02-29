import axios from "axios";

const openApi = axios.create({
    baseURL : "http://192.168.0.141:8080"
})

/*This function will allow us to register a new user to the database.*/
export async  function register(userName, password , email){
    const formData = new FormData();

   /* formData.append("username",userName);
    formData.append("password",password);
    formData.append("email",email);*/


    const response = await openApi.post("/api/v0/register",formData);
    console.log(response.data, response.headers)
    return response.status === 201;
}

/*connection with login api to the password manager backend*/
let response;
response.data.jwtToken = "";

export async function login(userName, password) {
    //const  loginData = new FormData();

    /*loginData.append("username", username);
    loginData.append("password", password);*/

    const loginModel = {
        username: userName,
        password: password
    }
    try {
        const response = await openApi.post("/api/v0/login", loginModel)
        console.log(response.data.jwtToken)
    } catch (error) {
        console.error(error)
    }
}