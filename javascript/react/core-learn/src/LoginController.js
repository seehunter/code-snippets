import React from 'react';

export default class LoginController extends React.Component{

    constructor(props){
        super(props);
        this.state={isLoginedIn:false}
    }

    render(){
        return(
            <div>
                <LoginCondition isLoginedIn={this.state.isLoginedIn}/>
            </div>
        )
    }
}

function LogineView({props}){
    return(
        <div style={{'width':'20px','height':'100px'}}>
            {props.loginContent}
        </div>
    )
}

function LoginOutView(props){
    return(
        <div style={{'width':'20px','height':'100px'}}>
            {props.loginoutContent}
        </div>
    )
}

function LoginCondition(props){
    if(props.isLoginedIn){
        return( <LogineView loginContent={props.loginContent} />);
    }else{
        return( <LoginOutView loginoutContent={props.loginoutContent} />);
    }
}