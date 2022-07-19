import logo from './logo.svg';
import './App.css';
import Home from "./Home";
import Searchbar from "./Searchbar";
import {BrowserRouter as Router, Route, Link, Routes} from 'react-router-dom';


export default function App() {
    return (
        <div>
        <Searchbar />
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
        </div>
    );
}
