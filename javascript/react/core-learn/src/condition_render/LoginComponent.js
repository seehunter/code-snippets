import React from 'react';
import LoginButton from './LoginButton';
import LoginOutButton from './LoginOutButton';
import Greeting from './Greeting';

export default class LoginComponent extends React.Component{

    constructor(props){
        super(props);
        this.handleLoginClick=this.handleLoginClick.bind(this);
        this.handleLoginOutClick=this.handleLoginOutClick.bind(this);
        this.state={isLoginedIn:false};
    }

    render(){
        let button;
        if(this.state.isLoginedIn){
            button=<LoginButton click={this.handleLoginClick} />
        }else{
            button=<LoginOutButton click={this.handleLoginOutClick} />
        }
        return(
            <div>
                <Greeting isLoginedIn={this.state.isLoginedIn} />
                {button}
            </div>
        )
    }

    handleLoginClick(){
        this.setState({isLoginedIn:true})
    }

    handleLoginOutClick(){
        this.setState({isLoginedIn:false})
    }

}