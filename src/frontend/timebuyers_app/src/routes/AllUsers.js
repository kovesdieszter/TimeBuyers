import React, {useEffect, useState} from "react";
import '../static/CSS/Usercard.css';
import '../static/CSS/Inside.css';
import {Link, useParams} from "react-router-dom";


const fetchUsers = async (filter, statusFilter) => {
    if (statusFilter !== undefined) {
        const response = await (fetch("/api/users/" + filter + "/" + statusFilter));
        return await response.json();
    } else {
        const response = await (fetch("/api/users/" + filter));
        return await response.json();
    }
}

export default function AllUsers() {
    const [users, setUsers] = useState([])
    let {filter} = useParams();
    let {statusFilter} = useParams();

    useEffect(() => {
        fetchUsers(filter, statusFilter).then((users) => {
            setUsers(users)
        })
    }, [filter, statusFilter])
    if (filter !== "all" && filter !== "taskers" && filter !== "buyers") {
    return (<div>
        <div className="filter-container">
            <div className="filter-text-container">
        <h1 className="filter">{filter.replaceAll("_", " ")}</h1>
            </div>
        <ButtonDiv taskType={filter}/>
        </div>
        <div className="cardContainer">
            {showUserCards(users)}
        </div>
    </div>)
    } else {
        return (
            <div className="cardContainer">
                {showUserCards(users)}
            </div>)
    }

}

const showUserCards = function (data) {
    return data.map((item, key) => (
        <UserCard
            key={item.id}
            name={item.userName}
            town={item.town}
            email={item.email}
            taskNeed={item.taskToNeed}
            taskTake={item.taskToTake}
            photo={item.photo}
        />));

}

const UserCard = (item) => {
    return (
        <div className="card">
            <img src={item.photo} style={{width: "100%", height: "200px"}} alt="profile"></img>
            <h1>{item.name}</h1>
            <p className="title">{item.email}</p>
            <p>{item.town}</p>
            <p>NEED: {item.taskNeed.map((x, index) => {
                if (index === item.taskNeed.length - 1)
                    return x.replace("_", "-");
                else return x.replace("_", "-") + ", ";
            })}</p>
            <p>TAKE: {item.taskTake.map((x, index) => {
                if (index === item.taskTake.length - 1)
                    return x.replace("_", "-");
                else return x.replace("_", "-") + ", ";
            })}</p>
            <p>
                <button>Hire</button>
            </p>
        </div>
    )
        ;
}

const ButtonDiv = (props) => {
    return <div className="payButtonCont">
        <Link className="payButton blue-bg nav-link" to={"/tasks/" + props.taskType + "/BOTH"}>Pay with task </Link>
        <Link className="payButton green-bg nav-link" to={"/tasks/" + props.taskType  + "/TASKER"}>Pay with cash</Link>
    </div>
}
