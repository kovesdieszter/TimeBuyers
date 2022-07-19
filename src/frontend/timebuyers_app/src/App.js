import logo from './logo.svg';
import './App.css';
import Home from "./components/Home";
import Searchbar from "./Searchbar";
import Navbar from "./components/Navbar";
import {BrowserRouter as Router, Route, Link, Routes} from 'react-router-dom';



export default function App() {
    return (
        <div>
        <Router>
            <div>
                {/* 👇️ Wrap your Route components in a Routes component */}
                <Routes>
                    <Route path="/" element={<Navbar />} />
                    <Route path="/" element={<Home />} />
                </Routes>
            </div>
        </Router>
            <Searchbar />
        </div>
    );
}
