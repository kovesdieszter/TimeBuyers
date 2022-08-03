import React, {useEffect, useState} from "react";
import '../static/CSS/Usercard.css';
import '../static/CSS/Inside.css';
import test_pic from '../static/images/testphoto.jpg'
import {useParams} from "react-router-dom";

const fetchUsers = async (filter) => {
    const response = await (fetch("/api/users/" + filter));
    return await response.json();
}

export default function AllUsers() {
    const [users, setUsers] = useState([])
    let {filter} = useParams();
    useEffect(() => {
        fetchUsers(filter).then((users) => {
            setUsers(users)
        })
    }, [filter])  // ez határozza meg, hogy mikor fusson le a function, jelen esetben a filter változásakor renderel újra



    return  (<div className="cardContainer">
        {showUserCards(users)}
    </div>)

}

const showUserCards = function (data) {
    return data.map(item => (
        <UserCard
            name={item.userName}
            town={item.town}
            email={item.email}
            taskNeed={item.taskToNeed}
            taskTake={item.taskToTake}
        />));

}

const UserCard = (item) => {
    return (
                <div className="card">
                    <img src={test_pic} alt="Test" style={{width: "100%"}}/>
                    <h1>{item.name}</h1>
                    <p className="title">{item.email}</p>
                    <p>{item.town}</p>
                    <p>NEED: {item.taskNeed.map((x, index) => {
                        if(index === item.taskNeed.length-1)
                            return x.replace("_", "-");
                        else return x.replace("_", "-") + ", ";
                    })}</p>
                    <p>TAKE: {item.taskTake.map((x, index) => {
                        if(index === item.taskTake.length-1)
                        return x.replace("_", "-");
                        else return x.replace("_", "-") + ", ";
                    })}</p>
                    <p>
                        <button>View profile</button>
                    </p>
                </div>
    )
        ;
}

