import {Form} from "react-bootstrap";

const InputComponent = (props) =>{
    return(
        <>
            <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>{props.label}</Form.Label>
                <Form.Control type={props.type} placeholder={props.placeHolder}
                onChange={props.onChange} value={props.value}/>
            </Form.Group>
        </>
    );
}

export default InputComponent;