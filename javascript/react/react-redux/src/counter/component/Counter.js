import React from 'react';
// import PropTypes from 'prop-types';

class Counter extends React.Component{

    constructor(props){
        super(props);
        this.state={click_times:0}
        this.addHandler=this.addHandler.bind(this);
    }

    render(){
        return(
            <p>
                Clicked:{this.state.click_times} times

                {' '}

                <button onClick={this.addHandler} >+</button>
            </p>
        )
    }

    addHandler(){
        this.setState((state,props)=>
                {return{click_times:state.click_times+1}} 
            
        )
    }

}

// Counter.propTypes={
//     click_times:PropTypes.number.isRequired
// }

export default Counter;
