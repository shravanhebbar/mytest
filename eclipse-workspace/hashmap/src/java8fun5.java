import java.lang.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;


class java8fun5
{
public static void main(String[] args) {
	Base64.Encoder encoder = Base64.getEncoder();
	String normalString = "username:password";
	String encodedString = encoder.encodeToString(
	        normalString.getBytes(StandardCharsets.UTF_8));
	System.out.println(encodedString);
	
	String encodedString1="dXNlcm5hbWU6cGFzc3dvcmQ=";
	Base64.Decoder decoder = Base64.getDecoder();
	byte[] decodedByteArray = decoder.decode(encodedString1);
	System.out.println(new String(decodedByteArray));
}
}