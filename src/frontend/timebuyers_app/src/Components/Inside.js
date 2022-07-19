import React from "react";
import '../static/CSS/Inside.css';
import lightBluePic from "../static/images/light_blue_pic.png";
import cleaningPic from "../static/images/cleaning.jpg";
import laundryPic from "../static/images/laundry.jpg";
import womanPic from "../static/images/woman.jpg";

function Inside(){
    return (
        <div className="container">
            <div className="left">
                {/*<img src={lightBluePic} alt="light blue wallpaper" />*/}
            </div>
            <div className="right">
                <img src={cleaningPic} alt="cleaning" />
            </div>
            <div className="left">
                <img src={laundryPic} alt="laundry" />
            </div>
            <div className="right">
                <img src={womanPic} alt="woman" />
            </div>

        </div>
    )
}
export default Inside;