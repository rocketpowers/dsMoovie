import Pagination from "components/Pagination";
import MoovieCard from "components/MoovieCard";
import axios from "axios";
import { BASE_URL } from "utils/requests";
import { useEffect, useState } from "react";
import { MooviePage } from "types/moovies";

function Listing() {

const [pageNumber, setPageNumber]= useState(0);

useEffect(()=>{

  axios.get(`${BASE_URL}/moovies`).then(Response=>{
    const data = Response.data as MooviePage;
    console.log(data);
    setPageNumber(data.number);
  });

}, []);



  return (
    <>

    <p> {pageNumber} </p>
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
