import React from "react";
// import '../static/CSS/Home.css';
import Inside from "./Inside";

function Home() {
    return (
        <body>
        <div className="flex-container">
            <div className="navbar">Navbar</div>
            <div className="searchbar">Searchbar</div>
            <div className="inside">Inside <Inside /> </div>
            <div className="footer">Footer</div>
        </div>
        </body>
    )
}

export default Home;

