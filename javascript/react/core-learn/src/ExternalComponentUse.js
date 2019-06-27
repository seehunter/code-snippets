import React from 'react';
import Remarkble from 'remarkable';

class ExternalComponentUse extends React.Component{

    constructor(props){
        super(props);
        this.state = { value: 'Hello, **world**!' };
        this.handleChange=this.handleChange.bind(this);
    }

    render(){
        return(
            <div>
                <h3>
                    input
                </h3>
                <label htmlFor="markdown-content">
                    enter some markdown
                </label>
                <textarea
                    id="markdown-content"
                    defaultValue={this.state.value}
                    onChange={this.handleChange}
                >
                </textarea>
                <h3>
                    Output
                </h3>
                <div
                    dangerouslySetInnerHTML={this.getRawMarkup()}
                >
                </div>
            </div>
        );
    }

    handleChange(e){
        this.setState({value:e.target.value})
    }

    getRawMarkup(){
        const md=new Remarkble();
        return { __html:md.render(this.state.value)}
    }
}

export default ExternalComponentUse