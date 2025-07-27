import React from 'react';
import {CalculateScore} from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="John"
        School="Sunrise Public School"
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
