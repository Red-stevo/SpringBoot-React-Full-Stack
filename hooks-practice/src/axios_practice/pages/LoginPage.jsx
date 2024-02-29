import InputComponent from "../Components/InputComponent";
import {useState} from "react";
import {Button} from "react-bootstrap";
import {login} from "../ApiConnection/BackEndResources";

const LoginPage = () =>{
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    const handleSubmit = (e) => {
        console.log("submitted.")
        try {
            const loginStatus = login(userName, password);

            loginStatus ? console.log("Login a success") : console.log("invalid password or username");

            setUserName("")
            setPassword("")
        }catch (error){
            console.log("no response")
        }
    }



    return(
        <>
            <InputComponent label = "Enter Your UserName : "
                            placeHolder={"eg Stephen Muiru"}
                            type={"text"} value={userName}
                            onChange={(e) => setUserName(e.target.value)}/>
            <InputComponent label = "Enter Your Password : "
                            placeHolder={"eg #2Tde@etrU!"}
                            type={"password"} value={password}
                            onChange={(e) => setPassword(e.target.value)}/>

            <Button onClick={handleSubmit}>Login</Button>
        </>
    )
}
export default LoginPage;