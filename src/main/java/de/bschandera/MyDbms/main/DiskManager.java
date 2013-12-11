package de.bschandera.MyDbms.main;

import java.net.URI;
import java.util.LinkedHashMap;

public final class DiskManager {

	private Block firstEmptyBlock;
	private LinkedHashMap<URI, Boolean> blockListWithStatusFlag;

	public void initializeSegment() {
		/*
		 * read init file and load file names of all Blocks in the only existing segment
		 * 
		 * prepare a hashmap of Block files where every just loaded block is accessable
		 * 
		 * set firstEmptyBlock
		 * 
		 * set firstWrittenBlock
		 */
	}

	public Block getBlock(int blockNumber) {
		return new Block();
	}

	public Block getFirstEmptyBlock() {
		return firstEmptyBlock;
	}

	/**
	 * Read a {@linkplain Block} file from the given file path.
	 * 
	 * @param filePath
	 *            where the requested block can be found on the file system
	 * 
	 * @return A {@linkplain Block} object representing the just read block file
	 */
	private Block readBlockFile(URI filePath) {
	}

	@Deprecated
	private Boolean findFirstEmptyBlock() {
		/*
		 * while (block-list.hasNext()) {
		 * 
		 * while (current block is not empty) {
		 * iterate over block-list
		 * }
		 * firstEmptyBlock = current Block 
		 * }
		 * 
		 * firstEmptyBlock = null
		 */
		return false;
	}

	private Boolean resizeSegment(int blockDifference) {
		/*
		 * if (blockDifference == 0) return true;
		 * else if(bd > 0) {
		 * return append(free block at the end)
		 * }
		 * else {
		 * if (there are empty blocks left) {
		 * return removeBlock(empty block with lowest position)
		 * }
		 * return false
		 */
		return false;
	}

	private Boolean removeBlock(int blockPosition) {
		/*
		 * first remove in the block-list
		 * then remove on hard disk
		 */
		return false;
	}

	private Boolean appendBlock() {

	}

}
