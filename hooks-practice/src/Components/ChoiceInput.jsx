import {useState} from "react";

const ChoiceInput = () =>{

    const [value , setValue] = useState("off");

    return(
        <>
            <label></label>
            <input type={"checkbox"} onInput={ () =>{
                if(value === "off")
                    setValue("on")
                else
                    setValue("off")

                console.log(value);
            }}/>
        </>)
}

export default ChoiceInput;