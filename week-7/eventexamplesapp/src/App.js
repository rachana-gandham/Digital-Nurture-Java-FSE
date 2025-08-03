import { useState } from 'react';

function App() {
  const [count, setCount] = useState(5);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleIncrement = () => {
    setCount(prevCount => prevCount + 1);
    alert('Hello Member1');
  };

  const handleDecrement = () => setCount(prevCount => prevCount - 1);

  const sayWelcome = () => alert('welcome');

  const handleClick = () => alert('I was clicked');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === 'euro') {
      const convertedAmount = parseFloat(amount) * 80; 
      alert(`Converting to Euro Amount is ${convertedAmount}`);
    } else {
      alert('Invalid currency');
    }
  };

  return (
    <div>
      <p>{count}</p>
      <button onClick={handleIncrement}>Increment</button>   <br/>
      <button onClick={handleDecrement}>Decrement</button>   <br/>
      <button onClick={sayWelcome}>Say welcome</button>    <br/>
      <button onClick={handleClick}>Click on me</button>   <br/>

      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </label>
        <br />
        <label>
          Currency:
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </label>
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
