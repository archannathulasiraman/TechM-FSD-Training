import {
  Drawer,
  DrawerBody,
  DrawerHeader,
  DrawerOverlay,
  DrawerContent,
  DrawerCloseButton,
  Button,
  useDisclosure,
  VStack,
  IconButton,
} from "@chakra-ui/react";
import { HamburgerIcon } from "@chakra-ui/icons"; // ✅ Ensure this is correctly imported

const Sidebar = () => {
  const { isOpen, onOpen, onClose } = useDisclosure(); // Controls drawer open/close state

  return (
    <>
      
      <IconButton
        icon={<HamburgerIcon />}
        aria-label="Open Menu"
        onClick={onOpen}
        position="fixed"
        bottom="20px"
        right="20px"
        zIndex="1000"
        colorScheme="teal"
        bg="olive" 
      />

      {/* Sidebar Drawer */}
      <Drawer isOpen={isOpen} placement="left" onClose={onClose}>
        <DrawerOverlay />
        <DrawerContent bg="gray.800" color="hotpink">
          <DrawerCloseButton />
          <DrawerHeader borderBottom="1px solid gray">Menu</DrawerHeader>

          <DrawerBody>
            <VStack spacing="4" align="start">
              <Button variant="ghost" w="full" onClick={onClose}>🏠 Home</Button>
              <Button variant="ghost" w="full" onClick={onClose}>🔥 Popular Games</Button>
              <Button variant="ghost" w="full" onClick={onClose}>🆕 New Releases</Button>
              <Button variant="ghost" w="full" onClick={onClose}>🎮 Categories</Button>
            </VStack>
          </DrawerBody>
        </DrawerContent>
      </Drawer>
    </>
  );
};

export default Sidebar;
