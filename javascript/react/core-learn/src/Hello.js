import React from 'react';

class HelloMessage extends React.Component{
    render(){
        return(
            <div>
                Hello {this.props.message}
            </div>
        );
    }
}

export default HelloMessage