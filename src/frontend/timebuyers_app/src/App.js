import logo from './logo.svg';
import './App.css';
import Home from "./Components/Home";
import {BrowserRouter as Router, Route, Link, Routes} from 'react-router-dom';
import Footer from "./Components/Footer";
import lightBluePic from "./static/images/light_blue_pic.png";


//https://stackoverflow.com/questions/70031839/cannot-resolve-symbol-routes!!!!!!!

export default function App() {
    return (
        <Router>
            <div>
                <nav>
                    <ul>
                        <li>
                            <Link to="/">Home</Link>
                        </li>
                    </ul>
                </nav>

                {/* 👇️ Wrap your Route components in a Routes component */}
                <Routes>
                    <Route path="/" element={<Home />} />
                </Routes>
            </div>
        </Router>
    );
}
