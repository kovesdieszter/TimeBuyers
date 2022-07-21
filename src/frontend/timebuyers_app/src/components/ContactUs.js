import React, { useState } from "react";
import '../static/CSS/ContactUs.css';

const ENDPOINT = ""; // TODO - ide jöjjön majd a route!

function ContactUs() {

    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [message, setMessage] = useState('');

    const [submitted, setSubmitted] = useState(false);
    const [error, setError] = useState(false);

    const handleName = (e) => {
        setName(e.target.value);
    };

    const handleEmail = (e) => {
        setEmail(e.target.value);
    };

    const handleMessage = (e) => {
        setMessage(e.target.value);
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        if (name === '' || email === '') {
            setError(true);
        } else {
            setSubmitted(true);
            setError(false);
        }
    };

    const successMessage = () => {
        return (
            <div
                className="success"   style={{display: submitted ? '' : 'none'}}>
                <h1>{name}, your message has been successfully sent!!</h1>
            </div>
        );
    };

    const errorMessage = () => {
        return (
            <div className="error"  style={{display: error ? '' : 'none'}}>
                <h1>Please enter all the fields</h1>
            </div>
        );
    };


    return (
        <div className="container">
            <form action="api/send-email/takacsberni@gmail.com">
                <label htmlFor="name">Name</label>
                <input type="text" id="name" name="name" placeholder="Your name.." onChange={handleName} value={name} type="text"/>

                <label htmlFor="email">Email</label>
                <input type="text" id="email" name="email" placeholder="Your email address.." onChange={handleEmail} value={email} type="text" />

                <label htmlFor="message">Message</label>
                <textarea id="message" name="message" placeholder="White a message..." onChange={handleMessage} value={message} type="text">  </textarea>

                <input type="submit" value="Submit"/>
            </form>
        </div>
        )
}

export default ContactUs;
