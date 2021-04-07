import React, {Component} from 'react';
import Columnview from './components/columnview';
import Listview from './components/listview';

class App extends Component {

    state = {
        fizzbuzz: []
    }

    componentDidMount() {
        fetch('http://localhost:3000/avaloq/fizzbuzz?num=20')
            .then(res => res.json())
            .then((data) => {
                this.setState({ fizzbuzz: data })
            })
            .catch(console.log)
    }

    render() {
        return (
            <div>
                <Listview listview={this.state.fizzbuzz} />
                <Columnview columnview={this.state.fizzbuzz} />
            </div>
        )
    }
}

export default App;
