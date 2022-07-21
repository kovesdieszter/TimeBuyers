import '../static/CSS/Navbar.css';
import React from "react";
import {Link} from "react-router-dom";

function Navbar(){
    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <Link to={"/"}  className="navbar-brand">TimeBuyers</Link>
            <button className="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
                <ul className="navbar-nav mr-auto">
                    <li className="nav-item">
                        <Link to={"about-us"} className="nav-link">About us</Link>
                        {/*<a className="nav-link" href="src/frontend/timebuyers_app/src/components/Navbar#">About us</a>*/}
                    </li>
                    <li className="nav-item dropdown">
                        <a className="nav-link dropdown-toggle" href="src/frontend/timebuyers_app/src/components/Navbar#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Taskers and Taskees
                        </a>
                        <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a className="dropdown-item" href="src/frontend/timebuyers_app/src/components/Navbar#">TimeBuyers</a>

                            <a className="dropdown-item" href="src/frontend/timebuyers_app/src/components/Navbar#">TimeSellers</a>

                            <Link to="/users/all" className="nav-link">All</Link>
                        </div>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link" href="src/frontend/timebuyers_app/src/components/Navbar#">Contact us</a>
                    </li>
                </ul>
                <ul className="navbar-nav mr-right">
                    <li className="nav-item">
                        <a className="nav-link" href="src/frontend/timebuyers_app/src/components/Navbar#">Login</a>
                    </li>
                    <li className="nav-item">
                        <Link to={"/users/new-user"} className="nav-link">Registration</Link>
                        {/*<a className="nav-link" href="src/frontend/timebuyers_app/src/components/Navbar#">Registration</a>*/}
                    </li>
                </ul>
            </div>
        </nav>
    )
}

export default Navbar;