import React from "react";
import '../static/CSS/Footer.css';
import Inside from "./Inside";

function Footer() {
    return (
        <footer>
            <div className="flex-container-footer">
                <div className="footer-col-1">
                    <h5>TimeBuyers</h5>
                    <h5>2022</h5>
                    <h5>CodeCool</h5>
                </div>
                <div className="footer-col-2">
                    <ul className="list-us">
                        <h5>Eszter Kövesdi</h5>
                        <h5>Hanna Szepesi</h5>
                        <h5>Bernadett Takács</h5>
                    </ul>
                </div>
                <div className="footer-col-3">
                    <h5 className="text-md-right">Contact Us</h5>
                    <h5> cctimebuyers@gmail.com </h5>
                </div>
            </div>
        </footer>
)
}

export default Footer;