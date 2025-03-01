import { HStack, Switch, useColorMode } from "@chakra-ui/react";

function DarkSwitch(){
    let{colorMode,toggleColorMode}= useColorMode();

    return <HStack>
        <Switch colorScheme="black" onChange={toggleColorMode}>DarkMode</Switch>

    </HStack>;
}
export default DarkSwitch;