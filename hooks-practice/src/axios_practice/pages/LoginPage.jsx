import InputComponent from "../Components/InputComponent";
import {useState} from "react";
import {Button} from "react-bootstrap";

const LoginPage = () =>{
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    return(
        <>
            <InputComponent label = "Enter Your UserName : "
                            placeHolder={"eg Stephen Muiru"}
                            type={"checkbox"} value={userName}
                            onChange={(e) => setUserName(e.target.value)}/>
            <InputComponent label = "Enter Your Password : "
                            placeHolder={"eg #2Tde@etrU!"}
                            type={"password"} value={password}
                            onChange={(e) => setPassword(e.target.value)}/>

            <Button type={"submit"} onClick={() => {
                console.log(userName, password)}}>Login</Button>
        </>
    )
}
export default LoginPage;