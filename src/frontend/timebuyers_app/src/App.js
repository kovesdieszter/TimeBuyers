import logo from './logo.svg';
import './App.css';
import Home from "./components/Home";
import Searchbar from "./components/Searchbar";
import Navbar from "./components/Navbar";
import {BrowserRouter as Router, Route, Link, Routes} from 'react-router-dom';
import Footer from "./components/Footer";
import lightBluePic from "./static/images/light_blue_pic.png";



export default function App() {
    return (
        <Router>
            <div>

                <Routes>
                    <Route path="/" element={<Home />} />
                </Routes>
            </div>
        </Router>
    );
}
