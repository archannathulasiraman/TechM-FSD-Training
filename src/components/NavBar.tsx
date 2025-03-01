import { HStack, Image } from '@chakra-ui/react';
import logo from '../assets/logo Kanguva image.png';
import { NativeImage } from '@chakra-ui/react/dist/types/image/native-image';
import DarkSwitch from './DarkSwitch';

function NavBar(){
    return(<HStack justifyContent={'space-between'}padding="15px">
        <Image src={logo} boxSize={'60px'}></Image>
        <DarkSwitch/>
    </HStack>
  
    ); 
}

export default NavBar;