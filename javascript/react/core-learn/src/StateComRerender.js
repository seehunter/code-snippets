import React from 'react';

class StateComRerender extends React.Component{

    constructor(props){
        super(props);
        this.state={seconds:0}
    }

    componentDidMount(){
        this.interval=setInterval(()=>this.tick(),1000);
    }

    componentWillMount(){
        clearInterval(this.interval);
    }

    tick(){
        this.setState(state=>({
            seconds:state.seconds+1
        }))
    }

    render(){
        return(
            <div>
                Seconds:{this.state.seconds}
            </div>
        );
    }
}

export default StateComRerender