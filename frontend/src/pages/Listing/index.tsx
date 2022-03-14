import axios from "axios";
import MoovieCard from "components/MoovieCard";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { MooviePage } from "types/moovies";
import { BASE_URL } from "utils/requests";

function Listing() {
  const [pageNumber, setPageNumber] = useState(0);

  const [page, setPage] = useState<MooviePage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true,
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/moovies=${pageNumber}&sort=id`)
    .then(Response => {
      const data = Response.data as MooviePage;
      setPage(data);
      //  console.log(data);
      //setPageNumber(data.number);
    });
  }, [pageNumber]);

  const moovie = {
    id: 1,
    image:
      "https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg",
    title: "The Witcher",
    count: 2,
    score: 4.5,
  };

  return (
    <>
      <Pagination />

      <div className="container">
        <div className="row">
          {page.content.map(moovie => (
            <div key={moovie.id}className="col-sm-6 col-lg-4 col-xl-3 mb-5">
              <MoovieCard moovie={moovie} />
            </div>
          )
          )}
        </div>
      </div>
    </>
  );
}

export default Listing;
