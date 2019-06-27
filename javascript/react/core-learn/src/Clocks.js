import React from 'react';

class Clock extends React.Component{

    constructor(props){
        super(props);
        let newDateTime=new Date().getTime();
        if(this.props.addition){
            newDateTime=newDateTime+parseInt(this.props.addition);
        }
        this.state={date:new Date(newDateTime)}
    }

    componentDidMount(){
        this.interval=setInterval(()=>this.tick(),1000);
    }

    tick(){
        this.setState((state,props)=>{
            let newDateTime=new Date().getTime();
            if(this.props.addition){
                newDateTime=newDateTime+parseInt(this.props.addition);
            }
            return {date:new Date(newDateTime)}
        })
    }

    componentWillUnmount(){
        clearInterval(this.interval);
    }

    render(){
        return(
            <div>
                <h1>Hello world!</h1>
                <h2>It is {this.state.date.toLocaleTimeString()}</h2>
            </div>
        );
    }
}

class Clocks extends React.Component{
    render(){
        return(
            <div>
                <Clock  />
                <Clock addition='10000' />
                <Clock addition='50000' />
            </div>
        );
    }
}

export default Clocks;