import React, {useEffect, useRef, useState} from "react";
import '../static/CSS/UpperSection.css';
import { useTransition, animated, config } from 'react-spring'

function UpperSection() {

    const first = <section id="hero" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Welcome to <span>TimeBuyers</span></h1>
            <h2>Welcome to our webpage, where you can either buy or sell some time!</h2></div>
    </section>

    const second = <section id="hero" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Welcome to <span>Second</span></h1>
            <h2>Welcome to our webpage, where you can either buy or sell some time!</h2></div>
    </section>


    const third =  <section id="hero" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Welcome to <span>Third</span></h1>
            <h2>Welcome to our webpage, where you can either buy or sell some time!</h2></div>
    </section>

    const colors = [first, second, third]

    const delay = 2500;

    const [index, setIndex] = React.useState(0);
    const timeoutRef = React.useRef(null);

    function resetTimeout() {
        if (timeoutRef.current) {
            clearTimeout(timeoutRef.current);
        }
    }

    React.useEffect(() => {
        resetTimeout();
        timeoutRef.current = setTimeout(
            () =>
                setIndex((prevIndex) =>
                    prevIndex === colors.length - 1 ? 0 : prevIndex + 1
                ),
            delay
        );

        return () => {
            resetTimeout();
        };
    }, [index]);

    return (
        <div className="slideshow-container">
        <div className="slideshow">
            <div
                className="slideshowSlider"
                style={{ transform: `translate3d(${-index * 100}%, 0, 0)` }}
            >
                {colors.map((backgroundColor, index) => (
                    <section
                        className="slide"
                        key={index}
                    >{backgroundColor}</section>
                ))}
            </div>

            <div className="slideshowDots">
                {colors.map((_, idx) => (
                    <div
                        key={idx}
                        className={`slideshowDot${index === idx ? " active" : ""}`}
                        onClick={() => {
                            setIndex(idx);
                        }}
                    ></div>
                ))}
            </div>
        </div>
        </div>
    );



}

export default UpperSection;