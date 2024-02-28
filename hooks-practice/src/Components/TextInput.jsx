import {useState} from "react";

const TextInput = () =>{
    const [value, setValue] = useState("");
    return(
        <>
            <input onChange={(e) => {
                setValue(e.target.value);
            }}/>
        </>
    )
}
export default TextInput;