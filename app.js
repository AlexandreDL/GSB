const url = 'http://localhost:3389/gsb/visiteur/' ;   
const url2 = 'http://localhost:3389/gsb/rapport'

//Créer un visiteur
const envoyer = document.querySelector('#envoyer');
const inputVisiteur = document.querySelector(".creerVisiteur");

envoyer.addEventListener('click', (Event)=>{
    console.log(inputVisiteur)
})

const pointeurDivVisiteur = document.querySelector('.listeVisiteur');
const pointeurDivRapport = document.querySelector('.listeRapport');
// Afficher tous les visiteurs
fetch(url)
.then(response =>response.json())
.then((datas)=>{
    datas.forEach(data => {
        console.log(data);
        pointeurDivVisiteur.insertAdjacentHTML('beforeend', 
        `<ul>
            <li>Visiteur n° ${data.id}</li>
            <li>Embauché le ${data.dateEmbauche}</li>
            <li>Nom : ${data.nom}</li>
        </ul>`);
        
    });
});

fetch(url2)
.then(response =>response.json())
.then((datas)=>{
    datas.forEach(data => {
pointeurDivRapport.insertAdjacentHTML('beforeend', 
`<ul>
    <li>Rapport n° ${data.id}</li>
    <li>date : ${data.date}</li>
    <li>Motif:  ${data.motif}</li>
</ul>`);
});
});

