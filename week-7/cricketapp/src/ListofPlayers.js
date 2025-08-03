import React from 'react';

export default function ListofPlayers({players}) {
  return(
    players.map((item)=>
    {
      return(
        <div>
          <li>Mr. {item.name}<span> {item.score} </span></li>
        </div>
      )
    })
  )
}
