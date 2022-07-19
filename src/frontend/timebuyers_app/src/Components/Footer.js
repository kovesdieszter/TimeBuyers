import React from "react";
import '../static/CSS/Footer.css';
import Inside from "./Inside";

function Footer() {
    return (
        <footer>
            <div className="flex-container-footer">
                <div className="footer-col-1">
                    <ul className="list-text">
                        <li>TimeBuyers</li>
                        <li>2022</li>
                        <li>CodeCool</li>
                    </ul>
                </div>
                <div className="footer-col-2">
                    <ul className="list-us">
                        <li>Eszter Kövesdi</li>
                        <li>Hanna Szepesi</li>
                        <li>Bernadett Takács</li>
                    </ul>
                </div>
                <div className="footer-col-3">
                    <h5 className="text-md-right">Contact Us</h5>
                </div>
            </div>
        </footer>
)
}

export default Footer;