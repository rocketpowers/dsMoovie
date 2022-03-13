import MoovieScore from "components/MoovieScore";

function MoovieCard() {
  const moovie = {
    id: 1,
    image:
      "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg",
    title: "The Witcher",
    count: 2,
    score: 4.5,
  };

  return (
    <div>
      <img className="dsmovie-movie-card-image"  src={moovie.image} alt={moovie.title}    /> 
  
      <div className="dsmovie-card-bottom-container">
        
        <h3>{moovie.title}</h3>
        <MoovieScore />
        <div className="btn btn-primary dsmovie-btn">Avaliar</div>
      </div>
    </div>
  );
}

export default MoovieCard;
