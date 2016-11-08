package ee.ut.cs.aa.grading.huffman_code;



/**
 * Purpose: interface for Huffman code data compression.
 */
public interface HuffmanAlgorithm {
	
	/**
	 * Encodes text in Huffman code.
	 * @param text Text to be encoded.
	 * @return Pair containing Huffman tree and encoded text.
	 */
	HuffmanPair encode(String text);
	
	
	/**
	 * Decodes Huffman code.
	 * 
	 * @param codePair containing Huffman tree and encoded text.
	 * @return Decoded text.
	 */
	String decode(HuffmanPair codePair);
	
}
