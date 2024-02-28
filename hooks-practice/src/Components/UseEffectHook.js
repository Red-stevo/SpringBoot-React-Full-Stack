import TextInput from "./TextInput";
import ChoiceInput from "./ChoiceInput";

const UseEffectHook = () =>{

    const fieldNames = ["choice-input","text-input", "choice-input", "text-input", "choice-input"]

    const form = fieldNames.map(
        (field, key) => {
            return(
                <div key={key}>
                    {field === "text-input" && <TextInput />}
                    {field === "choice-input" && <ChoiceInput />}
                </div>
            )
        }
    )

    return(<>
            {form}
        </>
    );
}

export default UseEffectHook;