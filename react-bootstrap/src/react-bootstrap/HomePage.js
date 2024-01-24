import React from "react";

const HomePage = () =>
{
    return(<React.Fragment>
        <div className={"container-lg justify-content-start align-content-center"}>
            <div className={"row justify-content-md-start text-center"}>
                <div className={"col-md-6 col-sm-12"}>
                    <h1 className={"fw-bold text-primary-emphasis"}>Employee Management System</h1>
                    <h1 className={"fw-light text-primary-emphasis"}>We Deliver The Best To Our Customers</h1>
                </div>
                <div className={"col-md-5 d-block d-none d-md-block"}>
                    <img className={"img-fluid"} src={"./images/employeeHomePage.jpeg"}
                         alt={"Employees on at work"}/>
                </div>
                </div>
        </div>
    </React.Fragment>);
}
export default HomePage;