# Engima Machine

In this project, you will replicate a WWII encryption technique used by the German military - an Enigma machine. Alan Turing and the mathematicians at Bletchly Park who created a machine to break the Engima code were key to the Allied war effort. Here you will recreate the original encryption/decryption device using Java rather than complex circuitry.

Note: This is a unique but very challenging project. Engima machines are complex and your program will be difficult to test. You will want to work together with your peers in order to tackle this task. That being said, I think you can do it.  You already have all the programming knowledge you need, but will have to use it in complex ways to be successful.  As a result, I will not be grading you on your success with this project, but on your effort.
## How does Enigma work?

Use the following resources and your own research and try to wrap your brain around how an engima machine encrypts/decrypts data.

- [How does the engima machine work?](https://static.guim.co.uk/ni/1415981437904/Enigma_Machine_WEB.svg)
- [How does an enigma machine work? - Youtube](https://www.youtube.com/watch?v=ybkkiGtJmkM)
- [Engima Machine Design](https://en.wikipedia.org/wiki/Enigma_machine#Design)
- [Engima Explained](https://www.cryptomuseum.com/crypto/enigma/working.htm)
- [Enigma Encoder/Decoder](https://cryptii.com/pipes/enigma-machine)
- [DIY Enigma](https://drive.google.com/file/d/1RsLIJ0vQcOZMg_44gSlrG2Y9npOokf33/view?usp=sharing)

## Creating your own Engima machine

You will now program your machine. Create a method `encrypt` that has a String argument(the text to encrypt). You can hardcode the positions of the rotors or take them in as parameters if you would like to make the task more challenging.

Tips:
- Create and test individual components of your machine as you go. You don't want to have to wait until the end to debug your code.
- Use the standard rotors or the rotors from the DIY one so you can use it to test your program.
- Enigma machine encryption is reciprocal, meaning if you input the encrypted message with the same settings, it should produce the original decrypted message.
- Depending on the rotors you choose, your machine may not line up with online encoders/decoders. You should focus on creating one that functions correctly for the rotors you chose.  
