import React, {useEffect, useState} from "react";
import '../static/CSS/UpperSection.css';
function UpperSection() {

    const first = <section id="hero" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Welcome to <span>TimeBuyers</span></h1>
            <h2>Welcome to our webpage, where you can either buy or sell some time!</h2></div>
    </section>

    const second = <section id="hero" className="d-flex flex-column justify-content-center align-items-center">
        <div className="upper-section-text-container" data-aos="fade-up"><h1>Welcome to <span>Second</span></h1>
            <h2>Welcome to our webpage, where you can either buy or sell some time!</h2></div>
    </section>

    const covers = [first, second]

    const [cover, setCover] = useState(0)

    useEffect(() => {
        const intervalID = setTimeout(() =>  {
            setCover((cover) => switchCover(cover))
        }, 3000);

        return () => clearInterval(intervalID);
    }, [cover]);

    function switchCover(cover) {
        switch (cover) {
            case 0:
                cover = cover + 1;
                break;
            case 1:
                cover = cover - 1;
        }
        return cover;
    }

    return (covers[cover])



}

export default UpperSection;