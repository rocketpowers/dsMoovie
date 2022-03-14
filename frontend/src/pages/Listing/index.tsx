import Pagination from "components/Pagination";
import MoovieCard from "components/MoovieCard";
import axios from "axios";
import { BASE_URL } from "utils/requests";

function Listing() {

  axios.get(`${BASE_URL}/moovies`).then(Response=>{
    console.log(Response.data);
  });
  return (
    <>
      <Pagination />

      <div className="container">
        <div className="row">
          <div className="col">
            <MoovieCard />
          </div>
          <div className="col">
            <MoovieCard />
          </div>
          <div className="col">
            <MoovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
            <MoovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
            <MoovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
            <MoovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
            <MoovieCard />
          </div>
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-5">
            <MoovieCard />
          </div>
        </div>
      </div>
    </>
  );
}

export default Listing;
