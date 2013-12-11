package de.bschandera.mydbms.main;

import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;

import de.bschandera.mydbms.blocks.Block;

public final class DiskManager {

	private Block firstEmptyBlock;
	private LinkedHashMap<URI, Boolean> blockListWithStatusFlag;

	/**
	 * Read init file and load file paths of all Dbms {@linkplain Block}s located in the only existing segment
	 * <p>
	 * Prepare a {@linkplain HashMap} with every file name of every just loaded {@linkplain Block} and its status
	 * (empty/written)
	 * <p>
	 * Set firstEmptyBlock<br>
	 * Set firstWrittenBlock
	 */
	public void initializeSegment() {
	}

	/**
	 * Look for a specified {@linkplain Block} in the current segment.
	 * 
	 * @param blockNumber
	 *            The position of a {@linkplain Block} in the sequential list of all existing {@linkplain Block}s in the
	 *            current segment.
	 * 
	 * @return The specified {@linkplain Block} object in the current segmet.
	 */
	public Block getBlock(int blockNumber) {
		return new Block();
	}

	/**
	 * @return the first {@linkplain Block} that has not been written, yet.<br>
	 *         {@code null} if there is no empty {@linkplain Block}.
	 */
	public Block getFirstEmptyBlock() {
		return firstEmptyBlock;
	}

	private Block readBlockFile(URI filePath) {
		return new Block();
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
		return null;
	}

}
