import { Grid, GridItem, Text } from "@chakra-ui/react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

// Import components correctly
import ButtonCmp from "./components/ButtonCmp";
import NavBar from "./components/NavBar";
import GameCard from "./components/GameCard";
import Footer from "./components/Footer"; 
import Sidebar from "./components/SideBar"; 

// Import pages correctly
import AboutPages from "./pages/AboutPages";
import ContactPage from "./pages/ContactPage";
import PrivacyPage from "./pages/PrivacyPage";
import GameStore from "./pages/GameStore";

function App() {
  return (
    <Router>
      <Sidebar />
      <Grid templateAreas={'"nav nav" "side main"'}>
        <GridItem area={'nav'} bg={'darkblue'}>
          <NavBar />
          <Text color='white'>Nav</Text>
        </GridItem>
        <GridItem area={'side'} bg={'maroon'}>
          Side
        </GridItem>
        <GridItem area={'main'} bg={'beige'}>
          Main
          <GameStore/>
          <GameCard name={""} />
        </GridItem>
      </Grid>

      {/* Router Configuration */}
      <Routes>

        <Route path="/about" element={<AboutPages />} />
        <Route path="/contact" element={<ContactPage />} />
        <Route path="/privacy" element={<PrivacyPage />} />
      </Routes>

      <Footer /> {/* Footer at the bottom */}
    </Router>
  );
}

export default App;


//"4e487f238b654bf0b66421ea24335cd9"