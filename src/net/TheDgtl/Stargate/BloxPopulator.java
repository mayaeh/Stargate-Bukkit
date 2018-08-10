package net.TheDgtl.Stargate;

import org.bukkit.Material;
import org.bukkit.block.data.BlockData;

public class BloxPopulator {
	private Blox blox;
	private Material nextMat;
	private byte nextData;
	private BlockData nextBlockData;
	
	public BloxPopulator(Blox b, Material m) {
		blox = b;
		nextMat = m;
		nextData = 0;
	}
	
	public BloxPopulator(Blox b, Material m, byte d) {
		blox = b;
		nextMat = m;
		nextData = d;
	}

	public BloxPopulator(Blox b, Material m, BlockData bd) {
		blox = b;
		nextMat = m;
		nextBlockData = bd;
	}
	
	public void setBlox(Blox b) {
		blox = b;
	}
	
	public void setMat(Material m) {
		nextMat = m;
	}
	
	public void setData(byte d) {
		nextData = d;
	}
	
	public void setBlockData(BlockData bd) {
		nextBlockData = bd;
	}
	
	public Blox getBlox() {
		return blox;
	}
	
	public Material getMat() {
		return nextMat;
	}
	
	public byte getData() {
		return nextData;
	}
	
	public BlockData getBlockData() {
		return nextBlockData;
	}
	
}
