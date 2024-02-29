import {Form} from "react-bootstrap";

const InputComponent = ([label, placeHolder, type]) =>{
    return(
        <>
            <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>{label}</Form.Label>
                <Form.Control type={type} placeholder={placeHolder} />
            </Form.Group>
        </>
    );
}

export default InputComponent;