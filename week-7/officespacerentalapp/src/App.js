import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://plus.unsplash.com/premium_photo-1674730952302-c9c9bc5da824?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fHdvcmtzcGFjZXxlbnwwfHwwfHx8MA%3D%3D"
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: "https://media.istockphoto.com/id/2190572397/photo/modern-collaborative-office-space-with-diverse-professionals-working-in-a-co-working.webp?a=1&b=1&s=612x612&w=0&k=20&c=VWl8bQxA7uEjYV1ZKyrs3lT-gs0PCiOGiivrRF1Mwy4="
    },
    {
      Name: "WeWork",
      Rent: 60000,
      Address: "Mumbai",
      Image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHdvcmtzcGFjZXxlbnwwfHwwfHx8MA%3D%3D"
    }
  ];

  return (
    <div>
      <h1>{element}</h1>

      {officeList.map((ItemName, index) => {
        let colors = [];

        if (ItemName.Rent <= 60000) {
          colors.push("textRed");
        } else {
          colors.push("textGreen");
        }

        const jsxatt = (
          <img src={ItemName.Image} width="25%" height="25%" alt="Office Space" />
        );

        return (
          <div key={index}>
            {jsxatt}
            <h1>Name: {ItemName.Name}</h1>
            <h3 className={colors.join(' ')}>Rent: Rs. {ItemName.Rent}</h3>
            <h3>Address: {ItemName.Address}</h3>
            <hr />
          </div>
        );
      })}
    </div>
  );
}

export default App;
