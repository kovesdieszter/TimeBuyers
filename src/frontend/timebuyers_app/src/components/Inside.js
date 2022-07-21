import React from "react";
import '../static/CSS/Inside.css';
import assembly from "../static/images/fa-hero-img-desktop.jpg";
import cleaningPic from "../static/images/cleaning.jpg";
import laundryPic from "../static/images/laundry.jpg";
import womanPic from "../static/images/woman.jpg";

function Inside(){
    return (
        <div className="flex-container-inside">
            {/*<div className="left">*/}
            {/*    <img src={assembly} alt="assembler" />*/}
            {/*</div>*/}
            <div className="card-inside">
            <div className="left">
                <h1>About TimeBuyers</h1>
                <p>hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
                hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
                hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
                hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh</p>
            </div>
            <div className="right">
                <img src={cleaningPic} alt="cleaning" />
            </div>
            </div>
            {/*<div className="left">*/}
            {/*    <h1>About TimeSellers</h1>*/}
            {/*    <img src={laundryPic} alt="laundry" />*/}
            {/*</div>*/}
            {/*<div className="right">*/}
            {/*    <h1>How to get started?</h1>*/}
            {/*    <img src={womanPic} alt="woman" />*/}
            {/*</div>*/}

        </div>
    )
}
export default Inside;