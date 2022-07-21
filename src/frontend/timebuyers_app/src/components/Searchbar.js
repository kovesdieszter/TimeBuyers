import React from 'react';
import '../static/CSS/Navbar.css';
import '../static/CSS/Searchbar.css';

const Searchbar = () => {
    return (
        <nav className="searchbarContainer">
            <div className="nav-item dropdown">
                <a className="nav-link dropdown-toggle taskTitle"
                   href="src/frontend/timebuyers_app/src/components/Navbar#" id="navbarDropdown" role="button"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Tasks
                </a>
                <div className="dropdown-menu search-menu" aria-labelledby="navbarDropdown">
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Ikea assembly</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Move boxes</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Move boxes + car</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Shopping</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Gardening</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">House cleaning</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Wait in line</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Cooking</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Return items</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Baby sitting</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Get kids from school</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Dog walking</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Cat sitting</a>
                    <a className="dropdown-item-searchbar dropdown-item"
                       href="/">Dog sitting</a>

                </div>
            </div>
        </nav>
    )
}

export default Searchbar;
