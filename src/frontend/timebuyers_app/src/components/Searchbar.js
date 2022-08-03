import React from 'react';
import '../static/CSS/Navbar.css';
import '../static/CSS/Searchbar.css';
import {Link} from "react-router-dom";

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
                    <Link to="/tasks/IKEA_ASSEMBLY" className="dropdown-item">Ikea assembly</Link>
                    <Link to="/tasks/MOVE_BOXES" className="dropdown-item">Move boxes</Link>
                    <Link to="/tasks/SHOPPING" className="dropdown-item">Shopping</Link>
                    <Link to="/tasks/DOG_WALKING" className="dropdown-item">Dog walking</Link>


                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Gardening</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">House cleaning</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Wait in line</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Cooking</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Return items</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Baby sitting</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Get kids from school</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Dog walking</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Cat sitting</a>*/}
                    {/*<a className="dropdown-item-searchbar dropdown-item"*/}
                    {/*   href="/">Dog sitting</a>*/}

                </div>
            </div>
        </nav>
    )
}

export default Searchbar;
