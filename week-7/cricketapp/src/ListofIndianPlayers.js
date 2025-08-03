import React from 'react';

export default function ListofIndianPlayers({ IndianPlayers }) {
  return (
    IndianPlayers.map((item) => {
      return (
        <div>
          <li>Mr. {item}</li>
        </div>
      )
    })
  );
}
