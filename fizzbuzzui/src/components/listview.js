import React from 'react'

const Listview = ({ listview }) => {
    return (
        <div>
            <center><h1>FizzBuzz List View</h1></center>
            {Object.entries(listview).map(([key,values]) => (
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">{key}</h5>
                        {values.map(function(d){
                            return (<li class="list-group-item">{d}</li>)
                        })}
                    </div>
                </div>
            ))}
        </div>
    )
};

export default Listview