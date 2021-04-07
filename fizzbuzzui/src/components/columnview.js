import React from 'react'

const Columnview = ({ columnview }) => {
    return (
        <div>
            <center><h1>FizzBuzz Column View</h1></center>
            <div className="container">
                <div className="row">
                    {Object.entries(columnview).map(([key,values]) => (
                        <div className="col-sm-4 border" >
                            <h3>{key}</h3>
                            {values.map(function(d){
                                return (<li>{d}</li>)
                            })}
                        </div>
                        ))}
                </div>
            </div>
        </div>
    )
};

export default Columnview