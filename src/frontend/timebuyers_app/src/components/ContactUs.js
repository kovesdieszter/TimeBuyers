import React, { useState } from "react";
import '../static/CSS/ContactUs.css';

const ENDPOINT = ""; // TODO - ide jöjjön majd a route!

function ContactUs() {


    return (
        <div className="container">
            <form action="">
                <label htmlFor="fname">First Name</label>
                <input type="text" id="fname" name="firstname" placeholder="Your name.." />

                <label htmlFor="lname">Last Name</label>
                <input type="text" id="lname" name="lastname" placeholder="Your last name.." />

                <label htmlFor="subject">Subject</label>
                <textarea id="subject" name="subject" placeholder="White a message...">  </textarea>

                <input type="submit" value="Submit"/>
            </form>
        </div>
        )
}

export default ContactUs;
