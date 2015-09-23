/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 24, 2015, 2:35:08 PM (GMT)]
 */
package vazkii.botania.common.block;

import net.minecraft.block.Block;
import vazkii.botania.common.block.decor.Block18Stone;
import vazkii.botania.common.block.decor.BlockPavement;
import vazkii.botania.common.block.decor.biomestone.BlockBiomeStoneA;
import vazkii.botania.common.block.decor.biomestone.BlockBiomeStoneB;
import vazkii.botania.common.block.decor.quartz.BlockSpecialQuartz;
import vazkii.botania.common.block.decor.quartz.BlockSpecialQuartzSlab;
import vazkii.botania.common.block.decor.quartz.BlockSpecialQuartzStairs;
import vazkii.botania.common.block.decor.slabs.Block18StoneSlab;
import vazkii.botania.common.block.decor.slabs.BlockBiomeStoneSlab;
import vazkii.botania.common.block.decor.slabs.BlockDirtPathSlab;
import vazkii.botania.common.block.decor.slabs.BlockEndStoneSlab;
import vazkii.botania.common.block.decor.slabs.BlockEnderBrickSlab;
import vazkii.botania.common.block.decor.slabs.BlockModSlab;
import vazkii.botania.common.block.decor.slabs.BlockPavementSlab;
import vazkii.botania.common.block.decor.slabs.BlockReedSlab;
import vazkii.botania.common.block.decor.slabs.BlockThatchSlab;
import vazkii.botania.common.block.decor.slabs.bricks.BlockCustomBrickSlab;
import vazkii.botania.common.block.decor.slabs.bricks.BlockSnowBrickSlab;
import vazkii.botania.common.block.decor.slabs.bricks.BlockSoulBrickSlab;
import vazkii.botania.common.block.decor.slabs.bricks.BlockTileSlab;
import vazkii.botania.common.block.decor.slabs.living.BlockDreamwoodPlankSlab;
import vazkii.botania.common.block.decor.slabs.living.BlockDreamwoodSlab;
import vazkii.botania.common.block.decor.slabs.living.BlockLivingrockBrickSlab;
import vazkii.botania.common.block.decor.slabs.living.BlockLivingrockSlab;
import vazkii.botania.common.block.decor.slabs.living.BlockLivingwoodPlankSlab;
import vazkii.botania.common.block.decor.slabs.living.BlockLivingwoodSlab;
import vazkii.botania.common.block.decor.slabs.prismarine.BlockDarkPrismarineSlab;
import vazkii.botania.common.block.decor.slabs.prismarine.BlockPrismarineBrickSlab;
import vazkii.botania.common.block.decor.slabs.prismarine.BlockPrismarineSlab;
import vazkii.botania.common.block.decor.stairs.Block18StoneStairs;
import vazkii.botania.common.block.decor.stairs.BlockBiomeStoneStairs;
import vazkii.botania.common.block.decor.stairs.BlockEndStoneStairs;
import vazkii.botania.common.block.decor.stairs.BlockEnderBrickStairs;
import vazkii.botania.common.block.decor.stairs.BlockPavementStairs;
import vazkii.botania.common.block.decor.stairs.BlockReedStairs;
import vazkii.botania.common.block.decor.stairs.BlockThatchStairs;
import vazkii.botania.common.block.decor.stairs.bricks.BlockCustomBrickStairs;
import vazkii.botania.common.block.decor.stairs.bricks.BlockSnowBrickStairs;
import vazkii.botania.common.block.decor.stairs.bricks.BlockSoulBrickStairs;
import vazkii.botania.common.block.decor.stairs.bricks.BlockTileStairs;
import vazkii.botania.common.block.decor.stairs.living.BlockDreamwoodPlankStairs;
import vazkii.botania.common.block.decor.stairs.living.BlockDreamwoodStairs;
import vazkii.botania.common.block.decor.stairs.living.BlockLivingrockBrickStairs;
import vazkii.botania.common.block.decor.stairs.living.BlockLivingrockStairs;
import vazkii.botania.common.block.decor.stairs.living.BlockLivingwoodPlankStairs;
import vazkii.botania.common.block.decor.stairs.living.BlockLivingwoodStairs;
import vazkii.botania.common.block.decor.stairs.prismarine.BlockDarkPrismarineStairs;
import vazkii.botania.common.block.decor.stairs.prismarine.BlockPrismarineBrickStairs;
import vazkii.botania.common.block.decor.stairs.prismarine.BlockPrismarineStairs;
import vazkii.botania.common.block.decor.walls.Block18StoneWall;
import vazkii.botania.common.block.decor.walls.BlockBiomeStoneWall;
import vazkii.botania.common.block.decor.walls.BlockPrismarineWall;
import vazkii.botania.common.block.decor.walls.BlockReedWall;
import vazkii.botania.common.block.decor.walls.living.BlockDreamwoodWall;
import vazkii.botania.common.block.decor.walls.living.BlockLivingrockWall;
import vazkii.botania.common.block.decor.walls.living.BlockLivingwoodWall;
import vazkii.botania.common.core.handler.ConfigHandler;
import vazkii.botania.common.lib.LibBlockNames;

public final class ModFluffBlocks {

	public static Block livingwoodStairs;
	public static Block livingwoodSlab;
	public static Block livingwoodSlabFull;
	public static Block livingwoodWall;
	public static Block livingwoodPlankStairs;
	public static Block livingwoodPlankSlab;
	public static Block livingwoodPlankSlabFull;
	public static Block livingrockStairs;
	public static Block livingrockSlab;
	public static Block livingrockSlabFull;
	public static Block livingrockWall;
	public static Block livingrockBrickStairs;
	public static Block livingrockBrickSlab;
	public static Block livingrockBrickSlabFull;
	public static Block dreamwoodStairs;
	public static Block dreamwoodSlab;
	public static Block dreamwoodSlabFull;
	public static Block dreamwoodWall;
	public static Block dreamwoodPlankStairs;
	public static Block dreamwoodPlankSlab;
	public static Block dreamwoodPlankSlabFull;

	public static Block prismarineStairs;
	public static Block prismarineSlab;
	public static Block prismarineSlabFull;
	public static Block prismarineWall;
	public static Block prismarineBrickStairs;
	public static Block prismarineBrickSlab;
	public static Block prismarineBrickSlabFull;
	public static Block darkPrismarineStairs;
	public static Block darkPrismarineSlab;
	public static Block darkPrismarineSlabFull;

	public static Block reedStairs;
	public static Block reedSlab;
	public static Block reedSlabFull;
	public static Block reedWall;
	public static Block thatchStairs;
	public static Block thatchSlab;
	public static Block thatchSlabFull;

	public static Block netherBrickStairs;
	public static Block netherBrickSlab;
	public static Block netherBrickSlabFull;
	public static Block soulBrickStairs;
	public static Block soulBrickSlab;
	public static Block soulBrickSlabFull;
	public static Block snowBrickStairs;
	public static Block snowBrickSlab;
	public static Block snowBrickSlabFull;
	public static Block tileStairs;
	public static Block tileSlab;
	public static Block tileSlabFull;

	public static Block darkQuartz;
	public static Block darkQuartzSlab;
	public static Block darkQuartzSlabFull;
	public static Block darkQuartzStairs;
	public static Block manaQuartz;
	public static Block manaQuartzSlab;
	public static Block manaQuartzSlabFull;
	public static Block manaQuartzStairs;
	public static Block blazeQuartz;
	public static Block blazeQuartzSlab;
	public static Block blazeQuartzSlabFull;
	public static Block blazeQuartzStairs;
	public static Block lavenderQuartz;
	public static Block lavenderQuartzSlab;
	public static Block lavenderQuartzSlabFull;
	public static Block lavenderQuartzStairs;
	public static Block redQuartz;
	public static Block redQuartzSlab;
	public static Block redQuartzSlabFull;
	public static Block redQuartzStairs;
	public static Block elfQuartz;
	public static Block elfQuartzSlab;
	public static Block elfQuartzSlabFull;
	public static Block elfQuartzStairs;
	public static Block sunnyQuartz;
	public static Block sunnyQuartzSlab;
	public static Block sunnyQuartzSlabFull;
	public static Block sunnyQuartzStairs;

	public static Block dirtPathSlab;
	public static Block dirtPathSlabFull;

	public static Block biomeStoneA;
	public static Block biomeStoneB;
	public static Block stone;
	public static Block pavement;

	public static Block[] biomeStoneStairs = new Block[24];
	public static Block[] biomeStoneSlabs = new Block[24];
	public static Block[] biomeStoneFullSlabs = new Block[24];
	public static Block biomeStoneWall;

	public static Block[] stoneStairs = new Block[8];
	public static Block[] stoneSlabs = new Block[8];
	public static Block[] stoneFullSlabs = new Block[8];
	public static Block stoneWall;

	public static Block[] pavementStairs = new Block[4];
	public static Block[] pavementSlabs = new Block[4];
	public static Block[] pavementFullSlabs = new Block[4];
	
	public static Block endStoneSlab;
	public static Block endStoneSlabFull;
	public static Block endStoneStairs;
	public static Block enderBrickSlab;
	public static Block enderBrickSlabFull;
	public static Block enderBrickStairs;

	public static void init() {

        manaQuartz = new BlockSpecialQuartz(LibBlockNames.QUARTZ_MANA);
        blazeQuartz = new BlockSpecialQuartz(LibBlockNames.QUARTZ_BLAZE);
        lavenderQuartz = new BlockSpecialQuartz(LibBlockNames.QUARTZ_LAVENDER);
        redQuartz = new BlockSpecialQuartz(LibBlockNames.QUARTZ_RED);
        elfQuartz = new BlockSpecialQuartz(LibBlockNames.QUARTZ_ELF);
        sunnyQuartz = new BlockSpecialQuartz(LibBlockNames.QUARTZ_SUNNY);

		biomeStoneA = new BlockBiomeStoneA();
		biomeStoneB = new BlockBiomeStoneB();
		stone = new Block18Stone();
		pavement = new BlockPavement();
		
		if(ConfigHandler.darkQuartzEnabled) {
			darkQuartz = new BlockSpecialQuartz(LibBlockNames.QUARTZ_DARK);
            if(ConfigHandler.slabsEnabled){
			darkQuartzSlab = new BlockSpecialQuartzSlab(darkQuartz, false);
			darkQuartzSlabFull = new BlockSpecialQuartzSlab(darkQuartz, true);
            }
            if(ConfigHandler.stairsEnabled) {
                darkQuartzStairs = new BlockSpecialQuartzStairs(darkQuartz);
            }
		}

		for(int i = 0; i < 24; i++) {
			int meta = i % 16;
			Block block = i < 16 ? biomeStoneA : biomeStoneB;
            if(ConfigHandler.stairsEnabled) {
                biomeStoneStairs[i] = new BlockBiomeStoneStairs(block, meta);
            }
            if(ConfigHandler.slabsEnabled) {
                biomeStoneSlabs[i] = new BlockBiomeStoneSlab(false, block, meta, i);
                biomeStoneFullSlabs[i] = new BlockBiomeStoneSlab(true, block, meta, i);
            }
		}

		for(int i = 0; i < 8; i++) {
			int meta = i > 3 ? i + 4 : i;
            if(ConfigHandler.stairsEnabled) {
                stoneStairs[i] = new Block18StoneStairs(meta);
            }
            if(ConfigHandler.slabsEnabled) {
                stoneSlabs[i] = new Block18StoneSlab(false, meta, i);
                stoneFullSlabs[i] = new Block18StoneSlab(true, meta, i);
            }
		}

		for(int i = 0; i < 4; i++) {
            if(ConfigHandler.stairsEnabled) {
                pavementStairs[i] = new BlockPavementStairs(i);
            }
            if(ConfigHandler.slabsEnabled) {
                pavementSlabs[i] = new BlockPavementSlab(false, i, i);
                pavementFullSlabs[i] = new BlockPavementSlab(true, i, i);
            }
		}

		if(ConfigHandler.darkQuartzEnabled && ConfigHandler.slabsEnabled) {
			((BlockModSlab) darkQuartzSlab).register();
			((BlockModSlab) darkQuartzSlabFull).register();
		}
        if(ConfigHandler.slabsEnabled) {
            for (int i = 0; i < 24; i++) {
                ((BlockModSlab) biomeStoneSlabs[i]).register();
                ((BlockModSlab) biomeStoneFullSlabs[i]).register();
            }
        }
        if(ConfigHandler.slabsEnabled) {
            for (int i = 0; i < 8; i++) {
                ((BlockModSlab) stoneSlabs[i]).register();
                ((BlockModSlab) stoneFullSlabs[i]).register();
            }
        }
        if(ConfigHandler.slabsEnabled) {
            for (int i = 0; i < 4; i++) {
                ((BlockModSlab) pavementSlabs[i]).register();
                ((BlockModSlab) pavementFullSlabs[i]).register();
            }
        }
	}

    public static void initStairs(){
        livingwoodStairs = new BlockLivingwoodStairs();
        livingwoodPlankStairs = new BlockLivingwoodPlankStairs();
        livingrockStairs = new BlockLivingrockStairs();
        livingrockBrickStairs = new BlockLivingrockBrickStairs();
        dreamwoodStairs = new BlockDreamwoodStairs();
        dreamwoodPlankStairs = new BlockDreamwoodPlankStairs();
        prismarineStairs = new BlockPrismarineStairs();
        prismarineBrickStairs = new BlockPrismarineBrickStairs();
        darkPrismarineStairs = new BlockDarkPrismarineStairs();
        reedStairs = new BlockReedStairs();
        thatchStairs = new BlockThatchStairs();
        netherBrickStairs = new BlockCustomBrickStairs();
        soulBrickStairs = new BlockSoulBrickStairs();
        snowBrickStairs = new BlockSnowBrickStairs();
        tileStairs = new BlockTileStairs();
        manaQuartzStairs = new BlockSpecialQuartzStairs(manaQuartz);
        blazeQuartzStairs = new BlockSpecialQuartzStairs(blazeQuartz);
        lavenderQuartzStairs = new BlockSpecialQuartzStairs(lavenderQuartz);
        redQuartzStairs = new BlockSpecialQuartzStairs(redQuartz);
        elfQuartzStairs = new BlockSpecialQuartzStairs(elfQuartz);
        sunnyQuartzStairs = new BlockSpecialQuartzStairs(sunnyQuartz);
        endStoneStairs = new BlockEndStoneStairs();
        enderBrickStairs = new BlockEnderBrickStairs();
    }

    public static void initSlabs() {
        livingwoodSlab = new BlockLivingwoodSlab(false);
        livingwoodSlabFull = new BlockLivingwoodSlab(true);
        livingwoodPlankSlab = new BlockLivingwoodPlankSlab(false);
        livingwoodPlankSlabFull = new BlockLivingwoodPlankSlab(true);
        livingrockSlab = new BlockLivingrockSlab(false);
        livingrockSlabFull = new BlockLivingrockSlab(true);
        livingrockBrickSlab = new BlockLivingrockBrickSlab(false);
        livingrockBrickSlabFull = new BlockLivingrockBrickSlab(true);
        dreamwoodSlab = new BlockDreamwoodSlab(false);
        dreamwoodSlabFull = new BlockDreamwoodSlab(true);
        dreamwoodPlankSlab = new BlockDreamwoodPlankSlab(false);
        dreamwoodPlankSlabFull = new BlockDreamwoodPlankSlab(true);
        prismarineSlab = new BlockPrismarineSlab(false);
        prismarineSlabFull = new BlockPrismarineSlab(true);
        prismarineBrickSlab = new BlockPrismarineBrickSlab(false);
        prismarineBrickSlabFull = new BlockPrismarineBrickSlab(true);
        darkPrismarineSlab = new BlockDarkPrismarineSlab(false);
        darkPrismarineSlabFull = new BlockDarkPrismarineSlab(true);
        reedSlab = new BlockReedSlab(false);
        reedSlabFull = new BlockReedSlab(true);
        thatchSlab = new BlockThatchSlab(false);
        thatchSlabFull = new BlockThatchSlab(true);
        netherBrickSlab = new BlockCustomBrickSlab(false);
        netherBrickSlabFull = new BlockCustomBrickSlab(true);
        soulBrickSlab = new BlockSoulBrickSlab(false);
        soulBrickSlabFull = new BlockSoulBrickSlab(true);
        snowBrickSlab = new BlockSnowBrickSlab(false);
        snowBrickSlabFull = new BlockSnowBrickSlab(true);
        tileSlab = new BlockTileSlab(false);
        tileSlabFull = new BlockTileSlab(true);
        manaQuartzSlab = new BlockSpecialQuartzSlab(manaQuartz, false);
        manaQuartzSlabFull = new BlockSpecialQuartzSlab(manaQuartz, true);
        blazeQuartzSlab = new BlockSpecialQuartzSlab(blazeQuartz, false);
        blazeQuartzSlabFull = new BlockSpecialQuartzSlab(blazeQuartz, true);
        lavenderQuartzSlab = new BlockSpecialQuartzSlab(lavenderQuartz, false);
        lavenderQuartzSlabFull = new BlockSpecialQuartzSlab(lavenderQuartz, true);
        redQuartzSlab = new BlockSpecialQuartzSlab(redQuartz, false);
        redQuartzSlabFull = new BlockSpecialQuartzSlab(redQuartz, true);
        elfQuartzSlab = new BlockSpecialQuartzSlab(elfQuartz, false);
        elfQuartzSlabFull = new BlockSpecialQuartzSlab(elfQuartz, true);
        sunnyQuartzSlab = new BlockSpecialQuartzSlab(sunnyQuartz, false);
        sunnyQuartzSlabFull = new BlockSpecialQuartzSlab(sunnyQuartz, true);
        dirtPathSlab = new BlockDirtPathSlab(false);
        dirtPathSlabFull = new BlockDirtPathSlab(true);
        endStoneSlab = new BlockEndStoneSlab(false);
        endStoneSlabFull = new BlockEndStoneSlab(true);
        enderBrickSlab = new BlockEnderBrickSlab(false);
        enderBrickSlabFull = new BlockEnderBrickSlab(true);



        ((BlockModSlab) manaQuartzSlab).register();
        ((BlockModSlab) manaQuartzSlabFull).register();
        ((BlockModSlab) blazeQuartzSlab).register();
        ((BlockModSlab) blazeQuartzSlabFull).register();
        ((BlockModSlab) lavenderQuartzSlab).register();
        ((BlockModSlab) lavenderQuartzSlabFull).register();
        ((BlockModSlab) redQuartzSlab).register();
        ((BlockModSlab) redQuartzSlabFull).register();
        ((BlockModSlab) elfQuartzSlab).register();
        ((BlockModSlab) elfQuartzSlabFull).register();
        ((BlockModSlab) sunnyQuartzSlab).register();
        ((BlockModSlab) sunnyQuartzSlabFull).register();
        ((BlockModSlab) livingwoodSlab).register();
        ((BlockModSlab) livingwoodSlabFull).register();
        ((BlockModSlab) livingwoodPlankSlab).register();
        ((BlockModSlab) livingwoodPlankSlabFull).register();
        ((BlockModSlab) livingrockSlab).register();
        ((BlockModSlab) livingrockSlabFull).register();
        ((BlockModSlab) livingrockBrickSlab).register();
        ((BlockModSlab) livingrockBrickSlabFull).register();
        ((BlockModSlab) dreamwoodSlab).register();
        ((BlockModSlab) dreamwoodSlabFull).register();
        ((BlockModSlab) dreamwoodPlankSlab).register();
        ((BlockModSlab) dreamwoodPlankSlabFull).register();
        ((BlockModSlab) reedSlab).register();
        ((BlockModSlab) reedSlabFull).register();
        ((BlockModSlab) thatchSlab).register();
        ((BlockModSlab) thatchSlabFull).register();
        ((BlockModSlab) prismarineSlab).register();
        ((BlockModSlab) prismarineSlabFull).register();
        ((BlockModSlab) prismarineBrickSlab).register();
        ((BlockModSlab) prismarineBrickSlabFull).register();
        ((BlockModSlab) darkPrismarineSlab).register();
        ((BlockModSlab) darkPrismarineSlabFull).register();
        ((BlockModSlab) netherBrickSlab).register();
        ((BlockModSlab) netherBrickSlabFull).register();
        ((BlockModSlab) soulBrickSlab).register();
        ((BlockModSlab) soulBrickSlabFull).register();
        ((BlockModSlab) snowBrickSlab).register();
        ((BlockModSlab) snowBrickSlabFull).register();
        ((BlockModSlab) tileSlab).register();
        ((BlockModSlab) tileSlabFull).register();
        ((BlockModSlab) dirtPathSlab).register();
        ((BlockModSlab) dirtPathSlabFull).register();
        ((BlockModSlab) endStoneSlab).register();
        ((BlockModSlab) endStoneSlabFull).register();
        ((BlockModSlab) enderBrickSlab).register();
        ((BlockModSlab) enderBrickSlabFull).register();
    }

    public static void initWalls(){
        livingwoodWall = new BlockLivingwoodWall();
        livingrockWall = new BlockLivingrockWall();
        dreamwoodWall = new BlockDreamwoodWall();
        prismarineWall = new BlockPrismarineWall();
        reedWall = new BlockReedWall();
        biomeStoneWall = new BlockBiomeStoneWall();
        stoneWall = new Block18StoneWall();
    }
}
