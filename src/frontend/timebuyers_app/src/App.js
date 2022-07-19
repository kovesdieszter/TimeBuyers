import logo from './logo.svg';
import './App.css';
import Home from "./components/Home";
import {BrowserRouter as Router, Route, Link, Routes} from 'react-router-dom';
import Navbar from "./components/Navbar";


//https://stackoverflow.com/questions/70031839/cannot-resolve-symbol-routes!!!!!!!

export default function App() {
    return (
        <Router>
            <div>
                {/* 👇️ Wrap your Route components in a Routes component */}
                <Routes>
                    <Route path="/" element={<Navbar />} />
                    <Route path="/" element={<Home />} />
                </Routes>
            </div>
        </Router>
    );
}
