package cf.finnt730.mccomputer

import net.minecraft.block.{AbstractBlock, BlockState, TNTBlock}
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class F_TNT(val properties: AbstractBlock.Properties) extends TNTBlock(properties) {


  override def onBlockAdded(state: BlockState, worldIn: World, pos: BlockPos, oldState: BlockState, isMoving: Boolean): Unit = {
    super.onBlockAdded(state, worldIn, pos, oldState, isMoving)
    Predef.println("pos: ".+(pos.toString))
  }


}