import { useEffect, useState } from "react";
import axios from "axios";
import { SimpleGrid, Button, Container, Heading, Spinner, HStack } from "@chakra-ui/react";
import GameCard from "../components/GameCard";

const API_KEY = "4e487f238b654bf0b66421ea24335cd9"; // Replace with your actual API key
const API_URL = `https://api.rawg.io/api/games?key=4e487f238b654bf0b66421ea24335cd9`;

interface Game {
    details: any;
    id: number;
    name?: string; // ✅ Make it optional to prevent errors
    background_image?: string;
    rating?: number;
  }
  

const GameStore = () => {
    const [games, setGames] = useState<Game[]>([]);
  const [loading, setLoading] = useState(true);
  const [page, setPage] = useState(1);
  const pageSize = 9;

  useEffect(() => {
    setLoading(true);
    axios
      .get(`${API_URL}&page=${page}&page_size=${pageSize}`)
      .then((response) => {
        console.log("Full API Response:", response.data); // 🔍 Log full API response
        if (Array.isArray(response.data.results)) {
          console.log("First game object:", response.data.results[0]); // 🔍 Check game structure
          setGames(response.data.results);
        } else {
          setGames([]);
        }
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error fetching games:", error);
        setGames([]);
        setLoading(false);
      });
  }, [page]);
  
  return (
    <Container maxW="container.xl" mt="4">
      <Heading mb="4">Game Store</Heading>
      {loading ? (
        <Spinner size="xl" />
      ) : (
        <>
          <SimpleGrid columns={[1, 2, 3]} spacing="4">
          {games.map((game, index) => (
  <GameCard
    key={game?.id || index}
    name={typeof game?.name === "string" ? game.name : "Unknown Game"} // ✅ Prevents TypeScript errors
    background_image={game?.background_image || "https://via.placeholder.com/400"}
    rating={game?.rating ?? 0}
  />
))}

          </SimpleGrid>

          <HStack justify="center" mt="6">
            <Button onClick={() => setPage(page - 1)} isDisabled={page === 1} colorScheme="teal">
              Previous
            </Button>
            <Button onClick={() => setPage(page + 1)} colorScheme="teal">
              Next
            </Button>
          </HStack>
        </>
      )}
    </Container>
  );
};

export default GameStore;
