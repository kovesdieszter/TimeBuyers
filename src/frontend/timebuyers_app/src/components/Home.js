import React from "react";
import '../static/CSS/Home.css';
import Inside from "./Inside";
import Footer from "./Footer";
import Searchbar from "./Searchbar";
import Navbar from "./Navbar";

function Home() {
    return (
        <body>
        <div className="flex-container-home">
            <div className="navbar"> <Navbar /> </div>
            <div className="searchbar"> <Searchbar/> </div>
            <div className="inside"> <Inside /> </div>
            <div className="footer"> <Footer /></div>
        </div>
        </body>
    )
}

export default Home;

