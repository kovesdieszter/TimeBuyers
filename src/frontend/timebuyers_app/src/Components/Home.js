import React from "react";
import '../static/CSS/Home.css';
import Inside from "./Inside";
import Footer from "./Footer";

function Home() {
    return (
        <body>
        <div className="flex-container-home">
            <div className="navbar">Navbar's place</div>
            <div className="searchbar">Searchbar's place</div>
            <div className="inside">Inside's place <Inside /> </div>
            <div className="footer">Footer's place <Footer /></div>
        </div>
        </body>
    )
}

export default Home;

