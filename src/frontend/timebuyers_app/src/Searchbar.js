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
                        ],
                    },
                ]}
            />
        </div>
    );
}

export default Searchbar;
