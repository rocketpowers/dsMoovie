import MoovieStars from "components/MoovieStars";
import './styles.css';

function MoovieScore(){

    const score =3.3;
    const count =13;


return(

<div className="dsmovie-score-container">
    <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
    <MoovieStars/>
    <p className="dsmovie-score-count">{count} avaliações</p>
</div>

);

}

export default MoovieScore;