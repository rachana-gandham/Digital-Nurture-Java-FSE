import React from 'react';

export default function Scorebelow70({ players }) {
  var players70 = [];

  return(
    players.map((item)=>{
      if(item.score <= 70)
      {
        players70.push(item);
      }
    }),
    players70.map((item) =>
      <div>
        <li>Mr. {item.name}<span> {item.score} </span></li>
      </div>
    )
  )
}
