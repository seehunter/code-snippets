//version 1
// function component(){
//     const element=document.createElement('div');
//     element.innerHTML=_.join(['Hello','webpack'],'');
//     return element;
// }

// document.body.appendChild(component());



//version 2
import _ from 'lodash';
import './css/style.css';
import './assert/icon.jpg';


function component(){
    const element=document.createElement("div");
    element.innerHTML=_.join(["hello","world"]," ");

    element.classList.add('hello');

    const myIcon=new Image();
    element.appendChild(myIcon);

    return element;
}

document.body.appendChild(component());