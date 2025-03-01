import { Box, Image, Text, VStack, Badge } from "@chakra-ui/react";

// ✅ Define the props for GameCard
interface GameProps {
  name: string;
  background_image?: string;
  rating?: number;
}

const GameCard = ({ name, background_image, rating }: GameProps) => {
  return (
    <Box
      borderRadius="lg"
      overflow="hidden"
      boxShadow="lg"
      p="4"
      bg="gray.800"
      color="white"
      textAlign="center"
      _hover={{ transform: "scale(1.05)", transition: "0.3s" }}
    >
      <Image
        src={background_image || "https://www.psdstamps.com/wp-content/uploads/2019/12/guaranteed-stamp-png.png"}
        alt={name}
        borderRadius="md"
        objectFit="cover"
        w="100%"
        h="200px"
      />
      <VStack spacing={2} mt={3}>
        <Text fontWeight="bold" fontSize="lg">
          {name}
        </Text>
        <Badge colorScheme={rating && rating >= 4 ? "green" : "yellow"}>
          ⭐ {rating ?? "N/A"}
        </Badge>
      </VStack>
    </Box>
  );
};

export default GameCard;














// Card

// import { Card, CardBody, Image, Text, Flex, Box } from '@chakra-ui/react';

// const cardsData = [
//   {
//     id: 1,
//     imageUrl: 'https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ffreepngimg.com%2Fthumb%2Fgta%2F157177-gta-game-hq-image-free.png&f=1&nofb=1&ipt=e9cbd5884620ffc505fc6343507b9e6c19da5eb3888d6e6c0103cec840494a71&ipo=images',
//     name: 'Grand Theft Auto V'
//   },
//   {
//     id: 2,
//     imageUrl: 'https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fstore-images.s-microsoft.com%2Fimage%2Fapps.37457.13538694197103028.80c8f509-f044-4c32-8c6f-cdd690764869.88de704e-43b1-4478-9dba-dab6f3e4cd16%3Fw%3D538%26h%3D303%26q%3D60&f=1&nofb=1&ipt=a94de6014650babd55ec06a97acedc5aa9c4e991e50d093eeb17b775954801fa&ipo=images',
//     name: 'Bubble shooter'
//   },
//   {
//     id: 3,
//     imageUrl: 'https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fgamepedia.cursecdn.com%2Fhillclimbracing2_gamepedia_en%2Ff%2Ff3%2FHill_Climber.png&f=1&nofb=1&ipt=2a89b8acbbc1dd4280699cee7acfa41d7fdc02446511de9f8aa2f3dce9ac10d9&ipo=images',
//     name: 'Hill Climbing'
//   },
//   {
//     id: 4,
//     imageUrl: 'https://images5.alphacoders.com/782/thumb-1920-782655.png',
//     name: 'Clash Of Clans'
//   }
// ];

// function GameCard() {
//   return (
//     <Flex justify="center" align="center" wrap="wrap" gap={6} p={4}>
//       {cardsData.map((card) => (
//         <Card 
//           key={card.id} 
//           textAlign="center" 
//           p={5} 
//           boxShadow="md" 
//           borderRadius="lg" 
//           transition="0.3s" 
//           _hover={{ transform: 'scale(1.05)', boxShadow: 'xl' }}
//           bg="olive"
//           maxW="sm"
//         >
//           <CardBody>
//             <Box borderRadius="md" overflow="hidden">
//               <Image boxSize={40} src={card.imageUrl} alt={card.name} borderRadius="md" />
//             </Box>
//             <Text mt={2} fontWeight="bold" fontSize="lg" color="gray.700">{card.name}</Text>
//           </CardBody>
//         </Card>
//       ))}
//     </Flex>
//   );
// }

// export default GameCard;