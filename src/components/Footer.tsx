import { Box, Text, HStack } from "@chakra-ui/react";
import { Link } from "react-router-dom"; // ✅ Use React Router's Link

const Footer = () => {
  return (
    <Box bg="gray.900" color="white" py="4" textAlign="center" mt="10" width="100%">
      <Text fontSize="sm">© 2025 Kanguva Games. All Rights Reserved.</Text>

      {/* Internal Navigation Links */}
      <HStack justify="center" spacing="6" mt="2">
        <Link to="/about" style={{ color: "white", textDecoration: "none" }}>About Us</Link>
        <Link to="/contact" style={{ color: "white", textDecoration: "none" }}>Contact</Link>
        <Link to="/privacy" style={{ color: "white", textDecoration: "none" }}>Privacy Policy</Link>
      </HStack>
    </Box>
  );
};

export default Footer;
