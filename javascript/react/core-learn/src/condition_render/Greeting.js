import React from 'react';
import UserGreeting from './UserGreeting';
import GustGreeting from './GustGreeting';

export default function(props){
    if(props.isLoginedIn){
        return <UserGreeting />
    }else{
        return <GustGreeting />
    }
}