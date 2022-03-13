import Pagination from "components/Pagination";
import MoovieCard from "components/MoovieCard";

function Listing() {
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
