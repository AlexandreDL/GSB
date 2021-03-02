// // Creer un RAPPORT


const url2 = 'http://localhost:3000/gsb/rapport';
const pointeurDivRapport = document.querySelector('.listeRapport');
// const id = document.querySelector(idRapport.value)

const submit2 = document.querySelector("#submit2");
// const idRapport = document.querySelector("#idRapport");
const motif = document.querySelector("#motifRapport");
const bilan = document.querySelector("#bilanRapport");
const dateRapport = document.querySelector("#dateRapport");
submit2.addEventListener('click', (Event)=>{
    Event.preventDefault();
    fetch('http://localhost:3000/gsb/visiteur/3/rapport', {
  method: 'POST',
  body: JSON.stringify({ 
    
    // id: idRapport.value,
    date: dateRapport.value,
    bilan: bilan.value,
    motif: motif.value 
  }),
  headers: {
    'Content-type': 'application/json; charset=UTF-8',
  },
})
  .then((response) => response.json())
  .then((json) => console.log(json));
})

// afficher tout les rapports 
fetch(url2)
.then(response =>response.json())
.then((datas)=>{
    datas.forEach(data => {
pointeurDivRapport.insertAdjacentHTML('beforeend', 
`<ul>
    <li>Rapport n° ${data.id}</li>
    <li>date : ${data.date}</li>
    <li>bilan:  ${data.bilan}</li>
    <li>Motif:  ${data.motif}</li>
</ul>`);
});
});
