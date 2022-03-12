import{ReactComponent as GitHubIcon} from 'assets/img/github.svg';
import './styles.css';  
function Navbar() {
  return (
    <header>
      <nav className="container" >
        <div className="dsmoovie-nav-content">
          <h1>main page</h1>
          <a href="https://github.com/rocketpowers">
            <div className='dsmoovie-contact-container'>
              <GitHubIcon />

              <p className='dsmoovie-contact-link'>rocketpowers</p> 
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;