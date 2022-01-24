package com.vicious.viciouslibkit.util;

import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.Stairs;

public class FacingUtil {
    public static BlockFace getClockwise90(BlockFace facing) {
        if(facing == BlockFace.EAST){
            return BlockFace.SOUTH;
        }
        else if(facing == BlockFace.SOUTH){
            return BlockFace.WEST;
        }
        else if(facing == BlockFace.WEST){
            return BlockFace.NORTH;
        }
        else if(facing == BlockFace.NORTH){
            return BlockFace.EAST;
        }
        return facing;
    }

    public static BlockFace getCounterClockWise90(BlockFace facing) {
        if(facing == BlockFace.EAST){
            return BlockFace.NORTH;
        }
        else if(facing == BlockFace.NORTH){
            return BlockFace.WEST;
        }
        else if(facing == BlockFace.WEST){
            return BlockFace.SOUTH;
        }
        else if(facing == BlockFace.SOUTH){
            return BlockFace.EAST;
        }
        return facing;
    }
}
