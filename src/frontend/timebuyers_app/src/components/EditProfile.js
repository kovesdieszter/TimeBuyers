import React from 'react';
import {useEffect, useState} from 'react';
import {useParams} from "react-router-dom";

export default function EditProfile() {
    const [user, setUser] = useState([])
    let {filter} = useParams();



    useEffect(() => {
        fetchUser(filter).then((user) => {
            setUser(user)
        })
    }, [filter])


    const fetchUser = async (filter) => {
        const response = await (fetch("/api/users/" + filter));
        return await response.json();
    }

    return (<div>
        <div className=" ">
            {user.map(item =>
            <div>
                username={item.username}
                email={item.email}
            </div>
            )}
        </div>
    </div>)
};






