package ee.ut.cs.aa.grading.huffman_code;

import java.util.List;

import ee.ut.cs.aa.grading.tree.BinaryTreeVertex;

/**
 * Pair for holding huffman tree and codeword.
 */
public class HuffmanPair {
	
	private BinaryTreeVertex<Character> huffmanTree;
	private List<Boolean> codeword;
	
	public HuffmanPair(BinaryTreeVertex<Character> huffmanTree, List<Boolean> codeword) {
		this.huffmanTree = huffmanTree;
		this.codeword = codeword;
	}
	
	public List<Boolean> getCodeword() {
		return codeword;
	}
	
	public BinaryTreeVertex<Character> getHuffmanTree() {
		return huffmanTree;
	}
}
