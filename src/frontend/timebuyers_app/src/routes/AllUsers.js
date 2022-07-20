import React, {useEffect, useState} from "react";

const fetchAllUsers = async() => {
    const response = await(fetch("/api/users"));
    return await response.json();
}

export default function AllUsers() {
    const [users, setUsers] = useState([])
    useEffect(() => {
        fetchAllUsers().then((users) => {
            setUsers(users)
        })
    }, [])


    return(<pre>{JSON.stringify(users, null, 2)}</pre>)
}