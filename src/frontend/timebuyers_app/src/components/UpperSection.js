import React from "react";
import '../static/CSS/UpperSection.css';
function UpperSection() {

    return(<section id="hero" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Welcome to <span>TimeBuyers</span></h1>
            <h2>Welcome to our webpage, where you can either buy or sell some time!</h2></div>
    </section>)



}

export default UpperSection;