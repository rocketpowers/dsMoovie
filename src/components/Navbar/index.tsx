import { ReactComponent as GitHubIcon } from "assets/img/github.svg";
import './styles.css';

function Navbar() {
  return (
    <header>

      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>project-ds-moovie</h1>
          <a href="https://github.com/rocketpowers">
            <div className="dsmovie-contact-container">
              <GitHubIcon />
              <p className="dsmovie-contact-link">rocketpowers</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}
export default Navbar;
