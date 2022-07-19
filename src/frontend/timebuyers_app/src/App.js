import logo from './logo.svg';
import './App.css';
import Home from "./Home";
import Searchbar from "./Searchbar";
import {BrowserRouter as Router, Route, Link, Routes} from 'react-router-dom';
import Navbar from "./components/Navbar";


export default function App() {
    return (
        <div>
        <Searchbar />
        <Router>
            <div>
                {/* 👇️ Wrap your Route components in a Routes component */}
                <Routes>
                    <Route path="/" element={<Navbar />} />
                    <Route path="/" element={<Home />} />
                </Routes>
            </div>
        </Router>
        </div>
    );
}
