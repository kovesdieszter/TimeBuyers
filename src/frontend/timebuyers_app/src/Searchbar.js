import React from 'react';
import {Navigation} from 'react-minimal-side-navigation';
import 'react-minimal-side-navigation/lib/ReactMinimalSideNavigation.css';
import './Searchbar.css';

const Searchbar = () => {
    return (
        <div className={"searchbarContainer"}>
            <Navigation
                activeItemId="/management/members"
                onSelect={({itemId}) => {
                }}
                items={[
                    {
                        title: 'Home',
                        itemId: '/',
                        className: 'firstItem'
                    },
                    {
                        title: 'Tasks',
                        itemId: '/tasks',
                        subNav: [
                            {
                                title: 'Ikea assembly',
                                // itemId: '/management/projects',
                            },
                            {
                                title: 'Move boxes without a car',
                            },
                            {
                                title: 'Move boxes with a car',
                            },
                            {
                                title: 'Shopping',
                            },
                            {
                                title: 'Gardening',
                            },
                            {
                                title: 'House cleaning',
                            },
                            {
                                title: 'Wait in line',
                            },
                            {
                                title: 'Cooking',
                            },
                            {
                                title: 'Return items',
                            },
                            {
                                title: 'Baby sitting',
                            },
                            {
                                title: 'Get kids from school',
                            },
                            {
                                title: 'Dog walking',
                            },
                            {
                                title: 'Cat sitting',
                            },
                            {
                                title: 'Dog sitting',
                            },
                        ],
                    },
                ]}
            />
        </div>
    );
}

export default Searchbar;
